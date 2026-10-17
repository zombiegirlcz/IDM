package androidx.camera.video.internal.workaround;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class QualityAddedEncoderProfilesProvider implements EncoderProfilesProvider {
    private Map<Integer, EncoderProfilesProxy> mExtraQualityToEncoderProfiles;
    private final EncoderProfilesProvider mProvider;

    public QualityAddedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, Quirks quirks, CameraInfoInternal cameraInfoInternal, VideoEncoderInfo.Finder finder) {
        this.mProvider = encoderProfilesProvider;
        List all2 = quirks.getAll(ExtraSupportedQualityQuirk.class);
        if (all2.isEmpty()) {
            return;
        }
        Preconditions.checkState(all2.size() == 1);
        Map<Integer, EncoderProfilesProxy> extraEncoderProfiles = ((ExtraSupportedQualityQuirk) all2.get(0)).getExtraEncoderProfiles(cameraInfoInternal, encoderProfilesProvider, finder);
        if (extraEncoderProfiles != null) {
            this.mExtraQualityToEncoderProfiles = new HashMap(extraEncoderProfiles);
        }
    }

    private EncoderProfilesProxy getProfilesInternal(int i) {
        Map<Integer, EncoderProfilesProxy> map = this.mExtraQualityToEncoderProfiles;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? this.mProvider.getAll(i) : this.mExtraQualityToEncoderProfiles.get(Integer.valueOf(i));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i) {
        return getProfilesInternal(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return getProfilesInternal(i) != null;
    }
}
