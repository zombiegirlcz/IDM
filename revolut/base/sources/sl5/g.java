package sl5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import smd.l;
import sqd.w;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264152a;

    public /* synthetic */ g(int i) {
        this.f264152a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        List list;
        switch (this.f264152a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 1:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 2:
                Throwable th12 = (Throwable) obj2;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                if (th12 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th12, h0Var);
                }
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 3:
                Throwable error = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (map == null) {
                    return error;
                }
                return null;
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new l((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), smd.d.f264410a, f0.f322471a);
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new snc.f(null);
            case 6:
                snd.c old2 = (snd.c) obj2;
                snd.c cVar = (snd.c) obj3;
                KProperty[] kPropertyArr = AnalyticsDashboardController.f87528r0;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(cVar, "new");
                return Boolean.valueOf(Intrinsics.f(old2.f264523a, cVar.f264523a));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.SMALL, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 12:
                Set accumulatedPockets = (Set) obj2;
                Data delistedPockets = (Data) obj3;
                Intrinsics.checkNotNullParameter(accumulatedPockets, "accumulatedPockets");
                Intrinsics.checkNotNullParameter(delistedPockets, "delistedPockets");
                eda.a aVar = (eda.a) delistedPockets.getContent();
                if (aVar != null && (list = aVar.f124959b) != null) {
                    accumulatedPockets.addAll(list);
                }
                return accumulatedPockets;
            case 13:
                Set accumulatedVaults = (Set) obj2;
                Data vaultData = (Data) obj3;
                Intrinsics.checkNotNullParameter(accumulatedVaults, "accumulatedVaults");
                Intrinsics.checkNotNullParameter(vaultData, "vaultData");
                List list2 = (List) vaultData.getContent();
                if (list2 != null) {
                    accumulatedVaults.addAll(list2);
                }
                return accumulatedVaults;
            case 14:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new sob.f((List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null)));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
            case 17:
                Throwable error2 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list3 == null) {
                    return error2;
                }
                return null;
            case 18:
                Throwable error3 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (model2 == null) {
                    return error3;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 21:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null));
            case 22:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 23:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List banners = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(banners, "banners");
                throw null;
            case 24:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List banners2 = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(banners2, "banners");
                throw null;
            case 25:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new w((List) getDefaultErrorItems7.invoke(new iii.d(12, null, true, false, null)));
            case 26:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 28:
                Throwable error4 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list4 == null) {
                    return error4;
                }
                return null;
            default:
                Throwable error5 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pair == null) {
                    return error5;
                }
                return null;
        }
    }

    public /* synthetic */ g(sq2.b bVar, int i) {
        this.f264152a = i;
    }
}
