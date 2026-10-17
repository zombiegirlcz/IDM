package gi1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f144047b;

    public /* synthetic */ p(c0 c0Var, int i) {
        this.f144046a = i;
        this.f144047b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144046a) {
            case 0:
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return k.a(update, sh1.h.a(update.f144028a, null, null, null, null, new sh1.g(((vi1.s) this.f144047b).f289518a, null, 6), null, null, null, null, null, null, null, 8159), null, null, null, true, null, null, null, null, null, null, 65518);
            case 1:
                k update2 = (k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return k.a(update2, sh1.h.a(update2.f144028a, null, new sh1.g(((vi1.j) this.f144047b).f289506a, null, 6), null, null, null, null, null, null, null, null, null, null, 8187), null, null, null, true, null, null, null, null, null, null, 65518);
            case 2:
                k update3 = (k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return k.a(update3, sh1.h.a(update3.f144028a, null, null, new sh1.g(((vi1.q) this.f144047b).f289515a.getName(), null, 6), null, null, null, null, null, null, null, null, null, 8183), null, null, null, true, null, null, null, null, null, null, 65518);
            case 3:
                grd.a update4 = (grd.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return grd.a.a(update4, ((ird.c) this.f144047b).f168042a, null, null, null, null, null, false, null, null, null, 32763);
            default:
                oog.g update5 = (oog.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return oog.g.a(update5, null, ((jbl.a) this.f144047b).f172653a, null, 5);
        }
    }
}
