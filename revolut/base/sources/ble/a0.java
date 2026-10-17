package ble;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionWidgetDelegate.Model f16553c;

    public /* synthetic */ a0(List list, ActionWidgetDelegate.Model model, int i) {
        this.f16551a = i;
        this.f16552b = list;
        this.f16553c = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16551a) {
            case 0:
                TabInvestControllerContract$State update = (TabInvestControllerContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List list = this.f16552b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                int i = 0;
                for (Object objE : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i == 0) {
                        objE = ActionWidgetDelegate.Model.e(this.f16553c, null, new AnimationRequest(false), null, 4193279);
                    }
                    arrayList.add(objE);
                    i = i2;
                }
                return TabInvestControllerContract$State.c(update, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, zi0.c.P(arrayList, false, null, 3), null, null, null, null, null, null, 2130706431);
            case 1:
                TabAccountsScreenContract$State update2 = (TabAccountsScreenContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List list2 = this.f16552b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                int i3 = 0;
                for (Object objE2 : list2) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i3 == 0) {
                        objE2 = ActionWidgetDelegate.Model.e(this.f16553c, null, new AnimationRequest(false), null, 4193279);
                    }
                    arrayList2.add(objE2);
                    i3 = i5;
                }
                return TabAccountsScreenContract$State.a(update2, null, null, null, null, zi0.c.P(arrayList2, false, null, 3), null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, null, 4194287);
            case 2:
                nje.f updateState = (nje.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                List list3 = this.f16552b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                int i6 = 0;
                for (Object objE3 : list3) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i6 == 0) {
                        objE3 = ActionWidgetDelegate.Model.e(this.f16553c, null, new AnimationRequest(false), null, 4193279);
                    }
                    arrayList3.add(objE3);
                    i6 = i21;
                }
                return nje.f.a(updateState, zi0.c.P(arrayList3, false, null, 3), null, null, null, null, null, null, 126);
            default:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a updateState2 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                List list4 = this.f16552b;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                int i22 = 0;
                for (Object objE4 : list4) {
                    int i32 = i22 + 1;
                    if (i22 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i22 == 0) {
                        objE4 = ActionWidgetDelegate.Model.e(this.f16553c, null, new AnimationRequest(false), null, 4193279);
                    }
                    arrayList4.add(objE4);
                    i22 = i32;
                }
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a(updateState2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, arrayList4, false, null, null, null, null, false, null, null, null, 268173311);
        }
    }
}
