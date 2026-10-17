package ogd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f225117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225119c;
    public final String d;

    public i(FavouritesAssetTypeKey key, String from, String to6) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f225117a = key;
        this.f225118b = from;
        this.f225119c = to6;
        xi0.b.Companion.getClass();
        this.d = cp5.d.d(new Pair(xi0.a.a(from), xi0.a.a(to6)));
    }

    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.p(this.f225117a.f86866a, "-", this.f225118b, "-", this.f225119c);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f225117a, iVar.f225117a) && Intrinsics.f(this.f225118b, iVar.f225118b) && Intrinsics.f(this.f225119c, iVar.f225119c);
    }

    public final int hashCode() {
        return this.f225119c.hashCode() + p.a.c(this.f225117a.f86866a.hashCode() * 31, 31, this.f225118b);
    }
}
