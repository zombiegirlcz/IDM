package bmm;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class x {
    public static int a(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(a0.d.g(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
