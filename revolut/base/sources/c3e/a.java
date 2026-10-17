package c3e;

import bzg.t;
import c2d.n;
import efm.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lk0.g;
import rfm.h;
import rfm.u;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20938b;

    public /* synthetic */ a(c cVar, int i) {
        this.f20937a = i;
        this.f20938b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20937a) {
            case 0:
                c cVar = this.f20938b;
                bwd.a aVar = new bwd.a(cVar, 15);
                f3e.b bVar = new f3e.b(12);
                n nVar = new n(27);
                return new lk0.d(aVar, new a(cVar, 1), new t(cVar, 21), bVar, nVar, new n(26), yk0.d.a());
            default:
                g gVar = (g) this.f20938b.f20940b.f();
                if (gVar != null) {
                    u uVarG = k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                h hVar = h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
        }
    }
}
