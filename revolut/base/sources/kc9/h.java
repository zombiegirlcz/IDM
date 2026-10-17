package kc9;

import com.revolut.feature.onboarding.api.esignature.UnsupportedESignatureStateException;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ESignatureProcess f182676b;

    public /* synthetic */ h(ESignatureProcess eSignatureProcess, int i) {
        this.f182675a = i;
        this.f182676b = eSignatureProcess;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws UnsupportedESignatureStateException {
        int i = this.f182675a;
        ESignatureProcess signatureProcess = this.f182676b;
        switch (i) {
            case 0:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new d(signatureProcess);
            case 1:
                mc9.d update2 = (mc9.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                boolean z = update2.f204312b;
                update2.getClass();
                return new mc9.d(signatureProcess, z);
            default:
                q99.c eSignatureDetailsDto = (q99.c) obj2;
                Intrinsics.checkNotNullParameter(eSignatureDetailsDto, "eSignatureDetailsDto");
                Object obj3 = q99.d.f243840a;
                Intrinsics.checkNotNullParameter(eSignatureDetailsDto, "<this>");
                Intrinsics.checkNotNullParameter(signatureProcess, "signatureProcess");
                k89.b bVar = (k89.b) u1.v(eSignatureDetailsDto.getState(), q99.d.f243840a);
                if (bVar != null) {
                    return new ESignatureDetails(signatureProcess, bVar, eSignatureDetailsDto.getInputDocumentIds());
                }
                String message = "state " + eSignatureDetailsDto.getState() + " is not supported";
                Intrinsics.checkNotNullParameter(message, "message");
                throw new UnsupportedESignatureStateException(message);
        }
    }
}
