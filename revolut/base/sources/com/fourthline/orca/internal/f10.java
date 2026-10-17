package com.fourthline.orca.internal;

import kotlin.Pair;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class f10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f10 f28310b = new f10("DOCUMENT_COUNTRY", 0, "document_country");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f10 f28311c = new f10("DOCUMENT_VALIDATION", 1, "document_validation");
    public static final f10 d = new f10("DOCUMENT_TYPE", 2, "document_type");
    public static final f10 e = new f10("DOCUMENT_ANALYSIS", 3, "document_analysis");
    public static final f10 f = new f10("DOCUMENT_NATIONALITY", 4, "personal_details_nationality");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ f10[] f28312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f28313h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pair f28314a;

    static {
        f10[] f10VarArrA = a();
        f28312g = f10VarArrA;
        f28313h = vc.s.n(f10VarArrA);
    }

    private f10(String str, int i, String str2) {
        this.f28314a = new Pair("source", str2);
    }

    private static final /* synthetic */ f10[] a() {
        return new f10[]{f28310b, f28311c, d, e, f};
    }

    public static f10 valueOf(String str) {
        return (f10) Enum.valueOf(f10.class, str);
    }

    public static f10[] values() {
        return (f10[]) f28312g.clone();
    }

    public final Pair b() {
        return this.f28314a;
    }
}
