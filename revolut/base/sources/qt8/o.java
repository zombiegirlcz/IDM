package qt8;

import com.revolut.camera.SignInSelfieVideoExposureExperiment;
import com.revolut.camera.VideoMaxFpsExperiment;
import com.revolut.camera.VideoStartDelayExperiment;
import com.revolut.feature.kyc.core.impl.kyc.UserKycService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.z;
import okhttp3.MultipartBody$Part;
import ulm.e1;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserKycService f249036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m31.c f249037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oy8.b f249038c;

    public o(UserKycService kycService, m31.c multipartHelper, oy8.b videoSelfieMetadataHelper) {
        Intrinsics.checkNotNullParameter(kycService, "kycService");
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
        Intrinsics.checkNotNullParameter(videoSelfieMetadataHelper, "videoSelfieMetadataHelper");
        this.f249036a = kycService;
        this.f249037b = multipartHelper;
        this.f249038c = videoSelfieMetadataHelper;
    }

    public static final MultipartBody$Part a(o oVar, av.a scanType) {
        String str;
        Long lN;
        String strE;
        oy8.b bVar = oVar.f249038c;
        Map externalMetadataParams = q0.c(new Pair("mask", null));
        bz8.a aVar = (bz8.a) bVar;
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(externalMetadataParams, "externalMetadataParams");
        kg.o oVar2 = aVar.d;
        Pair pair = new Pair("scanType", scanType.a());
        xu.g gVar = aVar.f19935a;
        gVar.getClass();
        try {
            ih0.b bVar2 = gVar.f308848a;
            SignInSelfieVideoExposureExperiment.f50681c.getClass();
            strE = ((ii0.b) bVar2).e("EID_SIGN_IN_SELFIE_VIDEO_EXPOSURE");
            if (d0.W(strE)) {
                strE = null;
            }
        } catch (Throwable unused) {
        }
        Integer numM = strE != null ? z.m(strE) : null;
        boolean z = false;
        Pair pair2 = new Pair("videoExposureCompensation", Integer.valueOf(numM != null ? numM.intValue() : 0));
        xu.h hVar = aVar.f19936b;
        hVar.getClass();
        try {
            ih0.b bVar3 = hVar.f308849a;
            VideoMaxFpsExperiment videoMaxFpsExperiment = VideoMaxFpsExperiment.f50682c;
            videoMaxFpsExperiment.getClass();
            String strE2 = ((ii0.b) bVar3).e("EID_VIDEO_MAX_FPS");
            if (d0.W(strE2)) {
                strE2 = null;
            }
            if (strE2 != null) {
                b0m.b.Companion.getClass();
                b0m.b bVarA = b0m.a.a(strE2);
                if (bVarA != null) {
                    if (bVarA == videoMaxFpsExperiment.f107371b) {
                        z = true;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        Pair pair3 = new Pair("videoFpsAdjusted", Boolean.valueOf(z));
        xu.j jVar = aVar.f19937c;
        jVar.getClass();
        try {
            ih0.b bVar4 = jVar.f308851a;
            VideoStartDelayExperiment.f50683c.getClass();
            String strE3 = ((ii0.b) bVar4).e("EID_VIDEO_START_DELAY");
            str = d0.W(strE3) ? null : strE3;
        } catch (Throwable unused3) {
        }
        long jLongValue = (str == null || (lN = z.n(str)) == null) ? 0L : lN.longValue();
        String strK = oVar2.k(r0.k(pair, new Pair("metaData", r0.p(externalMetadataParams, r0.k(pair2, pair3, new Pair("videoStartDelay", Long.valueOf(jLongValue)))))));
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        MultipartBody$Part.Companion.getClass();
        return e1.b("info", strK);
    }
}
