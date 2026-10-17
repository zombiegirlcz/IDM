package vc;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p implements m {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final p f287594zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final AtomicReference f287595zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final /* synthetic */ p[] f287596zzc;

    static {
        p pVar = new p("INSTANCE", 0);
        f287594zza = pVar;
        f287596zzc = new p[]{pVar};
        f287595zzb = new AtomicReference(null);
    }

    public static void b(wc.d dVar) {
        f287595zzb.set(dVar);
    }

    public static p[] values() {
        return (p[]) f287596zzc.clone();
    }

    public final wc.d a() {
        return (wc.d) f287595zzb.get();
    }
}
