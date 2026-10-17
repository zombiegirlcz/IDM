package yv2;

import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e f317117b;

    public /* synthetic */ n(com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e eVar, int i) {
        this.f317116a = i;
        this.f317117b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f317116a) {
            case 0:
                vv2.d result = (vv2.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, vv2.b.f292437a);
                com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e eVar = this.f317117b;
                if (zF) {
                    eVar.I2(false, g.SHOW_NEW_PIN);
                } else if (Intrinsics.f(result, vv2.c.f292438a)) {
                    eVar.I2(true, g.SHOW_PREVIOUS_OR_SINGLE_PIN);
                } else {
                    if (!Intrinsics.f(result, vv2.a.f292436a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.C2(a.C0460a.f64424a);
                }
                return Unit.f186387a;
            default:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                long jLongValue = it8.longValue();
                this.f317117b.getClass();
                if (jLongValue == 0) {
                    jLongValue = 1;
                }
                return Long.valueOf(jLongValue);
        }
    }
}
