package gs7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j extends d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146337b;

    public /* synthetic */ j(int i, String str) {
        if (1 == (i & 1)) {
            this.f146337b = str;
        } else {
            j1.f(h.f146336a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f146337b, ((j) obj2).f146337b);
    }

    public final int hashCode() {
        return this.f146337b.hashCode();
    }

    public j(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146337b = url2;
    }
}
