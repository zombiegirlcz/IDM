package clk;

import alc.k;
import cni.n;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.network.NetworkChangedReceiver;
import com.revolut.oauth.impl.ui.consent.screen.a;
import csj.o;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lr6.w;
import od0.i;
import rd0.d;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25044a;

    public /* synthetic */ b(int i) {
        this.f25044a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f25044a) {
            case 0:
                Throwable error = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (pricingPlanSubscription == null) {
                    return error;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 4:
                Throwable error2 = (Throwable) obj2;
                k kVar = (k) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (kVar == null) {
                    return error2;
                }
                return null;
            case 5:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                    return error3;
                }
                return null;
            case 6:
                Throwable error4 = (Throwable) obj2;
                i iVar = (i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 7:
                Throwable error5 = (Throwable) obj2;
                i iVar2 = (i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar2 == null) {
                    return error5;
                }
                return null;
            case 8:
                zli.b skippedDeeplink = (zli.b) obj2;
                String reason = (String) obj3;
                Intrinsics.checkNotNullParameter(skippedDeeplink, "skippedDeeplink");
                Intrinsics.checkNotNullParameter(reason, "reason");
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.b(rd0.c.INFO, "DeeplinkCoordinator", a0.d.s("Skip unified deeplink ", skippedDeeplink.a(), ": ", reason), null, null, 16);
                return Unit.f186387a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 12:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new n(a.C0599a.f98493a, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), null);
            case 13:
                Throwable error6 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (model == null) {
                    return error6;
                }
                return null;
            case 14:
                Throwable error7 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (model2 == null) {
                    return error7;
                }
                return null;
            case 15:
                return SplitBillRepositoryImpl.getSplitBillDetailsForRequestor$lambda$0((Throwable) obj2, (List) obj3);
            case 16:
                return NetworkChangedReceiver.getCurrentWallet$lambda$0((Throwable) obj2, (fo3.c) obj3);
            case 17:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new cpb.i((List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)), false);
            case 18:
                Throwable error8 = (Throwable) obj2;
                i iVar3 = (i) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (iVar3 == null) {
                    return error8;
                }
                return null;
            case 19:
                Throwable error9 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription2 = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (pricingPlanSubscription2 == null) {
                    return error9;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 21:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
                f0 f0Var = f0.f322471a;
                return new o(list, f0Var, f0Var, false, false);
            case 23:
                Throwable error10 = (Throwable) obj2;
                nel.n nVar = (nel.n) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (nVar == null) {
                    return error10;
                }
                return null;
            case 24:
                Throwable error11 = (Throwable) obj2;
                nel.n nVar2 = (nel.n) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (nVar2 == null) {
                    return error11;
                }
                return null;
            case 25:
                Throwable error12 = (Throwable) obj2;
                nel.n nVar3 = (nel.n) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (nVar3 == null) {
                    return error12;
                }
                return null;
            case 26:
                Throwable error13 = (Throwable) obj2;
                nel.n nVar4 = (nel.n) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (nVar4 == null) {
                    return error13;
                }
                return null;
            case 27:
                Throwable error14 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (pair == null) {
                    return error14;
                }
                return null;
            case 28:
                Throwable error15 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (list2 == null) {
                    return error15;
                }
                return null;
            default:
                Throwable error16 = (Throwable) obj2;
                w wVar = (w) obj3;
                Intrinsics.checkNotNullParameter(error16, "error");
                if (wVar == null) {
                    return error16;
                }
                return null;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f25044a = i;
    }
}
