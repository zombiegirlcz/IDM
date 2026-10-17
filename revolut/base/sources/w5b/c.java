package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294792b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f294769a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294791a = str;
        this.f294792b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f294791a, cVar.f294791a) && Intrinsics.f(this.f294792b, cVar.f294792b);
    }

    public final int hashCode() {
        return this.f294792b.hashCode() + (this.f294791a.hashCode() * 31);
    }

    public c(String title, String rewardId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        this.f294791a = title;
        this.f294792b = rewardId;
    }
}
