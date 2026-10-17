package j2a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170789c;

    public /* synthetic */ k(int i, String str, String str2, String str3) {
        if (5 != (i & 5)) {
            j1.f(i.f170786a.getDescriptor(), i, 5);
            throw null;
        }
        this.f170787a = str;
        if ((i & 2) == 0) {
            this.f170788b = null;
        } else {
            this.f170788b = str2;
        }
        this.f170789c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f170787a, kVar.f170787a) && Intrinsics.f(this.f170788b, kVar.f170788b) && Intrinsics.f(this.f170789c, kVar.f170789c);
    }

    public final int hashCode() {
        int iHashCode = this.f170787a.hashCode() * 31;
        String str = this.f170788b;
        return this.f170789c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public k(String id10, String str, String url2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f170787a = id10;
        this.f170788b = str;
        this.f170789c = url2;
    }
}
