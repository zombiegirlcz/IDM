package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49601a;

    public f() {
        this.f49601a = null;
    }

    public final Object a() {
        Object obj2 = this.f49601a;
        if (obj2 != null) {
            return obj2;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f49601a != null;
    }

    public f(Object obj2) {
        if (obj2 != null) {
            this.f49601a = obj2;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
