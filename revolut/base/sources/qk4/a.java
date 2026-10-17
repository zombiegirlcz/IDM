package qk4;

import jki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f246961a;

    public a(boolean z) {
        this.f246961a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f246961a == ((a) obj2).f246961a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246961a);
    }
}
