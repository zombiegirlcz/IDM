package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g4 {

    @NotNull
    public static final f4 Companion = new f4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f146752b = {yhm.j.c(yhm.k.PUBLICATION, new v1(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f146753a;

    public /* synthetic */ g4(int i, List list) {
        if (1 == (i & 1)) {
            this.f146753a = list;
        } else {
            qlm.j1.f(e4.f146738a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g4) && Intrinsics.f(this.f146753a, ((g4) obj2).f146753a);
    }

    public final int hashCode() {
        return this.f146753a.hashCode();
    }
}
