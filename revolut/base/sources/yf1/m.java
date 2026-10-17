package yf1;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f313124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f313125c;
    public final qf1.c d;
    public final qf1.c e;
    public final do3.n f;

    public m(List categories, l displayMode, Data legalEntityContext, qf1.c cVar, qf1.c cVar2, do3.n nVar) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f313123a = categories;
        this.f313124b = displayMode;
        this.f313125c = legalEntityContext;
        this.d = cVar;
        this.e = cVar2;
        this.f = nVar;
    }

    public static m a(m mVar, List list, l lVar, Data data, qf1.c cVar, qf1.c cVar2, do3.n nVar, int i) {
        if ((i & 1) != 0) {
            list = mVar.f313123a;
        }
        List categories = list;
        if ((i & 2) != 0) {
            lVar = mVar.f313124b;
        }
        l displayMode = lVar;
        if ((i & 4) != 0) {
            data = mVar.f313125c;
        }
        Data legalEntityContext = data;
        if ((i & 8) != 0) {
            cVar = mVar.d;
        }
        qf1.c cVar3 = cVar;
        if ((i & 16) != 0) {
            cVar2 = mVar.e;
        }
        qf1.c cVar4 = cVar2;
        if ((i & 32) != 0) {
            nVar = mVar.f;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new m(categories, displayMode, legalEntityContext, cVar3, cVar4, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f313123a, mVar.f313123a) && Intrinsics.f(this.f313124b, mVar.f313124b) && Intrinsics.f(this.f313125c, mVar.f313125c) && this.d == mVar.d && this.e == mVar.e && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f313125c, (this.f313124b.hashCode() + (this.f313123a.hashCode() * 31)) * 31, 31);
        qf1.c cVar = this.d;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        qf1.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        do3.n nVar = this.f;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
