package com.revolut.feature.payments.recipients.settings.impl.data;

import bu7.y;
import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class GsonHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f79670a = j.b(new y(19));

    private GsonHolder() {
    }

    public static o a() {
        Object value = f79670a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }
}
