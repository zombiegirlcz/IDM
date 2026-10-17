package com.bumptech.glide.load.engine;

import c8.a;
import c8.g;
import ch.qos.logback.core.CoreConstants;
import e8.a0;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] f = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f26123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f26124c;
    public Class d;
    public final String e;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th10, ArrayList arrayList) {
        if (!(th10 instanceof GlideException)) {
            arrayList.add(th10);
            return;
        }
        Iterator it8 = ((GlideException) th10).f26122a.iterator();
        while (it8.hasNext()) {
            a((Throwable) it8.next(), arrayList);
        }
    }

    public static void b(List list, a0 a0Var) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            a0Var.append("Cause (");
            int i2 = i + 1;
            a0Var.append(String.valueOf(i2));
            a0Var.append(" of ");
            a0Var.append(String.valueOf(size));
            a0Var.append("): ");
            Throwable th10 = (Throwable) list.get(i);
            if (th10 instanceof GlideException) {
                ((GlideException) th10).e(a0Var);
            } else {
                c(th10, a0Var);
            }
            i = i2;
        }
    }

    public static void c(Throwable th10, Appendable appendable) {
        try {
            appendable.append(th10.getClass().toString()).append(": ").append(th10.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th10);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb6 = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb6.append(i2);
            sb6.append(" of ");
            sb6.append(size);
            sb6.append(")");
            sb6.toString();
            i = i2;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f26122a, new a0(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb6 = new StringBuilder(71);
        sb6.append(this.e);
        sb6.append(this.d != null ? ", " + this.d : "");
        sb6.append(this.f26124c != null ? ", " + this.f26124c : "");
        sb6.append(this.f26123b != null ? ", " + this.f26123b : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb6.toString();
        }
        if (arrayList.size() == 1) {
            sb6.append("\nThere was 1 root cause:");
        } else {
            sb6.append("\nThere were ");
            sb6.append(arrayList.size());
            sb6.append(" root causes:");
        }
        for (Throwable th10 : arrayList) {
            sb6.append('\n');
            sb6.append(th10.getClass().getName());
            sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb6.append(th10.getMessage());
            sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb6.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb6.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public GlideException(String str, List list) {
        this.e = str;
        setStackTrace(f);
        this.f26122a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
