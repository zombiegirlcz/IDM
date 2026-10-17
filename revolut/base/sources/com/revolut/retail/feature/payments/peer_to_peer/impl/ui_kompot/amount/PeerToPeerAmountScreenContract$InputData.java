package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.CurrencyPickerMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransfer", "WithTransferData", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData$WithTransferData;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerAmountScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer implements PeerToPeerAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerRecipient f102310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f102311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferFlowType f102312c;
        public final TransferMoneyPocket d;
        public final m1l.a e;
        public final TransferScheduleData f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f102313g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f102314h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f102315j;
        public final p k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f102316l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f102317m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f102318n;
        public final CurrencyPickerMode o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Set f102319p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final TransferAppSource f102320q;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                PeerToPeerRecipient peerToPeerRecipient = (PeerToPeerRecipient) j6.a.f(parcel, "parcel", NewTransfer.class);
                f fVarValueOf = f.valueOf(parcel.readString());
                TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(NewTransfer.class.getClassLoader());
                TransferMoneyPocket transferMoneyPocket = (TransferMoneyPocket) parcel.readParcelable(NewTransfer.class.getClassLoader());
                m1l.a aVarValueOf = m1l.a.valueOf(parcel.readString());
                TransferScheduleData transferScheduleData = (TransferScheduleData) parcel.readParcelable(NewTransfer.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                p pVar = (p) parcel.readSerializable();
                boolean z4 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                CurrencyPickerMode currencyPickerMode = (CurrencyPickerMode) parcel.readParcelable(NewTransfer.class.getClassLoader());
                int i = parcel.readInt();
                boolean z12 = z;
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (true) {
                    PeerToPeerRecipient peerToPeerRecipient2 = peerToPeerRecipient;
                    if (iE == i) {
                        return new NewTransfer(peerToPeerRecipient, fVarValueOf, transferFlowType, transferMoneyPocket, aVarValueOf, transferScheduleData, string, string2, z12, z3, pVar, z4, z6, z11, currencyPickerMode, linkedHashSet, (TransferAppSource) parcel.readParcelable(NewTransfer.class.getClassLoader()));
                    }
                    iE = d.e(NewTransfer.class, parcel, linkedHashSet, iE, 1);
                    peerToPeerRecipient = peerToPeerRecipient2;
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(PeerToPeerRecipient recipient, f direction, TransferFlowType flowType, TransferMoneyPocket moneyPocket, m1l.a scheduleMode, TransferScheduleData scheduleData, String str, String str2, boolean z, boolean z3, p pVar, boolean z4, boolean z6, boolean z11, CurrencyPickerMode currencyPickerMode, Set extraConfigurations, TransferAppSource transferAppSource) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            Intrinsics.checkNotNullParameter(currencyPickerMode, "currencyPickerMode");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            this.f102310a = recipient;
            this.f102311b = direction;
            this.f102312c = flowType;
            this.d = moneyPocket;
            this.e = scheduleMode;
            this.f = scheduleData;
            this.f102313g = str;
            this.f102314h = str2;
            this.i = z;
            this.f102315j = z3;
            this.k = pVar;
            this.f102316l = z4;
            this.f102317m = z6;
            this.f102318n = z11;
            this.o = currencyPickerMode;
            this.f102319p = extraConfigurations;
            this.f102320q = transferAppSource;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: B9, reason: from getter */
        public final boolean getF() {
            return this.f102316l;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: C7, reason: from getter */
        public final boolean getF102325h() {
            return this.f102318n;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102323c() {
            return this.f102312c;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: U7, reason: from getter */
        public final CurrencyPickerMode getI() {
            return this.o;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: b7, reason: from getter */
        public final boolean getO() {
            return this.i;
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
            return Intrinsics.f(this.f102310a, newTransfer.f102310a) && this.f102311b == newTransfer.f102311b && Intrinsics.f(this.f102312c, newTransfer.f102312c) && Intrinsics.f(this.d, newTransfer.d) && this.e == newTransfer.e && Intrinsics.f(this.f, newTransfer.f) && Intrinsics.f(this.f102313g, newTransfer.f102313g) && Intrinsics.f(this.f102314h, newTransfer.f102314h) && this.i == newTransfer.i && this.f102315j == newTransfer.f102315j && Intrinsics.f(this.k, newTransfer.k) && this.f102316l == newTransfer.f102316l && this.f102317m == newTransfer.f102317m && this.f102318n == newTransfer.f102318n && Intrinsics.f(this.o, newTransfer.o) && Intrinsics.f(this.f102319p, newTransfer.f102319p) && Intrinsics.f(this.f102320q, newTransfer.f102320q);
        }

        public final int hashCode() {
            int iF = l.f(this.f, (this.e.hashCode() + ((this.d.hashCode() + d.c(this.f102312c, (this.f102311b.hashCode() + (this.f102310a.hashCode() * 31)) * 31, 31)) * 31)) * 31, 31);
            String str = this.f102313g;
            int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f102314h;
            int iC = j6.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.f102315j);
            p pVar = this.k;
            return this.f102320q.hashCode() + p.a.f((this.o.hashCode() + j6.a.c(j6.a.c(j6.a.c((iC + (pVar != null ? pVar.hashCode() : 0)) * 31, 31, this.f102316l), 31, this.f102317m), 31, this.f102318n)) * 31, 31, this.f102319p);
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF102322b() {
            return this.f102311b;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: m8, reason: from getter */
        public final p getE() {
            return this.k;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: t0, reason: from getter */
        public final PeerToPeerRecipient getF102321a() {
            return this.f102310a;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: u0, reason: from getter */
        public final Set getF102326j() {
            return this.f102319p;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102310a, i);
            dest.writeString(this.f102311b.name());
            dest.writeParcelable(this.f102312c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
            dest.writeString(this.f102313g);
            dest.writeString(this.f102314h);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f102315j ? 1 : 0);
            dest.writeSerializable(this.k);
            dest.writeInt(this.f102316l ? 1 : 0);
            dest.writeInt(this.f102317m ? 1 : 0);
            dest.writeInt(this.f102318n ? 1 : 0);
            dest.writeParcelable(this.o, i);
            Iterator itV = n.v(this.f102319p, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f102320q, i);
        }
    }

    /* JADX INFO: renamed from: B9 */
    boolean getF();

    /* JADX INFO: renamed from: C7 */
    boolean getF102325h();

    /* JADX INFO: renamed from: K */
    TransferFlowType getF102323c();

    /* JADX INFO: renamed from: U7 */
    CurrencyPickerMode getI();

    /* JADX INFO: renamed from: b7 */
    boolean getO();

    /* JADX INFO: renamed from: k */
    f getF102322b();

    /* JADX INFO: renamed from: m8 */
    p getE();

    /* JADX INFO: renamed from: t0 */
    PeerToPeerRecipient getF102321a();

    /* JADX INFO: renamed from: u0 */
    Set getF102326j();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData$WithTransferData;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransferData implements PeerToPeerAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithTransferData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerRecipient f102321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f102322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferFlowType f102323c;
        public final boolean d;
        public final p e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f102324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f102325h;
        public final CurrencyPickerMode i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Set f102326j;
        public final TransferAppSource k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final PeerToPeerTransferData f102327l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ReferenceData f102328m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f102329n;
        public final boolean o;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                PeerToPeerRecipient peerToPeerRecipient = (PeerToPeerRecipient) j6.a.f(parcel, "parcel", WithTransferData.class);
                f fVarValueOf = f.valueOf(parcel.readString());
                TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(WithTransferData.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                p pVar = (p) parcel.readSerializable();
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                CurrencyPickerMode currencyPickerMode = (CurrencyPickerMode) parcel.readParcelable(WithTransferData.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(WithTransferData.class, parcel, linkedHashSet, iE, 1);
                }
                return new WithTransferData(peerToPeerRecipient, fVarValueOf, transferFlowType, z, pVar, z3, z4, z6, currencyPickerMode, linkedHashSet, (TransferAppSource) parcel.readParcelable(WithTransferData.class.getClassLoader()), (PeerToPeerTransferData) parcel.readParcelable(WithTransferData.class.getClassLoader()), (ReferenceData) parcel.readParcelable(WithTransferData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransferData[i];
            }
        }

        public WithTransferData(PeerToPeerRecipient peerToPeerRecipient, f fVar, TransferFlowType transferFlowType, p pVar, boolean z, boolean z3, boolean z4, CurrencyPickerMode currencyPickerMode, Set set, PeerToPeerTransferData peerToPeerTransferData, ReferenceData referenceData, boolean z6, boolean z11, int i) {
            this(peerToPeerRecipient, fVar, transferFlowType, false, pVar, z, z3, z4, currencyPickerMode, set, peerToPeerTransferData.f102255r, peerToPeerTransferData, (i & 4096) != 0 ? null : referenceData, z6, z11);
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: B9, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: C7, reason: from getter */
        public final boolean getF102325h() {
            return this.f102325h;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102323c() {
            return this.f102323c;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: U7, reason: from getter */
        public final CurrencyPickerMode getI() {
            return this.i;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: b7, reason: from getter */
        public final boolean getO() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithTransferData)) {
                return false;
            }
            WithTransferData withTransferData = (WithTransferData) obj2;
            return Intrinsics.f(this.f102321a, withTransferData.f102321a) && this.f102322b == withTransferData.f102322b && Intrinsics.f(this.f102323c, withTransferData.f102323c) && this.d == withTransferData.d && Intrinsics.f(this.e, withTransferData.e) && this.f == withTransferData.f && this.f102324g == withTransferData.f102324g && this.f102325h == withTransferData.f102325h && Intrinsics.f(this.i, withTransferData.i) && Intrinsics.f(this.f102326j, withTransferData.f102326j) && Intrinsics.f(this.k, withTransferData.k) && Intrinsics.f(this.f102327l, withTransferData.f102327l) && Intrinsics.f(this.f102328m, withTransferData.f102328m) && this.f102329n == withTransferData.f102329n && this.o == withTransferData.o;
        }

        public final int hashCode() {
            int iC = j6.a.c(d.c(this.f102323c, (this.f102322b.hashCode() + (this.f102321a.hashCode() * 31)) * 31, 31), 31, this.d);
            p pVar = this.e;
            int iHashCode = (this.f102327l.hashCode() + ((this.k.hashCode() + p.a.f((this.i.hashCode() + j6.a.c(j6.a.c(j6.a.c((iC + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.f), 31, this.f102324g), 31, this.f102325h)) * 31, 31, this.f102326j)) * 31)) * 31;
            ReferenceData referenceData = this.f102328m;
            return Boolean.hashCode(this.o) + j6.a.c((iHashCode + (referenceData != null ? referenceData.hashCode() : 0)) * 31, 31, this.f102329n);
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF102322b() {
            return this.f102322b;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: m8, reason: from getter */
        public final p getE() {
            return this.e;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: t0, reason: from getter */
        public final PeerToPeerRecipient getF102321a() {
            return this.f102321a;
        }

        @Override // com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData
        /* JADX INFO: renamed from: u0, reason: from getter */
        public final Set getF102326j() {
            return this.f102326j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102321a, i);
            dest.writeString(this.f102322b.name());
            dest.writeParcelable(this.f102323c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f102324g ? 1 : 0);
            dest.writeInt(this.f102325h ? 1 : 0);
            dest.writeParcelable(this.i, i);
            Iterator itV = n.v(this.f102326j, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.k, i);
            dest.writeParcelable(this.f102327l, i);
            dest.writeParcelable(this.f102328m, i);
            dest.writeInt(this.f102329n ? 1 : 0);
            dest.writeInt(this.o ? 1 : 0);
        }

        public WithTransferData(PeerToPeerRecipient recipient, f direction, TransferFlowType flowType, boolean z, p pVar, boolean z3, boolean z4, boolean z6, CurrencyPickerMode currencyPickerMode, Set extraConfigurations, TransferAppSource transferAppSource, PeerToPeerTransferData transferData, ReferenceData referenceData, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(currencyPickerMode, "currencyPickerMode");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f102321a = recipient;
            this.f102322b = direction;
            this.f102323c = flowType;
            this.d = z;
            this.e = pVar;
            this.f = z3;
            this.f102324g = z4;
            this.f102325h = z6;
            this.i = currencyPickerMode;
            this.f102326j = extraConfigurations;
            this.k = transferAppSource;
            this.f102327l = transferData;
            this.f102328m = referenceData;
            this.f102329n = z11;
            this.o = z12;
        }
    }
}
