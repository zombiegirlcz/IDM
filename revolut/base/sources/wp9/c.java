package wp9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplitBillsSummaryScreen f299174b;

    public /* synthetic */ c(SplitBillsSummaryScreen splitBillsSummaryScreen, int i) {
        this.f299173a = i;
        this.f299174b = splitBillsSummaryScreen;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        g0 g0Var;
        String str;
        int i = this.f299173a;
        int i2 = 2;
        SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299174b;
        switch (i) {
            case 0:
                RowDelegate.Model item = (RowDelegate.Model) obj2;
                MaskedTextInputEditText field = (MaskedTextInputEditText) obj3;
                KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj4 = item.u;
                g0Var = obj4 instanceof g0 ? (g0) obj4 : null;
                if (g0Var != null) {
                    return new zp0.d(field, g0Var.f299184c, (u80.d) splitBillsSummaryScreen.N.getValue(), new b(new c(splitBillsSummaryScreen, i2), field, g0Var.d, new vx9.v(splitBillsSummaryScreen, 26, g0Var, field)), null, false, false, 0, false, null, 2032);
                }
                throw new IllegalStateException("RowDelegate.Model.parcel must be ValueInputParcel");
            case 1:
                RowDelegate.Model item2 = (RowDelegate.Model) obj2;
                MaskedTextInputEditText field2 = (MaskedTextInputEditText) obj3;
                KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj5 = item2.u;
                g0Var = obj5 instanceof g0 ? (g0) obj5 : null;
                if (g0Var == null) {
                    throw new IllegalStateException("RowDelegate.Model.parcel must be ValueInputParcel");
                }
                String str2 = item2.f53228a;
                int i3 = e.f299179c[g0Var.f299183b.ordinal()];
                if (i3 == 1) {
                    str = "[000000000000]";
                } else if (i3 == 2) {
                    str = "[000]";
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "[0000]";
                }
                return new zp0.y(field2, null, str, new ag.p(splitBillsSummaryScreen, 21, g0Var, field2), str2, null, false, 98);
            default:
                String amount = (String) obj2;
                String currencyCode = (String) obj3;
                KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                u80.p pVar = u80.p.f278066a;
                return Long.valueOf(u80.p.a(amount, currencyCode, (qd0.b) splitBillsSummaryScreen.O.getValue(), null));
        }
    }
}
