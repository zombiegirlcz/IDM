package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f274421c = {null, yhm.j.c(yhm.k.PUBLICATION, new ts1.h(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274423b;

    public /* synthetic */ w1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(u1.f274416a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274422a = str;
        this.f274423b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f274422a, w1Var.f274422a) && Intrinsics.f(this.f274423b, w1Var.f274423b);
    }

    public final int hashCode() {
        return this.f274423b.hashCode() + (this.f274422a.hashCode() * 31);
    }
}
