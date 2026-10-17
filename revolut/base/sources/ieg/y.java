package ieg;

import au0.u0;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.retail.feature.pod_nominees.impl.details.a;
import gig.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.j1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160742a;

    public /* synthetic */ y(int i) {
        this.f160742a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f160742a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return c0.b();
            case 1:
                oei.b category = (oei.b) obj3;
                Intrinsics.checkNotNullParameter((HotelsAmenity) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(category, "category");
                return Boolean.valueOf(category == oei.b.FOOD_AND_DRINK);
            case 2:
                oei.b category2 = (oei.b) obj3;
                Intrinsics.checkNotNullParameter((HotelsAmenity) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(category2, "category");
                return Boolean.valueOf(category2 != oei.b.FOOD_AND_DRINK);
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new iek.j(a.C0628a.f102587a, (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null)));
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new iga.i((List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)), new iga.f(new u0(NavBarWithContainerBackground.TransparentBackground.f57882a, null, null, null), null, null), null);
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return b.AbstractC0588b.C0589b.f95783a;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return b.a.C0587b.f95781a;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 17:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 19:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th10 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return i.a.f144194a;
            case 21:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 22:
                Throwable error2 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar == null) {
                    return error2;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new ij4.i((List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)));
            case 24:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, false, true, null));
            case 25:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                    return error3;
                }
                return null;
            case 26:
                Throwable error4 = (Throwable) obj2;
                j1 j1Var = (j1) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (j1Var == null) {
                    return error4;
                }
                return null;
            case 27:
                Throwable error5 = (Throwable) obj2;
                zh9.a aVar = (zh9.a) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (aVar == null) {
                    return error5;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ijj.h.f161808a;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }
}
