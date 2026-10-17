package zhm;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h extends AbstractList implements List, pim.d {
    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return removeAt(i);
    }

    public abstract Object removeAt(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
