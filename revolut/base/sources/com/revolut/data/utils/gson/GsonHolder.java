package com.revolut.data.utils.gson;

import af0.a;
import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class GsonHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f60253a = j.b(new a(28));

    private GsonHolder() {
    }

    public static o a() {
        Object value = f60253a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }
}
