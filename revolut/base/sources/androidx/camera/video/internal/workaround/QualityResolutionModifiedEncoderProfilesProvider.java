package androidx.camera.video.internal.workaround;

import android.util.Size;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class QualityResolutionModifiedEncoderProfilesProvider implements EncoderProfilesProvider {
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mProvider;
    private final Quirks mQuirks;

    public QualityResolutionModifiedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, Quirks quirks) {
        this.mProvider = encoderProfilesProvider;
        this.mQuirks = quirks;
    }

    private EncoderProfilesProxy createNewEncoderProfiles(EncoderProfilesProxy encoderProfilesProxy, Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<EncoderProfilesProxy.VideoProfileProxy> it8 = encoderProfilesProxy.getVideoProfiles().iterator();
        while (it8.hasNext()) {
            arrayList.add(generateVideoProfile(it8.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    private static EncoderProfilesProxy.VideoProfileProxy generateVideoProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, Size size) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), videoProfileProxy.getBitrate(), videoProfileProxy.getFrameRate(), size.getWidth(), size.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    private Size getAlternativeResolution(int i) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.mQuirks.getAll(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.getAlternativeResolution(i);
            }
        }
        return null;
    }

    private EncoderProfilesProxy getProfilesInternal(int i) {
        EncoderProfilesProxy encoderProfilesProxyCreateNewEncoderProfiles;
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i));
        }
        if (this.mProvider.hasProfile(i)) {
            EncoderProfilesProxy all2 = this.mProvider.getAll(i);
            Objects.requireNonNull(all2);
            encoderProfilesProxyCreateNewEncoderProfiles = all2;
            Size alternativeResolution = getAlternativeResolution(i);
            if (alternativeResolution != null) {
                encoderProfilesProxyCreateNewEncoderProfiles = createNewEncoderProfiles(encoderProfilesProxyCreateNewEncoderProfiles, alternativeResolution);
            }
        } else {
            encoderProfilesProxyCreateNewEncoderProfiles = null;
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(i), encoderProfilesProxyCreateNewEncoderProfiles);
        return encoderProfilesProxyCreateNewEncoderProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i) {
        return getProfilesInternal(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return this.mProvider.hasProfile(i) && getProfilesInternal(i) != null;
    }
}
