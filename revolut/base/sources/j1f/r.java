package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170426b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p.f170421a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170425a = str;
        this.f170426b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f170425a, rVar.f170425a) && Intrinsics.f(this.f170426b, rVar.f170426b);
    }

    public final int hashCode() {
        return this.f170426b.hashCode() + (this.f170425a.hashCode() * 31);
    }

    public r(String name, String imageUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f170425a = name;
        this.f170426b = imageUrl;
    }
}
