package m1i;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0 implements efm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pri.b f201562b;

    public /* synthetic */ l0(pri.b bVar, int i) {
        this.f201561a = i;
        this.f201562b = bVar;
    }

    @Override // efm.f
    public final void d(efm.d it8) {
        switch (this.f201561a) {
            case 0:
                i1 i1Var = (i1) this.f201562b;
                Intrinsics.checkNotNullParameter(it8, "it");
                i1Var.F = true;
                break;
            default:
                nae.q qVar = (nae.q) this.f201562b;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((pae.h) qVar.f213881m.f234543c).x0().set(new HashSet());
                break;
        }
    }
}
