package com.onfido.android.sdk.capture.internal.camera;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.api.client.data.SdkConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0002*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\u0005\u001a\u00020\u0002*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"QUALITY_PROFILE_MAPPER", "", "", "getQUALITY_PROFILE_MAPPER", "()Ljava/util/Map;", "videoQualityProfile", "Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "getVideoQualityProfile", "(Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;)I", "Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "(Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;)I", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConfigurationExtKt {

    @NotNull
    private static final Map<Integer, Integer> QUALITY_PROFILE_MAPPER = r0.k(new Pair(240, 7), new Pair(Integer.valueOf(DefaultFrameSampler.DESIRED_FRAME_WIDTH), 4), new Pair(720, 5), new Pair(1080, 6), new Pair(Integer.valueOf(DateTimeConstants.MINUTES_PER_DAY), 11), new Pair(2160, 8));

    @NotNull
    public static final Map<Integer, Integer> getQUALITY_PROFILE_MAPPER() {
        return QUALITY_PROFILE_MAPPER;
    }

    public static final int getVideoQualityProfile(@NotNull SdkConfiguration.DocumentCapture documentCapture) {
        Intrinsics.checkNotNullParameter(documentCapture, "<this>");
        Integer num = QUALITY_PROFILE_MAPPER.get(Integer.valueOf(documentCapture.getVideoQuality()));
        if (num == null) {
            Timber.INSTANCE.e("Document Video Quality couldn't be mapped. Using a default profile", new Object[0]);
            num = 6;
        }
        return num.intValue();
    }

    public static final int getVideoQualityProfile(@NotNull SdkConfiguration.LivenessCapture livenessCapture) {
        Intrinsics.checkNotNullParameter(livenessCapture, "<this>");
        Integer num = QUALITY_PROFILE_MAPPER.get(Integer.valueOf(livenessCapture.getVideoQuality()));
        if (num == null) {
            Timber.INSTANCE.e("Selfie Video Quality couldn't be mapped. Using a default profile", new Object[0]);
            num = 6;
        }
        return num.intValue();
    }
}
