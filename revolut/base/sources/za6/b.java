package za6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f320571c;
    public final String d;
    public final List e;
    public final boolean f;

    public b(String id10, String title, List charitiesId, String description, String bannerUrl, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(bannerUrl, "bannerUrl");
        Intrinsics.checkNotNullParameter(charitiesId, "charitiesId");
        this.f320569a = id10;
        this.f320570b = title;
        this.f320571c = description;
        this.d = bannerUrl;
        this.e = charitiesId;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f320569a, bVar.f320569a) && Intrinsics.f(this.f320570b, bVar.f320570b) && Intrinsics.f(this.f320571c, bVar.f320571c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + p.a.d(p.a.c(p.a.c(p.a.c(this.f320569a.hashCode() * 31, 31, this.f320570b), 31, this.f320571c), 31, this.d), 31, this.e);
    }
}
