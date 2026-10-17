package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Revoke", "EditAlias", "Back", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData$Back;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData$EditAlias;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData$Revoke;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilStoredMethodDetailsScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData$Back;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Back extends BrazilStoredMethodDetailsScreenContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Back f90807a = new Back();

        @NotNull
        public static final Parcelable.Creator<Back> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Back.f90807a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Back[i];
            }
        }

        private Back() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData$EditAlias;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditAlias extends BrazilStoredMethodDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<EditAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90809b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditAlias(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditAlias[i];
            }
        }

        public EditAlias(String consentId, String alias) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f90808a = consentId;
            this.f90809b = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditAlias)) {
                return false;
            }
            EditAlias editAlias = (EditAlias) obj2;
            return Intrinsics.f(this.f90808a, editAlias.f90808a) && Intrinsics.f(this.f90809b, editAlias.f90809b);
        }

        public final int hashCode() {
            return this.f90809b.hashCode() + (this.f90808a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90808a);
            dest.writeString(this.f90809b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData$Revoke;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Revoke extends BrazilStoredMethodDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<Revoke> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90811b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Revoke(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Revoke[i];
            }
        }

        public Revoke(String consentId, String thirdPartyTitle) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            this.f90810a = consentId;
            this.f90811b = thirdPartyTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Revoke)) {
                return false;
            }
            Revoke revoke = (Revoke) obj2;
            return Intrinsics.f(this.f90810a, revoke.f90810a) && Intrinsics.f(this.f90811b, revoke.f90811b);
        }

        public final int hashCode() {
            return this.f90811b.hashCode() + (this.f90810a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90810a);
            dest.writeString(this.f90811b);
        }
    }

    private BrazilStoredMethodDetailsScreenContract$OutputData() {
    }
}
