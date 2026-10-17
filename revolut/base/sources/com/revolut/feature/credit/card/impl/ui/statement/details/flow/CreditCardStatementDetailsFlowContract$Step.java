package com.revolut.feature.credit.card.impl.ui.statement.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Pay", "ExportStatement", "Details", "AccruedInterests", "Transactions", "StatementFinancing", "PrePurchaseInstalment", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$AccruedInterests;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$Details;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$ExportStatement;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$Pay;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$PrePurchaseInstalment;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$StatementFinancing;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$Transactions;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardStatementDetailsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$AccruedInterests;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccruedInterests implements CreditCardStatementDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccruedInterests> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f69677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f69678c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AccruedInterests.class, parcel, arrayList, iE, 1);
                }
                return new AccruedInterests(string, arrayList, (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccruedInterests[i];
            }
        }

        public AccruedInterests(String facilityId, List interests, b countryCode) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(interests, "interests");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69676a = facilityId;
            this.f69677b = interests;
            this.f69678c = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccruedInterests)) {
                return false;
            }
            AccruedInterests accruedInterests = (AccruedInterests) obj2;
            return Intrinsics.f(this.f69676a, accruedInterests.f69676a) && Intrinsics.f(this.f69677b, accruedInterests.f69677b) && Intrinsics.f(this.f69678c, accruedInterests.f69678c);
        }

        public final int hashCode() {
            return this.f69678c.f297794a.hashCode() + p.a.d(this.f69676a.hashCode() * 31, 31, this.f69677b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69676a);
            Iterator itV = p.a.v(this.f69677b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeSerializable(this.f69678c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$Details;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details implements CreditCardStatementDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f69679a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f69679a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$ExportStatement;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExportStatement implements CreditCardStatementDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExportStatement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f69680a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExportStatement((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExportStatement[i];
            }
        }

        public ExportStatement(LocalDate referenceDate) {
            Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
            this.f69680a = referenceDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExportStatement) && Intrinsics.f(this.f69680a, ((ExportStatement) obj2).f69680a);
        }

        public final int hashCode() {
            return this.f69680a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69680a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$Pay;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pay implements CreditCardStatementDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pay f69681a = new Pay();

        @NotNull
        public static final Parcelable.Creator<Pay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pay.f69681a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pay[i];
            }
        }

        private Pay() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$PrePurchaseInstalment;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrePurchaseInstalment implements CreditCardStatementDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PrePurchaseInstalment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69683b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrePurchaseInstalment(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrePurchaseInstalment[i];
            }
        }

        public PrePurchaseInstalment(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69682a = facilityId;
            this.f69683b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrePurchaseInstalment)) {
                return false;
            }
            PrePurchaseInstalment prePurchaseInstalment = (PrePurchaseInstalment) obj2;
            return Intrinsics.f(this.f69682a, prePurchaseInstalment.f69682a) && Intrinsics.f(this.f69683b, prePurchaseInstalment.f69683b);
        }

        public final int hashCode() {
            return this.f69683b.hashCode() + (this.f69682a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69682a);
            dest.writeString(this.f69683b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$StatementFinancing;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementFinancing implements CreditCardStatementDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StatementFinancing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69685b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatementFinancing(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementFinancing[i];
            }
        }

        public StatementFinancing(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69684a = facilityId;
            this.f69685b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatementFinancing)) {
                return false;
            }
            StatementFinancing statementFinancing = (StatementFinancing) obj2;
            return Intrinsics.f(this.f69684a, statementFinancing.f69684a) && Intrinsics.f(this.f69685b, statementFinancing.f69685b);
        }

        public final int hashCode() {
            return this.f69685b.hashCode() + (this.f69684a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69684a);
            dest.writeString(this.f69685b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step$Transactions;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transactions implements CreditCardStatementDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transactions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f69687b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transactions(parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transactions[i];
            }
        }

        public Transactions(String facilityId, LocalDate startDate) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            this.f69686a = facilityId;
            this.f69687b = startDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transactions)) {
                return false;
            }
            Transactions transactions = (Transactions) obj2;
            return Intrinsics.f(this.f69686a, transactions.f69686a) && Intrinsics.f(this.f69687b, transactions.f69687b);
        }

        public final int hashCode() {
            return this.f69687b.hashCode() + (this.f69686a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69686a);
            dest.writeSerializable(this.f69687b);
        }
    }
}
