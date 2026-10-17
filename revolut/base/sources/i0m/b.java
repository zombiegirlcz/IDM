package i0m;

import hzl.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yqi.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements f {
    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        hzl.d validationData = (hzl.d) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        String str = validationData.f157255b;
        String str2 = validationData.f157254a;
        StringBuilder sb6 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        if (!d0.W(string) && (d0.J(string, str2, false) || d0.J(str2, string, false))) {
            return new yqi.d(validationData, new g(0));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
