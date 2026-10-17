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
public final class b0 implements m0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatusDialogDescriptionProgress f216113c;
    public final Parcelable d;
    public final efm.r e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f216115h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f216116j;
    public final Parcelable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f216117l;

    public /* synthetic */ b0(Clause clause, Clause clause2, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Parcelable parcelable, efm.r rVar, int i, boolean z, boolean z3, AnalyticsProduct analyticsProduct, int i2) {
        this(clause, (i2 & 2) != 0 ? null : clause2, (i2 & 4) != 0 ? null : statusDialogDescriptionProgress, (i2 & 8) != 0 ? null : parcelable, rVar, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? true : z3, (i2 & 256) != 0 ? null : analyticsProduct, null, null);
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.i;
    }

    @Override // nii.m0
    public final Parcelable a() {
        return this.d;
    }

    @Override // nii.m0
    public final b2 b() {
        return null;
    }

    @Override // nii.m0
    public final Parcelable c() {
        return this.k;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return this.f216116j;
    }

    @Override // nii.m0
    public final boolean e() {
        return this.f216115h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f216111a, b0Var.f216111a) && Intrinsics.f(this.f216112b, b0Var.f216112b) && Intrinsics.f(this.f216113c, b0Var.f216113c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && this.f == b0Var.f && this.f216114g == b0Var.f216114g && this.f216115h == b0Var.f216115h && Intrinsics.f(this.i, b0Var.i) && Intrinsics.f(this.f216116j, b0Var.f216116j) && Intrinsics.f(this.k, b0Var.k);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.f216114g;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return this.f216113c;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.f216117l;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216112b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216111a;
    }

    public final int hashCode() {
        int iHashCode = this.f216111a.hashCode() * 31;
        Clause clause = this.f216112b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        StatusDialogDescriptionProgress statusDialogDescriptionProgress = this.f216113c;
        int iHashCode3 = (iHashCode2 + (statusDialogDescriptionProgress == null ? 0 : statusDialogDescriptionProgress.hashCode())) * 31;
        Parcelable parcelable = this.d;
        int iC = j6.a.c(j6.a.c(j6.a.b(this.f, (this.e.hashCode() + ((iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31, 31), 31, this.f216114g), 31, this.f216115h);
        AnalyticsProduct analyticsProduct = this.i;
        int iHashCode4 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        Parcelable parcelable2 = this.f216116j;
        int iHashCode5 = (iHashCode4 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        Parcelable parcelable3 = this.k;
        return iHashCode5 + (parcelable3 != null ? parcelable3.hashCode() : 0);
    }

    public b0(Clause title, Clause clause, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Parcelable parcelable, efm.r progressSource, int i, boolean z, boolean z3, AnalyticsProduct analyticsProduct, Parcelable parcelable2, Parcelable parcelable3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progressSource, "progressSource");
        this.f216111a = title;
        this.f216112b = clause;
        this.f216113c = statusDialogDescriptionProgress;
        this.d = parcelable;
        this.e = progressSource;
        this.f = i;
        this.f216114g = z;
        this.f216115h = z3;
        this.i = analyticsProduct;
        this.f216116j = parcelable2;
        this.k = parcelable3;
        this.f216117l = new l(n7.Progress);
    }
}
