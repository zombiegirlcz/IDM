package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.n7;
import ix0.b2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements w {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f216140c;
    public final Parcelable d;
    public final boolean e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f216142h;

    public e0(Clause title, Clause clause, Clause clause2, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f216138a = title;
        this.f216139b = clause;
        this.f216140c = clause2;
        this.d = parcelable;
        this.e = z;
        this.f = analyticsProduct;
        this.f216141g = z3;
        this.f216142h = new l(n7.Offline);
    }

    public static e0 i(e0 e0Var, TextLocalisedClause textLocalisedClause, int i) {
        Clause title = e0Var.f216138a;
        Clause clause = e0Var.f216139b;
        e0Var.getClass();
        Clause clause2 = textLocalisedClause;
        if ((i & 8) != 0) {
            clause2 = e0Var.f216140c;
        }
        Clause clause3 = clause2;
        Parcelable parcelable = e0Var.d;
        boolean z = (i & 32) != 0 ? e0Var.e : true;
        AnalyticsProduct analyticsProduct = e0Var.f;
        boolean z3 = e0Var.f216141g;
        e0Var.getClass();
        e0Var.getClass();
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        return new e0(title, clause, clause3, parcelable, z, analyticsProduct, z3);
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f;
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
        return null;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return null;
    }

    @Override // nii.m0
    public final boolean e() {
        return this.f216141g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f216138a, e0Var.f216138a) && Intrinsics.f(this.f216139b, e0Var.f216139b) && Intrinsics.f(this.f216140c, e0Var.f216140c) && Intrinsics.f(this.d, e0Var.d) && this.e == e0Var.e && Intrinsics.f(this.f, e0Var.f) && this.f216141g == e0Var.f216141g;
    }

    @Override // nii.m0
    public final boolean f() {
        return this.e;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return null;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.f216142h;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216139b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216138a;
    }

    public final int hashCode() {
        int iHashCode = this.f216138a.hashCode() * 31;
        Clause clause = this.f216139b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 961;
        Clause clause2 = this.f216140c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Parcelable parcelable = this.d;
        int iC = j6.a.c((iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.e);
        AnalyticsProduct analyticsProduct = this.f;
        return j6.a.c((iC + (analyticsProduct != null ? analyticsProduct.hashCode() : 0)) * 31, 961, this.f216141g);
    }

    public /* synthetic */ e0(Clause clause, Clause clause2, TextLocalisedClause textLocalisedClause, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, int i) {
        this(clause, (i & 2) != 0 ? null : clause2, (Clause) ((i & 8) != 0 ? null : textLocalisedClause), (i & 16) != 0 ? null : parcelable, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : analyticsProduct, true);
    }
}
