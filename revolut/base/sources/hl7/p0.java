package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153248b = {yhm.j.c(yhm.k.PUBLICATION, new hf7.d(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153249a;

    public /* synthetic */ p0(int i, List list) {
        if (1 == (i & 1)) {
            this.f153249a = list;
        } else {
            qlm.j1.f(n0.f153220a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f153249a, ((p0) obj2).f153249a);
    }

    public final int hashCode() {
        return this.f153249a.hashCode();
    }
}
