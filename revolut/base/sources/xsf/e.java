package xsf;

import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsAdditionalInfoScreen f308466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f308467b;

    public e(TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen, n nVar) {
        this.f308466a = transferReasonsAdditionalInfoScreen;
        this.f308467b = nVar;
    }

    @Override // zp0.c
    public final void k(String rawValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(rawValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        com.revolut.feature.transfer_reasons.impl.ui.additional_info.a aVar = (com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) this.f308466a.R2();
        aVar.getClass();
        n model = this.f308467b;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        String strL = m70.a.l(rawValue);
        aVar.H2(aVar.f92381q, new xpe.c(model, new s(strL != null ? aVar.f92380p.p(strL, aVar.o.f92374a.f115083b) : null, strL), 13));
    }
}
