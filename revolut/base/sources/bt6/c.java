package bt6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18314a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18315b;

    public c(b bVar) {
        this.f18315b = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f18314a) {
            case 0:
                return new com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a(this.f18315b.e());
            default:
                t37.c cVar = new t37.c();
                b bVar = this.f18315b;
                a61.a aVarA = bVar.a();
                ang.f fVarE = bVar.f18301m.e();
                x47.a analyticsContextProvider = new x47.a();
                t37.b clauseFactory = new t37.b();
                Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
                Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a(cVar, aVarA, fVarE, new r37.l());
        }
    }

    public c(b bVar, p pVar) {
        this.f18315b = bVar;
    }
}
