package ff4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.r2;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f134740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f134741c;
    public final Image d;
    public final r2 e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f134742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f134743h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f134744j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f134745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f134746m;

    public s(List items, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Image backgroundImage, r2 r2Var, TextClause textClause, ResourceImage resourceImage, CompositeClause compositeClause, TextLocalisedClause textLocalisedClause3, boolean z, boolean z3, k kVar, Integer num, int i) {
        textLocalisedClause = (i & 2) != 0 ? null : textLocalisedClause;
        textLocalisedClause2 = (i & 4) != 0 ? null : textLocalisedClause2;
        backgroundImage = (i & 8) != 0 ? ShimmerImage.f60002a : backgroundImage;
        r2Var = (i & 16) != 0 ? null : r2Var;
        boolean z4 = (i & 512) != 0 ? true : z;
        k kVar2 = (i & 2048) != 0 ? null : kVar;
        Integer num2 = (i & 4096) == 0 ? num : null;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.f134739a = items;
        this.f134740b = textLocalisedClause;
        this.f134741c = textLocalisedClause2;
        this.d = backgroundImage;
        this.e = r2Var;
        this.f = textClause;
        this.f134742g = resourceImage;
        this.f134743h = compositeClause;
        this.i = textLocalisedClause3;
        this.f134744j = z4;
        this.k = z3;
        this.f134745l = kVar2;
        this.f134746m = num2;
    }

    @Override // cli.p
    public final List c() {
        return this.f134739a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f134739a, sVar.f134739a) && Intrinsics.f(this.f134740b, sVar.f134740b) && Intrinsics.f(this.f134741c, sVar.f134741c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f134742g, sVar.f134742g) && Intrinsics.f(this.f134743h, sVar.f134743h) && Intrinsics.f(this.i, sVar.i) && this.f134744j == sVar.f134744j && this.k == sVar.k && Intrinsics.f(this.f134745l, sVar.f134745l) && Intrinsics.f(this.f134746m, sVar.f134746m);
    }

    public final int hashCode() {
        int iHashCode = this.f134739a.hashCode() * 31;
        Clause clause = this.f134740b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f134741c;
        int iC = a10.b.c(this.d, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        r2 r2Var = this.e;
        int iHashCode3 = (iC + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        Clause clause3 = this.f;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Image image = this.f134742g;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause4 = this.f134743h;
        int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.i;
        int iC2 = j6.a.c(j6.a.c((iHashCode6 + (clause5 == null ? 0 : clause5.hashCode())) * 31, 31, this.f134744j), 31, this.k);
        k kVar = this.f134745l;
        int iHashCode7 = (iC2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Integer num = this.f134746m;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }
}
