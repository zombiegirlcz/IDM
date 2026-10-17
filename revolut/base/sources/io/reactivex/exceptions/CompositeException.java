package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f163108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f163110c;

    /* JADX INFO: loaded from: classes22.dex */
    public static final class CompositeExceptionCausalChain extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static abstract class PrintStreamOrWriter {
        public abstract void a(String str);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class WrappedPrintStream extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintStream f163111a;

        public WrappedPrintStream(PrintStream printStream) {
            this.f163111a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        public final void a(String str) {
            this.f163111a.println((Object) str);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class WrappedPrintWriter extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintWriter f163112a;

        public WrappedPrintWriter(PrintWriter printWriter) {
            this.f163112a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        public final void a(String str) {
            this.f163112a.println((Object) str);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb6, Throwable th10, String str) {
        sb6.append(str);
        sb6.append(th10);
        sb6.append('\n');
        for (StackTraceElement stackTraceElement : th10.getStackTrace()) {
            sb6.append("\t\tat ");
            sb6.append(stackTraceElement);
            sb6.append('\n');
        }
        if (th10.getCause() != null) {
            sb6.append("\tCaused by: ");
            a(sb6, th10.getCause(), "");
        }
    }

    public final void b(PrintStreamOrWriter printStreamOrWriter) {
        StringBuilder sb6 = new StringBuilder(128);
        sb6.append(this);
        sb6.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb6.append("\tat ");
            sb6.append(stackTraceElement);
            sb6.append('\n');
        }
        int i = 1;
        for (Throwable th10 : this.f163108a) {
            sb6.append("  ComposedException ");
            sb6.append(i);
            sb6.append(" :\n");
            a(sb6, th10, "\t");
            i++;
        }
        printStreamOrWriter.a(sb6.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f163110c == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
                for (Throwable runtimeException : this.f163108a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        for (Throwable th10 : arrayList) {
                            if (hashSet.contains(th10)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th10);
                            }
                        }
                        try {
                            compositeExceptionCausalChain2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = compositeExceptionCausalChain2.getCause();
                        if (cause3 != null && compositeExceptionCausalChain2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            compositeExceptionCausalChain2 = cause3;
                        }
                    }
                }
                this.f163110c = compositeExceptionCausalChain;
            }
        } catch (Throwable th11) {
            throw th11;
        }
        return this.f163110c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f163109b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new WrappedPrintStream(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new WrappedPrintWriter(printWriter));
    }

    public CompositeException(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                Throwable th10 = (Throwable) it8.next();
                if (th10 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th10).f163108a);
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
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f163108a = listUnmodifiableList;
            this.f163109b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
