package com.fasterxml.jackson.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a PADDING_ALLOWED;
    public static final a PADDING_FORBIDDEN;
    public static final a PADDING_REQUIRED;

    static {
        a aVar = new a("PADDING_FORBIDDEN", 0);
        PADDING_FORBIDDEN = aVar;
        a aVar2 = new a("PADDING_REQUIRED", 1);
        PADDING_REQUIRED = aVar2;
        a aVar3 = new a("PADDING_ALLOWED", 2);
        PADDING_ALLOWED = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
