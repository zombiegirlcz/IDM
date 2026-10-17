package wl3;

import com.revolut.core.ui_kit.browser.InAppBrowserView;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewActivity;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wk2.x;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements kfm.o, kfm.g, kfm.p, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f298373b;

    public /* synthetic */ b(Function function, int i) {
        this.f298372a = i;
        this.f298373b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f298372a;
        Function function = this.f298373b;
        switch (i) {
            case 2:
                ((x) function).invoke(obj2);
                break;
            case 9:
                ((wlh.g) function).invoke(obj2);
                break;
            case 14:
                int i2 = InAppBrowserView.f51517l;
                ((wo0.d) function).invoke(obj2);
                break;
            case 18:
                ((wnc.x) function).invoke(obj2);
                break;
            default:
                ((x) function).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f298372a;
        Function function = this.f298373b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((wb3.k) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((wje.m) function).invoke(p0);
            case 2:
            case 3:
            case 8:
            case 9:
            case 14:
            case 18:
            case 22:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wp5.r) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zm3.j) ((wje.m) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((d) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((wg2.g) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((wg2.g) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((x) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wm.g) ((d) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wm.h) ((d) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wm.f) ((d) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wg2.g) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q06.j) ((wnc.x) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wg2.g) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((wnc.x) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wo5.a) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((t9f.n) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((wnc.x) function).invoke(p0);
                return Boolean.TRUE;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((wnc.x) function).invoke(p0);
            case 25:
                int i2 = CryptoWithdrawToAddressReviewActivity.A0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((wnc.x) function).invoke(p0);
            case 26:
                int i3 = CryptoWithdrawToAddressReviewActivity.A0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((wnc.x) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((wp5.r) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f298372a) {
            case 3:
                wje.m mVar = (wje.m) this.f298373b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) mVar.invoke(p0)).booleanValue();
            default:
                return ((Boolean) ((d) this.f298373b).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        wm9.k kVar = (wm9.k) this.f298373b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) kVar.invoke(p0, p17);
    }
}
