package wvj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new wq1.a(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f300517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f300518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300519c;
    public final List d;

    public /* synthetic */ c(int i, Long l2, Long l3, String str, List list) {
        if (15 != (i & 15)) {
            j1.f(a.f300516a.getDescriptor(), i, 15);
            throw null;
        }
        this.f300517a = l2;
        this.f300518b = l3;
        this.f300519c = str;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f300517a, cVar.f300517a) && Intrinsics.f(this.f300518b, cVar.f300518b) && Intrinsics.f(this.f300519c, cVar.f300519c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        Long l2 = this.f300517a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f300518b;
        return this.d.hashCode() + p.a.c((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.f300519c);
    }

    public c(Long l2, Long l3, String countryCode, ArrayList transactionAdjustments) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(transactionAdjustments, "transactionAdjustments");
        this.f300517a = l2;
        this.f300518b = l3;
        this.f300519c = countryCode;
        this.d = transactionAdjustments;
    }
}
