package qz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f250396b = {yhm.j.c(yhm.k.PUBLICATION, new f(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250397a;

    public /* synthetic */ l(int i, List list) {
        if (1 == (i & 1)) {
            this.f250397a = list;
        } else {
            j1.f(j.f250395a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f250397a, ((l) obj2).f250397a);
    }

    public final int hashCode() {
        return this.f250397a.hashCode();
    }
}
