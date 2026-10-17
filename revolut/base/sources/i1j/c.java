package i1j;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements d {
    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(true) * 31);
    }
}
