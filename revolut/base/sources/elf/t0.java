package elf;

import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Sender;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends yji.n implements s0 {
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        JuniorBlockInboundTransferNavigation$Mode block;
        boolean z;
        if (a10.b.B(akf.v1.Companion, akf.t1.BLOCK_JUNIOR_INBOUND_TRANSFER_SENDER_ID, str) || Intrinsics.f(str, "ID_UNBLOCK_JUNIOR_INBOUND_TRANSFER_SENDER_ACTION_ITEM")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.transactions.impl.ui.kompot.details.models.JuniorBlockInboundSenderData");
            cmf.i iVar = (cmf.i) obj2;
            kq8.e eVar = iVar.f25240g;
            String str2 = eVar.f188341b;
            String str3 = iVar.f25237a;
            String str4 = iVar.f25238b;
            String str5 = iVar.f25239c;
            String str6 = iVar.d;
            do3.c cVar = iVar.e;
            if (cVar == null) {
                cVar = do3.c.PERSONAL;
            }
            JuniorBlockInboundTransferNavigation$Sender sender = new JuniorBlockInboundTransferNavigation$Sender(str2, str3, str4, str5, str6, cVar, null);
            if (eVar.f188342c) {
                block = new JuniorBlockInboundTransferNavigation$Mode.Unblock(sender);
            } else {
                Intrinsics.checkNotNullParameter(sender, "sender");
                block = new JuniorBlockInboundTransferNavigation$Mode.Block(zhm.u.c(sender));
            }
            yji.n.P2(this, o2(new lq8.a(new JuniorBlockInboundTransferNavigation$Junior(eVar.f188340a, iVar.f), block, true)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
