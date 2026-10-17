package com.google.gson.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f49651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f49652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f49653c;
    public q d;
    public q e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f49655h;
    public int i;

    public q(boolean z) {
        this.f = null;
        this.f49654g = z;
        this.e = this;
        this.d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object obj3 = this.f;
            if (obj3 != null ? obj3.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj4 = this.f49655h;
                if (obj4 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj4.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f49655h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj2 = this.f;
        int iHashCode = obj2 == null ? 0 : obj2.hashCode();
        Object obj3 = this.f49655h;
        return (obj3 != null ? obj3.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        if (obj2 == null && !this.f49654g) {
            throw new NullPointerException("value == null");
        }
        Object obj3 = this.f49655h;
        this.f49655h = obj2;
        return obj3;
    }

    public final String toString() {
        return this.f + "=" + this.f49655h;
    }

    public q(boolean z, q qVar, Object obj2, q qVar2, q qVar3) {
        this.f49651a = qVar;
        this.f = obj2;
        this.f49654g = z;
        this.i = 1;
        this.d = qVar2;
        this.e = qVar3;
        qVar3.d = this;
        qVar2.e = this;
    }
}
