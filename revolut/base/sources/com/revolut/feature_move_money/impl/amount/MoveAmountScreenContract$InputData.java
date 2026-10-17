package com.revolut.feature_move_money.impl.amount;

import android.os.Parcel;
import android.os.Parcelable;
import b6i.i;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"com/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Add", "MoveWithFixedAccount", "Withdraw", "MoveMoney", "AddNewScheduledPayment", "EditScheduledPayment", "Deposit", "MoveMoneyWithAccountPair", "b6i/i", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$Add;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$AddNewScheduledPayment;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$Deposit;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$EditScheduledPayment;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$MoveMoney;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$MoveMoneyWithAccountPair;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$MoveWithFixedAccount;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$Withdraw;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoveAmountScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$Add;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Add extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Add> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f97237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f97238b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Add((StartUpPocket) parcel.readParcelable(Add.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Add[i];
            }
        }

        public Add(StartUpPocket inputPocket, Long l2) {
            Intrinsics.checkNotNullParameter(inputPocket, "inputPocket");
            this.f97237a = inputPocket;
            this.f97238b = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Add)) {
                return false;
            }
            Add add2 = (Add) obj2;
            return Intrinsics.f(this.f97237a, add2.f97237a) && Intrinsics.f(this.f97238b, add2.f97238b);
        }

        public final int hashCode() {
            int iHashCode = this.f97237a.hashCode() * 31;
            Long l2 = this.f97238b;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97237a, i);
            Long l2 = this.f97238b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$AddNewScheduledPayment;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewScheduledPayment extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AddNewScheduledPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f97239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferScheduleData f97240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f97241c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewScheduledPayment((StartUpPocket) parcel.readParcelable(AddNewScheduledPayment.class.getClassLoader()), (TransferScheduleData) parcel.readParcelable(AddNewScheduledPayment.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewScheduledPayment[i];
            }
        }

        public AddNewScheduledPayment(StartUpPocket startUpPocket, TransferScheduleData scheduleData, Long l2) {
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            this.f97239a = startUpPocket;
            this.f97240b = scheduleData;
            this.f97241c = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddNewScheduledPayment)) {
                return false;
            }
            AddNewScheduledPayment addNewScheduledPayment = (AddNewScheduledPayment) obj2;
            return Intrinsics.f(this.f97239a, addNewScheduledPayment.f97239a) && Intrinsics.f(this.f97240b, addNewScheduledPayment.f97240b) && Intrinsics.f(this.f97241c, addNewScheduledPayment.f97241c);
        }

        public final int hashCode() {
            StartUpPocket startUpPocket = this.f97239a;
            int iF = l.f(this.f97240b, (startUpPocket == null ? 0 : startUpPocket.hashCode()) * 31, 31);
            Long l2 = this.f97241c;
            return iF + (l2 != null ? l2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97239a, i);
            dest.writeParcelable(this.f97240b, i);
            Long l2 = this.f97241c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$Deposit;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deposit extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Deposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f97242a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deposit((StartUpPocket) parcel.readParcelable(Deposit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deposit[i];
            }
        }

        public Deposit(StartUpPocket inputPocket) {
            Intrinsics.checkNotNullParameter(inputPocket, "inputPocket");
            this.f97242a = inputPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deposit) && Intrinsics.f(this.f97242a, ((Deposit) obj2).f97242a);
        }

        public final int hashCode() {
            return this.f97242a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97242a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$EditScheduledPayment;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditScheduledPayment extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditScheduledPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyRecurringPayment f97243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f97244b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditScheduledPayment((MoveMoneyRecurringPayment) parcel.readParcelable(EditScheduledPayment.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditScheduledPayment[i];
            }
        }

        public EditScheduledPayment(MoveMoneyRecurringPayment recurringPayment, Long l2) {
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            this.f97243a = recurringPayment;
            this.f97244b = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditScheduledPayment)) {
                return false;
            }
            EditScheduledPayment editScheduledPayment = (EditScheduledPayment) obj2;
            return Intrinsics.f(this.f97243a, editScheduledPayment.f97243a) && Intrinsics.f(this.f97244b, editScheduledPayment.f97244b);
        }

        public final int hashCode() {
            int iHashCode = this.f97243a.hashCode() * 31;
            Long l2 = this.f97244b;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97243a, i);
            Long l2 = this.f97244b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$MoveMoney;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f97245a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((StartUpPocket) parcel.readParcelable(MoveMoney.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(StartUpPocket inputPocket) {
            Intrinsics.checkNotNullParameter(inputPocket, "inputPocket");
            this.f97245a = inputPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoney) && Intrinsics.f(this.f97245a, ((MoveMoney) obj2).f97245a);
        }

        public final int hashCode() {
            return this.f97245a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97245a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$MoveMoneyWithAccountPair;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyWithAccountPair extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyWithAccountPair> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f97246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StartUpPocket f97247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f97248c;
        public final i d;
        public final Clause e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoneyWithAccountPair((StartUpPocket) parcel.readParcelable(MoveMoneyWithAccountPair.class.getClassLoader()), (StartUpPocket) parcel.readParcelable(MoveMoneyWithAccountPair.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), i.valueOf(parcel.readString()), (Clause) parcel.readParcelable(MoveMoneyWithAccountPair.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyWithAccountPair[i];
            }
        }

        public MoveMoneyWithAccountPair(StartUpPocket sourcePocket, StartUpPocket targetPocket, Long l2, i uiMode, Clause clause) {
            Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
            Intrinsics.checkNotNullParameter(targetPocket, "targetPocket");
            Intrinsics.checkNotNullParameter(uiMode, "uiMode");
            this.f97246a = sourcePocket;
            this.f97247b = targetPocket;
            this.f97248c = l2;
            this.d = uiMode;
            this.e = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoneyWithAccountPair)) {
                return false;
            }
            MoveMoneyWithAccountPair moveMoneyWithAccountPair = (MoveMoneyWithAccountPair) obj2;
            return Intrinsics.f(this.f97246a, moveMoneyWithAccountPair.f97246a) && Intrinsics.f(this.f97247b, moveMoneyWithAccountPair.f97247b) && Intrinsics.f(this.f97248c, moveMoneyWithAccountPair.f97248c) && this.d == moveMoneyWithAccountPair.d && Intrinsics.f(this.e, moveMoneyWithAccountPair.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f97247b.hashCode() + (this.f97246a.hashCode() * 31)) * 31;
            Long l2 = this.f97248c;
            int iHashCode2 = (this.d.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
            Clause clause = this.e;
            return iHashCode2 + (clause != null ? clause.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97246a, i);
            dest.writeParcelable(this.f97247b, i);
            Long l2 = this.f97248c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$MoveWithFixedAccount;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature_move_money/impl/amount/a", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveWithFixedAccount extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<MoveWithFixedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f97249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature_move_money.impl.amount.a f97250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f97251c;
        public final long d;
        public final boolean e;
        public final Set f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                StartUpPocket startUpPocket = (StartUpPocket) j6.a.f(parcel, "parcel", MoveWithFixedAccount.class);
                com.revolut.feature_move_money.impl.amount.a aVarValueOf = com.revolut.feature_move_money.impl.amount.a.valueOf(parcel.readString());
                i iVarValueOf = i.valueOf(parcel.readString());
                long j2 = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(j8l.a.valueOf(parcel.readString()));
                }
                return new MoveWithFixedAccount(startUpPocket, aVarValueOf, iVarValueOf, j2, z, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveWithFixedAccount[i];
            }
        }

        public MoveWithFixedAccount(StartUpPocket pocket, com.revolut.feature_move_money.impl.amount.a pocketPosition, i uiMode, long j2, boolean z, Set accountsToHide) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(pocketPosition, "pocketPosition");
            Intrinsics.checkNotNullParameter(uiMode, "uiMode");
            Intrinsics.checkNotNullParameter(accountsToHide, "accountsToHide");
            this.f97249a = pocket;
            this.f97250b = pocketPosition;
            this.f97251c = uiMode;
            this.d = j2;
            this.e = z;
            this.f = accountsToHide;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveWithFixedAccount)) {
                return false;
            }
            MoveWithFixedAccount moveWithFixedAccount = (MoveWithFixedAccount) obj2;
            return Intrinsics.f(this.f97249a, moveWithFixedAccount.f97249a) && this.f97250b == moveWithFixedAccount.f97250b && this.f97251c == moveWithFixedAccount.f97251c && this.d == moveWithFixedAccount.d && this.e == moveWithFixedAccount.e && Intrinsics.f(this.f, moveWithFixedAccount.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c(a0.d.c((this.f97251c.hashCode() + ((this.f97250b.hashCode() + (this.f97249a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97249a, i);
            dest.writeString(this.f97250b.name());
            dest.writeString(this.f97251c.name());
            dest.writeLong(this.d);
            dest.writeInt(this.e ? 1 : 0);
            Iterator itV = n.v(this.f, dest);
            while (itV.hasNext()) {
                dest.writeString(((j8l.a) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData$Withdraw;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdraw extends MoveAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Withdraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f97252a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Withdraw((StartUpPocket) parcel.readParcelable(Withdraw.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdraw[i];
            }
        }

        public Withdraw(StartUpPocket inputPocket) {
            Intrinsics.checkNotNullParameter(inputPocket, "inputPocket");
            this.f97252a = inputPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Withdraw) && Intrinsics.f(this.f97252a, ((Withdraw) obj2).f97252a);
        }

        public final int hashCode() {
            return this.f97252a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97252a, i);
        }
    }

    private MoveAmountScreenContract$InputData() {
    }
}
