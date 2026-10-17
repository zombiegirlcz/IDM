package com.fourthline.orca.internal;

import com.fourthline.orca.internal.pb1;
import java.lang.Thread;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f32568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg0 f32569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32570c;

    public r1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, qg0 analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f32568a = uncaughtExceptionHandler;
        this.f32569b = analytics;
        this.f32570c = "javaClass";
    }

    public final qg0 a() {
        return this.f32569b;
    }

    public final Thread.UncaughtExceptionHandler b() {
        return this.f32568a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable error) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(error, "error");
        Objects.toString(thread);
        Objects.toString(error);
        if (a(error)) {
            this.f32569b.track(new pb1.a.c(error, thread));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f32568a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, error);
        }
    }

    private final boolean a(Throwable th10) {
        StackTraceElement[] stackTrace = th10.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (kotlin.text.a0.H(className, "com.fourthline", false)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ r1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, qg0 qg0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler, (i & 2) != 0 ? new pb1() : qg0Var);
    }
}
