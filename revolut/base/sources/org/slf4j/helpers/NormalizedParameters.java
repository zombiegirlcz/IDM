package org.slf4j.helpers;

import org.slf4j.event.LoggingEvent;

/* JADX INFO: loaded from: classes14.dex */
public class NormalizedParameters {
    final Object[] arguments;
    final String message;
    final Throwable throwable;

    public NormalizedParameters(String str, Object[] objArr, Throwable th10) {
        this.message = str;
        this.arguments = objArr;
        this.throwable = th10;
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj2 = objArr[objArr.length - 1];
            if (obj2 instanceof Throwable) {
                return (Throwable) obj2;
            }
        }
        return null;
    }

    public static NormalizedParameters normalize(String str, Object[] objArr, Throwable th10) {
        if (th10 != null) {
            return new NormalizedParameters(str, objArr, th10);
        }
        if (objArr == null || objArr.length == 0) {
            return new NormalizedParameters(str, objArr, th10);
        }
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        return throwableCandidate != null ? new NormalizedParameters(str, MessageFormatter.trimmedCopy(objArr), throwableCandidate) : new NormalizedParameters(str, objArr);
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }

    public Object[] getArguments() {
        return this.arguments;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public NormalizedParameters(String str, Object[] objArr) {
        this(str, objArr, null);
    }

    public static NormalizedParameters normalize(LoggingEvent loggingEvent) {
        return normalize(loggingEvent.getMessage(), loggingEvent.getArgumentArray(), loggingEvent.getThrowable());
    }
}
