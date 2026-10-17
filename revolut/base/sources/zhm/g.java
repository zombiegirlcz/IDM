package zhm;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g extends AbstractCollection implements Collection, pim.b {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
