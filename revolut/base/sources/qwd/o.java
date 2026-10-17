package qwd;

import android.widget.TextView;
import aw0.x4;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.selfserve.sot.impl.ui.description.AddDescriptionFragment;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import com.revolut.feature.transport.models.transit.TransitTicketEligibility;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State;
import com.revolut.ui.push.PushEventTrackerService;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249872a;

    public /* synthetic */ o(int i) {
        this.f249872a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f249872a) {
            case 0:
                m state = (m) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return state.f249866g;
            case 1:
                m state2 = (m) obj2;
                Intrinsics.checkNotNullParameter(state2, "state");
                return (io3.d) state2.f249866g.getContent();
            case 2:
                m update = (m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return m.a(update, 0L, null, null, false, new Data(null, null, true, 3, null), null, null, null, 959);
            case 3:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j61.c cVar = (j61.c) d0.d0(it8);
                if (cVar != null) {
                    return cVar.f171656a;
                }
                return null;
            case 4:
                String str = ((fo3.c) obj2).f136805h;
                if (str != null) {
                    return str;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 5:
                InputTextDelegate.Model it9 = (InputTextDelegate.Model) obj2;
                KProperty[] kPropertyArr = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.P instanceof TransportCheckoutField);
            case 6:
                InputTextDelegate.Model it10 = (InputTextDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.P instanceof TransportCheckoutField);
            case 7:
                CellDetailsDelegate.Model it11 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.o instanceof TransitTicketEligibility);
            case 8:
                CellDetailsDelegate.Model it12 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = TransitCheckoutScreen.f92560k0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.o instanceof Quote);
            case 9:
                qwf.o updateState = (qwf.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return qwf.o.a(updateState, 0L, null, null, null, null, null, new Data(null, null, false, 7, null), null, 767);
            case 10:
                qwf.o updateState2 = (qwf.o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return qwf.o.a(updateState2, 0L, null, null, null, null, null, null, null, 511);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.b(pb0.Companion, "payWithItemLoadingId", false, 0, false, 30);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new gu("REV_POINTS_OPTIONS_SECTION_TITLE_LOADING_ID", 0, 0, 30));
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it13 = intRange.iterator();
                while (it13.f289625c) {
                    t1 t1Var = new t1(a0.d.n("REV_POINTS_OPTION_ITEM_LOADING_ID_PREFIX_", it13.nextInt()), null, 6);
                    yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(t1Var);
                }
                eVarB.add(new hg("REV_POINTS_OPTIONS_SECTION_LOADING_ID", arrayList, 3, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624));
                return zhm.u.a(eVarB);
            case 13:
                AirportLoungePassDetailsFlowContract$State update2 = (AirportLoungePassDetailsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return AirportLoungePassDetailsFlowContract$State.a(update2, false, null, null, null, 62);
            case 14:
                AirportLoungePassDetailsFlowContract$State update3 = (AirportLoungePassDetailsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return AirportLoungePassDetailsFlowContract$State.a(update3, false, null, null, null, 39);
            case 15:
                Intrinsics.checkNotNullParameter((iyi.b) obj2, "it");
                return Unit.f186387a;
            case 16:
                return AirportLoungePassDetailsFlowContract$State.a((AirportLoungePassDetailsFlowContract$State) obj2, false, null, null, null, 59);
            case 17:
                mm0.o session = (mm0.o) obj2;
                PushEventTrackerService.Companion aVar = PushEventTrackerService.INSTANCE;
                Intrinsics.checkNotNullParameter(session, "session");
                return Boolean.valueOf((session instanceof mm0.n) || (session instanceof mm0.p));
            case 18:
                TextView it14 = (TextView) obj2;
                CodeEditor.Companion companion = CodeEditor.INSTANCE;
                Intrinsics.checkNotNullParameter(it14, "it");
                CharSequence text = it14.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                return text;
            case 19:
                qx0.c cVar2 = (qx0.c) obj2;
                CodeEditor.Companion companion2 = CodeEditor.INSTANCE;
                Intrinsics.checkNotNullParameter(cVar2, "<destruct>");
                return cVar2.f249975a;
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 22:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new ox6.o((List) getDefaultLoadingItems.invoke());
            case 23:
                qx8.f update4 = (qx8.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                boolean z = update4.f250035b;
                update4.getClass();
                return new qx8.f(true, z);
            case 24:
                qx8.f update5 = (qx8.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                boolean z3 = update5.f250034a;
                update5.getClass();
                return new qx8.f(z3, true);
            case 25:
                qxd.e eVar = (qxd.e) obj2;
                return new Pair(eVar.f250073a, eVar.f250074b);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return qxg.g.b();
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return qxg.g.b();
            case 28:
                FeatureCommand it15 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return u0.b(it15);
            default:
                InputTextDelegate.TextData it16 = (InputTextDelegate.TextData) obj2;
                int i = AddDescriptionFragment.g0;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f52598b;
        }
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f249872a = i;
    }
}
