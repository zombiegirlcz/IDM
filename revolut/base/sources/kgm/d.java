package kgm;

import igm.q;
import java.util.HashSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class d implements q {
    private static final /* synthetic */ d[] $VALUES;
    public static final d INSTANCE;

    static {
        d dVar = new d("INSTANCE", 0);
        INSTANCE = dVar;
        $VALUES = new d[]{dVar};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // igm.q
    public final Object get() {
        return new HashSet();
    }
}
