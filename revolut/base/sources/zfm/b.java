package zfm;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Callable, kfm.o {
    private static final /* synthetic */ b[] $VALUES;
    public static final b INSTANCE;

    static {
        b bVar = new b("INSTANCE", 0);
        INSTANCE = bVar;
        $VALUES = new b[]{bVar};
    }

    public static b a() {
        return INSTANCE;
    }

    public static b b() {
        return INSTANCE;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object obj2) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList();
    }
}
