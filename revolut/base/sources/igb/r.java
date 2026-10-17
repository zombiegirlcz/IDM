package igb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161146b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p.f161144a.getDescriptor(), i, 3);
            throw null;
        }
        this.f161145a = str;
        this.f161146b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f161145a, rVar.f161145a) && Intrinsics.f(this.f161146b, rVar.f161146b);
    }

    public final int hashCode() {
        return this.f161146b.hashCode() + (this.f161145a.hashCode() * 31);
    }

    public r(String text, String deeplink) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f161145a = text;
        this.f161146b = deeplink;
    }
}
