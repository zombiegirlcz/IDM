package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ix0.b2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements w {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f216217c;
    public final Clause d;
    public final s e;
    public final Parcelable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f216219h;
    public final Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f216220j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f216221l;

    public t(Clause title, Clause clause, Clause clause2, Clause clause3, s state, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, Parcelable parcelable2, Parcelable parcelable3, boolean z3, k kVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f216215a = title;
        this.f216216b = clause;
        this.f216217c = clause2;
        this.d = clause3;
        this.e = state;
        this.f = parcelable;
        this.f216218g = z;
        this.f216219h = analyticsProduct;
        this.i = parcelable2;
        this.f216220j = parcelable3;
        this.k = z3;
        this.f216221l = kVar;
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f216219h;
    }

    @Override // nii.m0
    public final Parcelable a() {
        return this.f;
    }

    @Override // nii.m0
    public final b2 b() {
        return null;
    }

    @Override // nii.m0
    public final Parcelable c() {
        return this.f216220j;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return this.i;
    }

    @Override // nii.m0
    public final boolean e() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f216215a, tVar.f216215a) && Intrinsics.f(this.f216216b, tVar.f216216b) && Intrinsics.f(this.f216217c, tVar.f216217c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && this.f216218g == tVar.f216218g && Intrinsics.f(this.f216219h, tVar.f216219h) && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f216220j, tVar.f216220j) && this.k == tVar.k && Intrinsics.f(this.f216221l, tVar.f216221l);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.f216218g;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return null;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.f216221l;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216216b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216215a;
    }

    public final int hashCode() {
        int iHashCode = this.f216215a.hashCode() * 31;
        Clause clause = this.f216216b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f216217c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31)) * 31;
        Parcelable parcelable = this.f;
        int iC = j6.a.c((iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f216218g);
        AnalyticsProduct analyticsProduct = this.f216219h;
        int iHashCode5 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        Parcelable parcelable2 = this.i;
        int iHashCode6 = (iHashCode5 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        Parcelable parcelable3 = this.f216220j;
        int iC2 = j6.a.c((iHashCode6 + (parcelable3 == null ? 0 : parcelable3.hashCode())) * 31, 31, this.k);
        k kVar = this.f216221l;
        return iC2 + (kVar != null ? kVar.f216181a.hashCode() : 0);
    }

    public /* synthetic */ t(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, TextLocalisedClause textLocalisedClause4, s sVar, Parcelable parcelable, k kVar, int i) {
        this(textLocalisedClause, (i & 2) != 0 ? null : textLocalisedClause2, (i & 4) != 0 ? null : textLocalisedClause3, (i & 8) != 0 ? null : textLocalisedClause4, sVar, (i & 32) != 0 ? null : parcelable, true, null, null, null, (i & 1024) != 0, (i & 2048) != 0 ? null : kVar);
    }
}
