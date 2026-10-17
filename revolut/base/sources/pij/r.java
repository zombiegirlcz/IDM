package pij;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$GiftRecipientData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ModalStep;
import dej.q3;
import dej.r3;
import dej.s3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Map map;
        ?? arrayList;
        String str;
        EsimDevicePickerControllerScreenContract$GiftRecipientData esimDevicePickerControllerScreenContract$GiftRecipientData;
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarE3 = this.v.R2();
        String itemId = model.f53337a;
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE3;
        cli.y yVar = bVar.f101081e0;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "DEVICE_PICKER_ITEM") && (map = (Map) ((v) ((j2) yVar.f22677a).getValue()).f236590r.getContent()) != null) {
            Set setKeySet = map.keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : setKeySet) {
                if (obj3 instanceof q3) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                UserDevice userDevice = ((q3) it8.next()).f113630a;
                if (userDevice != null) {
                    arrayList3.add(userDevice);
                }
            }
            if (((jte.d) bVar.P).c(EsimApi$Toggles.EsimGifting.f100175c)) {
                arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    s3 s3Var = (s3) entry.getKey();
                    List list = (List) entry.getValue();
                    if (s3Var instanceof q3) {
                        esimDevicePickerControllerScreenContract$GiftRecipientData = null;
                    } else {
                        if (!(s3Var instanceof r3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        esimDevicePickerControllerScreenContract$GiftRecipientData = new EsimDevicePickerControllerScreenContract$GiftRecipientData(((r3) s3Var).f113643a, list.size());
                    }
                    if (esimDevicePickerControllerScreenContract$GiftRecipientData != null) {
                        arrayList.add(esimDevicePickerControllerScreenContract$GiftRecipientData);
                    }
                }
            } else {
                arrayList = zhm.f0.f322471a;
            }
            if (arrayList.size() + arrayList3.size() < 2) {
                IllegalStateException illegalStateException = new IllegalStateException("Can not open view picker: views list is less than 2");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", null, illegalStateException, h0Var);
            } else {
                c0 view = ((v) ((j2) yVar.f22677a).getValue()).f236587n.getView();
                if ((view instanceof z) || view == null) {
                    str = "ID_ALL_PLANS_OPTION";
                } else if (view instanceof a0) {
                    str = ((a0) view).f236525a;
                } else {
                    if (!(view instanceof b0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((b0) view).f236529a.f100268a;
                }
                oki.h.v2(bVar.f0, new EsimSubscriptionsScreenContract$ModalStep.ViewSelection(str, arrayList3, arrayList), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
