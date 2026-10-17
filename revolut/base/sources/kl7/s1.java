package kl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f185386b = {yhm.j.c(yhm.k.PUBLICATION, new w0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185387a;

    public /* synthetic */ s1(int i, List list) {
        if (1 == (i & 1)) {
            this.f185387a = list;
        } else {
            qlm.j1.f(q1.f185375a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s1) && Intrinsics.f(this.f185387a, ((s1) obj2).f185387a);
    }

    public final int hashCode() {
        return this.f185387a.hashCode();
    }

    public s1(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f185387a = options;
    }
}
