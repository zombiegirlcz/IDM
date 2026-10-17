package pka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236996b;

    public /* synthetic */ v(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(t.f236993a.getDescriptor(), i, 3);
            throw null;
        }
        this.f236995a = str;
        this.f236996b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f236995a, vVar.f236995a) && Intrinsics.f(this.f236996b, vVar.f236996b);
    }

    public final int hashCode() {
        return this.f236996b.hashCode() + (this.f236995a.hashCode() * 31);
    }

    public v(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f236995a = text;
        this.f236996b = url2;
    }
}
