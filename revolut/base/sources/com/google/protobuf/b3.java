package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class b3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f49685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f49686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2 f49687c;

    public b3(v2 v2Var, Map.Entry entry) {
        this(v2Var, (Comparable) entry.getKey(), entry.getValue());
    }

    public final Comparable a() {
        return this.f49685a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        return this.f49685a.compareTo(((b3) obj2).f49685a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (obj2 != this) {
            if (obj2 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj2;
                Object key = entry.getKey();
                Comparable comparable = this.f49685a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj3 = this.f49686b;
                    Object value = entry.getValue();
                    if (obj3 == null ? value == null : obj3.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f49685a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f49686b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f49685a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj2 = this.f49686b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        this.f49687c.b();
        Object obj3 = this.f49686b;
        this.f49686b = obj2;
        return obj3;
    }

    public final String toString() {
        return this.f49685a + "=" + this.f49686b;
    }

    public b3(v2 v2Var, Comparable comparable, Object obj2) {
        this.f49687c = v2Var;
        this.f49685a = comparable;
        this.f49686b = obj2;
    }
}
