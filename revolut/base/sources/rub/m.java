package rub;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f257525c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new rr4.a(16)), yhm.j.c(kVar, new rr4.a(17)), null};
    }

    public /* synthetic */ m(int i, List list, List list2, i iVar) {
        if (7 != (i & 7)) {
            j1.f(k.f257522a.getDescriptor(), i, 7);
            throw null;
        }
        this.f257523a = list;
        this.f257524b = list2;
        this.f257525c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f257523a, mVar.f257523a) && Intrinsics.f(this.f257524b, mVar.f257524b) && Intrinsics.f(this.f257525c, mVar.f257525c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f257523a.hashCode() * 31, 31, this.f257524b);
        i iVar = this.f257525c;
        return iD + (iVar == null ? 0 : iVar.hashCode());
    }
}
