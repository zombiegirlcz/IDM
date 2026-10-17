package a82;

import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.graph.Controller3A;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlowContract$FlowState;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlowContract$PagerItem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2013c;

    public /* synthetic */ n(boolean z, boolean z3, int i) {
        this.f2011a = i;
        this.f2012b = z;
        this.f2013c = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List pagerItems;
        int i = this.f2011a;
        boolean z = false;
        boolean z3 = this.f2013c;
        boolean z4 = this.f2012b;
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                if (!z4 && !z3) {
                    z = true;
                }
                return c.a(cVar, null, z, 1);
            case 1:
                xi0.b it8 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z6 = cp5.d.z(it8) && !z4;
                if (cp5.d.y(it8) && !z3) {
                    z = true;
                }
                if (!z6 && !z) {
                    return it8;
                }
                xi0.b.Companion.getClass();
                return xi0.b.i;
            case 2:
                TransactionsDayNightLimitsFlowContract$FlowState transactionsDayNightLimitsFlowContract$FlowState = (TransactionsDayNightLimitsFlowContract$FlowState) obj2;
                bwc.d dVar = z4 ? bwc.d.INDIA : z3 ? bwc.d.MEXICO : bwc.d.BRAZIL;
                TransactionsDayNightLimitsFlowContract$PagerItem.Day day = TransactionsDayNightLimitsFlowContract$PagerItem.Day.f85714a;
                TransactionsDayNightLimitsFlowContract$PagerItem.Daily daily = TransactionsDayNightLimitsFlowContract$PagerItem.Daily.f85713a;
                if (z4 || z3) {
                    pagerItems = zhm.u.c(daily);
                } else {
                    TransactionsDayNightLimitsFlowContract$PagerItem[] elements = {day, TransactionsDayNightLimitsFlowContract$PagerItem.Night.f85715a, daily, TransactionsDayNightLimitsFlowContract$PagerItem.Other.f85716a};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    pagerItems = kotlin.collections.d.L(elements);
                }
                String f89793a = z4 ? daily.getF79006a() : day.getF79006a();
                transactionsDayNightLimitsFlowContract$FlowState.getClass();
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new TransactionsDayNightLimitsFlowContract$FlowState(f89793a, pagerItems, dVar);
            case 3:
                c42.a aVar = (c42.a) obj2;
                if (!z4 && !z3) {
                    z = true;
                }
                return c42.a.a(aVar, null, null, z, 27);
            case 4:
                return cvl.l.a((cvl.l) obj2, null, null, null, null, null, null, null, null, null, null, false, this.f2012b, this.f2013c, 2047);
            case 5:
                g62.d dVar2 = (g62.d) obj2;
                if (!z4 && !z3) {
                    z = true;
                }
                return g62.d.a(dVar2, null, z, 1);
            case 6:
                gc1.j jVar = (gc1.j) obj2;
                gc1.i[] elements2 = {z4 ? gc1.g.f142300a : null, z3 ? gc1.f.f142299a : null, null};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return gc1.j.a(jVar, kotlin.collections.d.L(elements2), null, 2);
            case 7:
                qc2.b bVar = (qc2.b) obj2;
                if (!z4 && !z3) {
                    z = true;
                }
                return qc2.b.a(bVar, null, z, 1);
            case 8:
                ts1.b bVar2 = (ts1.b) obj2;
                if (!z4 && !z3) {
                    z = true;
                }
                return ts1.b.a(bVar2, null, z, 1);
            case 9:
                uv1.l lVar = (uv1.l) obj2;
                return uv1.l.a(lVar, null, uv1.k.a(lVar.f283280b, (!z4) & (!z3), null, 2), null, null, null, 29);
            case 10:
                v0f.u update = (v0f.u) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v0f.u.a(update, null, null, null, null, null, null, null, null, false, this.f2012b, this.f2013c, false, false, false, 14847);
            case 11:
                return v0f.u.a((v0f.u) obj2, null, null, null, null, null, null, null, null, false, false, false, false, false, (z4 || z3) ? false : true, 8191);
            case 12:
                return v4a.e.a((v4a.e) obj2, null, null, null, null, this.f2012b, this.f2013c, null, 159);
            case 13:
                vh2.c cVar2 = (vh2.c) obj2;
                if (!z4 && !z3) {
                    z = true;
                }
                return vh2.c.a(cVar2, null, z, 1);
            case 14:
                wzb.f update2 = (wzb.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wzb.f.a(update2, null, z4 || z3, null, false, 13);
            case 15:
                yed.o updateState = (yed.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return yed.o.a(updateState, null, null, null, null, false, this.f2012b, null, null, null, null, this.f2013c, null, false, null, null, null, 1044415);
            default:
                return Boolean.valueOf(Controller3A.createLock3AForCaptureExitConditions$lambda$0(z4, z3, (FrameMetadata) obj2));
        }
    }
}
