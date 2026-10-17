package kem;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n0 implements Serializable {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f183216c;
    public static final LinkedHashMap d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f183218b;

    static {
        n0 n0Var = new n0("http", 80);
        f183216c = n0Var;
        List listK = zhm.v.k(n0Var, new n0("https", 443), new n0("ws", 80), new n0("wss", 443), new n0("socks", 1080));
        int iB = zhm.q0.b(zhm.w.t(listK, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : listK) {
            linkedHashMap.put(((n0) obj2).f183217a, obj2);
        }
        d = linkedHashMap;
    }

    public n0(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f183217a = name;
        this.f183218b = i;
        for (int i2 = 0; i2 < name.length(); i2++) {
            char cCharAt = name.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f183217a, n0Var.f183217a) && this.f183218b == n0Var.f183218b;
    }

    public final int hashCode() {
        return (this.f183217a.hashCode() * 31) + Integer.hashCode(this.f183218b);
    }

    public final String toString() {
        return "URLProtocol(name=" + this.f183217a + ", defaultPort=" + this.f183218b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
