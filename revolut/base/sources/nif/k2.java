package nif;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class k2 {

    @NotNull
    public static final j2 Companion = new j2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f215898b = {yhm.j.c(yhm.k.PUBLICATION, new nhl.s(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215899a;

    public /* synthetic */ k2(int i, List list) {
        if (1 == (i & 1)) {
            this.f215899a = list;
        } else {
            qlm.j1.f(i2.f215866a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final List a() {
        return this.f215899a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k2) && Intrinsics.f(this.f215899a, ((k2) obj2).f215899a);
    }

    public final int hashCode() {
        return this.f215899a.hashCode();
    }

    public k2(List relatedTransactions) {
        Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
        this.f215899a = relatedTransactions;
    }
}
