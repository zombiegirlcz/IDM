package rif;

import com.revolut.feature.transfer_reasons.models.reason.TransferReason;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import gsf.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.a0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f {
    public static final TransferReasonNode a(n nVar) {
        ttf.c cVar;
        String code = nVar.getCode();
        if (code == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TransactionTransferReasonsDtoMapper", "Failed to map transfer reason node, missing code", null, h0Var);
            return null;
        }
        String type = nVar.getType();
        if (type != null) {
            ttf.c[] cVarArrValues = ttf.c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i];
                if (a0.z(cVar.name(), type, true)) {
                    break;
                }
                i++;
            }
            if (cVar != null) {
                int i2 = e.f254584b[cVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String label = nVar.getLabel();
                    jo3.a amount = nVar.getAmount();
                    return new TransferReason(amount != null ? mo3.a.o(amount) : null, code, label);
                }
                String label2 = nVar.getLabel();
                List children = nVar.getChildren();
                if (children == null) {
                    children = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = children.iterator();
                while (it8.hasNext()) {
                    TransferReasonNode transferReasonNodeA = a((n) it8.next());
                    if (transferReasonNodeA != null) {
                        arrayList.add(transferReasonNodeA);
                    }
                }
                return new TransferReasonCategory(code, label2, arrayList, (ttf.e) null, 18);
            }
        }
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "TransactionTransferReasonsDtoMapper", a0.d.s("Failed to map transfer reason node '", code, "', unknown type: ", nVar.getType()), null, h0Var2);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ttf.a b(gsf.m r16) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rif.f.b(gsf.m):ttf.a");
    }
}
