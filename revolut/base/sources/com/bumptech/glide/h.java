package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h HIGH;
    public static final h IMMEDIATE;
    public static final h LOW;
    public static final h NORMAL;

    static {
        h hVar = new h("IMMEDIATE", 0);
        IMMEDIATE = hVar;
        h hVar2 = new h("HIGH", 1);
        HIGH = hVar2;
        h hVar3 = new h("NORMAL", 2);
        NORMAL = hVar3;
        h hVar4 = new h("LOW", 3);
        LOW = hVar4;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
