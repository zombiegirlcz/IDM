package igb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161154c;

    public /* synthetic */ v(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(t.f161151a.getDescriptor(), i, 7);
            throw null;
        }
        this.f161152a = str;
        this.f161153b = str2;
        this.f161154c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f161152a, vVar.f161152a) && Intrinsics.f(this.f161153b, vVar.f161153b) && Intrinsics.f(this.f161154c, vVar.f161154c);
    }

    public final int hashCode() {
        return this.f161154c.hashCode() + p.a.c(this.f161152a.hashCode() * 31, 31, this.f161153b);
    }

    public v(String imageUrl, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f161152a = imageUrl;
        this.f161153b = title;
        this.f161154c = subtitle;
    }
}
