package wf1;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qf1.d;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
@g
public final class c implements d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296952a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f296952a = str;
        } else {
            j1.f(a.f296951a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f296952a, ((c) obj2).f296952a);
    }

    public final int hashCode() {
        return this.f296952a.hashCode();
    }

    public c(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f296952a = itemId;
    }
}
