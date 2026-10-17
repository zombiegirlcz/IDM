package kl7;

import java.util.List;
import kkf.z5;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f185330b = {yhm.j.c(yhm.k.PUBLICATION, new z5(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185331a;

    public /* synthetic */ h0(int i, List list) {
        if (1 == (i & 1)) {
            this.f185331a = list;
        } else {
            qlm.j1.f(f0.f185316a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f185331a, ((h0) obj2).f185331a);
    }

    public final int hashCode() {
        return this.f185331a.hashCode();
    }
}
