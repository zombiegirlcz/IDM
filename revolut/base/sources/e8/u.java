package e8;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f123520a;

    public u(ArrayList arrayList) {
        this.f123520a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f123520a.iterator();
    }
}
