package b94;

import aw0.f4;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;
import zhm.a1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4 f13657b;

    public /* synthetic */ p(f4 f4Var, int i) {
        this.f13656a = i;
        this.f13657b = f4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13656a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, this.f13657b.f10303a, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 1:
                dfg.e update2 = (dfg.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                f4 f4Var = this.f13657b;
                boolean z = f4Var.f10304b;
                String str = f4Var.f10303a;
                return dfg.e.a(update2, null, null, z ? a1.m(update2.f113894c, str) : a1.j(update2.f113894c, str), null, 11);
            case 2:
                grd.a update3 = (grd.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                String str2 = this.f13657b.f10303a;
                return grd.a.a(update3, null, null, null, str2, a1.m(update3.i, str2), null, false, null, null, null, 32383);
            case 3:
                grd.a update4 = (grd.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Set set = update4.i;
                Set setM = update4.f145987j;
                f4 f4Var2 = this.f13657b;
                if (set.contains(f4Var2.f10303a)) {
                    setM = a1.m(setM, f4Var2.f10303a);
                }
                return grd.a.a(update4, null, null, null, null, null, setM, false, null, null, null, 32127);
            default:
                h0f.e update5 = (h0f.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return h0f.e.a(update5, null, null, this.f13657b.f10303a, null, 27);
        }
    }
}
