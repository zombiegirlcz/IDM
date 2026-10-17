package cul;

import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pdf.c f109144b;

    public /* synthetic */ o0(pdf.c cVar, int i) {
        this.f109143a = i;
        this.f109144b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f109143a) {
            case 0:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                pdf.c cVar = this.f109144b;
                return v.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, new FrequencySettings(cVar.f235170a, cVar.f235171b), null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 8191);
            default:
                hul.h update2 = (hul.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                pdf.c cVar2 = this.f109144b;
                return hul.h.a(update2, new FrequencySettings(cVar2.f235170a, cVar2.f235171b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285);
        }
    }
}
