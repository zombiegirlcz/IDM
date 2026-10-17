package com.revolut.feature.junior_transfer.impl.ui.add_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddMoney", "AddNewPocket", "Lcom/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$Step$AddMoney;", "Lcom/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$Step$AddNewPocket;", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAddMoneyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$Step$AddMoney;", "Lcom/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddMoney extends JuniorAddMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f77427a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddMoney((l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddMoney[i];
            }
        }

        public AddMoney(l contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f77427a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddMoney) && Intrinsics.f(this.f77427a, ((AddMoney) obj2).f77427a);
        }

        public final int hashCode() {
            return this.f77427a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77427a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$Step$AddNewPocket;", "Lcom/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$Step;", "<init>", "()V", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddNewPocket extends JuniorAddMoneyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNewPocket f77428a = new AddNewPocket();

        @NotNull
        public static final Parcelable.Creator<AddNewPocket> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddNewPocket.f77428a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewPocket[i];
            }
        }

        private AddNewPocket() {
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

    private JuniorAddMoneyFlowContract$Step() {
    }
}
