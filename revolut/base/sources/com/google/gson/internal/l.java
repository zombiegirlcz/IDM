package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49644a;

    public l(String str) {
        this.f49644a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f49644a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof l) {
            return this.f49644a.equals(((l) obj2).f49644a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f49644a);
    }

    public final int hashCode() {
        return this.f49644a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f49644a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return j.n(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f49644a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j.n(str).longValue();
        }
    }

    public final String toString() {
        return this.f49644a;
    }
}
