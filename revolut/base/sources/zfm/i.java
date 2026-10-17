package zfm;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Callable {
    private static final /* synthetic */ i[] $VALUES;
    public static final i INSTANCE;

    static {
        i iVar = new i("INSTANCE", 0);
        INSTANCE = iVar;
        $VALUES = new i[]{iVar};
    }

    public static i a() {
        return INSTANCE;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new HashMap();
    }
}
