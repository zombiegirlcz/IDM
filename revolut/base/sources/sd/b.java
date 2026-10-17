package sd;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class b {

    @NonNull
    public static final b AD_PERSONALIZATION;

    @NonNull
    public static final b AD_STORAGE;

    @NonNull
    public static final b AD_USER_DATA;

    @NonNull
    public static final b ANALYTICS_STORAGE;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final /* synthetic */ b[] f261776zza;

    static {
        b bVar = new b("AD_STORAGE", 0);
        AD_STORAGE = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        ANALYTICS_STORAGE = bVar2;
        b bVar3 = new b("AD_USER_DATA", 2);
        AD_USER_DATA = bVar3;
        b bVar4 = new b("AD_PERSONALIZATION", 3);
        AD_PERSONALIZATION = bVar4;
        f261776zza = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    @NonNull
    public static b valueOf(@NonNull String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    @NonNull
    public static b[] values() {
        return (b[]) f261776zza.clone();
    }
}
