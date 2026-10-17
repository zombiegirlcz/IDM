package p1l;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231975a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f231975a = str;
        } else {
            j1.f(a.f231974a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f231975a, ((c) obj2).f231975a);
    }

    public final int hashCode() {
        return this.f231975a.hashCode();
    }

    public c(String productArticleId) {
        Intrinsics.checkNotNullParameter(productArticleId, "productArticleId");
        this.f231975a = productArticleId;
    }
}
