package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m5 {

    @NotNull
    public static final l5 Companion = new l5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f294927c = {yhm.j.c(yhm.k.PUBLICATION, new w56.a(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294929b;

    public /* synthetic */ m5(int i, List list, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(k5.f294902a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294928a = list;
        this.f294929b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj2;
        return Intrinsics.f(this.f294928a, m5Var.f294928a) && Intrinsics.f(this.f294929b, m5Var.f294929b);
    }

    public final int hashCode() {
        int iHashCode = this.f294928a.hashCode() * 31;
        String str = this.f294929b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public m5(String str, ArrayList transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f294928a = transactions;
        this.f294929b = str;
    }
}
