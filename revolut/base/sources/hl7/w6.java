package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w6 {

    @NotNull
    public static final v6 Companion = new v6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153352b = {yhm.j.c(yhm.k.PUBLICATION, new q0(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153353a;

    public /* synthetic */ w6(int i, List list) {
        if (1 == (i & 1)) {
            this.f153353a = list;
        } else {
            qlm.j1.f(u6.f153330a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w6) && Intrinsics.f(this.f153353a, ((w6) obj2).f153353a);
    }

    public final int hashCode() {
        return this.f153353a.hashCode();
    }
}
