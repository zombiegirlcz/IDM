package kr;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f188576b = {yhm.j.c(yhm.k.PUBLICATION, new kl7.w0(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f188577a;

    public /* synthetic */ s1(int i, List list) {
        if (1 == (i & 1)) {
            this.f188577a = list;
        } else {
            qlm.j1.f(q1.f188561a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s1) && Intrinsics.f(this.f188577a, ((s1) obj2).f188577a);
    }

    public final int hashCode() {
        return this.f188577a.hashCode();
    }

    public s1(List qualities) {
        Intrinsics.checkNotNullParameter(qualities, "qualities");
        this.f188577a = qualities;
    }
}
