package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f2 extends w1 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146746c = {yhm.j.c(yhm.k.PUBLICATION, new v1(1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146747b;

    public /* synthetic */ f2(int i, List list) {
        if (1 == (i & 1)) {
            this.f146747b = list;
        } else {
            qlm.j1.f(d2.f146728a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f2) && Intrinsics.f(this.f146747b, ((f2) obj2).f146747b);
    }

    public final int hashCode() {
        return this.f146747b.hashCode();
    }

    public f2(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146747b = items;
    }
}
