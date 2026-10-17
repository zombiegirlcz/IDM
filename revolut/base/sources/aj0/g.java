package aj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5352b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f5347a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5351a = str;
        this.f5352b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f5351a, gVar.f5351a) && Intrinsics.f(this.f5352b, gVar.f5352b);
    }

    public final int hashCode() {
        return this.f5352b.hashCode() + (this.f5351a.hashCode() * 31);
    }

    public g(String label, String link) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f5351a = label;
        this.f5352b = link;
    }
}
