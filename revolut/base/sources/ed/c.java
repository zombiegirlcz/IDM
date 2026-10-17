package ed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public abstract class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALGORITHM_NOT_FIPS;
    public static final c ALGORITHM_REQUIRES_BORINGCRYPTO;

    static {
        c cVar = new c() { // from class: ed.a
            @Override // ed.c
            public final boolean a() {
                return !d.a();
            }
        };
        ALGORITHM_NOT_FIPS = cVar;
        c cVar2 = new c() { // from class: ed.b
            @Override // ed.c
            public final boolean a() {
                Boolean bool;
                if (d.a()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                    } catch (Exception unused) {
                        d.f124903a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
        };
        ALGORITHM_REQUIRES_BORINGCRYPTO = cVar2;
        $VALUES = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public abstract boolean a();
}
