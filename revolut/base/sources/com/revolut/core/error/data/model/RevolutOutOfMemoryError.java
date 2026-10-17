package com.revolut.core.error.data.model;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/error/data/model/RevolutOutOfMemoryError;", "Ljava/lang/OutOfMemoryError;", "<init>", "()V", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutOutOfMemoryError extends OutOfMemoryError {
    public RevolutOutOfMemoryError() {
        StackTraceElement stackTraceElement = new StackTraceElement("com.revolut.core.error.data.model.RevolutOutOfMemoryError", LocalDateTime.now(Clock.systemUTC()).format(DateTimeFormatter.ofPattern("MM-yyyy")), "RevolutOutOfMemoryError.kt", 0);
        s0 s0Var = new s0(2);
        s0Var.a(stackTraceElement);
        s0Var.b(getStackTrace());
        ArrayList arrayList = s0Var.f186433a;
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }
}
