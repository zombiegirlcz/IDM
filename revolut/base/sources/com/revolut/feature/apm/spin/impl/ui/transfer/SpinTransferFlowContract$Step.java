package com.revolut.feature.apm.spin.impl.ui.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/spin/impl/ui/transfer/SpinTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Chat", "Transfer", "Lcom/revolut/feature/apm/spin/impl/ui/transfer/SpinTransferFlowContract$Step$Chat;", "Lcom/revolut/feature/apm/spin/impl/ui/transfer/SpinTransferFlowContract$Step$Transfer;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SpinTransferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/transfer/SpinTransferFlowContract$Step$Chat;", "Lcom/revolut/feature/apm/spin/impl/ui/transfer/SpinTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat implements SpinTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpinContact f62888a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat((SpinContact) parcel.readParcelable(Chat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(SpinContact contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f62888a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f62888a, ((Chat) obj2).f62888a);
        }

        public final int hashCode() {
            return this.f62888a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62888a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/transfer/SpinTransferFlowContract$Step$Transfer;", "Lcom/revolut/feature/apm/spin/impl/ui/transfer/SpinTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements SpinTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f62889a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f62889a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transfer) && Intrinsics.f(this.f62889a, ((Transfer) obj2).f62889a);
        }

        public final int hashCode() {
            return this.f62889a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62889a);
        }
    }
}
