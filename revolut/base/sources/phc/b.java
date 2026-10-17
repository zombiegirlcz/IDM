package phc;

import cgc.n;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsActivity;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import efm.w;
import ggc.e0;
import ggc.i0;
import ggc.j0;
import ggc.l;
import java.util.List;
import java.util.Set;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pfk.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f236252b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f236251a = i;
        this.f236252b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f236251a;
        Function1 function1 = this.f236252b;
        switch (i) {
            case 26:
                CmsStoriesScreen.Companion aVar = CmsStoriesScreen.INSTANCE;
                ((pj3.a) function1).invoke(obj2);
                break;
            default:
                ((pjg.h) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f236251a;
        Function1 function1 = this.f236252b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((h0) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((c) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((e) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j0) ((e) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) ((e) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i0) ((e) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Integer) ((e) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) ((l3d.f) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l) ((e) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e0) ((e) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l) ((e) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((l1.e) function1).invoke(p0);
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                int i2 = TrustedMerchantDetailsActivity.y0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((pj9.n) function1).invoke(p0);
                return Boolean.FALSE;
            case 20:
                KProperty[] kPropertyArr = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (EsimProfile) ((e) function1).invoke(p0);
            case 22:
                KProperty[] kPropertyArr2 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (EsimProfile) ((e) function1).invoke(p0);
            case 27:
                int i3 = TrustedMerchantDetailsActivity.y0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((pj9.n) function1).invoke(p0);
                return Boolean.TRUE;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f236251a;
        Function1 function1 = this.f236252b;
        switch (i) {
            case 15:
                KProperty[] kPropertyArr = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                KProperty[] kPropertyArr2 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                KProperty[] kPropertyArr3 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                KProperty[] kPropertyArr4 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                KProperty[] kPropertyArr5 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
            case 22:
            default:
                KProperty[] kPropertyArr6 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                KProperty[] kPropertyArr7 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                KProperty[] kPropertyArr8 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                KProperty[] kPropertyArr9 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((pij.d) function1).invoke(p0)).booleanValue();
    }
}
