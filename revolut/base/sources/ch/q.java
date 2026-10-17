package ch;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Executor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final q f24050zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final /* synthetic */ q[] f24051zzb;

    static {
        q qVar = new q("INSTANCE", 0);
        f24050zza = qVar;
        f24051zzb = new q[]{qVar};
    }

    public static q[] values() {
        return (q[]) f24051zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g.a().f24023a.post(runnable);
    }
}
