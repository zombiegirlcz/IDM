package com.revolut.feature.subaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig;", "Landroid/os/Parcelable;", "<init>", "()V", "ResolveBySubaccountType", "StartWithArticle", "ShowArticlePerSubaccount", "Config", "Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig$ResolveBySubaccountType;", "Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig$ShowArticlePerSubaccount;", "Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig$StartWithArticle;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreateSubaccountProductArticleConfig implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig$Config;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f88928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f88929b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Config((ProductArticleParams) parcel.readParcelable(Config.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Config[i];
            }
        }

        public Config(ProductArticleParams productArticleParams, boolean z) {
            Intrinsics.checkNotNullParameter(productArticleParams, "productArticleParams");
            this.f88928a = productArticleParams;
            this.f88929b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Config)) {
                return false;
            }
            Config config = (Config) obj2;
            return Intrinsics.f(this.f88928a, config.f88928a) && this.f88929b == config.f88929b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88929b) + (this.f88928a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88928a, i);
            dest.writeInt(this.f88929b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig$ResolveBySubaccountType;", "Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResolveBySubaccountType extends CreateSubaccountProductArticleConfig {

        @NotNull
        public static final Parcelable.Creator<ResolveBySubaccountType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f88930a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResolveBySubaccountType(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResolveBySubaccountType[i];
            }
        }

        public ResolveBySubaccountType(boolean z) {
            this.f88930a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ResolveBySubaccountType) && this.f88930a == ((ResolveBySubaccountType) obj2).f88930a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88930a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f88930a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig$ShowArticlePerSubaccount;", "Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowArticlePerSubaccount extends CreateSubaccountProductArticleConfig {

        @NotNull
        public static final Parcelable.Creator<ShowArticlePerSubaccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f88931a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readParcelable(ShowArticlePerSubaccount.class.getClassLoader()), Config.CREATOR.createFromParcel(parcel));
                }
                return new ShowArticlePerSubaccount(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowArticlePerSubaccount[i];
            }
        }

        public ShowArticlePerSubaccount(Map configs) {
            Intrinsics.checkNotNullParameter(configs, "configs");
            this.f88931a = configs;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowArticlePerSubaccount) && Intrinsics.f(this.f88931a, ((ShowArticlePerSubaccount) obj2).f88931a);
        }

        public final int hashCode() {
            return this.f88931a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itZ = j6.a.z(this.f88931a, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeParcelable((Parcelable) entry.getKey(), i);
                ((Config) entry.getValue()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig$StartWithArticle;", "Lcom/revolut/feature/subaccount/api/CreateSubaccountProductArticleConfig;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartWithArticle extends CreateSubaccountProductArticleConfig {

        @NotNull
        public static final Parcelable.Creator<StartWithArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Config f88932a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartWithArticle(Config.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartWithArticle[i];
            }
        }

        public StartWithArticle(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f88932a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StartWithArticle) && Intrinsics.f(this.f88932a, ((StartWithArticle) obj2).f88932a);
        }

        public final int hashCode() {
            return this.f88932a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88932a.writeToParcel(dest, i);
        }
    }

    private CreateSubaccountProductArticleConfig() {
    }
}
