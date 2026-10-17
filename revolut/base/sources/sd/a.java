package sd;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a {

    @NonNull
    public static final a DENIED;

    @NonNull
    public static final a GRANTED;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final /* synthetic */ a[] f261775zza;

    static {
        a aVar = new a("GRANTED", 0);
        GRANTED = aVar;
        a aVar2 = new a("DENIED", 1);
        DENIED = aVar2;
        f261775zza = new a[]{aVar, aVar2};
    }

    @NonNull
    public static a valueOf(@NonNull String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    @NonNull
    public static a[] values() {
        return (a[]) f261775zza.clone();
    }
}
