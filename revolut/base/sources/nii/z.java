package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.n7;
import ix0.b2;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements w {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f216248c;
    public final Clause d;
    public final Image e;
    public final Parcelable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f216250h;
    public final Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f216251j;
    public final u0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f216252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f216253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f216254n;
    public final o1 o;

    public z(Clause title, Clause clause, Clause clause2, Clause clause3, Image image, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, Parcelable parcelable2, Parcelable parcelable3, u0 errorIcon, y errorContext, String dialogBreadcrumb) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(errorIcon, "errorIcon");
        Intrinsics.checkNotNullParameter(errorContext, "errorContext");
        Intrinsics.checkNotNullParameter(dialogBreadcrumb, "dialogBreadcrumb");
        this.f216246a = title;
        this.f216247b = clause;
        this.f216248c = clause2;
        this.d = clause3;
        this.e = image;
        this.f = parcelable;
        this.f216249g = z;
        this.f216250h = analyticsProduct;
        this.i = parcelable2;
        this.f216251j = parcelable3;
        this.k = errorIcon;
        this.f216252l = errorContext;
        this.f216253m = dialogBreadcrumb;
        this.f216254n = new l(n7.Failure);
        this.o = o1.UNLIMITED;
    }

    public static z i(z zVar, TextLocalisedClause textLocalisedClause, int i) {
        Clause title = zVar.f216246a;
        Clause clause = zVar.f216247b;
        zVar.getClass();
        Clause clause2 = (i & 8) != 0 ? zVar.f216248c : textLocalisedClause;
        zVar.getClass();
        Clause clause3 = zVar.d;
        Image image = zVar.e;
        Parcelable parcelable = zVar.f;
        boolean z = (i & 256) != 0 ? zVar.f216249g : true;
        AnalyticsProduct analyticsProduct = zVar.f216250h;
        Parcelable parcelable2 = zVar.i;
        Parcelable parcelable3 = zVar.f216251j;
        u0 errorIcon = zVar.k;
        y errorContext = zVar.f216252l;
        String dialogBreadcrumb = zVar.f216253m;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(errorIcon, "errorIcon");
        Intrinsics.checkNotNullParameter(errorContext, "errorContext");
        Intrinsics.checkNotNullParameter(dialogBreadcrumb, "dialogBreadcrumb");
        return new z(title, clause, clause2, clause3, image, parcelable, z, analyticsProduct, parcelable2, parcelable3, errorIcon, errorContext, dialogBreadcrumb);
    }

    @Override // nii.m0
    public final AnalyticsProduct P() {
        return this.f216250h;
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
        return this.f216251j;
    }

    @Override // nii.m0
    public final Parcelable d() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!z.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.kompot.common.dialog.status.StatusDialogConfiguration.Error");
        z zVar = (z) obj2;
        return this.f216249g == zVar.f216249g && Intrinsics.f(this.f216246a, zVar.f216246a) && Intrinsics.f(this.f216247b, zVar.f216247b) && Intrinsics.f(this.f216248c, zVar.f216248c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f216250h, zVar.f216250h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f216251j, zVar.f216251j) && this.k == zVar.k && Intrinsics.f(this.f216252l, zVar.f216252l);
    }

    @Override // nii.m0
    public final boolean f() {
        return this.f216249g;
    }

    @Override // nii.m0
    public final StatusDialogDescriptionProgress g() {
        return null;
    }

    @Override // nii.m0
    public final m getAnalyticsContext() {
        return this.f216254n;
    }

    @Override // nii.m0
    public final Clause getDescription() {
        return this.f216247b;
    }

    @Override // nii.m0
    public final Clause getTitle() {
        return this.f216246a;
    }

    @Override // nii.m0
    public final o1 h() {
        return this.o;
    }

    public final int hashCode() {
        int iA = p.a.a(Boolean.hashCode(this.f216249g) * 31, 31, this.f216246a);
        Clause clause = this.f216247b;
        int iHashCode = (iA + (clause != null ? clause.hashCode() : 0)) * 961;
        Clause clause2 = this.f216248c;
        int iHashCode2 = (iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 961;
        Clause clause3 = this.d;
        int iHashCode3 = (iHashCode2 + (clause3 != null ? clause3.hashCode() : 0)) * 31;
        Image image = this.e;
        int iHashCode4 = (iHashCode3 + (image != null ? image.hashCode() : 0)) * 31;
        Parcelable parcelable = this.f;
        int iHashCode5 = (iHashCode4 + (parcelable != null ? parcelable.hashCode() : 0)) * 31;
        AnalyticsProduct analyticsProduct = this.f216250h;
        int iHashCode6 = (iHashCode5 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0)) * 31;
        Parcelable parcelable2 = this.i;
        int iHashCode7 = (iHashCode6 + (parcelable2 != null ? parcelable2.hashCode() : 0)) * 31;
        Parcelable parcelable3 = this.f216251j;
        return this.f216252l.hashCode() + ((this.k.hashCode() + ((iHashCode7 + (parcelable3 != null ? parcelable3.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(Clause clause, Clause clause2, Clause clause3, Clause clause4, Image image, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, u0 u0Var, y yVar, String str, int i) throws IOException {
        String strK0;
        Clause clause5 = (i & 2) != 0 ? null : clause2;
        Clause clause6 = (i & 8) != 0 ? null : clause3;
        Clause clause7 = (i & 32) != 0 ? null : clause4;
        Image image2 = (i & 64) != 0 ? null : image;
        Parcelable parcelable2 = (i & 128) != 0 ? null : parcelable;
        boolean z3 = (i & 256) != 0 ? false : z;
        AnalyticsProduct analyticsProduct2 = (i & 512) != 0 ? null : analyticsProduct;
        AnalyticsContext analyticsContext3 = (i & 1024) != 0 ? null : analyticsContext;
        AnalyticsContext analyticsContext4 = (i & 2048) != 0 ? null : analyticsContext2;
        u0 u0Var2 = (i & 4096) != 0 ? u0.DEFAULT : u0Var;
        y yVar2 = (i & 8192) != 0 ? new y(3, null, null) : yVar;
        if ((i & 16384) != 0) {
            StackTraceElement[] stackTrace = new BreadcrumbException().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            strK0 = zhm.d0.k0(zhm.d0.V0(kotlin.collections.d.K(1, stackTrace), 3), null, null, null, 0, null, 63);
        } else {
            strK0 = str;
        }
        this(clause, clause5, clause6, clause7, image2, parcelable2, z3, analyticsProduct2, analyticsContext3, analyticsContext4, u0Var2, yVar2, strK0);
    }
}
