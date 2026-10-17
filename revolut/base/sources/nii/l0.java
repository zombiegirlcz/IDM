package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.n7;
import ix0.b2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements w {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatusDialogDescriptionProgress f216186c;
    public final Clause d;
    public final Clause e;
    public final Parcelable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f216188h;
    public final Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f216189j;
    public final l k;

    public /* synthetic */ l0(Clause clause, Clause clause2, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Clause clause3, Clause clause4, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, int i) {
        this(clause, (i & 2) != 0 ? null : clause2, (i & 4) != 0 ? null : statusDialogDescriptionProgress, (i & 8) != 0 ? null : clause3, (i & 16) != 0 ? null : clause4, (i & 32) != 0 ? null : parcelable, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : analyticsProduct, null, null);
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f216188h;
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
        return this.f216189j;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f216184a, l0Var.f216184a) && Intrinsics.f(this.f216185b, l0Var.f216185b) && Intrinsics.f(this.f216186c, l0Var.f216186c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f) && this.f216187g == l0Var.f216187g && Intrinsics.f(this.f216188h, l0Var.f216188h) && Intrinsics.f(this.i, l0Var.i) && Intrinsics.f(this.f216189j, l0Var.f216189j);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.f216187g;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return this.f216186c;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.k;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216185b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216184a;
    }

    public final int hashCode() {
        int iHashCode = this.f216184a.hashCode() * 31;
        Clause clause = this.f216185b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        StatusDialogDescriptionProgress statusDialogDescriptionProgress = this.f216186c;
        int iHashCode3 = (iHashCode2 + (statusDialogDescriptionProgress == null ? 0 : statusDialogDescriptionProgress.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.e;
        int iHashCode5 = (iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Parcelable parcelable = this.f;
        int iC = j6.a.c((iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f216187g);
        AnalyticsProduct analyticsProduct = this.f216188h;
        int iHashCode6 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        Parcelable parcelable2 = this.i;
        int iHashCode7 = (iHashCode6 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        Parcelable parcelable3 = this.f216189j;
        return iHashCode7 + (parcelable3 != null ? parcelable3.hashCode() : 0);
    }

    public l0(Clause title, Clause clause, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Clause clause2, Clause clause3, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, Parcelable parcelable2, Parcelable parcelable3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f216184a = title;
        this.f216185b = clause;
        this.f216186c = statusDialogDescriptionProgress;
        this.d = clause2;
        this.e = clause3;
        this.f = parcelable;
        this.f216187g = z;
        this.f216188h = analyticsProduct;
        this.i = parcelable2;
        this.f216189j = parcelable3;
        this.k = new l(n7.Warning);
    }
}
