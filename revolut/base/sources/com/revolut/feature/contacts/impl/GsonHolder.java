package com.revolut.feature.contacts.impl;

import jj9.b;
import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class GsonHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f65995a = j.b(new b(14));

    private GsonHolder() {
    }

    public static o a() {
        Object value = f65995a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }
}
