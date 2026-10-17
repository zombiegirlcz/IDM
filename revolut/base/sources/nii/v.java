package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ix0.b2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements w {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f216228c;
    public final Clause d;
    public final Clause e;
    public final b2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StatusDialogDescriptionProgress f216229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Parcelable f216230h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AnalyticsProduct f216231j;
    public final Parcelable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Parcelable f216232l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(TextClause title, TextLocalisedClause description, CountryImage countryImage, TextLocalisedClause primaryButtonText, TextLocalisedClause secondaryButtonText, ListIdTarget anchor) {
        this(title, description, countryImage, primaryButtonText, secondaryButtonText, anchor, null, null, false, null, null, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f216231j;
    }

    @Override // nii.m0
    public final Parcelable a() {
        return this.f216230h;
    }

    @Override // nii.m0
    public final b2 b() {
        return this.f;
    }

    @Override // nii.m0
    public final Parcelable c() {
        return this.f216232l;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f216226a, vVar.f216226a) && Intrinsics.f(this.f216227b, vVar.f216227b) && Intrinsics.f(this.f216228c, vVar.f216228c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f216229g, vVar.f216229g) && Intrinsics.f(this.f216230h, vVar.f216230h) && this.i == vVar.i && Intrinsics.f(this.f216231j, vVar.f216231j) && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f216232l, vVar.f216232l);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.i;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return this.f216229g;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return null;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216227b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216226a;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f216226a.hashCode() * 31, 31, this.f216227b);
        Image image = this.f216228c;
        int iA2 = p.a.a(p.a.a((iA + (image == null ? 0 : image.hashCode())) * 31, 31, this.d), 31, this.e);
        b2 b2Var = this.f;
        int iHashCode = (iA2 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        StatusDialogDescriptionProgress statusDialogDescriptionProgress = this.f216229g;
        int iHashCode2 = (iHashCode + (statusDialogDescriptionProgress == null ? 0 : statusDialogDescriptionProgress.hashCode())) * 31;
        Parcelable parcelable = this.f216230h;
        int iC = j6.a.c((iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.i);
        AnalyticsProduct analyticsProduct = this.f216231j;
        int iHashCode3 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        Parcelable parcelable2 = this.k;
        int iHashCode4 = (iHashCode3 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        Parcelable parcelable3 = this.f216232l;
        return iHashCode4 + (parcelable3 != null ? parcelable3.hashCode() : 0);
    }

    public v(Clause title, Clause description, Image image, Clause primaryButtonText, Clause secondaryButtonText, b2 b2Var, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, Parcelable parcelable2, Parcelable parcelable3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f216226a = title;
        this.f216227b = description;
        this.f216228c = image;
        this.d = primaryButtonText;
        this.e = secondaryButtonText;
        this.f = b2Var;
        this.f216229g = statusDialogDescriptionProgress;
        this.f216230h = parcelable;
        this.i = z;
        this.f216231j = analyticsProduct;
        this.k = parcelable2;
        this.f216232l = parcelable3;
    }

    public /* synthetic */ v(Clause clause, Clause clause2, Image image, Clause clause3, Clause clause4, b2 b2Var, StatusDialogDescriptionProgress statusDialogDescriptionProgress, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, int i) {
        this(clause, clause2, image, clause3, clause4, b2Var, (i & 64) != 0 ? null : statusDialogDescriptionProgress, (i & 128) != 0 ? null : parcelable, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : analyticsProduct, null, null);
    }
}
