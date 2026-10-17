package de;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Executor {
    private static final /* synthetic */ m[] $VALUES;
    private static final Handler HANDLER;
    public static final m INSTANCE;

    static {
        m mVar = new m("INSTANCE", 0);
        INSTANCE = mVar;
        $VALUES = new m[]{mVar};
        HANDLER = new Handler(Looper.getMainLooper());
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}
