package w5a;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f294767b = {j.c(k.PUBLICATION, new w56.a(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294768a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f294768a = list;
        } else {
            j1.f(a.f294762a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f294768a, ((f) obj2).f294768a);
    }

    public final int hashCode() {
        return this.f294768a.hashCode();
    }
}
