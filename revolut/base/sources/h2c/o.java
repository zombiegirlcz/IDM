package h2c;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import p2c.z;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a f148781b;

    public /* synthetic */ o(com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar, int i) {
        this.f148780a = i;
        this.f148781b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        switch (this.f148780a) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar = this.f148781b;
                aVar.f84156q.getClass();
                yji.l.a1(aVar, aVar.X1(new y0(null, z.a(throwable), false, 5)), null, null, null, 7);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar2 = this.f148781b;
                aVar2.f84156q.getClass();
                yji.l.a1(aVar2, aVar2.X1(new y0(null, z.a(throwable), false, 5)), null, null, null, 7);
                break;
        }
        return Boolean.TRUE;
    }
}
