package com.revolut.retail.feature.payments.peer_to_peer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.CurrencyPickerMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ehe.n;
import h30.l;
import hrf.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Companion", "NewTransfer", "ReviewOnly", "a", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferInputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferInputData$ReviewOnly;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PeerToPeerTransferInputData implements IOData$Input {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferInputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferInputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer extends PeerToPeerTransferInputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerRecipient f102279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f102280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferFlowType f102281c;
        public final m1l.a d;
        public final p e;
        public final FlowExtras f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LaunchMode f102282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f102283h;
        public final Set i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TransferMoneyPocket f102284j;
        public final TransferScheduleData k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f102285l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f102286m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f102287n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final CurrencyPickerMode f102288p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final TransferAppSource f102289q;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                int i2;
                LinkedHashSet linkedHashSet;
                TransferScheduleData transferScheduleData;
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PeerToPeerRecipient peerToPeerRecipientCreateFromParcel = PeerToPeerRecipient.CREATOR.createFromParcel(parcel);
                f fVarValueOf = f.valueOf(parcel.readString());
                TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(NewTransfer.class.getClassLoader());
                m1l.a aVarValueOf = m1l.a.valueOf(parcel.readString());
                p pVar = (p) parcel.readSerializable();
                FlowExtras flowExtras = (FlowExtras) parcel.readParcelable(NewTransfer.class.getClassLoader());
                LaunchMode launchMode = (LaunchMode) parcel.readParcelable(NewTransfer.class.getClassLoader());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z3 = true;
                } else {
                    i = 0;
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                int iE = i;
                while (iE != i3) {
                    iE = d.e(NewTransfer.class, parcel, linkedHashSet2, iE, 1);
                }
                TransferMoneyPocket transferMoneyPocket = (TransferMoneyPocket) parcel.readParcelable(NewTransfer.class.getClassLoader());
                TransferScheduleData transferScheduleData2 = (TransferScheduleData) parcel.readParcelable(NewTransfer.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    i2 = 1;
                    linkedHashSet = linkedHashSet2;
                    transferScheduleData = transferScheduleData2;
                    z = 1;
                } else {
                    i2 = 1;
                    linkedHashSet = linkedHashSet2;
                    transferScheduleData = transferScheduleData2;
                    z = i;
                }
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    i2 = i;
                }
                return new NewTransfer(peerToPeerRecipientCreateFromParcel, fVarValueOf, transferFlowType, aVarValueOf, pVar, flowExtras, launchMode, z3, linkedHashSet, transferMoneyPocket, transferScheduleData, z, string, i2, parcel.readString(), (CurrencyPickerMode) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferAppSource) parcel.readParcelable(NewTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(PeerToPeerRecipient recipient, f direction, TransferFlowType flowType, m1l.a scheduleMode, p pVar, FlowExtras flowExtras, LaunchMode launchMode, boolean z, Set extraConfigurations, TransferMoneyPocket moneyPocket, TransferScheduleData scheduleData, boolean z3, String str, boolean z4, String str2, CurrencyPickerMode currencyPickerMode, TransferAppSource transferAppSource) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            Intrinsics.checkNotNullParameter(currencyPickerMode, "currencyPickerMode");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            this.f102279a = recipient;
            this.f102280b = direction;
            this.f102281c = flowType;
            this.d = scheduleMode;
            this.e = pVar;
            this.f = flowExtras;
            this.f102282g = launchMode;
            this.f102283h = z;
            this.i = extraConfigurations;
            this.f102284j = moneyPocket;
            this.k = scheduleData;
            this.f102285l = z3;
            this.f102286m = str;
            this.f102287n = z4;
            this.o = str2;
            this.f102288p = currencyPickerMode;
            this.f102289q = transferAppSource;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: C7, reason: from getter */
        public final boolean getF102294h() {
            return this.f102283h;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102292c() {
            return this.f102281c;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: L3, reason: from getter */
        public final FlowExtras getF() {
            return this.f;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LaunchMode getF102293g() {
            return this.f102282g;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final m1l.a getD() {
            return this.d;
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
            return Intrinsics.f(this.f102279a, newTransfer.f102279a) && this.f102280b == newTransfer.f102280b && Intrinsics.f(this.f102281c, newTransfer.f102281c) && this.d == newTransfer.d && Intrinsics.f(this.e, newTransfer.e) && Intrinsics.f(this.f, newTransfer.f) && Intrinsics.f(this.f102282g, newTransfer.f102282g) && this.f102283h == newTransfer.f102283h && Intrinsics.f(this.i, newTransfer.i) && Intrinsics.f(this.f102284j, newTransfer.f102284j) && Intrinsics.f(this.k, newTransfer.k) && this.f102285l == newTransfer.f102285l && Intrinsics.f(this.f102286m, newTransfer.f102286m) && this.f102287n == newTransfer.f102287n && Intrinsics.f(this.o, newTransfer.o) && Intrinsics.f(this.f102288p, newTransfer.f102288p) && Intrinsics.f(this.f102289q, newTransfer.f102289q);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + d.c(this.f102281c, (this.f102280b.hashCode() + (this.f102279a.hashCode() * 31)) * 31, 31)) * 31;
            p pVar = this.e;
            int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
            FlowExtras flowExtras = this.f;
            int iC = j6.a.c(l.f(this.k, (this.f102284j.hashCode() + p.a.f(j6.a.c((this.f102282g.hashCode() + ((iHashCode2 + (flowExtras == null ? 0 : flowExtras.hashCode())) * 31)) * 31, 31, this.f102283h), 31, this.i)) * 31, 31), 31, this.f102285l);
            String str = this.f102286m;
            int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f102287n);
            String str2 = this.o;
            return this.f102289q.hashCode() + ((this.f102288p.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF102291b() {
            return this.f102280b;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: m8, reason: from getter */
        public final p getE() {
            return this.e;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: t0, reason: from getter */
        public final PeerToPeerRecipient getF102290a() {
            return this.f102279a;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: u0, reason: from getter */
        public final Set getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102279a.writeToParcel(dest, i);
            dest.writeString(this.f102280b.name());
            dest.writeParcelable(this.f102281c, i);
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f102282g, i);
            dest.writeInt(this.f102283h ? 1 : 0);
            Iterator itV = n.v(this.i, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f102284j, i);
            dest.writeParcelable(this.k, i);
            dest.writeInt(this.f102285l ? 1 : 0);
            dest.writeString(this.f102286m);
            dest.writeInt(this.f102287n ? 1 : 0);
            dest.writeString(this.o);
            dest.writeParcelable(this.f102288p, i);
            dest.writeParcelable(this.f102289q, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferInputData$ReviewOnly;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferInputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewOnly extends PeerToPeerTransferInputData {

        @NotNull
        public static final Parcelable.Creator<ReviewOnly> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerRecipient f102290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f102291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferFlowType f102292c;
        public final m1l.a d;
        public final p e;
        public final FlowExtras f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LaunchMode f102293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f102294h;
        public final Set i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final PeerToPeerTransferData f102295j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iE;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PeerToPeerRecipient peerToPeerRecipientCreateFromParcel = PeerToPeerRecipient.CREATOR.createFromParcel(parcel);
                f fVarValueOf = f.valueOf(parcel.readString());
                TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(ReviewOnly.class.getClassLoader());
                m1l.a aVarValueOf = m1l.a.valueOf(parcel.readString());
                p pVar = (p) parcel.readSerializable();
                FlowExtras flowExtras = (FlowExtras) parcel.readParcelable(ReviewOnly.class.getClassLoader());
                LaunchMode launchMode = (LaunchMode) parcel.readParcelable(ReviewOnly.class.getClassLoader());
                boolean z = false;
                if (parcel.readInt() != 0) {
                    iE = 0;
                    z = true;
                } else {
                    iE = 0;
                }
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                while (iE != i) {
                    iE = d.e(ReviewOnly.class, parcel, linkedHashSet, iE, 1);
                }
                return new ReviewOnly(peerToPeerRecipientCreateFromParcel, fVarValueOf, transferFlowType, aVarValueOf, pVar, flowExtras, launchMode, z, linkedHashSet, PeerToPeerTransferData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewOnly[i];
            }
        }

        public ReviewOnly(PeerToPeerRecipient recipient, f direction, TransferFlowType flowType, m1l.a scheduleMode, p pVar, FlowExtras flowExtras, LaunchMode launchMode, boolean z, Set extraConfigurations, PeerToPeerTransferData transferData) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f102290a = recipient;
            this.f102291b = direction;
            this.f102292c = flowType;
            this.d = scheduleMode;
            this.e = pVar;
            this.f = flowExtras;
            this.f102293g = launchMode;
            this.f102294h = z;
            this.i = extraConfigurations;
            this.f102295j = transferData;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: C7, reason: from getter */
        public final boolean getF102294h() {
            return this.f102294h;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102292c() {
            return this.f102292c;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: L3, reason: from getter */
        public final FlowExtras getF() {
            return this.f;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LaunchMode getF102293g() {
            return this.f102293g;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final m1l.a getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewOnly)) {
                return false;
            }
            ReviewOnly reviewOnly = (ReviewOnly) obj2;
            return Intrinsics.f(this.f102290a, reviewOnly.f102290a) && this.f102291b == reviewOnly.f102291b && Intrinsics.f(this.f102292c, reviewOnly.f102292c) && this.d == reviewOnly.d && Intrinsics.f(this.e, reviewOnly.e) && Intrinsics.f(this.f, reviewOnly.f) && Intrinsics.f(this.f102293g, reviewOnly.f102293g) && this.f102294h == reviewOnly.f102294h && Intrinsics.f(this.i, reviewOnly.i) && Intrinsics.f(this.f102295j, reviewOnly.f102295j);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + d.c(this.f102292c, (this.f102291b.hashCode() + (this.f102290a.hashCode() * 31)) * 31, 31)) * 31;
            p pVar = this.e;
            int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
            FlowExtras flowExtras = this.f;
            return this.f102295j.hashCode() + p.a.f(j6.a.c((this.f102293g.hashCode() + ((iHashCode2 + (flowExtras != null ? flowExtras.hashCode() : 0)) * 31)) * 31, 31, this.f102294h), 31, this.i);
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF102291b() {
            return this.f102291b;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: m8, reason: from getter */
        public final p getE() {
            return this.e;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: t0, reason: from getter */
        public final PeerToPeerRecipient getF102290a() {
            return this.f102290a;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData
        /* JADX INFO: renamed from: u0, reason: from getter */
        public final Set getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102290a.writeToParcel(dest, i);
            dest.writeString(this.f102291b.name());
            dest.writeParcelable(this.f102292c, i);
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f102293g, i);
            dest.writeInt(this.f102294h ? 1 : 0);
            Iterator itV = n.v(this.i, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            this.f102295j.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static NewTransfer a(Companion companion, PeerToPeerRecipient recipient, f direction, TransferFlowType flowType, TransferMoneyPocket transferMoneyPocket, TransferScheduleData scheduleData, m1l.a scheduleMode, boolean z, String str, String str2, p pVar, FlowExtras flowExtras, LaunchMode.AsController asController, CurrencyPickerMode.CurrencyOnly currencyOnly, Set set, TransferAppSource transferAppSource, int i) {
            TransferMoneyPocket moneyPocket = (i & 8) != 0 ? new TransferMoneyPocket(null, null, 3) : transferMoneyPocket;
            boolean z3 = (i & 64) != 0 ? true : z;
            String str3 = (i & 128) != 0 ? null : str;
            boolean z4 = (i & 256) != 0;
            String str4 = (i & 512) != 0 ? null : str2;
            p pVar2 = (i & 1024) != 0 ? null : pVar;
            FlowExtras flowExtras2 = (i & 2048) != 0 ? null : flowExtras;
            LaunchMode launchMode = (i & 4096) != 0 ? LaunchMode.AsDestination.f102267a : asController;
            CurrencyPickerMode currencyPickerMode = (i & 8192) != 0 ? CurrencyPickerMode.Default.f102265a : currencyOnly;
            boolean z6 = (i & 16384) == 0;
            Set extraConfigurations = (32768 & i) != 0 ? h0.f322473a : set;
            TransferAppSource transferAppSource2 = (i & 65536) != 0 ? TransferAppSource.DEFAULT.f92298a : transferAppSource;
            companion.getClass();
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            Intrinsics.checkNotNullParameter(currencyPickerMode, "currencyPickerMode");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(transferAppSource2, "transferAppSource");
            return new NewTransfer(recipient, direction, flowType, scheduleMode, pVar2, flowExtras2, launchMode, z6, extraConfigurations, moneyPocket, scheduleData, z3, str3, z4, str4, currencyPickerMode, transferAppSource2);
        }
    }

    /* JADX INFO: renamed from: C7 */
    public abstract boolean getF102294h();

    /* JADX INFO: renamed from: K */
    public abstract TransferFlowType getF102292c();

    /* JADX INFO: renamed from: L3 */
    public abstract FlowExtras getF();

    /* JADX INFO: renamed from: a */
    public abstract LaunchMode getF102293g();

    /* JADX INFO: renamed from: b */
    public abstract m1l.a getD();

    /* JADX INFO: renamed from: k */
    public abstract f getF102291b();

    /* JADX INFO: renamed from: m8 */
    public abstract p getE();

    /* JADX INFO: renamed from: t0 */
    public abstract PeerToPeerRecipient getF102290a();

    /* JADX INFO: renamed from: u0 */
    public abstract Set getI();
}
