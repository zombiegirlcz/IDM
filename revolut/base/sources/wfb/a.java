package wfb;

import hgb.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297024a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f297025b;

    public a(i iVar, k kVar) {
        this.f297025b = iVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f297024a) {
            case 0:
                return new ugb.f((xfb.s) this.f297025b.G.get(), new bib.a(), new ugb.g());
            default:
                hgb.a claimDeadlineProvider = new hgb.a();
                Intrinsics.checkNotNullParameter(claimDeadlineProvider, "claimDeadlineProvider");
                d0 d0Var = new d0();
                hgb.b bVar = new hgb.b();
                i iVar = this.f297025b;
                xfb.s sVar = (xfb.s) iVar.G.get();
                wzi.a aVarA = ((ctj.b) iVar.f297044j).a();
                vc.s.j(aVarA);
                q06.d dVarA = iVar.k.a();
                vc.s.j(dVarA);
                q06.l lVarA = iVar.f297045l.a();
                vc.s.j(lVarA);
                return new com.revolut.feature.retail.salary_account.impl.salary_hub.a(d0Var, bVar, sVar, aVarA, dVarA, lVarA);
        }
    }

    public a(i iVar) {
        this.f297025b = iVar;
    }
}
