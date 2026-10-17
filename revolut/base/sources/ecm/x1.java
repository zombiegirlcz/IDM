package ecm;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class x1 {
    public static final Logger d = Logger.getLogger(x1.class.getName());
    public static x1 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f124894a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f124895b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImmutableMap f124896c = ImmutableMap.of();

    public final synchronized void a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            byte b4 = -2147483648;
            for (w1 w1Var : this.f124895b) {
                w1Var.getClass();
                if (((w1) map.get("dns")) == null) {
                    map.put("dns", w1Var);
                }
                if (b4 < 5) {
                    str = "dns";
                    b4 = 5;
                }
            }
            this.f124896c = ImmutableMap.copyOf((Map) map);
            this.f124894a = str;
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
