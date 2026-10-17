package jr6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {
    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(true) * 31);
    }
}
