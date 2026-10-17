package com.revolut.shared.feature.move_money.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import dj0.d;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenBalanceAutomation", "Add", "MoveWithFixedAccount", "Withdraw", "MoveMoney", "Deposit", "Topup", "AddNewScheduledPayment", "EditScheduledPayment", "EditScheduledAutomation", "MoveMoneyWithAccountPair", "k8l/a", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$Add;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$AddNewScheduledPayment;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$Deposit;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$EditScheduledAutomation;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$EditScheduledPayment;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$MoveMoney;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$MoveMoneyWithAccountPair;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$MoveWithFixedAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$OpenBalanceAutomation;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$Topup;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action$Withdraw;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Action implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$Add;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Add extends Action {

        @NotNull
        public static final Parcelable.Creator<Add> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f104810b;

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
            this.f104809a = inputPocket;
            this.f104810b = l2;
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
            return Intrinsics.f(this.f104809a, add2.f104809a) && Intrinsics.f(this.f104810b, add2.f104810b);
        }

        public final int hashCode() {
            int iHashCode = this.f104809a.hashCode() * 31;
            Long l2 = this.f104810b;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104809a, i);
            Long l2 = this.f104810b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$AddNewScheduledPayment;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewScheduledPayment extends Action {

        @NotNull
        public static final Parcelable.Creator<AddNewScheduledPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f104812b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewScheduledPayment((StartUpPocket) parcel.readParcelable(AddNewScheduledPayment.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewScheduledPayment[i];
            }
        }

        public AddNewScheduledPayment() {
            this((StartUpPocket) null, 3);
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
            return Intrinsics.f(this.f104811a, addNewScheduledPayment.f104811a) && Intrinsics.f(this.f104812b, addNewScheduledPayment.f104812b);
        }

        public final int hashCode() {
            StartUpPocket startUpPocket = this.f104811a;
            int iHashCode = (startUpPocket == null ? 0 : startUpPocket.hashCode()) * 31;
            Long l2 = this.f104812b;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104811a, i);
            Long l2 = this.f104812b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
        }

        public AddNewScheduledPayment(StartUpPocket startUpPocket, Long l2) {
            this.f104811a = startUpPocket;
            this.f104812b = l2;
        }

        public /* synthetic */ AddNewScheduledPayment(StartUpPocket startUpPocket, int i) {
            this((i & 1) != 0 ? null : startUpPocket, (Long) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$Deposit;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deposit extends Action {

        @NotNull
        public static final Parcelable.Creator<Deposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104813a;

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
            this.f104813a = inputPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deposit) && Intrinsics.f(this.f104813a, ((Deposit) obj2).f104813a);
        }

        public final int hashCode() {
            return this.f104813a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104813a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$EditScheduledAutomation;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditScheduledAutomation extends Action {

        @NotNull
        public static final Parcelable.Creator<EditScheduledAutomation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyRecurringPayment f104814a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditScheduledAutomation(MoveMoneyRecurringPayment.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditScheduledAutomation[i];
            }
        }

        public EditScheduledAutomation(MoveMoneyRecurringPayment recurringPayment) {
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            this.f104814a = recurringPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditScheduledAutomation) && Intrinsics.f(this.f104814a, ((EditScheduledAutomation) obj2).f104814a);
        }

        public final int hashCode() {
            return this.f104814a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f104814a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$EditScheduledPayment;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditScheduledPayment extends Action {

        @NotNull
        public static final Parcelable.Creator<EditScheduledPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyRecurringPayment f104815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f104816b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditScheduledPayment(MoveMoneyRecurringPayment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditScheduledPayment[i];
            }
        }

        public EditScheduledPayment(MoveMoneyRecurringPayment recurringPayment, Long l2) {
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            this.f104815a = recurringPayment;
            this.f104816b = l2;
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
            return Intrinsics.f(this.f104815a, editScheduledPayment.f104815a) && Intrinsics.f(this.f104816b, editScheduledPayment.f104816b);
        }

        public final int hashCode() {
            int iHashCode = this.f104815a.hashCode() * 31;
            Long l2 = this.f104816b;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f104815a.writeToParcel(dest, i);
            Long l2 = this.f104816b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$OpenBalanceAutomation;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenBalanceAutomation extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenBalanceAutomation f104828a = new OpenBalanceAutomation();

        @NotNull
        public static final Parcelable.Creator<OpenBalanceAutomation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenBalanceAutomation.f104828a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenBalanceAutomation[i];
            }
        }

        private OpenBalanceAutomation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$Topup;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Topup extends Action {

        @NotNull
        public static final Parcelable.Creator<Topup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsProduct f104831c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                StartUpPocket startUpPocket = (StartUpPocket) parcel.readParcelable(Topup.class.getClassLoader());
                d dVar = (d) parcel.readSerializable();
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(Topup.class.getClassLoader());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new Topup(startUpPocket, dVar, analyticsProduct, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Topup[i];
            }
        }

        public Topup(StartUpPocket targetPocket, d dVar, AnalyticsProduct analyticsProduct, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(targetPocket, "targetPocket");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f104829a = targetPocket;
            this.f104830b = dVar;
            this.f104831c = analyticsProduct;
            this.d = z;
            this.e = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Topup)) {
                return false;
            }
            Topup topup = (Topup) obj2;
            return Intrinsics.f(this.f104829a, topup.f104829a) && Intrinsics.f(this.f104830b, topup.f104830b) && Intrinsics.f(this.f104831c, topup.f104831c) && this.d == topup.d && this.e == topup.e;
        }

        public final int hashCode() {
            int iHashCode = this.f104829a.hashCode() * 31;
            d dVar = this.f104830b;
            return Boolean.hashCode(this.e) + j6.a.c(l.a((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f104831c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104829a, i);
            dest.writeSerializable(this.f104830b);
            dest.writeParcelable(this.f104831c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$Withdraw;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdraw extends Action {

        @NotNull
        public static final Parcelable.Creator<Withdraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104832a;

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
            this.f104832a = inputPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Withdraw) && Intrinsics.f(this.f104832a, ((Withdraw) obj2).f104832a);
        }

        public final int hashCode() {
            return this.f104832a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104832a, i);
        }
    }

    private Action() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$MoveWithFixedAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "com/revolut/shared/feature/move_money/api/navigation/b", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveWithFixedAccount extends Action {

        @NotNull
        public static final Parcelable.Creator<MoveWithFixedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f104824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k8l.a f104825c;
        public final long d;
        public final StartUpPocket e;
        public final long f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f104826g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Set f104827h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                StartUpPocket startUpPocket = (StartUpPocket) j6.a.f(parcel, "parcel", MoveWithFixedAccount.class);
                b bVarValueOf = b.valueOf(parcel.readString());
                k8l.a aVarValueOf = k8l.a.valueOf(parcel.readString());
                long j2 = parcel.readLong();
                StartUpPocket startUpPocket2 = (StartUpPocket) parcel.readParcelable(MoveWithFixedAccount.class.getClassLoader());
                long j3 = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(j8l.a.valueOf(parcel.readString()));
                }
                return new MoveWithFixedAccount(startUpPocket, bVarValueOf, aVarValueOf, j2, startUpPocket2, j3, z, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveWithFixedAccount[i];
            }
        }

        public MoveWithFixedAccount(StartUpPocket startUpPocket, b bVar, k8l.a aVar, long j2, Set set, int i) {
            this(startUpPocket, bVar, aVar, j2, null, 0L, (i & 64) != 0, (i & 128) != 0 ? h0.f322473a : set);
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
            return Intrinsics.f(this.f104823a, moveWithFixedAccount.f104823a) && this.f104824b == moveWithFixedAccount.f104824b && this.f104825c == moveWithFixedAccount.f104825c && this.d == moveWithFixedAccount.d && Intrinsics.f(this.e, moveWithFixedAccount.e) && this.f == moveWithFixedAccount.f && this.f104826g == moveWithFixedAccount.f104826g && Intrinsics.f(this.f104827h, moveWithFixedAccount.f104827h);
        }

        public final int hashCode() {
            int iC = a0.d.c((this.f104825c.hashCode() + ((this.f104824b.hashCode() + (this.f104823a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            StartUpPocket startUpPocket = this.e;
            return this.f104827h.hashCode() + j6.a.c(a0.d.c((iC + (startUpPocket == null ? 0 : startUpPocket.hashCode())) * 31, 31, this.f), 31, this.f104826g);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104823a, i);
            dest.writeString(this.f104824b.name());
            dest.writeString(this.f104825c.name());
            dest.writeLong(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeLong(this.f);
            dest.writeInt(this.f104826g ? 1 : 0);
            Iterator itV = n.v(this.f104827h, dest);
            while (itV.hasNext()) {
                dest.writeString(((j8l.a) itV.next()).name());
            }
        }

        public MoveWithFixedAccount(StartUpPocket pocket, b pocketPosition, k8l.a uiMode, long j2, StartUpPocket startUpPocket, long j3, boolean z, Set accountsToHide) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(pocketPosition, "pocketPosition");
            Intrinsics.checkNotNullParameter(uiMode, "uiMode");
            Intrinsics.checkNotNullParameter(accountsToHide, "accountsToHide");
            this.f104823a = pocket;
            this.f104824b = pocketPosition;
            this.f104825c = uiMode;
            this.d = j2;
            this.e = startUpPocket;
            this.f = j3;
            this.f104826g = z;
            this.f104827h = accountsToHide;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$MoveMoney;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "com/revolut/shared/feature/move_money/api/navigation/a", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney extends Action {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.shared.feature.move_money.api.navigation.a f104818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f104819c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((StartUpPocket) parcel.readParcelable(MoveMoney.class.getClassLoader()), com.revolut.shared.feature.move_money.api.navigation.a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(StartUpPocket inputPocket, com.revolut.shared.feature.move_money.api.navigation.a pocketPosition, boolean z) {
            Intrinsics.checkNotNullParameter(inputPocket, "inputPocket");
            Intrinsics.checkNotNullParameter(pocketPosition, "pocketPosition");
            this.f104817a = inputPocket;
            this.f104818b = pocketPosition;
            this.f104819c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoney)) {
                return false;
            }
            MoveMoney moveMoney = (MoveMoney) obj2;
            return Intrinsics.f(this.f104817a, moveMoney.f104817a) && this.f104818b == moveMoney.f104818b && this.f104819c == moveMoney.f104819c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f104819c) + ((this.f104818b.hashCode() + (this.f104817a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104817a, i);
            dest.writeString(this.f104818b.name());
            dest.writeInt(this.f104819c ? 1 : 0);
        }

        public /* synthetic */ MoveMoney(StartUpPocket startUpPocket, com.revolut.shared.feature.move_money.api.navigation.a aVar, int i) {
            this(startUpPocket, (i & 2) != 0 ? com.revolut.shared.feature.move_money.api.navigation.a.DEFAULT : aVar, (i & 4) != 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/Action$MoveMoneyWithAccountPair;", "Lcom/revolut/shared/feature/move_money/api/navigation/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyWithAccountPair extends Action {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyWithAccountPair> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartUpPocket f104820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StartUpPocket f104821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f104822c;
        public final k8l.a d;
        public final boolean e;
        public final Clause f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoneyWithAccountPair((StartUpPocket) parcel.readParcelable(MoveMoneyWithAccountPair.class.getClassLoader()), (StartUpPocket) parcel.readParcelable(MoveMoneyWithAccountPair.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), k8l.a.valueOf(parcel.readString()), parcel.readInt() != 0, (Clause) parcel.readParcelable(MoveMoneyWithAccountPair.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyWithAccountPair[i];
            }
        }

        public MoveMoneyWithAccountPair(StartUpPocket sourcePocket, StartUpPocket targetPocket, Long l2, k8l.a uiMode, boolean z, Clause clause) {
            Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
            Intrinsics.checkNotNullParameter(targetPocket, "targetPocket");
            Intrinsics.checkNotNullParameter(uiMode, "uiMode");
            this.f104820a = sourcePocket;
            this.f104821b = targetPocket;
            this.f104822c = l2;
            this.d = uiMode;
            this.e = z;
            this.f = clause;
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
            return Intrinsics.f(this.f104820a, moveMoneyWithAccountPair.f104820a) && Intrinsics.f(this.f104821b, moveMoneyWithAccountPair.f104821b) && Intrinsics.f(this.f104822c, moveMoneyWithAccountPair.f104822c) && this.d == moveMoneyWithAccountPair.d && this.e == moveMoneyWithAccountPair.e && Intrinsics.f(this.f, moveMoneyWithAccountPair.f);
        }

        public final int hashCode() {
            int iHashCode = (this.f104821b.hashCode() + (this.f104820a.hashCode() * 31)) * 31;
            Long l2 = this.f104822c;
            int iC = j6.a.c((this.d.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31, 31, this.e);
            Clause clause = this.f;
            return iC + (clause != null ? clause.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104820a, i);
            dest.writeParcelable(this.f104821b, i);
            Long l2 = this.f104822c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }

        public /* synthetic */ MoveMoneyWithAccountPair(StartUpPocket startUpPocket, StartUpPocket startUpPocket2, Long l2, k8l.a aVar, int i) {
            this(startUpPocket, startUpPocket2, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? k8l.a.MOVE : aVar, (i & 16) != 0, null);
        }
    }
}
