package o99;

import com.revolut.feature.confirmation_code.data.OtpTask;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration;
import com.revolut.feature.onboarding.impl.esignature.data.network.ESignatureService;
import efm.d0;
import ft3.h1;
import gim.i;
import java.util.List;
import kc9.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p5a.m;
import q99.e;
import q99.f;
import te0.w;
import ufm.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements pk3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p99.c f223141a;

    public a(p99.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f223141a = repository;
    }

    @Override // pk3.a
    public final Object a(OtpTask otpTask, h1 h1Var, i iVar) {
        String id10 = otpTask.getF78555a();
        p99.c cVar = this.f223141a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Object objA = nim.a.a(w.g0(cVar.f234287b.resendOtp(id10)), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // pk3.a
    public final Object b(OtpTask otpTask, String code, h1 h1Var, Continuation continuation) {
        String id10 = otpTask.getF78555a();
        p99.c cVar = this.f223141a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Object objA = nim.a.a(w.g0(cVar.f234287b.confirmESignature(id10, new q99.a(code))), continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final n c(ESignatureProcess signatureProcess) {
        Intrinsics.checkNotNullParameter(signatureProcess, "signatureProcess");
        p99.c cVar = this.f223141a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(signatureProcess, "signatureProcess");
        d0<q99.c> eSignatureDetails = cVar.f234287b.getESignatureDetails(signatureProcess.f78147a);
        p8k.b bVar = new p8k.b(4, new h(signatureProcess, 2));
        eSignatureDetails.getClass();
        ufm.i iVar = new ufm.i(eSignatureDetails, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    public final n d(List documentIds, ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration, String str) {
        y89.a aVar;
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        p99.c cVar = this.f223141a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        ESignatureService eSignatureService = cVar.f234287b;
        String strName = null;
        String str2 = eSignatureWorkflowConfiguration != null ? eSignatureWorkflowConfiguration.f78149a : null;
        if (eSignatureWorkflowConfiguration != null && (aVar = eSignatureWorkflowConfiguration.f78150b) != null) {
            strName = aVar.name();
        }
        d0<e> d0VarInitESignature = eSignatureService.initESignature(new f(str2, strName, documentIds), str);
        p8k.b bVar = new p8k.b(5, new m(17));
        d0VarInitESignature.getClass();
        ufm.i iVar = new ufm.i(d0VarInitESignature, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }
}
