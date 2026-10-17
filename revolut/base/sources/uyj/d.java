package uyj;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f284427a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof d) {
            return Arrays.equals(this.f284427a, ((d) obj2).f284427a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f284427a);
    }

    public d(byte[] bArr) {
        this.f284427a = bArr;
    }
}
