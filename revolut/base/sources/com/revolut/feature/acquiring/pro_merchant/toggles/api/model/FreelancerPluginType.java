package com.revolut.feature.acquiring.pro_merchant.toggles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType;", "Landroid/os/Parcelable;", "Shopify", "Woocommerce", "PrestaShop", "Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType$PrestaShop;", "Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType$Shopify;", "Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType$Woocommerce;", "feature_acquiring_pro_merchant_toggles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerPluginType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType$PrestaShop;", "Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType;", "<init>", "()V", "feature_acquiring_pro_merchant_toggles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrestaShop implements FreelancerPluginType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrestaShop f60845a = new PrestaShop();

        @NotNull
        public static final Parcelable.Creator<PrestaShop> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrestaShop.f60845a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrestaShop[i];
            }
        }

        private PrestaShop() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType$Shopify;", "Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType;", "<init>", "()V", "feature_acquiring_pro_merchant_toggles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Shopify implements FreelancerPluginType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Shopify f60846a = new Shopify();

        @NotNull
        public static final Parcelable.Creator<Shopify> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Shopify.f60846a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Shopify[i];
            }
        }

        private Shopify() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType$Woocommerce;", "Lcom/revolut/feature/acquiring/pro_merchant/toggles/api/model/FreelancerPluginType;", "<init>", "()V", "feature_acquiring_pro_merchant_toggles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Woocommerce implements FreelancerPluginType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Woocommerce f60847a = new Woocommerce();

        @NotNull
        public static final Parcelable.Creator<Woocommerce> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Woocommerce.f60847a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Woocommerce[i];
            }
        }

        private Woocommerce() {
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
}
