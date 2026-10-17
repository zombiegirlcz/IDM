package znc;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import ql4.d0;
import tof.a3;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323697a;

    public /* synthetic */ j(int i) {
        this.f323697a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f323697a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 1:
                ind.f old2 = (ind.f) obj2;
                ind.f fVar = (ind.f) obj3;
                AnalyticsDetailsController.Companion aVar = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(fVar, "new");
                return Boolean.valueOf(Intrinsics.f(old2.f162801a, fVar.f162801a));
            case 2:
                Throwable error = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                xnd.l lVar = (xnd.l) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (lVar == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                jnd.d dVar = (jnd.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                rnd.h hVar = (rnd.h) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (hVar == null) {
                    return error4;
                }
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar2 == null) {
                    return error5;
                }
                return null;
            case 7:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 9:
                Throwable error6 = (Throwable) obj2;
                DateTime dateTime = (DateTime) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (dateTime == null) {
                    return error6;
                }
                return null;
            case 10:
                Throwable error7 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list == null) {
                    return error7;
                }
                return null;
            case 11:
                Throwable error8 = (Throwable) obj2;
                DateTime dateTime2 = (DateTime) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (dateTime2 == null) {
                    return error8;
                }
                return null;
            case 12:
                Context context = (Context) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(context, "context");
                return Integer.valueOf(Math.min(iIntValue - kli.a.k(context, 108.0f), kli.a.k(context, 280.0f)));
            case 13:
                Context context2 = (Context) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(context2, "context");
                return Integer.valueOf(Math.min(iIntValue2, kli.a.k(context2, 388.0f)));
            case 14:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 16:
                Throwable error9 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list2 == null) {
                    return error9;
                }
                return null;
            case 17:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new zo2.g((List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null)), false, false);
            case 18:
                Throwable error10 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list3 == null) {
                    return error10;
                }
                return null;
            case 19:
                Throwable error11 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (model == null) {
                    return error11;
                }
                return null;
            case 20:
                Throwable th10 = (Throwable) obj2;
                if (((vm4.a) obj3) == null) {
                    return th10;
                }
                return null;
            case 21:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(10, null, true, false, "ERROR_STATE_ID"));
            case 22:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new zqf.e(null, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)), false);
            case 23:
                Throwable th11 = (Throwable) obj2;
                if (((a3) obj3) == null) {
                    return th11;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.c(5);
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 26:
                Throwable error12 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list4 == null) {
                    return error12;
                }
                return null;
            case 27:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new zrd.g((List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)));
            case 28:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            default:
                Throwable error13 = (Throwable) obj2;
                d0 d0Var = (d0) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (d0Var == null) {
                    return error13;
                }
                return null;
        }
    }
}
