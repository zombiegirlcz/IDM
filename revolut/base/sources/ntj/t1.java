package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f219127b = {yhm.j.c(yhm.k.PUBLICATION, new ns1.a(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219128a;

    public /* synthetic */ t1(int i, List list) {
        if (1 == (i & 1)) {
            this.f219128a = list;
        } else {
            qlm.j1.f(r1.f219121a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t1) && Intrinsics.f(this.f219128a, ((t1) obj2).f219128a);
    }

    public final int hashCode() {
        return this.f219128a.hashCode();
    }

    public t1(ArrayList challenges) {
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f219128a = challenges;
    }
}
