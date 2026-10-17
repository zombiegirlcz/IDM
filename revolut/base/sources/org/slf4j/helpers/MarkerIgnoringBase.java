package org.slf4j.helpers;

import org.slf4j.Logger;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MarkerIgnoringBase extends NamedLoggerBase implements Logger {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str) {
        debug(str);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str) {
        error(str);
    }

    @Override // org.slf4j.helpers.NamedLoggerBase, org.slf4j.Logger
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str) {
        info(str);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str) {
        trace(str);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str) {
        warn(str);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj2) {
        debug(str, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj2) {
        error(str, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj2) {
        info(str, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj2) {
        trace(str, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj2) {
        warn(str, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj2, Object obj3) {
        debug(str, obj2, obj3);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj2, Object obj3) {
        error(str, obj2, obj3);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj2, Object obj3) {
        info(str, obj2, obj3);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj2, Object obj3) {
        trace(str, obj2, obj3);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj2, Object obj3) {
        warn(str, obj2, obj3);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object... objArr) {
        debug(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object... objArr) {
        error(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object... objArr) {
        info(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object... objArr) {
        trace(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object... objArr) {
        warn(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Throwable th10) {
        debug(str, th10);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Throwable th10) {
        error(str, th10);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Throwable th10) {
        info(str, th10);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Throwable th10) {
        trace(str, th10);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Throwable th10) {
        warn(str, th10);
    }
}
