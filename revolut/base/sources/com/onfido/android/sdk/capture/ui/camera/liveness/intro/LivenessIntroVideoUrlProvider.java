package com.onfido.android.sdk.capture.ui.camera.liveness.intro;

import com.google.android.gms.internal.mlkit_vision_face.a;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LivenessIntroVideoIndexEmpty;
import io.reactivex.rxjava3.core.Single;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import tgm.b;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoUrlProvider;", "", "()V", "random", "Ljava/security/SecureRandom;", "getRandom", "()Ljava/security/SecureRandom;", "random$delegate", "Lkotlin/Lazy;", "getIndexUrl", "Lio/reactivex/rxjava3/core/Single;", "", "getVideoUrl", "videoUrlsList", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LivenessIntroVideoUrlProvider {

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy random = j.b(LivenessIntroVideoUrlProvider$random$2.INSTANCE);

    @NotNull
    private static final String LIVENESS_INTRO_VIDEO_NAME_ROOT = "liveness_intro";

    private SecureRandom getRandom() {
        return (SecureRandom) this.random.getValue();
    }

    @NotNull
    public Single<String> getIndexUrl() {
        b bVarF = Single.f("https://assets.onfido.com/mobile-sdk-assets/android/v2/index.json");
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }

    @NotNull
    public Single<String> getVideoUrl(@NotNull List<String> videoUrlsList) {
        ArrayList arrayListY = a.y("videoUrlsList", videoUrlsList);
        for (Object obj2 : videoUrlsList) {
            if (d0.J((String) obj2, "liveness_intro", false)) {
                arrayListY.add(obj2);
            }
        }
        if (arrayListY.isEmpty()) {
            return Single.e(new LivenessIntroVideoIndexEmpty());
        }
        return Single.f("https://assets.onfido.com/mobile-sdk-assets/android/v2/" + ((String) arrayListY.get(getRandom().nextInt(arrayListY.size()))));
    }
}
