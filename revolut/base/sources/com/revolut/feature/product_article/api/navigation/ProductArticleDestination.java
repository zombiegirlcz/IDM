package com.revolut.feature.product_article.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import grl.k9;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/product_article/api/navigation/ProductArticleDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/product_article/api/flow/ProductArticleFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductArticleDestination extends InternalDestination<ProductArticleFlowContract$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ProductArticleDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductArticleParams f81281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SkipShownArticleBehaviour f81282c;
    public final ProductArticleCommandInterceptor d;
    public final ProductArticleDestinationInterceptor e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsContext f81283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f81284h;
    public final TransitionAnimation i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductArticleDestination(ProductArticleParams.CREATOR.createFromParcel(parcel), (SkipShownArticleBehaviour) parcel.readParcelable(ProductArticleDestination.class.getClassLoader()), parcel.readInt() == 0 ? null : ProductArticleCommandInterceptor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProductArticleDestinationInterceptor.CREATOR.createFromParcel(parcel) : null, (AnalyticsProduct) parcel.readParcelable(ProductArticleDestination.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(ProductArticleDestination.class.getClassLoader()), parcel.readInt() != 0, (TransitionAnimation) parcel.readParcelable(ProductArticleDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductArticleDestination[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProductArticleDestination(com.revolut.feature.product_article.api.models.ProductArticleParams r8, com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour r9, com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r10, com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor r11, com.revolut.analytics.tracking.v3.AnalyticsProduct r12, com.revolut.analytics.tracking.v3.AnalyticsContext r13, boolean r14, com.revolut.kompot.navigable.TransitionAnimation r15) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "skipShownArticleBehaviour"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "analyticsProduct"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData r0 = new com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData
            r3 = 0
            if (r10 == 0) goto L17
            com.revolut.retail.core.navigation.NaviCommand r5 = r10.f81268a
            goto L18
        L17:
            r5 = r3
        L18:
            if (r5 != 0) goto L22
            if (r11 == 0) goto L1e
            com.revolut.kompot.common.StackDestination r3 = r11.f81271a
        L1e:
            if (r3 != 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            r6 = 1
            r1 = r8
            r2 = r9
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.<init>(r0)
            r7.f81281b = r8
            r7.f81282c = r9
            r7.d = r10
            r7.e = r11
            r7.f = r12
            r7.f81283g = r5
            r0 = r14
            r7.f81284h = r0
            r0 = r15
            r7.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.product_article.api.navigation.ProductArticleDestination.<init>(com.revolut.feature.product_article.api.models.ProductArticleParams, com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour, com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor, com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor, com.revolut.analytics.tracking.v3.AnalyticsProduct, com.revolut.analytics.tracking.v3.AnalyticsContext, boolean, com.revolut.kompot.navigable.TransitionAnimation):void");
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF() {
        return this.i;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ProductArticleCommandInterceptor getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ProductArticleDestinationInterceptor getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductArticleDestination)) {
            return false;
        }
        ProductArticleDestination productArticleDestination = (ProductArticleDestination) obj2;
        return Intrinsics.f(this.f81281b, productArticleDestination.f81281b) && Intrinsics.f(this.f81282c, productArticleDestination.f81282c) && Intrinsics.f(this.d, productArticleDestination.d) && Intrinsics.f(this.e, productArticleDestination.e) && Intrinsics.f(this.f, productArticleDestination.f) && Intrinsics.f(this.f81283g, productArticleDestination.f81283g) && this.f81284h == productArticleDestination.f81284h && Intrinsics.f(this.i, productArticleDestination.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f81282c.hashCode() + (this.f81281b.hashCode() * 31)) * 31;
        ProductArticleCommandInterceptor productArticleCommandInterceptor = this.d;
        int iHashCode2 = (iHashCode + (productArticleCommandInterceptor == null ? 0 : productArticleCommandInterceptor.hashCode())) * 31;
        ProductArticleDestinationInterceptor productArticleDestinationInterceptor = this.e;
        int iA = l.a((iHashCode2 + (productArticleDestinationInterceptor == null ? 0 : productArticleDestinationInterceptor.hashCode())) * 31, 31, this.f);
        AnalyticsContext analyticsContext = this.f81283g;
        int iC = j6.a.c((iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f81284h);
        TransitionAnimation transitionAnimation = this.i;
        return iC + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF99936c() {
        return this.f81284h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81281b.writeToParcel(dest, i);
        dest.writeParcelable(this.f81282c, i);
        ProductArticleCommandInterceptor productArticleCommandInterceptor = this.d;
        if (productArticleCommandInterceptor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productArticleCommandInterceptor.writeToParcel(dest, i);
        }
        ProductArticleDestinationInterceptor productArticleDestinationInterceptor = this.e;
        if (productArticleDestinationInterceptor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productArticleDestinationInterceptor.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f81283g, i);
        dest.writeInt(this.f81284h ? 1 : 0);
        dest.writeParcelable(this.i, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductArticleDestination(ProductArticleParams productArticleParams, SkipShownArticleBehaviour skipShownArticleBehaviour, ProductArticleCommandInterceptor productArticleCommandInterceptor, ProductArticleDestinationInterceptor productArticleDestinationInterceptor, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, TransitionAnimation transitionAnimation, int i) {
        AnalyticsProduct analyticsProductH;
        ProductArticleCommandInterceptor productArticleCommandInterceptor2 = (i & 4) != 0 ? null : productArticleCommandInterceptor;
        ProductArticleDestinationInterceptor productArticleDestinationInterceptor2 = (i & 8) != 0 ? null : productArticleDestinationInterceptor;
        if ((i & 16) != 0) {
            k9 k9Var = k9.Home;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProductH = analyticsProduct;
        }
        this(productArticleParams, skipShownArticleBehaviour, productArticleCommandInterceptor2, productArticleDestinationInterceptor2, analyticsProductH, (i & 32) != 0 ? null : analyticsContext, true, (i & 128) != 0 ? null : transitionAnimation);
    }
}
