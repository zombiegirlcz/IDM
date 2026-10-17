package ygm;

import igm.o;
import igm.q;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class b implements q, o {
    private static final /* synthetic */ b[] $VALUES;
    public static final b INSTANCE;

    static {
        b bVar = new b("INSTANCE", 0);
        INSTANCE = bVar;
        $VALUES = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        return new ArrayList();
    }

    @Override // igm.q
    public final Object get() {
        return new ArrayList();
    }
}
