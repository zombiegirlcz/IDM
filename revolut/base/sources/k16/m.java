package k16;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180120b;

    public /* synthetic */ m(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(k.f180118a.getDescriptor(), i, 3);
            throw null;
        }
        this.f180119a = str;
        this.f180120b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f180119a, mVar.f180119a) && Intrinsics.f(this.f180120b, mVar.f180120b);
    }

    public final int hashCode() {
        return this.f180120b.hashCode() + (this.f180119a.hashCode() * 31);
    }
}
