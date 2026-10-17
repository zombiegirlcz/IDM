package pq3;

import ft3.d1;
import ft3.g1;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends z {
    public final d1 a() throws Throwable {
        Matcher matcher = this.f238681a;
        String strGroup = matcher.group(1);
        d1 d1VarG = strGroup != null ? g1.g(strGroup, null, null) : null;
        if (d1VarG == null) {
            hx7.e.n(new IllegalArgumentException(j6.a.q("Cancellation not supported for this product: ", matcher.group(1))));
        }
        return d1VarG;
    }
}
