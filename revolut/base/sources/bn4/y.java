package bn4;

import aw0.m6;
import aw0.n6;
import bq7.e;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.balance_history.models.BalancePendingError;
import com.revolut.rxdata.core.CompositeException;
import ip0.zj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.g1;
import x2h.b;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17103a;

    public /* synthetic */ y(int i) {
        this.f17103a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f17103a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                if (((Boolean) obj3) == null) {
                    return th10;
                }
                return null;
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 3:
                Throwable error2 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pair == null) {
                    return error2;
                }
                return null;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                Throwable th11 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th11;
                }
                return null;
            case 6:
                Throwable th12 = (Throwable) obj2;
                if (((of8.b) obj3) == null) {
                    return th12;
                }
                return null;
            case 7:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 8:
                Data data = (Data) obj3;
                Integer num = (Integer) org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data, "feedsData", "inboxData");
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = (Integer) data.getContent();
                int iIntValue2 = iIntValue + (num2 != null ? num2.intValue() : 0);
                return iIntValue2 == 0 ? yna.x.f315383a : new yna.y(iIntValue2);
            case 9:
                Throwable error3 = (Throwable) obj2;
                uib.c cVar = (uib.c) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cVar == null) {
                    return error3;
                }
                return null;
            case 10:
                Throwable error4 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool == null) {
                    return error4;
                }
                return null;
            case 11:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar == null) {
                    return error5;
                }
                return null;
            case 12:
                Throwable error6 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (iVar2 == null) {
                    return error6;
                }
                return null;
            case 13:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new bq7.i((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), null, e.a.f17775a);
            case 14:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new br4.z(br4.w.f17925a, (List) defaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null)));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new brc.r(iii.c.b(null, null, 6, false));
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((Throwable) obj2) instanceof BalancePendingError ? new FullScreenStateDelegate.Model("CHART_ID", new TextLocalisedClause(R$string.analytics_total_wealth_chart_processing_title, null, null, 14), new TextLocalisedClause(R$string.analytics_total_wealth_chart_processing_subtitle, null, null, 14), null, null, null, false, null, null, false, R$attr.uikit_dp32, R$attr.uikit_dp48, 25592) : new FullScreenStateDelegate.Model("CHART_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
            case 17:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 18:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 19:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 20:
                Throwable th13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                Throwable illegalStateException = new IllegalStateException("GroupDetails Mapper error");
                if (th13 != null) {
                    illegalStateException = new CompositeException(zhm.v.k(illegalStateException, th13));
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new bt9.n(zhm.u.c(model), null);
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new btl.e(b.C1676b.f302573a);
            case 23:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new bu4.i((List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)), bu4.f.f18676a);
            case 24:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new bv4.g((List) errorItems.invoke(new iii.d(14, null, true, false, null)));
            case 25:
                Throwable error7 = (Throwable) obj2;
                g1 g1Var = (g1) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (g1Var == null) {
                    return error7;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return bvb.w.f();
        }
    }

    public /* synthetic */ y(Object obj2, int i) {
        this.f17103a = i;
    }
}
