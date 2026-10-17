package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219075b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(g.f219062a.getDescriptor(), i, 3);
            throw null;
        }
        this.f219074a = str;
        this.f219075b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f219074a, iVar.f219074a) && Intrinsics.f(this.f219075b, iVar.f219075b);
    }

    public final int hashCode() {
        int iHashCode = this.f219074a.hashCode() * 31;
        String str = this.f219075b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public i(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f219074a = title;
        this.f219075b = str;
    }
}
