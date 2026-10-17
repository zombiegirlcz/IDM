package fyk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f139052b = {yhm.j.c(yhm.k.PUBLICATION, new fyh.k(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139053a;

    public /* synthetic */ t(int i, List list) {
        if (1 == (i & 1)) {
            this.f139053a = list;
        } else {
            j1.f(r.f139051a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f139053a, ((t) obj2).f139053a);
    }

    public final int hashCode() {
        return this.f139053a.hashCode();
    }

    public t(ArrayList documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f139053a = documents;
    }
}
