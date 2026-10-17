package io.reactivex.rxjava3.exceptions;

import ami.g;
import c8g.c;
import hgm.a;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f163118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f163120c;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(c cVar, Throwable th10, String str) {
        cVar.a(str).a(th10).a('\n');
        for (StackTraceElement stackTraceElement : th10.getStackTrace()) {
            cVar.a("\t\tat ").a(stackTraceElement).a('\n');
        }
        if (th10.getCause() != null) {
            cVar.a("\tCaused by: ");
            a(cVar, th10.getCause(), "");
        }
    }

    public final List b() {
        return this.f163118a;
    }

    public final void c(c cVar) {
        cVar.a(this).a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            cVar.a("\tat ").a(stackTraceElement).a("\n");
        }
        int i = 1;
        for (Throwable th10 : this.f163118a) {
            cVar.a("  ComposedException ").a(Integer.valueOf(i)).a(" :\n");
            a(cVar, th10, "\t");
            i++;
        }
        cVar.a("\n");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        int i;
        try {
            if (this.f163120c == null) {
                String property = System.getProperty("line.separator");
                if (this.f163118a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Multiple exceptions (");
                    sb6.append(this.f163118a.size());
                    sb6.append(")");
                    sb6.append(property);
                    for (Throwable cause : this.f163118a) {
                        int i2 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    sb6.append("  ");
                                }
                                sb6.append("|-- ");
                                sb6.append(cause.getClass().getCanonicalName());
                                sb6.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb6.append(message);
                                    sb6.append(property);
                                } else {
                                    sb6.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i5 = 0; i5 < i2 + 2; i5++) {
                                            sb6.append("  ");
                                        }
                                        sb6.append(str);
                                        sb6.append(property);
                                    }
                                }
                                int i6 = 0;
                                while (true) {
                                    i = i2 + 2;
                                    if (i6 >= i) {
                                        break;
                                    }
                                    sb6.append("  ");
                                    i6++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb6.append("at ");
                                    sb6.append(stackTrace[0]);
                                    sb6.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i21 = 0; i21 < i; i21++) {
                                            sb6.append("  ");
                                        }
                                        sb6.append("|-- ");
                                        sb6.append("(cause not expanded again) ");
                                        sb6.append(cause2.getClass().getCanonicalName());
                                        sb6.append(": ");
                                        sb6.append(cause2.getMessage());
                                        sb6.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i2++;
                                }
                            }
                        }
                    }
                    this.f163120c = new g(sb6.toString().trim(), 1);
                } else {
                    this.f163120c = (Throwable) this.f163118a.get(0);
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f163120c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f163119b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        c(new a(printStream, 0));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                Throwable th10 = (Throwable) it8.next();
                if (th10 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th10).f163118a);
                } else if (th10 != null) {
                    linkedHashSet.add(th10);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f163118a = listUnmodifiableList;
            this.f163119b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        c(new a(printWriter, 1));
    }
}
