package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/ContentUser;", "Landroid/os/Parcelable;", "Companion", "Self", "Junior", "a", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/ContentUser$Junior;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/ContentUser$Self;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContentUser implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64234a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/ContentUser$Junior;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/ContentUser;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior extends ContentUser {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64236c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Junior(String juniorId, String firstName, String juniorWalletId) {
            super(juniorId, juniorId);
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(juniorWalletId, "juniorWalletId");
            this.f64235b = juniorId;
            this.f64236c = firstName;
            this.d = juniorWalletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Junior)) {
                return false;
            }
            Junior junior = (Junior) obj2;
            return Intrinsics.f(this.f64235b, junior.f64235b) && Intrinsics.f(this.f64236c, junior.f64236c) && Intrinsics.f(this.d, junior.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(this.f64235b.hashCode() * 31, 31, this.f64236c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64235b);
            dest.writeString(this.f64236c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/ContentUser$Self;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/ContentUser;", "<init>", "()V", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Self extends ContentUser {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Self f64237b = new Self();

        @NotNull
        public static final Parcelable.Creator<Self> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Self.f64237b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Self[i];
            }
        }

        private Self() {
            super("SELF_ID_MARKER", null);
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

    public ContentUser(String str, String str2) {
        this.f64234a = str2;
    }
}
