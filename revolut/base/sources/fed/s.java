package fed;

import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new fce.b(25)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iel.u f134566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f134568c;

    public /* synthetic */ s(int i, iel.u uVar, String str, BigDecimal bigDecimal) {
        if (7 != (i & 7)) {
            j1.f(q.f134565a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134566a = uVar;
        this.f134567b = str;
        this.f134568c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f134566a == sVar.f134566a && Intrinsics.f(this.f134567b, sVar.f134567b) && Intrinsics.f(this.f134568c, sVar.f134568c);
    }

    public final int hashCode() {
        return this.f134568c.hashCode() + p.a.c(this.f134566a.hashCode() * 31, 31, this.f134567b);
    }
}
