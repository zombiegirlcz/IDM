package hqk;

import a12.m;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.raffle.api.navigation.RaffleDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import com.youTransactor.uCube.rpc.Constants;
import ggk.g1;
import ggk.n0;
import ggk.o0;
import h30.l;
import hu1.o;
import io3.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.h;
import od0.i;
import tof.va;
import whf.p;
import zhm.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154735a;

    public /* synthetic */ a(int i) {
        this.f154735a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k kVar;
        int i = this.f154735a;
        i iVar = i.f224256b;
        switch (i) {
            case 0:
                Map pocketIdsToPocketMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(pocketIdsToPocketMap, "pocketIdsToPocketMap");
                return new va(pocketIdsToPocketMap.keySet());
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h hVar = i.Companion;
                vm4.b bVar = new vm4.b(f0.f322471a);
                hVar.getClass();
                return h.a(bVar);
            case 2:
                g1 layout = (g1) obj2;
                Intrinsics.checkNotNullParameter(layout, "layout");
                String str = layout.f143719b;
                List list = layout.f143722h;
                ArrayList arrayList = new ArrayList();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    a0.x(((o0) it9.next()).d, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((n0) obj3).e) {
                        arrayList2.add(obj3);
                    }
                }
                return new gr4.c(str, arrayList2.size());
            case 3:
                w4d.i displayAmountModel = (w4d.i) obj2;
                Intrinsics.checkNotNullParameter(displayAmountModel, "displayAmountModel");
                for (w4d.h hVar2 : displayAmountModel.f294552c) {
                    if (hVar2.f294548a.equals(displayAmountModel.f294551b)) {
                        return hVar2.f294549b;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 4:
                i.Companion.getClass();
                return h.a(obj2);
            case 5:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                i.Companion.getClass();
                return iVar;
            case 6:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                i.Companion.getClass();
                return iVar;
            case 7:
                amd.d group = (amd.d) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                if (group.d.f115082a < 0 || group.f6313b.isEmpty()) {
                    return null;
                }
                return group;
            case 8:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : pockets) {
                    io3.d dVar = (io3.d) obj4;
                    if (l.D(xi0.b.Companion, dVar.f163147c) && ((kVar = dVar.f) == k.ACTIVE || kVar == k.INACTIVE)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 9:
                tel.d it12 = (tel.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f270123a;
            case 10:
                BiometricVerificationDocumentStepFlowContract$Step it13 = (BiometricVerificationDocumentStepFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13 instanceof BiometricVerificationDocumentStepFlowContract$Step.DocumentCountryPicker);
            case 11:
                BiometricVerificationDocumentStepFlowContract$Step it14 = (BiometricVerificationDocumentStepFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14 instanceof BiometricVerificationDocumentStepFlowContract$Step.CardDetails);
            case 12:
                hw0.k kVar2 = (hw0.k) obj2;
                TrendView.Companion companion = TrendView.INSTANCE;
                return "(" + kVar2.f156008c + "," + kVar2.f156007b + ")";
            case 13:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 14:
                ht2.i update = (ht2.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ht2.i.a(update, null, null, null, false, null, false, null, false, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 15:
                RaffleDestination it15 = (RaffleDestination) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.TRUE;
            case 16:
                RaffleDestination destination = (RaffleDestination) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                return new q06.h(destination, new q06.b(new MainScreenTab("crypto"), null));
            case 17:
                SelectableDelegate.Model it16 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = TransferReasonsScreen.T;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj5 = it16.k;
                if (obj5 instanceof TransferReasonNode) {
                    return (TransferReasonNode) obj5;
                }
                return null;
            case 18:
                SingleChoiceDelegate.Model it17 = (SingleChoiceDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TransferReasonsScreen.T;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj6 = it17.f;
                if (obj6 instanceof TransferReasonNode) {
                    return (TransferReasonNode) obj6;
                }
                return null;
            case 19:
                Boolean isInvalidPasscode = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isInvalidPasscode, "isInvalidPasscode");
                return isInvalidPasscode.booleanValue() ? etg.a.SHOW_PROMPT : etg.a.NOTHING;
            case 20:
                t it18 = (t) obj2;
                KProperty[] kPropertyArr3 = BlikCodeScreen.f61658n0;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f54722b.f51590a, "REGISTRATION_PROMPT_ACTION_WIDGET_ID"));
            case 21:
                ReferralContactDelegate.Model it19 = (ReferralContactDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = BlikCodeScreen.f61658n0;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj7 = it19.f53167l;
                if (obj7 instanceof BlikContact) {
                    return (BlikContact) obj7;
                }
                return null;
            case 22:
                o updateState = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return o.a(updateState, null, null, null, true, true, false, false, null, null, 487);
            case 23:
                List it20 = (List) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new a12.c(it20);
            case 24:
                o updateState2 = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return o.a(updateState2, null, null, null, false, false, false, false, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 25:
                o updateState3 = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return o.a(updateState3, null, null, null, true, false, false, false, null, null, 503);
            case 26:
                return new m(f0.f322471a, (p) obj2);
            case 27:
                return o.a((o) obj2, null, null, null, false, false, true, false, null, null, 479);
            case 28:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return (List) loadingItems.invoke();
            default:
                Function0 it21 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return iii.c.c(3);
        }
    }
}
