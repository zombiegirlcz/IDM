package iqf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f167824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final krf.c f167826c;
    public final String d;

    public a(List predefinedReasons, boolean z, krf.c cVar, String query) {
        Intrinsics.checkNotNullParameter(predefinedReasons, "predefinedReasons");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f167824a = predefinedReasons;
        this.f167825b = z;
        this.f167826c = cVar;
        this.d = query;
    }

    public static a a(a aVar, List predefinedReasons, krf.c cVar, String query, int i) {
        if ((i & 1) != 0) {
            predefinedReasons = aVar.f167824a;
        }
        boolean z = aVar.f167825b;
        if ((i & 4) != 0) {
            cVar = aVar.f167826c;
        }
        if ((i & 8) != 0) {
            query = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(predefinedReasons, "predefinedReasons");
        Intrinsics.checkNotNullParameter(query, "query");
        return new a(predefinedReasons, z, cVar, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f167824a, aVar.f167824a) && this.f167825b == aVar.f167825b && Intrinsics.f(this.f167826c, aVar.f167826c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f167824a.hashCode() * 31, 31, this.f167825b);
        krf.c cVar = this.f167826c;
        return this.d.hashCode() + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
