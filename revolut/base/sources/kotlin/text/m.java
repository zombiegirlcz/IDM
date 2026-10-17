package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.w0;

/* JADX INFO: loaded from: classes13.dex */
public final class m extends kotlin.collections.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187916a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f187917b;

    public m(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f187917b = delegate;
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj2) {
        switch (this.f187916a) {
            case 0:
                if (obj2 instanceof String) {
                    return super.contains((String) obj2);
                }
                return false;
            default:
                return super.contains(obj2);
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public final Object get(int i) {
        switch (this.f187916a) {
            case 0:
                String strGroup = ((o) this.f187917b).f187919a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.f187917b).get(zhm.b0.J(i, this));
        }
    }

    @Override // zhm.a
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        switch (this.f187916a) {
            case 0:
                return ((o) this.f187917b).f187919a.groupCount() + 1;
            default:
                return ((List) this.f187917b).size();
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public /* bridge */ int indexOf(Object obj2) {
        switch (this.f187916a) {
            case 0:
                if (obj2 instanceof String) {
                    return super.indexOf((String) obj2);
                }
                return -1;
            default:
                return super.indexOf(obj2);
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f187916a) {
            case 1:
                return new w0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public /* bridge */ int lastIndexOf(Object obj2) {
        switch (this.f187916a) {
            case 0:
                if (obj2 instanceof String) {
                    return super.lastIndexOf((String) obj2);
                }
                return -1;
            default:
                return super.lastIndexOf(obj2);
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator() {
        switch (this.f187916a) {
            case 1:
                return new w0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f187916a) {
            case 1:
                return new w0(this, i);
            default:
                return super.listIterator(i);
        }
    }

    public m(o oVar) {
        this.f187917b = oVar;
    }
}
