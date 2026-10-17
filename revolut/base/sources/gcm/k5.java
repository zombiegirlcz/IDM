package gcm;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f142732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f142733c;
    public final Collection d;
    public final int e;
    public final m5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f142734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f142735h;

    public k5(List list, Collection collection, Collection collection2, m5 m5Var, boolean z, boolean z3, boolean z4, int i) {
        this.f142732b = list;
        this.f142733c = (Collection) Preconditions.checkNotNull(collection, "drainedSubstreams");
        this.f = m5Var;
        this.d = collection2;
        this.f142734g = z;
        this.f142731a = z3;
        this.f142735h = z4;
        this.e = i;
        Preconditions.checkState(!z3 || list == null, "passThrough should imply buffer is null");
        Preconditions.checkState((z3 && m5Var == null) ? false : true, "passThrough should imply winningSubstream != null");
        Preconditions.checkState(!z3 || (collection.size() == 1 && collection.contains(m5Var)) || (collection.size() == 0 && m5Var.f142774b), "passThrough should imply winningSubstream is drained");
        Preconditions.checkState((z && m5Var == null) ? false : true, "cancelled should imply committed");
    }

    public final k5 a(m5 m5Var) {
        Collection collectionUnmodifiableCollection;
        Preconditions.checkState(!this.f142735h, "hedging frozen");
        Preconditions.checkState(this.f == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(m5Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(m5Var);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new k5(this.f142732b, this.f142733c, collectionUnmodifiableCollection, this.f, this.f142734g, this.f142731a, this.f142735h, this.e + 1);
    }

    public final k5 b(m5 m5Var) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.remove(m5Var);
        return new k5(this.f142732b, this.f142733c, Collections.unmodifiableCollection(arrayList), this.f, this.f142734g, this.f142731a, this.f142735h, this.e);
    }

    public final k5 c(m5 m5Var, m5 m5Var2) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.remove(m5Var);
        arrayList.add(m5Var2);
        return new k5(this.f142732b, this.f142733c, Collections.unmodifiableCollection(arrayList), this.f, this.f142734g, this.f142731a, this.f142735h, this.e);
    }

    public final k5 d(m5 m5Var) {
        m5Var.f142774b = true;
        Collection collection = this.f142733c;
        if (!collection.contains(m5Var)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(m5Var);
        return new k5(this.f142732b, Collections.unmodifiableCollection(arrayList), this.d, this.f, this.f142734g, this.f142731a, this.f142735h, this.e);
    }

    public final k5 e(m5 m5Var) {
        List list;
        Preconditions.checkState(!this.f142731a, "Already passThrough");
        boolean z = m5Var.f142774b;
        Collection collectionUnmodifiableCollection = this.f142733c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(m5Var);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(m5Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        m5 m5Var2 = this.f;
        boolean z3 = m5Var2 != null;
        if (z3) {
            Preconditions.checkState(m5Var2 == m5Var, "Another RPC attempt has already committed");
            list = null;
        } else {
            list = this.f142732b;
        }
        return new k5(list, collection, this.d, this.f, this.f142734g, z3, this.f142735h, this.e);
    }
}
