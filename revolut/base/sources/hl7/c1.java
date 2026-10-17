package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153044b = {yhm.j.c(yhm.k.PUBLICATION, new q0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153045a;

    public /* synthetic */ c1(int i, List list) {
        if (1 == (i & 1)) {
            this.f153045a = list;
        } else {
            qlm.j1.f(a1.f153017a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f153045a, ((c1) obj2).f153045a);
    }

    public final int hashCode() {
        return this.f153045a.hashCode();
    }
}
