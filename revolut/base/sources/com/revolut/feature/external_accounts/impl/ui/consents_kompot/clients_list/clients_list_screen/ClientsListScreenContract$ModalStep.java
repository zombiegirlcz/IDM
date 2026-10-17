package com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.JointDataSharingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/clients_list_screen/ClientsListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "JointDataSharing", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/clients_list_screen/ClientsListScreenContract$ModalStep$JointDataSharing;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ClientsListScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/clients_list_screen/ClientsListScreenContract$ModalStep$JointDataSharing;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/clients_list_screen/ClientsListScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointDataSharing implements ClientsListScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<JointDataSharing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JointDataSharingScreenContract$InputData f72761a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointDataSharing((JointDataSharingScreenContract$InputData) parcel.readParcelable(JointDataSharing.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointDataSharing[i];
            }
        }

        public JointDataSharing(JointDataSharingScreenContract$InputData dataSharingInput) {
            Intrinsics.checkNotNullParameter(dataSharingInput, "dataSharingInput");
            this.f72761a = dataSharingInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointDataSharing) && Intrinsics.f(this.f72761a, ((JointDataSharing) obj2).f72761a);
        }

        public final int hashCode() {
            return this.f72761a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72761a, i);
        }
    }
}
