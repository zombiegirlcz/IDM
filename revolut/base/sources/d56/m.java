package d56;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c36.q f111380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c36.q f111381c;

    public /* synthetic */ m(int i, String str, c36.q qVar, c36.q qVar2) {
        if (7 != (i & 7)) {
            j1.f(k.f111378a.getDescriptor(), i, 7);
            throw null;
        }
        this.f111379a = str;
        this.f111380b = qVar;
        this.f111381c = qVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f111379a, mVar.f111379a) && Intrinsics.f(this.f111380b, mVar.f111380b) && Intrinsics.f(this.f111381c, mVar.f111381c);
    }

    public final int hashCode() {
        return this.f111381c.hashCode() + ((this.f111380b.hashCode() + (this.f111379a.hashCode() * 31)) * 31);
    }
}
