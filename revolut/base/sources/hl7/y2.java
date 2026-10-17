package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y2 {

    @NotNull
    public static final x2 Companion = new x2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153372b = {yhm.j.c(yhm.k.PUBLICATION, new q0(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153373a;

    public /* synthetic */ y2(int i, List list) {
        if (1 == (i & 1)) {
            this.f153373a = list;
        } else {
            qlm.j1.f(w2.f153349a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y2) && Intrinsics.f(this.f153373a, ((y2) obj2).f153373a);
    }

    public final int hashCode() {
        return this.f153373a.hashCode();
    }
}
