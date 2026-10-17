package e18;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f121913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f121914c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f121915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f121916h;

    public e(String id10, Instant date, f type, String title, String str, String ref2, List assetType, l lVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f121912a = id10;
        this.f121913b = date;
        this.f121914c = type;
        this.d = title;
        this.e = str;
        this.f = ref2;
        this.f121915g = assetType;
        this.f121916h = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f121912a, eVar.f121912a) && Intrinsics.f(this.f121913b, eVar.f121913b) && this.f121914c == eVar.f121914c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f121915g, eVar.f121915g) && Intrinsics.f(this.f121916h, eVar.f121916h);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f121914c.hashCode() + r6.b.c(this.f121912a.hashCode() * 31, 31, this.f121913b)) * 31, 31, this.d);
        String str = this.e;
        int iD = p.a.d(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f121915g);
        l lVar = this.f121916h;
        return iD + (lVar != null ? lVar.hashCode() : 0);
    }
}
