package com.revolut.feature.payees.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/PayeesFlowType;", "Landroid/os/Parcelable;", "RequireAuthentication", "Blocked", "Lcom/revolut/feature/payees/impl/ui/PayeesFlowType$Blocked;", "Lcom/revolut/feature/payees/impl/ui/PayeesFlowType$RequireAuthentication;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayeesFlowType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/PayeesFlowType$Blocked;", "Lcom/revolut/feature/payees/impl/ui/PayeesFlowType;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Blocked implements PayeesFlowType {

        @NotNull
        public static final Parcelable.Creator<Blocked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OwnerType f78995a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Blocked((OwnerType) parcel.readParcelable(Blocked.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Blocked[i];
            }
        }

        public Blocked(OwnerType ownerType) {
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            this.f78995a = ownerType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Blocked) && Intrinsics.f(this.f78995a, ((Blocked) obj2).f78995a);
        }

        public final int hashCode() {
            return this.f78995a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78995a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/PayeesFlowType$RequireAuthentication;", "Lcom/revolut/feature/payees/impl/ui/PayeesFlowType;", "<init>", "()V", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequireAuthentication implements PayeesFlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequireAuthentication f78996a = new RequireAuthentication();

        @NotNull
        public static final Parcelable.Creator<RequireAuthentication> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequireAuthentication.f78996a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequireAuthentication[i];
            }
        }

        private RequireAuthentication() {
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
