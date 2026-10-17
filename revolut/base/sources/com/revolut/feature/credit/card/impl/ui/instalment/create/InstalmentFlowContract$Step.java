package com.revolut.feature.credit.card.impl.ui.instalment.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.impl.navigation.articles.CreditCardArticleKey;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import ql4.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "TransactionsList", "Term", "Confirmation", "Agreement", "IneligibilityExplainer", "Repay", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Agreement;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Confirmation;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$IneligibilityExplainer;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Repay;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$TransactionsList;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstalmentFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Agreement;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Agreement implements InstalmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Agreement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f69332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f69333b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Agreement.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                while (iA != i2) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new Agreement(linkedHashSet, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Agreement[i];
            }
        }

        public Agreement(Set transactionIds, ArrayList documents) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            this.f69332a = documents;
            this.f69333b = transactionIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Agreement)) {
                return false;
            }
            Agreement agreement = (Agreement) obj2;
            return this.f69332a.equals(agreement.f69332a) && Intrinsics.f(this.f69333b, agreement.f69333b);
        }

        public final int hashCode() {
            return this.f69333b.hashCode() + (this.f69332a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f69332a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Iterator itV = n.v(this.f69333b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Confirmation;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements InstalmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f69334a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(s quote) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.f69334a = quote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f69334a, ((Confirmation) obj2).f69334a);
        }

        public final int hashCode() {
            return this.f69334a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69334a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$IneligibilityExplainer;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IneligibilityExplainer implements InstalmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IneligibilityExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstalmentFlowContract$IneligibilityDialogType f69335a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IneligibilityExplainer((InstalmentFlowContract$IneligibilityDialogType) parcel.readParcelable(IneligibilityExplainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IneligibilityExplainer[i];
            }
        }

        public IneligibilityExplainer(InstalmentFlowContract$IneligibilityDialogType dialogType) {
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            this.f69335a = dialogType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IneligibilityExplainer) && Intrinsics.f(this.f69335a, ((IneligibilityExplainer) obj2).f69335a);
        }

        public final int hashCode() {
            return this.f69335a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69335a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements InstalmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardArticleKey f69336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f69337b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                CreditCardArticleKey creditCardArticleKey = (CreditCardArticleKey) j6.a.f(parcel, "parcel", Intro.class);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Intro(creditCardArticleKey, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(CreditCardArticleKey articleKey, Map substitutionData) {
            Intrinsics.checkNotNullParameter(articleKey, "articleKey");
            Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
            this.f69336a = articleKey;
            this.f69337b = substitutionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Intro)) {
                return false;
            }
            Intro intro = (Intro) obj2;
            return Intrinsics.f(this.f69336a, intro.f69336a) && Intrinsics.f(this.f69337b, intro.f69337b);
        }

        public final int hashCode() {
            return this.f69337b.hashCode() + (this.f69336a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69336a, i);
            Iterator itZ = j6.a.z(this.f69337b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Repay;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Repay implements InstalmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Repay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69338a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Repay((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repay[i];
            }
        }

        public Repay(d dVar) {
            this.f69338a = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Repay) && Intrinsics.f(this.f69338a, ((Repay) obj2).f69338a);
        }

        public final int hashCode() {
            d dVar = this.f69338a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69338a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step;", "Credit", "Debit", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term$Credit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term$Debit;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Term extends InstalmentFlowContract$Step {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term$Credit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Credit implements Term {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Credit f69339a = new Credit();

            @NotNull
            public static final Parcelable.Creator<Credit> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Credit.f69339a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Credit[i];
                }
            }

            private Credit() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term$Debit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$Term;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Debit implements Term {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Debit f69340a = new Debit();

            @NotNull
            public static final Parcelable.Creator<Debit> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Debit.f69340a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Debit[i];
                }
            }

            private Debit() {
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step$TransactionsList;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionsList implements InstalmentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionsList f69341a = new TransactionsList();

        @NotNull
        public static final Parcelable.Creator<TransactionsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionsList.f69341a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsList[i];
            }
        }

        private TransactionsList() {
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
}
