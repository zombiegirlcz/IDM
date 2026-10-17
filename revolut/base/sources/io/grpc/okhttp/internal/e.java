package io.grpc.okhttp.internal;

import java.util.ArrayList;
import java.util.Iterator;
import zhm.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f163003a;

    public e() {
        this.f163003a = new ArrayList(20);
    }

    @Override // zhm.j0
    public Object keyOf(Object obj2) {
        return (String) obj2;
    }

    @Override // zhm.j0
    public Iterator sourceIterator() {
        return this.f163003a.iterator();
    }

    public e(ArrayList arrayList) {
        this.f163003a = arrayList;
    }
}
