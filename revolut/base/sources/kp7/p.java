package kp7;

import java.io.IOException;
import java.util.Map;
import kl7.g1;
import kl7.n2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e f188192b;

    public /* synthetic */ p(com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar, int i) {
        this.f188191a = i;
        this.f188192b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        switch (this.f188191a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                y0 y0VarA = vl7.a.a(15, null, null, null);
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar = this.f188192b;
                yji.l.a1(eVar, eVar.X1(y0VarA), null, null, new com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.b(eVar, null), 3);
                return Boolean.TRUE;
            default:
                j updateState = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                g1 g1VarB2 = this.f188192b.B2();
                Map mapW = updateState.f188179c;
                String str = g1VarB2.f185319a;
                boolean zBooleanValue = true;
                if (((Boolean) mapW.get(str)) != null) {
                    mapW = foh.i.w(str, Boolean.valueOf(!r3.booleanValue()), mapW);
                }
                Boolean bool = (Boolean) mapW.get(str);
                if (bool == null) {
                    throw new IllegalStateException("should contain item");
                }
                n2 n2Var = bool.booleanValue() ? g1VarB2.e : g1VarB2.d;
                Map map = updateState.d;
                if ((n2Var != null ? n2Var.f185366c : null) == null) {
                    zBooleanValue = false;
                } else if (n2Var.f185365b != null) {
                    zBooleanValue = ((Boolean) map.getOrDefault(str, Boolean.valueOf(g1VarB2.f.d))).booleanValue();
                }
                return j.a(updateState, null, null, mapW, foh.i.w(str, Boolean.valueOf(zBooleanValue), map), null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
        }
    }
}
