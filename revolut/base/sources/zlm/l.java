package zlm;

import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.z;
import ulm.h1;

/* JADX INFO: loaded from: classes13.dex */
public final class l {
    public static m a(String statusLine) throws ProtocolException {
        h1 h1Var;
        int i;
        String strSubstring;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        if (a0.H(statusLine, "HTTP/1.", false)) {
            i = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt == 0) {
                h1Var = h1.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                h1Var = h1.HTTP_1_1;
            }
        } else if (a0.H(statusLine, "ICY ", false)) {
            h1Var = h1.HTTP_1_0;
            i = 4;
        } else {
            if (!a0.H(statusLine, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            h1Var = h1.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (statusLine.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String strSubstring2 = statusLine.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Integer numM = z.m(strSubstring2);
        if (numM == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int iIntValue = numM.intValue();
        if (statusLine.length() <= i2) {
            strSubstring = "";
        } else {
            if (statusLine.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            strSubstring = statusLine.substring(i + 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return new m(h1Var, iIntValue, strSubstring);
    }
}
