package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "JoinWaitingList", "WaitingListSubscribed", "Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$Step$JoinWaitingList;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$Step$WaitingListSubscribed;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WaitingListFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$Step$JoinWaitingList;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JoinWaitingList extends WaitingListFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JoinWaitingList f68518a = new JoinWaitingList();

        @NotNull
        public static final Parcelable.Creator<JoinWaitingList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JoinWaitingList.f68518a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JoinWaitingList[i];
            }
        }

        private JoinWaitingList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$Step$WaitingListSubscribed;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WaitingListSubscribed extends WaitingListFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WaitingListSubscribed f68519a = new WaitingListSubscribed();

        @NotNull
        public static final Parcelable.Creator<WaitingListSubscribed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WaitingListSubscribed.f68519a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingListSubscribed[i];
            }
        }

        private WaitingListSubscribed() {
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

    private WaitingListFlowContract$Step() {
    }
}
