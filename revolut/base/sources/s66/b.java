package s66;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final String a(String str, ty5.a aVar) {
        int i = a.f260152a[aVar.ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "-".concat(str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
