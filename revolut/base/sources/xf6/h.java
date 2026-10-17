package xf6;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304869b;

    public /* synthetic */ h(t tVar, int i) {
        this.f304868a = i;
        this.f304869b = tVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f304868a) {
            case 0:
                t tVar = this.f304869b;
                xg6.l lVar = (xg6.l) tVar.f305073n0.get();
                zja.a aVarA = ((ika.b) tVar.z).a();
                vc.s.j(aVarA);
                return new com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c(lVar, aVarA, (le6.c) tVar.f305074o0.get());
            default:
                t tVar2 = this.f304869b;
                return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a((bh6.j) tVar2.K0.get(), (xg6.r) tVar2.P0.get(), (xg6.l) tVar2.f305073n0.get(), new zca.b());
        }
    }
}
