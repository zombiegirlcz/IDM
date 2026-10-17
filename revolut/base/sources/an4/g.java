package an4;

import anc.n;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import hha.h0;
import hha.i0;
import ip0.p20;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import prk.o;
import qv0.c;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6560a;

    public /* synthetic */ g(int i) {
        this.f6560a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        i0 i0Var;
        i0 i0Var2;
        switch (this.f6560a) {
            case 0:
                Throwable error = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 2:
                String email1 = (String) obj2;
                String str = (String) data;
                Intrinsics.checkNotNullParameter(email1, "email1");
                return o.m(str, "email2", email1, str);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return n.f6753a;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return Boolean.FALSE;
            case 5:
                Throwable error2 = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pair == null) {
                    return error2;
                }
                return null;
            case 6:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 7:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 8:
                Throwable error4 = (Throwable) obj2;
                l35.e eVar = (l35.e) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (eVar == null) {
                    return error4;
                }
                return null;
            case 9:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 10:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 11:
                Throwable error6 = (Throwable) obj2;
                l71.d dVar = (l71.d) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (dVar == null) {
                    return error6;
                }
                return null;
            case 12:
                Throwable error7 = (Throwable) obj2;
                do3.n nVar = (do3.n) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (nVar == null) {
                    return error7;
                }
                return null;
            case 13:
                Throwable error8 = (Throwable) obj2;
                zlg.n nVar2 = (zlg.n) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (nVar2 == null) {
                    return error8;
                }
                return null;
            case 14:
                Throwable error9 = (Throwable) obj2;
                do3.n nVar3 = (do3.n) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (nVar3 == null) {
                    return error9;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 16:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 17:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                Intrinsics.checkNotNullParameter("ID_PLAN", "listId");
                int i = R$attr.uikit_dp16;
                p20 p20Var = new p20();
                p20Var.f165757a = c.d.f249513a;
                p20Var.f165758b = i;
                p20Var.f165759c = i;
                p20Var.d = i;
                p20Var.e = i;
                p20Var.f = null;
                p20Var.f165760g = null;
                p20Var.f165761h = null;
                p20Var.i = null;
                return u.c(p20Var);
            case 18:
                Data data2 = (Data) data;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data2, "prev", "next");
                h0 h0Var = null;
                h0 h0Var2 = (pricingPlanSubscription == null || (i0Var2 = pricingPlanSubscription.f81135l) == null) ? null : i0Var2.f152315h;
                PricingPlanSubscription pricingPlanSubscription2 = (PricingPlanSubscription) data2.getContent();
                if (pricingPlanSubscription2 != null && (i0Var = pricingPlanSubscription2.f81135l) != null) {
                    h0Var = i0Var.f152315h;
                }
                return Boolean.valueOf(h0Var2 == h0Var);
            case 19:
                Data data3 = (Data) data;
                return Boolean.valueOf(Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data3, "prev", "next"), data3.getContent()));
            case 20:
                Throwable error10 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (bool == null) {
                    return error10;
                }
                return null;
            case 21:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ap0.d);
            case 22:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ap0.h);
            case 23:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                return e;
            case 24:
                ((Boolean) obj2).booleanValue();
                return wk5.n.NOT_RESTRICTED;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Function1 errorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return (List) errorItems.invoke(new iii.d(12, null, false, true, null));
            case 27:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 28:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            default:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
        }
    }
}
