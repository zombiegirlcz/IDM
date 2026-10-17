package com.revolut.feature.raffle.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Raffle", "NotAvailable", "ShareRaffle", "Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step$NotAvailable;", "Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step$Raffle;", "Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step$ShareRaffle;", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RaffleFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step$NotAvailable;", "Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step;", "<init>", "()V", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable implements RaffleFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f81636a = new NotAvailable();

        @NotNull
        public static final Parcelable.Creator<NotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotAvailable.f81636a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotAvailable[i];
            }
        }

        private NotAvailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step$Raffle;", "Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step;", "<init>", "()V", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Raffle implements RaffleFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Raffle f81637a = new Raffle();

        @NotNull
        public static final Parcelable.Creator<Raffle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Raffle.f81637a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Raffle[i];
            }
        }

        private Raffle() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step$ShareRaffle;", "Lcom/revolut/feature/raffle/impl/flow/RaffleFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShareRaffle implements RaffleFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShareRaffle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RaffleCampaign$ShareInfo f81638a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareRaffle(RaffleCampaign$ShareInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShareRaffle[i];
            }
        }

        public ShareRaffle(RaffleCampaign$ShareInfo shareInfo) {
            Intrinsics.checkNotNullParameter(shareInfo, "shareInfo");
            this.f81638a = shareInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShareRaffle) && Intrinsics.f(this.f81638a, ((ShareRaffle) obj2).f81638a);
        }

        public final int hashCode() {
            return this.f81638a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81638a.writeToParcel(dest, i);
        }
    }
}
