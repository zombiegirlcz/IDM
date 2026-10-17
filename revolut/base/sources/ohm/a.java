package ohm;

import java.io.Serializable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f225407a = new a();

    public final boolean equals(Object obj2) {
        return obj2 == this;
    }

    @Override // ohm.c
    public final Object get() {
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        return 1;
    }

    @Override // ohm.c, mhm.e
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "None";
    }
}
