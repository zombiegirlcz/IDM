package koi;

import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArrayCompat f186369a;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public c() {
        this(0);
    }

    public final void a(k delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f186369a.put(delegate.getF98535a(), delegate);
    }

    public final void b(List delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Iterator it8 = delegates.iterator();
        while (it8.hasNext()) {
            a((k) it8.next());
        }
    }

    public final k c(Class clazz) {
        k kVar;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        SparseArrayCompat sparseArrayCompat = this.f186369a;
        int size = sparseArrayCompat.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = (k) sparseArrayCompat.valueAt(i);
            if (clazz.isAssignableFrom(kVar.getClass())) {
                break;
            }
            i++;
        }
        if (kVar != null) {
            return kVar;
        }
        return null;
    }

    public final k d(int i) {
        k kVar = (k) this.f186369a.get(i);
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException(("No delegate found for viewType " + i).toString());
    }

    public final ArrayList e() {
        SparseArrayCompat sparseArrayCompat = this.f186369a;
        ArrayList arrayList = new ArrayList(sparseArrayCompat.size());
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((k) sparseArrayCompat.valueAt(i));
        }
        return arrayList;
    }

    public c(List delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f186369a = new SparseArrayCompat(delegates.size() + 2);
        b(delegates);
    }

    public c(int i) {
        this(f0.f322471a);
    }
}
