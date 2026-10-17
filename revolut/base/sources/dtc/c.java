package dtc;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.i3;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f117404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd0.d f117405b;

    public c(thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f117404a = transactionCategoryResourcesMapper;
        this.f117405b = new fd0.d(50);
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        i3 i3Var = instance.Q;
        fd0.d dVar = this.f117405b;
        String strK = (String) dVar.c(i3Var);
        if (strK == null) {
            strK = ((wjf.e) this.f117404a).k(i3Var);
            dVar.d(i3Var, strK);
        }
        targetCollection.add(strK);
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f117404a, ((c) obj2).f117404a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117404a.hashCode();
    }
}
