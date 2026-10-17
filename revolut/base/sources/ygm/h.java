package ygm;

import igm.q;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class h implements q {
    private static final /* synthetic */ h[] $VALUES;
    public static final h INSTANCE;

    static {
        h hVar = new h("INSTANCE", 0);
        INSTANCE = hVar;
        $VALUES = new h[]{hVar};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @Override // igm.q
    public final Object get() {
        return new HashMap();
    }
}
