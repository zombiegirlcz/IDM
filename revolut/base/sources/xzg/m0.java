package xzg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f310012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310014c;
    public final ArrayList d;

    public m0(l0 timeSpan, List topGainers, List topLosers) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(topGainers, "topGainers");
        Intrinsics.checkNotNullParameter(topLosers, "topLosers");
        this.f310012a = timeSpan;
        this.f310013b = topGainers;
        this.f310014c = topLosers;
        ArrayList arrayListE0 = zhm.d0.E0(topLosers, topGainers);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListE0) {
            if (hashSet.add(((k0) obj2).f310003a)) {
                arrayList.add(obj2);
            }
        }
        this.d = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f310012a == m0Var.f310012a && Intrinsics.f(this.f310013b, m0Var.f310013b) && Intrinsics.f(this.f310014c, m0Var.f310014c);
    }

    public final int hashCode() {
        return this.f310014c.hashCode() + p.a.d(this.f310012a.hashCode() * 31, 31, this.f310013b);
    }
}
