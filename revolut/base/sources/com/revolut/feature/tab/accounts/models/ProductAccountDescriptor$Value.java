package com.revolut.feature.tab.accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nie.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value", "Lnie/c;", "Landroid/os/Parcelable;", "Main", "Discover", "Lcom/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value$Discover;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value$Main;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductAccountDescriptor$Value extends c implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value$Discover;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Discover extends ProductAccountDescriptor$Value {

        @NotNull
        public static final Parcelable.Creator<Discover> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductId f89725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProductAccountId f89726b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Discover(ProductAccountId.CREATOR.createFromParcel(parcel), ProductId.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discover[i];
            }
        }

        public Discover(ProductAccountId accountId, ProductId productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f89725a = productId;
            this.f89726b = accountId;
        }

        @Override // nie.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ProductAccountId getF89728b() {
            return this.f89726b;
        }

        @Override // nie.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProductId getF89727a() {
            return this.f89725a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Discover)) {
                return false;
            }
            Discover discover = (Discover) obj2;
            return this.f89725a == discover.f89725a && Intrinsics.f(this.f89726b, discover.f89726b);
        }

        public final int hashCode() {
            return this.f89726b.hashCode() + (this.f89725a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89725a.writeToParcel(dest, i);
            this.f89726b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value$Main;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Main extends ProductAccountDescriptor$Value {

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductId f89727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProductAccountId f89728b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Main(ProductAccountId.CREATOR.createFromParcel(parcel), ProductId.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        public Main(ProductAccountId accountId, ProductId productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f89727a = productId;
            this.f89728b = accountId;
        }

        public static Main c(Main main, ProductId productId, ProductAccountId accountId, int i) {
            if ((i & 1) != 0) {
                productId = main.f89727a;
            }
            if ((i & 2) != 0) {
                accountId = main.f89728b;
            }
            main.getClass();
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new Main(accountId, productId);
        }

        @Override // nie.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ProductAccountId getF89728b() {
            return this.f89728b;
        }

        @Override // nie.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProductId getF89727a() {
            return this.f89727a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Main)) {
                return false;
            }
            Main main = (Main) obj2;
            return this.f89727a == main.f89727a && Intrinsics.f(this.f89728b, main.f89728b);
        }

        public final int hashCode() {
            return this.f89728b.hashCode() + (this.f89727a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89727a.writeToParcel(dest, i);
            this.f89728b.writeToParcel(dest, i);
        }
    }
}
