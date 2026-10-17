package a5a;

import android.os.Parcelable;
import c5a.n;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.ui.flow.ChatFlow;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlow;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$InputData;
import dy0.n0;
import dy0.o;
import j30.f;
import jma.k;
import k4a.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tla.e;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements dtb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.d f1331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f1332c;
    public final vqi.a d;

    public d(e profileFlowControllerProvider, j30.d moneyAssistanceDestinationProvider, v newTransferScreenProvider, vqi.a menuItemsRegistry) {
        Intrinsics.checkNotNullParameter(profileFlowControllerProvider, "profileFlowControllerProvider");
        Intrinsics.checkNotNullParameter(moneyAssistanceDestinationProvider, "moneyAssistanceDestinationProvider");
        Intrinsics.checkNotNullParameter(newTransferScreenProvider, "newTransferScreenProvider");
        Intrinsics.checkNotNullParameter(menuItemsRegistry, "menuItemsRegistry");
        this.f1330a = profileFlowControllerProvider;
        this.f1331b = moneyAssistanceDestinationProvider;
        this.f1332c = newTransferScreenProvider;
        this.d = menuItemsRegistry;
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a a(o direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = a.f1326a[direction.ordinal()];
        if (i == 1) {
            return ((k) this.f1330a).a();
        }
        ChatFlow chatFlowA = null;
        if (i == 2) {
            return v.a(this.f1332c, com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a, null, null, 10);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            chatFlowA = ((f) this.f1331b).a(new ChatEntryPoint("payments"));
        }
        if (chatFlowA != null) {
            return chatFlowA;
        }
        throw new IllegalArgumentException("Sliding to " + direction + " is not supported in transfer tab");
    }

    @Override // dtb.b
    public final n0 b() {
        return new c(this, 0);
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a c(Parcelable parcelable) {
        TransferDestination.ChatTransfer chatTransfer = parcelable instanceof TransferDestination.ChatTransfer ? (TransferDestination.ChatTransfer) parcelable : null;
        boolean z = false;
        if (chatTransfer != null && chatTransfer.f80034b) {
            z = true;
        }
        return new TabPaymentsFlow(new TabPaymentsFlowContract$InputData.ChatInputData(new ChatTransferScreenContract$InputData(n.EMBEDDED, z, true, chatTransfer != null ? chatTransfer.f80035c : null)));
    }
}
