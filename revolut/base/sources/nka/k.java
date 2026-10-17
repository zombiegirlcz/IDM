package nka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216785b;

    public /* synthetic */ k(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(i.f216783a.getDescriptor(), i, 3);
            throw null;
        }
        this.f216784a = str;
        this.f216785b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f216784a, kVar.f216784a) && Intrinsics.f(this.f216785b, kVar.f216785b);
    }

    public final int hashCode() {
        return this.f216785b.hashCode() + (this.f216784a.hashCode() * 31);
    }

    public k(String asset, String title) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f216784a = asset;
        this.f216785b = title;
    }
}
