package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public abstract class fb0 {
    public static final byte[] a(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        return eb0Var.a().b();
    }

    public static final String b(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        return new String(a(eb0Var), Charsets.UTF_8);
    }

    public static final String c(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        return "N/A";
    }

    public static final boolean d(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        int iD = eb0Var.d();
        return 400 <= iD && iD < 500;
    }

    public static final boolean e(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        int iD = eb0Var.d();
        return 500 <= iD && iD < 600;
    }

    public static final boolean f(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        int iD = eb0Var.d();
        return 200 <= iD && iD < 300;
    }
}
