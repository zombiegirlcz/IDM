package ub1;

import aii.g;
import cc1.c;
import com.revolut.feature.acquiring.card_reader.ui.api.navigation.CardReaderFlowDestination;
import com.revolut.feature.acquiring.card_reader.ui.api.navigation.CardReaderTipsSettingsDestination$TipsSettings;
import com.revolut.feature.acquiring.card_reader.ui.api.navigation.CardReaderTipsSettingsDestination$TipsSettingsBridge;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlow;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import xb1.b;
import xb1.e;
import xb1.u;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ohi.a {
    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
        b.Companion.b();
        u.Companion.b();
        e.Companion.b();
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof sb1.a) {
            return ((sb1.a) descriptor).a(new CardReaderRootFlow(new CardReaderRootFlowContract$InputData(c.DEFAULT)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, CardReaderFlowDestination.CardReader.f60609b) || Intrinsics.f(destination, CardReaderFlowDestination.CardReaderBridge.f60610b)) {
            return new CardReaderRootFlow(new CardReaderRootFlowContract$InputData(c.DEFAULT));
        }
        if (Intrinsics.f(destination, CardReaderFlowDestination.PaymentLinkSettings.f60612b)) {
            return new CardReaderRootFlow(new CardReaderRootFlowContract$InputData(c.LINK_SETTINGS));
        }
        if (Intrinsics.f(destination, CardReaderTipsSettingsDestination$TipsSettings.f60613b) || Intrinsics.f(destination, CardReaderTipsSettingsDestination$TipsSettingsBridge.f60614b)) {
            return new CardReaderRootFlow(new CardReaderRootFlowContract$InputData(c.TIPS_SETTINGS));
        }
        if (Intrinsics.f(destination, CardReaderFlowDestination.CardReaderSettingsBridge.f60611b)) {
            return new CardReaderRootFlow(new CardReaderRootFlowContract$InputData(c.CARD_READER_SETTINGS));
        }
        return null;
    }
}
