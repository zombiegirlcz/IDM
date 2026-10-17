package com.revolut.feature.credit.application.plugins.impl.ui.address_v2;

import android.os.Parcel;
import android.os.Parcelable;
import dx4.z2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$Config", "Landroid/os/Parcelable;", "AddressInput", "AddressSelection", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$Config$AddressInput;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$Config$AddressSelection;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditAddressV2FlowContract$Config extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$Config$AddressInput;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressInput implements CreditAddressV2FlowContract$Config {

        @NotNull
        public static final Parcelable.Creator<AddressInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66967c;
        public final z2 d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressInput(parcel.readString(), parcel.readString(), parcel.readString(), (z2) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressInput[i];
            }
        }

        public AddressInput(String title, String str, String buttonTitle, z2 z2Var) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            this.f66965a = title;
            this.f66966b = str;
            this.f66967c = buttonTitle;
            this.d = z2Var;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: S8, reason: from getter */
        public final String getF66970c() {
            return this.f66967c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressInput)) {
                return false;
            }
            AddressInput addressInput = (AddressInput) obj2;
            return Intrinsics.f(this.f66965a, addressInput.f66965a) && Intrinsics.f(this.f66966b, addressInput.f66966b) && Intrinsics.f(this.f66967c, addressInput.f66967c) && Intrinsics.f(this.d, addressInput.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getF66969b() {
            return this.f66966b;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF66968a() {
            return this.f66965a;
        }

        public final int hashCode() {
            int iHashCode = this.f66965a.hashCode() * 31;
            String str = this.f66966b;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66967c);
            z2 z2Var = this.d;
            return iC + (z2Var != null ? z2Var.hashCode() : 0);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: i4, reason: from getter */
        public final z2 getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66965a);
            dest.writeString(this.f66966b);
            dest.writeString(this.f66967c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$Config$AddressSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressSelection implements CreditAddressV2FlowContract$Config {

        @NotNull
        public static final Parcelable.Creator<AddressSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66970c;
        public final z2 d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressSelection(parcel.readString(), parcel.readString(), parcel.readString(), (z2) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressSelection[i];
            }
        }

        public AddressSelection(String title, String str, String buttonTitle, z2 z2Var) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            this.f66968a = title;
            this.f66969b = str;
            this.f66970c = buttonTitle;
            this.d = z2Var;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: S8, reason: from getter */
        public final String getF66970c() {
            return this.f66970c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressSelection)) {
                return false;
            }
            AddressSelection addressSelection = (AddressSelection) obj2;
            return Intrinsics.f(this.f66968a, addressSelection.f66968a) && Intrinsics.f(this.f66969b, addressSelection.f66969b) && Intrinsics.f(this.f66970c, addressSelection.f66970c) && Intrinsics.f(this.d, addressSelection.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getF66969b() {
            return this.f66969b;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF66968a() {
            return this.f66968a;
        }

        public final int hashCode() {
            int iHashCode = this.f66968a.hashCode() * 31;
            String str = this.f66969b;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66970c);
            z2 z2Var = this.d;
            return iC + (z2Var != null ? z2Var.hashCode() : 0);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config
        /* JADX INFO: renamed from: i4, reason: from getter */
        public final z2 getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66968a);
            dest.writeString(this.f66969b);
            dest.writeString(this.f66970c);
            dest.writeSerializable(this.d);
        }
    }

    /* JADX INFO: renamed from: S8 */
    String getF66970c();

    /* JADX INFO: renamed from: getDescription */
    String getF66969b();

    /* JADX INFO: renamed from: getTitle */
    String getF66968a();

    /* JADX INFO: renamed from: i4 */
    z2 getD();
}
