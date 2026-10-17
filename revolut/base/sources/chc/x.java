package chc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24185c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new cbh.b(27)), yhm.j.c(kVar, new cbh.b(28))};
    }

    public /* synthetic */ x(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            j1.f(p.f24175a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24183a = str;
        this.f24184b = list;
        this.f24185c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f24183a, xVar.f24183a) && Intrinsics.f(this.f24184b, xVar.f24184b) && Intrinsics.f(this.f24185c, xVar.f24185c);
    }

    public final int hashCode() {
        return this.f24185c.hashCode() + p.a.d(this.f24183a.hashCode() * 31, 31, this.f24184b);
    }

    public x(ArrayList payments, ArrayList faqs, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(faqs, "faqs");
        this.f24183a = type;
        this.f24184b = payments;
        this.f24185c = faqs;
    }
}
