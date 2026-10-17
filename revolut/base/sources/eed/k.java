package eed;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f125196b;

    public /* synthetic */ k(n nVar, int i) {
        this.f125195a = i;
        this.f125196b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        s vault = (s) obj2;
        switch (this.f125195a) {
            case 0:
                Intrinsics.checkNotNullParameter(vault, "vault");
                return ue0.e.v(this.f125196b.f.f251201a.l0(true)).f(w.j(vault));
            default:
                Intrinsics.checkNotNullParameter(vault, "vault");
                qq8.a aVar = this.f125196b.f125203c;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return rd0.e.c(rd0.e.b(nim.a.w(aVar.f248500a.R(), new aed.c(aVar, vault, 7))), kotlin.coroutines.g.f186406a);
        }
    }
}
