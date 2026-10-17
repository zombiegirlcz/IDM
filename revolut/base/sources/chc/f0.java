package chc;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f24157b = {yhm.j.c(yhm.k.PUBLICATION, new c0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24158a;

    public /* synthetic */ f0(int i, List list) {
        if (1 == (i & 1)) {
            this.f24158a = list;
        } else {
            j1.f(d0.f24155a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f24158a, ((f0) obj2).f24158a);
    }

    public final int hashCode() {
        return this.f24158a.hashCode();
    }

    public f0(List linkedPaymentIds) {
        Intrinsics.checkNotNullParameter(linkedPaymentIds, "linkedPaymentIds");
        this.f24158a = linkedPaymentIds;
    }
}
