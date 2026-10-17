package ia1;

import fa1.y;
import ga1.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f159927a;

    public d(tl0.a base64Util) {
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        this.f159927a = base64Util;
    }

    public final y a(p dto) {
        fa1.b bVar;
        byte[] bArrA;
        fa1.b bVar2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String paymentId = dto.getPaymentId();
        String state = dto.getState();
        fa1.d.Companion.getClass();
        fa1.d dVar = (fa1.d) u1.t(state, fa1.d.UNKNOWN, fa1.d.mapping);
        String text = dto.getPaymentMethod().getErrorCode();
        List listQ0 = null;
        if (text != null) {
            fa1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            fa1.b[] bVarArrValues = fa1.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar2 = null;
                    break;
                }
                bVar2 = bVarArrValues[i];
                if (a0.z(bVar2.a(), text, true)) {
                    break;
                }
                i++;
            }
            if (bVar2 == null) {
                bVar2 = fa1.b.UNKNOWN;
            }
            bVar = bVar2;
        } else {
            bVar = null;
        }
        String receiptUrl = dto.getReceiptUrl();
        boolean signatureRequired = dto.getPaymentMethod().getSignatureRequired();
        String emvTags = dto.getPaymentMethod().getEmvTags();
        if (emvTags != null && (bArrA = this.f159927a.a(emvTags)) != null) {
            listQ0 = kotlin.collections.d.q0(bArrA);
        }
        return new y(paymentId, dVar, bVar, receiptUrl, signatureRequired, listQ0, dto.getPaymentMethod().getFetchDebugLogs());
    }
}
