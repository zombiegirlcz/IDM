package chc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final y Companion = new y();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new cbh.b(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f24150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f24151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24152c;

    public /* synthetic */ b0(int i, x xVar, x xVar2, List list) {
        if (7 != (i & 7)) {
            j1.f(o.f24174a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24150a = xVar;
        this.f24151b = xVar2;
        this.f24152c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f24150a, b0Var.f24150a) && Intrinsics.f(this.f24151b, b0Var.f24151b) && Intrinsics.f(this.f24152c, b0Var.f24152c);
    }

    public final int hashCode() {
        return this.f24152c.hashCode() + ((this.f24151b.hashCode() + (this.f24150a.hashCode() * 31)) * 31);
    }

    public b0(x rent, x bills, ArrayList faqs) {
        Intrinsics.checkNotNullParameter(rent, "rent");
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(faqs, "faqs");
        this.f24150a = rent;
        this.f24151b = bills;
        this.f24152c = faqs;
    }
}
