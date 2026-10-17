package i3g;

import ip0.la0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la0 f158214b;

    public /* synthetic */ h(la0 la0Var, int i) {
        this.f158213a = i;
        this.f158214b = la0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158213a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, null, null, a1.m(update.f158211c, this.f158214b.f165153a), 3);
            case 1:
                f update2 = (f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return f.a(update2, null, null, a1.j(update2.f158211c, this.f158214b.f165153a), 3);
            case 2:
                sdg.g update3 = (sdg.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return sdg.g.a(update3, null, null, null, d0.F0(this.f158214b.f165153a, update3.d), 7);
            default:
                sdg.g update4 = (sdg.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return sdg.g.a(update4, null, null, null, d0.A0(update4.d, this.f158214b.f165153a), 7);
        }
    }
}
