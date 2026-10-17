package qsa;

import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsScreen;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.feature.selfserve.sot.impl.ui.description.AddDescriptionFragment;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.ui.push.PushEventTrackerService;
import efm.h0;
import efm.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f248764b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f248763a = i;
        this.f248764b = function1;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f248763a;
        Function1 function1 = this.f248764b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((qpb.i) function1).invoke(p0);
            case 1:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((qz9.b) function1).invoke(p0);
            case 2:
                KProperty[] kPropertyArr2 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((qpb.i) function1).invoke(p0);
            case 3:
                KProperty[] kPropertyArr3 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((qpb.i) function1).invoke(p0);
            case 4:
                KProperty[] kPropertyArr4 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((qpb.i) function1).invoke(p0);
            case 5:
                KProperty[] kPropertyArr5 = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((qpb.i) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((qi3.i) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((qi3.i) function1).invoke(p0);
            case 17:
                CodeEditor.Companion aVar = CodeEditor.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((qwd.o) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (aii.u) ((qwd.o) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) ((qpb.a) function1).invoke(p0);
            case 20:
                int i2 = AddDescriptionFragment.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CharSequence) ((qwd.o) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((qtb.c) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((qz9.b) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((qz9.b) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((qz9.k) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((qz9.b) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((qz9.o) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((qpb.a) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((qz9.b) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f248763a;
        Function1 function1 = this.f248764b;
        switch (i) {
            case 1:
                KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                PushEventTrackerService.Companion aVar = PushEventTrackerService.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                KProperty[] kPropertyArr2 = BlikSettingsScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                KProperty[] kPropertyArr3 = BlikSettingsScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                KProperty[] kPropertyArr4 = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                KProperty[] kPropertyArr5 = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                KProperty[] kPropertyArr6 = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                KProperty[] kPropertyArr7 = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((qwd.o) function1).invoke(p0)).booleanValue();
    }
}
