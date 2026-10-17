package zp0;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class m {
    private m() {
    }

    public static jm.b a() throws IOException {
        IntRange intRange = new IntRange(32, CertificateBody.profileType, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(Character.valueOf((char) it8.nextInt()));
        }
        String characterSet = d0.k0(arrayList, "", null, null, 0, null, 62);
        Intrinsics.checkNotNullParameter(characterSet, "characterSet");
        return new jm.b(false, characterSet, CoreConstants.DOT);
    }
}
