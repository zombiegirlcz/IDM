package mfm;

import java.util.HashSet;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Callable {
    private static final /* synthetic */ c[] $VALUES;
    public static final c INSTANCE;

    static {
        c cVar = new c("INSTANCE", 0);
        INSTANCE = cVar;
        $VALUES = new c[]{cVar};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new HashSet();
    }
}
