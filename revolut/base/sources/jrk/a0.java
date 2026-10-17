package jrk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f178039b = {yhm.j.c(yhm.k.PUBLICATION, new jp9.l(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178040a;

    public /* synthetic */ a0(int i, List list) {
        if (1 == (i & 1)) {
            this.f178040a = list;
        } else {
            j1.f(y.f178084a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f178040a, ((a0) obj2).f178040a);
    }

    public final int hashCode() {
        return this.f178040a.hashCode();
    }
}
