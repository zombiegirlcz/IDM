package com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ManageShopify", "PluginChooser", "PluginPreview", "PluginDetails", "ShopifyProductArticle", "BusinessNotSupported", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$BusinessNotSupported;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$ManageShopify;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$PluginChooser;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$PluginDetails;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$PluginPreview;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$ShopifyProductArticle;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ManageEcommercePluginFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$BusinessNotSupported;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BusinessNotSupported extends ManageEcommercePluginFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BusinessNotSupported f73794a = new BusinessNotSupported();

        @NotNull
        public static final Parcelable.Creator<BusinessNotSupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BusinessNotSupported.f73794a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessNotSupported[i];
            }
        }

        private BusinessNotSupported() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$ManageShopify;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManageShopify extends ManageEcommercePluginFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageShopify f73795a = new ManageShopify();

        @NotNull
        public static final Parcelable.Creator<ManageShopify> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageShopify.f73795a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageShopify[i];
            }
        }

        private ManageShopify() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$PluginChooser;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PluginChooser extends ManageEcommercePluginFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PluginChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f73796a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(PluginChooser.class, parcel, linkedHashSet, iE, 1);
                }
                return new PluginChooser(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PluginChooser[i];
            }
        }

        public PluginChooser(Set enabledPlugins) {
            Intrinsics.checkNotNullParameter(enabledPlugins, "enabledPlugins");
            this.f73796a = enabledPlugins;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PluginChooser) && Intrinsics.f(this.f73796a, ((PluginChooser) obj2).f73796a);
        }

        public final int hashCode() {
            return this.f73796a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f73796a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$PluginDetails;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PluginDetails extends ManageEcommercePluginFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PluginDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerPluginType f73797a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PluginDetails((FreelancerPluginType) parcel.readParcelable(PluginDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PluginDetails[i];
            }
        }

        public PluginDetails(FreelancerPluginType pluginType) {
            Intrinsics.checkNotNullParameter(pluginType, "pluginType");
            this.f73797a = pluginType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PluginDetails) && Intrinsics.f(this.f73797a, ((PluginDetails) obj2).f73797a);
        }

        public final int hashCode() {
            return this.f73797a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73797a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$PluginPreview;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PluginPreview extends ManageEcommercePluginFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PluginPreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerPluginType f73798a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PluginPreview((FreelancerPluginType) parcel.readParcelable(PluginPreview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PluginPreview[i];
            }
        }

        public PluginPreview(FreelancerPluginType pluginType) {
            Intrinsics.checkNotNullParameter(pluginType, "pluginType");
            this.f73798a = pluginType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PluginPreview) && Intrinsics.f(this.f73798a, ((PluginPreview) obj2).f73798a);
        }

        public final int hashCode() {
            return this.f73798a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73798a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step$ShopifyProductArticle;", "Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShopifyProductArticle extends ManageEcommercePluginFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShopifyProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f73799a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShopifyProductArticle((ProductArticleParams) parcel.readParcelable(ShopifyProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShopifyProductArticle[i];
            }
        }

        public ShopifyProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f73799a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShopifyProductArticle) && Intrinsics.f(this.f73799a, ((ShopifyProductArticle) obj2).f73799a);
        }

        public final int hashCode() {
            return this.f73799a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73799a, i);
        }
    }

    private ManageEcommercePluginFlowContract$Step() {
    }
}
