package zhm;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public abstract class j extends AbstractSet implements Set, pim.g {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
