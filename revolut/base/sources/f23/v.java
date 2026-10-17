package f23;

import com.revolut.feature.card_order_new.api.SelectedTab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectedTab f131419b;

    public /* synthetic */ v(SelectedTab selectedTab, int i) {
        this.f131418a = i;
        this.f131419b = selectedTab;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f131418a) {
            case 0:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, null, this.f131419b.getD(), null, null, null, false, ISO781611.SMT_TAG);
            default:
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zhm.u.c(it8.booleanValue() ? this.f131419b : SelectedTab.DEBIT);
        }
    }
}
