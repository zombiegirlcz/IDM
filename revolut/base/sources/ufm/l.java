package ufm;

import efm.h0;
import pfm.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class l implements kfm.o {
    private static final /* synthetic */ l[] $VALUES;
    public static final l INSTANCE;

    static {
        l lVar = new l("INSTANCE", 0);
        INSTANCE = lVar;
        $VALUES = new l[]{lVar};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object obj2) {
        return new x((h0) obj2, 4);
    }
}
