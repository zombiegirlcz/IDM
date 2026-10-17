package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b1 extends s0 {
    static {
        Preconditions.checkNotNull(new q1(3), "config");
    }

    public abstract String b();

    public abstract s1 c(Map map);

    public final boolean equals(Object obj2) {
        return this == obj2;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("policy", b()).add("priority", 5).add("available", true).toString();
    }
}
