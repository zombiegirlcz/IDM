package jla;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c implements bla.a {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new jj9.b(15)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bla.c f175656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f175657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f175658c;

    public /* synthetic */ c(int i, bla.c cVar, k kVar, String str) {
        if (7 != (i & 7)) {
            j1.f(a.f175655a.getDescriptor(), i, 7);
            throw null;
        }
        this.f175656a = cVar;
        this.f175657b = kVar;
        this.f175658c = str;
    }

    public final Boolean a(String code) {
        Map map;
        List list;
        Intrinsics.checkNotNullParameter(code, "code");
        k kVar = this.f175657b;
        if (kVar == null || (map = kVar.f175668c) == null || (list = (List) map.get(code)) == null) {
            return null;
        }
        return (Boolean) d0.M0(list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f175656a == cVar.f175656a && Intrinsics.f(this.f175657b, cVar.f175657b) && Intrinsics.f(this.f175658c, cVar.f175658c);
    }

    public final int hashCode() {
        int iHashCode = this.f175656a.hashCode() * 31;
        k kVar = this.f175657b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.f175658c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public c(bla.c state, k kVar, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f175656a = state;
        this.f175657b = kVar;
        this.f175658c = str;
    }
}
