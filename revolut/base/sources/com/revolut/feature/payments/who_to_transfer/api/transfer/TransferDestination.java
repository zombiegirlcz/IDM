package com.revolut.feature.payments.who_to_transfer.api.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TabTransferShotDialogAction;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import ehe.n;
import g3a.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "NewTransfer", "NewTransferFriend", "ChatTransfer", "PaymentsSearch", "NotifyFriends", "FindFriends", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$ChatTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$FindFriends;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$NewTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$NewTransferFriend;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$NotifyFriends;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$PaymentsSearch;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferDestination implements KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$ChatTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatTransfer extends TransferDestination {

        @NotNull
        public static final Parcelable.Creator<ChatTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f80033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TabTransferShotDialogAction f80035c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatTransfer(parcel.readInt() != 0, parcel.readInt() != 0, (TabTransferShotDialogAction) parcel.readParcelable(ChatTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatTransfer[i];
            }
        }

        public ChatTransfer() {
            this(false, (TabTransferShotDialogAction.Success) null, 7);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF80033a() {
            return this.f80033a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChatTransfer)) {
                return false;
            }
            ChatTransfer chatTransfer = (ChatTransfer) obj2;
            return this.f80033a == chatTransfer.f80033a && this.f80034b == chatTransfer.f80034b && Intrinsics.f(this.f80035c, chatTransfer.f80035c);
        }

        public final int hashCode() {
            int iC = j6.a.c(Boolean.hashCode(this.f80033a) * 31, 31, this.f80034b);
            TabTransferShotDialogAction tabTransferShotDialogAction = this.f80035c;
            return iC + (tabTransferShotDialogAction == null ? 0 : tabTransferShotDialogAction.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f80033a ? 1 : 0);
            dest.writeInt(this.f80034b ? 1 : 0);
            dest.writeParcelable(this.f80035c, i);
        }

        public ChatTransfer(boolean z, boolean z3, TabTransferShotDialogAction tabTransferShotDialogAction) {
            this.f80033a = z;
            this.f80034b = z3;
            this.f80035c = tabTransferShotDialogAction;
        }

        public /* synthetic */ ChatTransfer(boolean z, TabTransferShotDialogAction.Success success, int i) {
            this((i & 1) != 0 ? true : z, (i & 2) == 0, (i & 4) != 0 ? null : success);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$FindFriends;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FindFriends extends TransferDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FindFriends f80036a = new FindFriends();

        @NotNull
        public static final Parcelable.Creator<FindFriends> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FindFriends.f80036a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FindFriends[i];
            }
        }

        private FindFriends() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$NewTransferFriend;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewTransferFriend extends TransferDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewTransferFriend f80040a = new NewTransferFriend();

        @NotNull
        public static final Parcelable.Creator<NewTransferFriend> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewTransferFriend.f80040a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransferFriend[i];
            }
        }

        private NewTransferFriend() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$NotifyFriends;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotifyFriends extends TransferDestination {

        @NotNull
        public static final Parcelable.Creator<NotifyFriends> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f80041a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotifyFriends(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotifyFriends[i];
            }
        }

        public NotifyFriends(int i) {
            this.f80041a = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF80041a() {
            return this.f80041a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NotifyFriends) && this.f80041a == ((NotifyFriends) obj2).f80041a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f80041a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f80041a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$PaymentsSearch;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentsSearch extends TransferDestination {

        @NotNull
        public static final Parcelable.Creator<PaymentsSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f80042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WhoToTransferFilter f80043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferFlowType f80044c;
        public final boolean d;
        public final TransferDestinationParcel e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(PaymentsSearch.class, parcel, linkedHashSet, iE, 1);
                }
                return new PaymentsSearch((WhoToTransferFilter) parcel.readParcelable(PaymentsSearch.class.getClassLoader()), parcel.readInt() == 0 ? null : TransferDestinationParcel.CREATOR.createFromParcel(parcel), (TransferFlowType) parcel.readParcelable(PaymentsSearch.class.getClassLoader()), linkedHashSet, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentsSearch[i];
            }
        }

        public PaymentsSearch() {
            this(null, 31);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Set getF80042a() {
            return this.f80042a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TransferDestinationParcel getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final WhoToTransferFilter getF80043b() {
            return this.f80043b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TransferFlowType getF80044c() {
            return this.f80044c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentsSearch)) {
                return false;
            }
            PaymentsSearch paymentsSearch = (PaymentsSearch) obj2;
            return Intrinsics.f(this.f80042a, paymentsSearch.f80042a) && Intrinsics.f(this.f80043b, paymentsSearch.f80043b) && Intrinsics.f(this.f80044c, paymentsSearch.f80044c) && this.d == paymentsSearch.d && Intrinsics.f(this.e, paymentsSearch.e);
        }

        public final int hashCode() {
            int iHashCode = this.f80042a.hashCode() * 31;
            WhoToTransferFilter whoToTransferFilter = this.f80043b;
            int iC = j6.a.c(d.c(this.f80044c, (iHashCode + (whoToTransferFilter == null ? 0 : whoToTransferFilter.hashCode())) * 31, 31), 31, this.d);
            TransferDestinationParcel transferDestinationParcel = this.e;
            return iC + (transferDestinationParcel != null ? transferDestinationParcel.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f80042a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f80043b, i);
            dest.writeParcelable(this.f80044c, i);
            dest.writeInt(this.d ? 1 : 0);
            TransferDestinationParcel transferDestinationParcel = this.e;
            if (transferDestinationParcel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferDestinationParcel.writeToParcel(dest, i);
            }
        }

        public PaymentsSearch(WhoToTransferFilter whoToTransferFilter, int i) {
            this((i & 2) != 0 ? null : whoToTransferFilter, null, TransferFlowType.Default.f92257b, com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a, true);
        }

        public PaymentsSearch(WhoToTransferFilter whoToTransferFilter, TransferDestinationParcel transferDestinationParcel, TransferFlowType transferFlowType, Set availableFilters, boolean z) {
            Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
            Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
            this.f80042a = availableFilters;
            this.f80043b = whoToTransferFilter;
            this.f80044c = transferFlowType;
            this.d = z;
            this.e = transferDestinationParcel;
        }
    }

    private TransferDestination() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination$NewTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer extends TransferDestination {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f80037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferDestinationParcel f80038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f80039c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(NewTransfer.class, parcel, linkedHashSet, iE, 1);
                }
                return new NewTransfer(linkedHashSet, parcel.readInt() == 0 ? null : TransferDestinationParcel.CREATOR.createFromParcel(parcel), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(Set availableFilters, TransferDestinationParcel transferDestinationParcel, e entryPoint) {
            Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f80037a = availableFilters;
            this.f80038b = transferDestinationParcel;
            this.f80039c = entryPoint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Set getF80037a() {
            return this.f80037a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getF80039c() {
            return this.f80039c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TransferDestinationParcel getF80038b() {
            return this.f80038b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransfer)) {
                return false;
            }
            NewTransfer newTransfer = (NewTransfer) obj2;
            return Intrinsics.f(this.f80037a, newTransfer.f80037a) && Intrinsics.f(this.f80038b, newTransfer.f80038b) && this.f80039c == newTransfer.f80039c;
        }

        public final int hashCode() {
            int iHashCode = this.f80037a.hashCode() * 31;
            TransferDestinationParcel transferDestinationParcel = this.f80038b;
            return this.f80039c.hashCode() + ((iHashCode + (transferDestinationParcel == null ? 0 : transferDestinationParcel.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f80037a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            TransferDestinationParcel transferDestinationParcel = this.f80038b;
            if (transferDestinationParcel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferDestinationParcel.writeToParcel(dest, i);
            }
            dest.writeString(this.f80039c.name());
        }

        public /* synthetic */ NewTransfer(Set set, e eVar, int i) {
            this(set, (TransferDestinationParcel) null, (i & 4) != 0 ? e.PAYMENTS : eVar);
        }
    }
}
