package fz3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f139083a;

    public c(boolean z) {
        this.f139083a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f139083a == ((c) obj2).f139083a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139083a);
    }
}
