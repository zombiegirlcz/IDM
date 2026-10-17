package io.grpc.okhttp.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALPN_AND_NPN;
    public static final k NONE;
    public static final k NPN;

    static {
        k kVar = new k("ALPN_AND_NPN", 0);
        ALPN_AND_NPN = kVar;
        k kVar2 = new k("NPN", 1);
        NPN = kVar2;
        k kVar3 = new k("NONE", 2);
        NONE = kVar3;
        $VALUES = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
