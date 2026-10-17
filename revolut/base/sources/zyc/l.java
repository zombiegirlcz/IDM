package zyc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f326419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f326420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f326421c;
    public final Integer d;
    public final boolean e;
    public final aw0.k f;

    public l() {
        this(null, null, null, null, true, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f326419a, lVar.f326419a) && Intrinsics.f(this.f326420b, lVar.f326420b) && Intrinsics.f(this.f326421c, lVar.f326421c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        Clause clause = this.f326419a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f326420b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f326421c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.d;
        int iC = j6.a.c((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        aw0.k kVar = this.f;
        return iC + (kVar != null ? kVar.hashCode() : 0);
    }

    public l(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, CdnImage cdnImage, Integer num, boolean z, aw0.k kVar) {
        this.f326419a = textLocalisedClause;
        this.f326420b = textLocalisedClause2;
        this.f326421c = cdnImage;
        this.d = num;
        this.e = z;
        this.f = kVar;
    }
}
