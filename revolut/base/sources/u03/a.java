package u03;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i93.e f276036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i93.i f276037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f276038c;
    public final ResourceImage d;
    public final TextLocalisedClause e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f276039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f276040h;
    public final boolean i;

    public a(i93.e type, i93.i iVar, ResourceImage iconNormal, ResourceImage iconDisabled, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause textLocalisedClause, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(iconNormal, "iconNormal");
        Intrinsics.checkNotNullParameter(iconDisabled, "iconDisabled");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f276036a = type;
        this.f276037b = iVar;
        this.f276038c = iconNormal;
        this.d = iconDisabled;
        this.e = title;
        this.f = description;
        this.f276039g = textLocalisedClause;
        this.f276040h = z;
        this.i = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f276036a == aVar.f276036a && Intrinsics.f(this.f276037b, aVar.f276037b) && this.f276038c.equals(aVar.f276038c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && Intrinsics.f(this.f276039g, aVar.f276039g) && this.f276040h == aVar.f276040h && this.i == aVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f276036a.hashCode() * 31;
        i93.i iVar = this.f276037b;
        int iA = t61.a.a(t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f276038c, (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f);
        TextLocalisedClause textLocalisedClause = this.f276039g;
        return Boolean.hashCode(this.i) + j6.a.c((iA + (textLocalisedClause != null ? textLocalisedClause.hashCode() : 0)) * 31, 31, this.f276040h);
    }
}
