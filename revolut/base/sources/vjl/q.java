package vjl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f289822c;
    public final p d;
    public final m e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f289823g;

    public q(String id10, String displayTitle, String displaySubtitle, p profileType, m mVar, m mVar2, k kVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
        Intrinsics.checkNotNullParameter(displaySubtitle, "displaySubtitle");
        Intrinsics.checkNotNullParameter(profileType, "profileType");
        this.f289820a = id10;
        this.f289821b = displayTitle;
        this.f289822c = displaySubtitle;
        this.d = profileType;
        this.e = mVar;
        this.f = mVar2;
        this.f289823g = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f289820a, qVar.f289820a) && Intrinsics.f(this.f289821b, qVar.f289821b) && Intrinsics.f(this.f289822c, qVar.f289822c) && this.d == qVar.d && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f289823g, qVar.f289823g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f289820a.hashCode() * 31, 31, this.f289821b), 31, this.f289822c)) * 31;
        m mVar = this.e;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        m mVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31;
        k kVar = this.f289823g;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }
}
