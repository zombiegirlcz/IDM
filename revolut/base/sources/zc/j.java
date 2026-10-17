package zc;

import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class j extends f implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f320986c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient k f320987b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        if (obj2 == this || obj2 == this) {
            return true;
        }
        if (obj2 instanceof Set) {
            Set set = (Set) obj2;
            try {
                if (set.size() == 0) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
