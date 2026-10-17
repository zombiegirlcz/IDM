package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j2 {

    @NotNull
    public static final i2 Companion = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153158b = {yhm.j.c(yhm.k.PUBLICATION, new q0(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153159a;

    public /* synthetic */ j2(int i, List list) {
        if (1 == (i & 1)) {
            this.f153159a = list;
        } else {
            qlm.j1.f(h2.f153124a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j2) && Intrinsics.f(this.f153159a, ((j2) obj2).f153159a);
    }

    public final int hashCode() {
        return this.f153159a.hashCode();
    }
}
