package aj0;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class m0 implements a {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f5365g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gj0.c f5368c;
    public final l0 d;
    public final j e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f5365g = new Lazy[]{null, null, yhm.j.c(kVar, new a92.d(25)), yhm.j.c(kVar, new a92.d(26)), null, yhm.j.c(kVar, new a92.d(27))};
    }

    public /* synthetic */ m0(int i, String str, String str2, gj0.c cVar, l0 l0Var, j jVar, List list) {
        if (63 != (i & 63)) {
            j1.f(d.f5346a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5366a = str;
        this.f5367b = str2;
        this.f5368c = cVar;
        this.d = l0Var;
        this.e = jVar;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f5366a, m0Var.f5366a) && Intrinsics.f(this.f5367b, m0Var.f5367b) && this.f5368c == m0Var.f5368c && Intrinsics.f(this.d, m0Var.d) && Intrinsics.f(this.e, m0Var.e) && Intrinsics.f(this.f, m0Var.f);
    }

    @Override // aj0.a
    public final String getKey() {
        return this.f5366a;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f5368c.hashCode() + p.a.c(this.f5366a.hashCode() * 31, 31, this.f5367b)) * 31)) * 31;
        j jVar = this.e;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List list = this.f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public m0(String key, String title, gj0.c type, l0 content, j jVar, List list) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f5366a = key;
        this.f5367b = title;
        this.f5368c = type;
        this.d = content;
        this.e = jVar;
        this.f = list;
    }
}
