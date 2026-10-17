package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import ez3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "SelectSolicitor", "PartnerSolicitorDetails", "CustomSolicitorDetails", "CustomSolicitorAddress", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$CustomSolicitorAddress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$CustomSolicitorDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$PartnerSolicitorDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$SelectSolicitor;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SolicitorSelectionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$CustomSolicitorAddress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomSolicitorAddress implements SolicitorSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomSolicitorAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ez3.c f68380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Address f68381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f68382c;
        public final String d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomSolicitorAddress((ez3.c) parcel.readSerializable(), (Address) parcel.readParcelable(CustomSolicitorAddress.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomSolicitorAddress[i];
            }
        }

        public CustomSolicitorAddress(ez3.c configuration, Address userAddress, String solicitorName, String email, String str, String str2) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(userAddress, "userAddress");
            Intrinsics.checkNotNullParameter(solicitorName, "solicitorName");
            Intrinsics.checkNotNullParameter(email, "email");
            this.f68380a = configuration;
            this.f68381b = userAddress;
            this.f68382c = solicitorName;
            this.d = email;
            this.e = str;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomSolicitorAddress)) {
                return false;
            }
            CustomSolicitorAddress customSolicitorAddress = (CustomSolicitorAddress) obj2;
            return Intrinsics.f(this.f68380a, customSolicitorAddress.f68380a) && Intrinsics.f(this.f68381b, customSolicitorAddress.f68381b) && Intrinsics.f(this.f68382c, customSolicitorAddress.f68382c) && Intrinsics.f(this.d, customSolicitorAddress.d) && Intrinsics.f(this.e, customSolicitorAddress.e) && Intrinsics.f(this.f, customSolicitorAddress.f);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c((this.f68381b.hashCode() + (this.f68380a.hashCode() * 31)) * 31, 31, this.f68382c), 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68380a);
            dest.writeParcelable(this.f68381b, i);
            dest.writeString(this.f68382c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$CustomSolicitorDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomSolicitorDetails implements SolicitorSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomSolicitorDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ez3.c f68383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Address f68384b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomSolicitorDetails((ez3.c) parcel.readSerializable(), (Address) parcel.readParcelable(CustomSolicitorDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomSolicitorDetails[i];
            }
        }

        public CustomSolicitorDetails(ez3.c configuration, Address userAddress) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(userAddress, "userAddress");
            this.f68383a = configuration;
            this.f68384b = userAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomSolicitorDetails)) {
                return false;
            }
            CustomSolicitorDetails customSolicitorDetails = (CustomSolicitorDetails) obj2;
            return Intrinsics.f(this.f68383a, customSolicitorDetails.f68383a) && Intrinsics.f(this.f68384b, customSolicitorDetails.f68384b);
        }

        public final int hashCode() {
            return this.f68384b.hashCode() + (this.f68383a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68383a);
            dest.writeParcelable(this.f68384b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements SolicitorSelectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f68385a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f68385a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$PartnerSolicitorDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartnerSolicitorDetails implements SolicitorSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PartnerSolicitorDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ez3.d f68386a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartnerSolicitorDetails((ez3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartnerSolicitorDetails[i];
            }
        }

        public PartnerSolicitorDetails(ez3.d configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f68386a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PartnerSolicitorDetails) && Intrinsics.f(this.f68386a, ((PartnerSolicitorDetails) obj2).f68386a);
        }

        public final int hashCode() {
            return this.f68386a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68386a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step$SelectSolicitor;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/solicitor_selection/SolicitorSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectSolicitor implements SolicitorSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectSolicitor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f68387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Address f68388b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectSolicitor((n) parcel.readSerializable(), (Address) parcel.readParcelable(SelectSolicitor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectSolicitor[i];
            }
        }

        public SelectSolicitor(n configuration, Address userAddress) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(userAddress, "userAddress");
            this.f68387a = configuration;
            this.f68388b = userAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectSolicitor)) {
                return false;
            }
            SelectSolicitor selectSolicitor = (SelectSolicitor) obj2;
            return Intrinsics.f(this.f68387a, selectSolicitor.f68387a) && Intrinsics.f(this.f68388b, selectSolicitor.f68388b);
        }

        public final int hashCode() {
            return this.f68388b.hashCode() + (this.f68387a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68387a);
            dest.writeParcelable(this.f68388b, i);
        }
    }
}
