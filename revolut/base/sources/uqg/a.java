package uqg;

import ccb.j;
import l80.e;
import tqg.i;
import wsg.n;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements xbb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f282125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f282126c;
    public final /* synthetic */ xua.a d;
    public final /* synthetic */ com.revolut.domain.interactors.transactions.a e;

    public /* synthetic */ a(e eVar, n nVar, xua.a aVar, com.revolut.domain.interactors.transactions.a aVar2, int i) {
        this.f282124a = i;
        this.f282125b = eVar;
        this.f282126c = nVar;
        this.d = aVar;
        this.e = aVar2;
    }

    @Override // xbb.d
    public final j a() {
        switch (this.f282124a) {
            case 0:
                return new i(this.f282125b, this.f282126c, this.d, this.e);
            default:
                return new u8e.j(this.f282125b, this.f282126c, this.d, this.e);
        }
    }
}
