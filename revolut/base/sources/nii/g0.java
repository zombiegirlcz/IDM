package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.n7;
import ix0.b2;
import kotlin.jvm.internal.Intrinsics;
import nii.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements w {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatusDialogDescriptionProgress f216156c;
    public final Clause d;
    public final Clause e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Parcelable f216157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f216158h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AnalyticsProduct f216159j;
    public final Parcelable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Parcelable f216160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f216161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Image f216162n;
    public final l o;

    public g0(Clause title, Clause clause, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Clause clause2, Clause clause3, Image image, Parcelable parcelable, j pendingType, boolean z, AnalyticsProduct analyticsProduct, Parcelable parcelable2, Parcelable parcelable3, boolean z3, Image image2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingType, "pendingType");
        this.f216154a = title;
        this.f216155b = clause;
        this.f216156c = statusDialogDescriptionProgress;
        this.d = clause2;
        this.e = clause3;
        this.f = image;
        this.f216157g = parcelable;
        this.f216158h = pendingType;
        this.i = z;
        this.f216159j = analyticsProduct;
        this.k = parcelable2;
        this.f216160l = parcelable3;
        this.f216161m = z3;
        this.f216162n = image2;
        this.o = new l(n7.Pending);
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f216159j;
    }

    @Override // nii.m0
    public final Parcelable a() {
        return this.f216157g;
    }

    @Override // nii.m0
    public final b2 b() {
        return null;
    }

    @Override // nii.m0
    public final Parcelable c() {
        return this.f216160l;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return this.k;
    }

    @Override // nii.m0
    public final boolean e() {
        return this.f216161m;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f216154a, g0Var.f216154a) && Intrinsics.f(this.f216155b, g0Var.f216155b) && Intrinsics.f(this.f216156c, g0Var.f216156c) && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f216157g, g0Var.f216157g) && Intrinsics.f(this.f216158h, g0Var.f216158h) && this.i == g0Var.i && Intrinsics.f(this.f216159j, g0Var.f216159j) && Intrinsics.f(this.k, g0Var.k) && Intrinsics.f(this.f216160l, g0Var.f216160l) && this.f216161m == g0Var.f216161m && Intrinsics.f(this.f216162n, g0Var.f216162n);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.i;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return this.f216156c;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.o;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216155b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216154a;
    }

    public final int hashCode() {
        int iHashCode = this.f216154a.hashCode() * 31;
        Clause clause = this.f216155b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        StatusDialogDescriptionProgress statusDialogDescriptionProgress = this.f216156c;
        int iHashCode3 = (iHashCode2 + (statusDialogDescriptionProgress == null ? 0 : statusDialogDescriptionProgress.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.e;
        int iHashCode5 = (iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Image image = this.f;
        int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        Parcelable parcelable = this.f216157g;
        int iC = j6.a.c((this.f216158h.hashCode() + ((iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31, 31, this.i);
        AnalyticsProduct analyticsProduct = this.f216159j;
        int iHashCode7 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        Parcelable parcelable2 = this.k;
        int iHashCode8 = (iHashCode7 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        Parcelable parcelable3 = this.f216160l;
        int iC2 = j6.a.c((iHashCode8 + (parcelable3 == null ? 0 : parcelable3.hashCode())) * 31, 31, this.f216161m);
        Image image2 = this.f216162n;
        return iC2 + (image2 != null ? image2.hashCode() : 0);
    }

    public /* synthetic */ g0(Clause clause, Clause clause2, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Clause clause3, Clause clause4, Image image, Parcelable parcelable, j jVar, boolean z, AnalyticsProduct analyticsProduct, boolean z3, Image image2, int i) {
        this(clause, (i & 2) != 0 ? null : clause2, (i & 4) != 0 ? null : statusDialogDescriptionProgress, (i & 8) != 0 ? null : clause3, (i & 16) != 0 ? null : clause4, (i & 32) != 0 ? null : image, (i & 64) != 0 ? null : parcelable, (i & 128) != 0 ? j.a.f216169a : jVar, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : analyticsProduct, null, null, (i & 4096) != 0 ? true : z3, (i & 8192) != 0 ? null : image2);
    }
}
