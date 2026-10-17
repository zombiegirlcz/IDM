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
public final class c0 implements m0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Parcelable f216127c;
    public final boolean d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f216129h;
    public final l i;

    public static final class a {
        private a() {
        }
    }

    public c0() {
        this(null, null, null, false, null, false, false, null, 2047);
    }

    public static c0 i(c0 c0Var, int i) {
        Clause clause = c0Var.f216125a;
        Clause clause2 = c0Var.f216126b;
        c0Var.getClass();
        Parcelable parcelable = c0Var.f216127c;
        boolean z = (i & 16) != 0 ? c0Var.d : true;
        Clause clause3 = c0Var.e;
        boolean z3 = c0Var.f;
        boolean z4 = (i & 128) != 0 ? c0Var.f216128g : false;
        AnalyticsProduct analyticsProduct = c0Var.f216129h;
        c0Var.getClass();
        c0Var.getClass();
        c0Var.getClass();
        return new c0(clause, clause2, parcelable, z, clause3, z3, z4, analyticsProduct);
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f216129h;
    }

    @Override // nii.m0
    public final Parcelable a() {
        return this.f216127c;
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
        return this.f216128g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f216125a, c0Var.f216125a) && Intrinsics.f(this.f216126b, c0Var.f216126b) && Intrinsics.f(this.f216127c, c0Var.f216127c) && this.d == c0Var.d && Intrinsics.f(this.e, c0Var.e) && this.f == c0Var.f && this.f216128g == c0Var.f216128g && Intrinsics.f(this.f216129h, c0Var.f216129h);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.d;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return null;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.i;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216126b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216125a;
    }

    public final int hashCode() {
        Clause clause = this.f216125a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f216126b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 961;
        Parcelable parcelable = this.f216127c;
        int iC = j6.a.c((iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.d);
        Clause clause3 = this.e;
        int iC2 = j6.a.c(j6.a.c((iC + (clause3 == null ? 0 : clause3.hashCode())) * 31, 31, this.f), 31, this.f216128g);
        AnalyticsProduct analyticsProduct = this.f216129h;
        return (iC2 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0)) * 961;
    }

    public c0(Clause clause, Clause clause2, Parcelable parcelable, boolean z, Clause clause3, boolean z3, boolean z4, AnalyticsProduct analyticsProduct) {
        this.f216125a = clause;
        this.f216126b = clause2;
        this.f216127c = parcelable;
        this.d = z;
        this.e = clause3;
        this.f = z3;
        this.f216128g = z4;
        this.f216129h = analyticsProduct;
        this.i = new l(n7.Progress);
    }

    public /* synthetic */ c0(Clause clause, Clause clause2, Parcelable parcelable, boolean z, Clause clause3, boolean z3, boolean z4, AnalyticsProduct analyticsProduct, int i) {
        this((i & 1) != 0 ? null : clause, (i & 2) != 0 ? null : clause2, (i & 8) != 0 ? null : parcelable, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : clause3, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? true : z4, (i & 256) != 0 ? null : analyticsProduct);
    }
}
