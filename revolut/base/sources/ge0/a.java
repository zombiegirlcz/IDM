package ge0;

import android.database.Cursor;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143203b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f143202a = i;
        this.f143203b = obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f143202a) {
            case 0:
                b bVar = (b) this.f143203b;
                return (((Cursor) bVar.f143205b).isClosed() || ((Cursor) bVar.f143205b).isAfterLast() || !((Cursor) bVar.f143205b).moveToNext()) ? false : true;
            default:
                return ((Enumeration) this.f143203b).hasMoreElements();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f143202a) {
            case 0:
                return (Cursor) ((b) this.f143203b).f143205b;
            default:
                return ((Enumeration) this.f143203b).nextElement();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f143202a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
