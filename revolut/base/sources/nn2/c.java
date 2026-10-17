package nn2;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qf1.d;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@g
public final class c implements d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f217435c = {null, j.c(k.PUBLICATION, new nme.c(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2.a f217437b;

    public /* synthetic */ c(int i, String str, mn2.a aVar) {
        if (3 != (i & 3)) {
            j1.f(a.f217434a.getDescriptor(), i, 3);
            throw null;
        }
        this.f217436a = str;
        this.f217437b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f217436a, cVar.f217436a) && this.f217437b == cVar.f217437b;
    }

    public final int hashCode() {
        return this.f217437b.hashCode() + (this.f217436a.hashCode() * 31);
    }

    public c(String itemId, mn2.a serviceType) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f217436a = itemId;
        this.f217437b = serviceType;
    }
}
