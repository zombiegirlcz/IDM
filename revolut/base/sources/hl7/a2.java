package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153018b = {yhm.j.c(yhm.k.PUBLICATION, new q0(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153019a;

    public /* synthetic */ a2(int i, List list) {
        if (1 == (i & 1)) {
            this.f153019a = list;
        } else {
            qlm.j1.f(y1.f153371a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a2) && Intrinsics.f(this.f153019a, ((a2) obj2).f153019a);
    }

    public final int hashCode() {
        return this.f153019a.hashCode();
    }

    public a2(ArrayList reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f153019a = reasons;
    }
}
