package com.fourthline.orca.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ng1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31412a = "https://cdn.ext-development.fourthline.com/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31413b = "https://cdn.ext-sandbox.fourthline.com/";

    public static final String a(mb.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof mb.b) {
            return "https://cdn.ext.fourthline.com/";
        }
        if (!(dVar instanceof mb.c) && !(dVar instanceof mb.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return f31413b;
    }
}
