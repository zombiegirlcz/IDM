package atc;

import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public abstract void a(Object obj2, Collection collection);

    public boolean equals(Object obj2) {
        if (this != obj2) {
            return getClass().equals(obj2 != null ? obj2.getClass() : null);
        }
        return true;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
