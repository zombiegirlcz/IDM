package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class q20 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q20 f32170c = new q20("All", 0, "");
    public static final q20 d = new q20("Numeric", 1, "^[0-9]*$");
    public static final q20 e = new q20("AlphaWithSpace", 2, "^[a-zA-Z ]*$");
    public static final q20 f = new q20("AlphaNumericWithSpace", 3, "^[a-zA-Z0-9 ]*$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q20 f32171g = new q20("AlphaNumeric", 4, "^[a-zA-Z0-9]*$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q20 f32172h = new q20("AlphaWithExtra", 5, "^[a-zA-Z\\-'\"]*$");
    public static final q20 i = new q20("AlphaWithDiacriticsExtra", 6, "^[\\p{L}'`‘ \\-]*$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q20 f32173j = new q20("Email", 7, "^[a-zA-Z0-9@._%+\\-]*$");
    private static final /* synthetic */ q20[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f32174l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Regex f32176b;

    static {
        q20[] q20VarArrA = a();
        k = q20VarArrA;
        f32174l = vc.s.n(q20VarArrA);
    }

    private q20(String str, int i2, String str2) {
        this.f32175a = str2;
        this.f32176b = new Regex(str2);
    }

    private static final /* synthetic */ q20[] a() {
        return new q20[]{f32170c, d, e, f, f32171g, f32172h, i, f32173j};
    }

    public static q20 valueOf(String str) {
        return (q20) Enum.valueOf(q20.class, str);
    }

    public static q20[] values() {
        return (q20[]) k.clone();
    }

    public final boolean a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this == f32170c) {
            return true;
        }
        return this.f32176b.f(value);
    }
}
