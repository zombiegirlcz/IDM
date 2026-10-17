package ybh;

import com.revolut.retail.trading.core.domain.PocketInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b f312310b;

    public /* synthetic */ g0(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, int i) {
        this.f312309a = i;
        this.f312310b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f312309a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(this.f312310b.B.Z2(it8));
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(this.f312310b.B.Z2(it9));
            default:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) hVar.f288433a).booleanValue();
                m1h.h hVar2 = (m1h.h) hVar.f288434b;
                PocketInfo pocketInfo = (PocketInfo) hVar.f288435c;
                return this.f312310b.z.a(new m1h.f(zBooleanValue, hVar2.f201496a, pocketInfo.getF104478b().f115083b, (od0.i) hVar.d));
        }
    }
}
