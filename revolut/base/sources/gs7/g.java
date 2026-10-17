package gs7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g extends d {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146335b;

    public /* synthetic */ g(int i, String str) {
        if (1 == (i & 1)) {
            this.f146335b = str;
        } else {
            j1.f(e.f146334a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f146335b, ((g) obj2).f146335b);
    }

    public final int hashCode() {
        return this.f146335b.hashCode();
    }

    public g(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146335b = url2;
    }
}
