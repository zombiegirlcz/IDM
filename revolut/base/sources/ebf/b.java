package ebf;

import java.util.ArrayList;
import java.util.Iterator;
import zhm.j0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f124319b;

    public /* synthetic */ b(int i, ArrayList arrayList) {
        this.f124318a = i;
        this.f124319b = arrayList;
    }

    @Override // zhm.j0
    public final Object keyOf(Object obj2) {
        switch (this.f124318a) {
            case 0:
                return (dj0.d) obj2;
            default:
                return ((qv0.i) obj2).getF53816a();
        }
    }

    @Override // zhm.j0
    public final Iterator sourceIterator() {
        switch (this.f124318a) {
        }
        return this.f124319b.iterator();
    }
}
