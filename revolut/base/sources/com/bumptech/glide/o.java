package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w8.e f26141a = w8.c.f295560b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof o) {
            return y8.l.b(this.f26141a, ((o) obj2).f26141a);
        }
        return false;
    }

    public int hashCode() {
        w8.e eVar = this.f26141a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}
