package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.n7;
import ix0.b2;
import kotlin.jvm.internal.Intrinsics;
import nii.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements w {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatusDialogDescriptionProgress f216173c;
    public final Parcelable d;
    public final u1 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f216174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Parcelable f216175h;
    public final Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StatusViewContract$Duration f216176j;
    public final h0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Image f216177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f216178m;

    public j0(Clause title, Clause clause, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Parcelable parcelable, u1 successType, boolean z, AnalyticsProduct analyticsProduct, Parcelable parcelable2, Parcelable parcelable3, StatusViewContract$Duration duration, h0 overlayAnimation, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(successType, "successType");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(overlayAnimation, "overlayAnimation");
        this.f216171a = title;
        this.f216172b = clause;
        this.f216173c = statusDialogDescriptionProgress;
        this.d = parcelable;
        this.e = successType;
        this.f = z;
        this.f216174g = analyticsProduct;
        this.f216175h = parcelable2;
        this.i = parcelable3;
        this.f216176j = duration;
        this.k = overlayAnimation;
        this.f216177l = image;
        this.f216178m = new l(n7.Success);
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f216174g;
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
        return this.i;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return this.f216175h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f216171a, j0Var.f216171a) && Intrinsics.f(this.f216172b, j0Var.f216172b) && Intrinsics.f(this.f216173c, j0Var.f216173c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e) && this.f == j0Var.f && Intrinsics.f(this.f216174g, j0Var.f216174g) && Intrinsics.f(this.f216175h, j0Var.f216175h) && Intrinsics.f(this.i, j0Var.i) && Intrinsics.f(this.f216176j, j0Var.f216176j) && this.k == j0Var.k && Intrinsics.f(this.f216177l, j0Var.f216177l);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.f;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return this.f216173c;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.f216178m;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216172b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216171a;
    }

    public final int hashCode() {
        int iHashCode = this.f216171a.hashCode() * 31;
        Clause clause = this.f216172b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        StatusDialogDescriptionProgress statusDialogDescriptionProgress = this.f216173c;
        int iHashCode3 = (iHashCode2 + (statusDialogDescriptionProgress == null ? 0 : statusDialogDescriptionProgress.hashCode())) * 31;
        Parcelable parcelable = this.d;
        int iC = j6.a.c((this.e.hashCode() + ((iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31, 31, this.f);
        AnalyticsProduct analyticsProduct = this.f216174g;
        int iHashCode4 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        Parcelable parcelable2 = this.f216175h;
        int iHashCode5 = (iHashCode4 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        Parcelable parcelable3 = this.i;
        int iHashCode6 = (this.k.hashCode() + ((this.f216176j.hashCode() + ((iHashCode5 + (parcelable3 == null ? 0 : parcelable3.hashCode())) * 31)) * 31)) * 31;
        Image image = this.f216177l;
        return iHashCode6 + (image != null ? image.hashCode() : 0);
    }

    public final h0 i() {
        return this.k;
    }

    public /* synthetic */ j0(Clause clause, Clause clause2, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Parcelable parcelable, u1 u1Var, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, StatusViewContract$Duration statusViewContract$Duration, h0 h0Var, ResourceImage resourceImage, int i) {
        this(clause, (i & 2) != 0 ? null : clause2, (i & 4) != 0 ? null : statusDialogDescriptionProgress, (i & 8) != 0 ? null : parcelable, (i & 16) != 0 ? u1.b.f216225a : u1Var, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : analyticsProduct, (i & 128) != 0 ? null : analyticsContext, (Parcelable) null, (i & 512) != 0 ? StatusViewContract$Duration.Long.f59733a : statusViewContract$Duration, (i & 1024) != 0 ? h0.NONE : h0Var, (i & 2048) != 0 ? null : resourceImage);
    }
}
