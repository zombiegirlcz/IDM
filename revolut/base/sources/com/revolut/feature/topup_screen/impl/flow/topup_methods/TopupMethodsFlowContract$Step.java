package com.revolut.feature.topup_screen.impl.flow.topup_methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yte.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"com/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TopupMethods", "CashTopupSelection", "StoredMethodDetails", "CurrencyChooser", "AddNewCardDetails", "ExternalCardDetails", "CardBlockedDialog", "CrossProfileRestrictedCardDialog", "UaRestrictionDialog", "BrazilStoredMethodDetails", "SelectInstitution", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$AddNewCardDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$BrazilStoredMethodDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CardBlockedDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CashTopupSelection;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CrossProfileRestrictedCardDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CurrencyChooser;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$ExternalCardDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$SelectInstitution;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$StoredMethodDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$TopupMethods;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$UaRestrictionDialog;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TopupMethodsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$AddNewCardDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewCardDetails extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddNewCardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90636b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewCardDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewCardDetails[i];
            }
        }

        public AddNewCardDetails(String currencyCode, String str) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f90635a = currencyCode;
            this.f90636b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddNewCardDetails)) {
                return false;
            }
            AddNewCardDetails addNewCardDetails = (AddNewCardDetails) obj2;
            return Intrinsics.f(this.f90635a, addNewCardDetails.f90635a) && Intrinsics.f(this.f90636b, addNewCardDetails.f90636b);
        }

        public final int hashCode() {
            int iHashCode = this.f90635a.hashCode() * 31;
            String str = this.f90636b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90635a);
            dest.writeString(this.f90636b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$BrazilStoredMethodDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BrazilStoredMethodDetails extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BrazilStoredMethodDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90637a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BrazilStoredMethodDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BrazilStoredMethodDetails[i];
            }
        }

        public BrazilStoredMethodDetails(String consentId) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f90637a = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BrazilStoredMethodDetails) && Intrinsics.f(this.f90637a, ((BrazilStoredMethodDetails) obj2).f90637a);
        }

        public final int hashCode() {
            return this.f90637a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90637a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CardBlockedDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardBlockedDialog extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardBlockedDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupMethod.StoredMethod.Card.Restrictions f90638a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardBlockedDialog((TopupMethod.StoredMethod.Card.Restrictions) parcel.readParcelable(CardBlockedDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardBlockedDialog[i];
            }
        }

        public CardBlockedDialog(TopupMethod.StoredMethod.Card.Restrictions restrictions) {
            Intrinsics.checkNotNullParameter(restrictions, "restrictions");
            this.f90638a = restrictions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardBlockedDialog) && Intrinsics.f(this.f90638a, ((CardBlockedDialog) obj2).f90638a);
        }

        public final int hashCode() {
            return this.f90638a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90638a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CashTopupSelection;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashTopupSelection extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CashTopupSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupMethod.OtherMethod f90639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90640b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashTopupSelection((TopupMethod.OtherMethod) parcel.readParcelable(CashTopupSelection.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashTopupSelection[i];
            }
        }

        public CashTopupSelection(TopupMethod.OtherMethod method, String currencyCode) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f90639a = method;
            this.f90640b = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashTopupSelection)) {
                return false;
            }
            CashTopupSelection cashTopupSelection = (CashTopupSelection) obj2;
            return Intrinsics.f(this.f90639a, cashTopupSelection.f90639a) && Intrinsics.f(this.f90640b, cashTopupSelection.f90640b);
        }

        public final int hashCode() {
            return this.f90640b.hashCode() + (this.f90639a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90639a, i);
            dest.writeString(this.f90640b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CrossProfileRestrictedCardDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CrossProfileRestrictedCardDialog extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CrossProfileRestrictedCardDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupMethod.StoredMethod.Card.Restrictions f90641a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CrossProfileRestrictedCardDialog((TopupMethod.StoredMethod.Card.Restrictions) parcel.readParcelable(CrossProfileRestrictedCardDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CrossProfileRestrictedCardDialog[i];
            }
        }

        public CrossProfileRestrictedCardDialog(TopupMethod.StoredMethod.Card.Restrictions restrictions) {
            Intrinsics.checkNotNullParameter(restrictions, "restrictions");
            this.f90641a = restrictions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CrossProfileRestrictedCardDialog) && Intrinsics.f(this.f90641a, ((CrossProfileRestrictedCardDialog) obj2).f90641a);
        }

        public final int hashCode() {
            return this.f90641a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90641a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$CurrencyChooser;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyChooser extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CurrencyChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f90642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f90643b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new CurrencyChooser(arrayList, (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyChooser[i];
            }
        }

        public CurrencyChooser(List currencies, xi0.b selectedCurrency) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
            this.f90642a = currencies;
            this.f90643b = selectedCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyChooser)) {
                return false;
            }
            CurrencyChooser currencyChooser = (CurrencyChooser) obj2;
            return Intrinsics.f(this.f90642a, currencyChooser.f90642a) && Intrinsics.f(this.f90643b, currencyChooser.f90643b);
        }

        public final int hashCode() {
            return this.f90643b.hashCode() + (this.f90642a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f90642a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeSerializable(this.f90643b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$ExternalCardDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalCardDetails extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExternalCardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90645b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalCardDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalCardDetails[i];
            }
        }

        public ExternalCardDetails(String externalCardId, String currencyCode) {
            Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f90644a = externalCardId;
            this.f90645b = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExternalCardDetails)) {
                return false;
            }
            ExternalCardDetails externalCardDetails = (ExternalCardDetails) obj2;
            return Intrinsics.f(this.f90644a, externalCardDetails.f90644a) && Intrinsics.f(this.f90645b, externalCardDetails.f90645b);
        }

        public final int hashCode() {
            return this.f90645b.hashCode() + (this.f90644a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90644a);
            dest.writeString(this.f90645b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$SelectInstitution;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectInstitution extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectInstitution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TopUpContext f90647b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectInstitution((dj0.d) parcel.readSerializable(), (TopUpContext) parcel.readParcelable(SelectInstitution.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectInstitution[i];
            }
        }

        public SelectInstitution(dj0.d amount, TopUpContext topUpContext) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
            this.f90646a = amount;
            this.f90647b = topUpContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectInstitution)) {
                return false;
            }
            SelectInstitution selectInstitution = (SelectInstitution) obj2;
            return Intrinsics.f(this.f90646a, selectInstitution.f90646a) && Intrinsics.f(this.f90647b, selectInstitution.f90647b);
        }

        public final int hashCode() {
            return this.f90647b.hashCode() + (this.f90646a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90646a);
            dest.writeParcelable(this.f90647b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$StoredMethodDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoredMethodDetails extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StoredMethodDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f90649b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoredMethodDetails(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoredMethodDetails[i];
            }
        }

        public StoredMethodDetails(String id10, m mVar) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f90648a = id10;
            this.f90649b = mVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StoredMethodDetails)) {
                return false;
            }
            StoredMethodDetails storedMethodDetails = (StoredMethodDetails) obj2;
            return Intrinsics.f(this.f90648a, storedMethodDetails.f90648a) && this.f90649b == storedMethodDetails.f90649b;
        }

        public final int hashCode() {
            int iHashCode = this.f90648a.hashCode() * 31;
            m mVar = this.f90649b;
            return iHashCode + (mVar == null ? 0 : mVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90648a);
            m mVar = this.f90649b;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$TopupMethods;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TopupMethods extends TopupMethodsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TopupMethods f90650a = new TopupMethods();

        @NotNull
        public static final Parcelable.Creator<TopupMethods> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TopupMethods.f90650a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopupMethods[i];
            }
        }

        private TopupMethods() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step$UaRestrictionDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UaRestrictionDialog extends TopupMethodsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UaRestrictionDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupMethod f90651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90652b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UaRestrictionDialog((TopupMethod) parcel.readParcelable(UaRestrictionDialog.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UaRestrictionDialog[i];
            }
        }

        public UaRestrictionDialog(TopupMethod selectedMethod, String selectedCurrencyCode) {
            Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
            Intrinsics.checkNotNullParameter(selectedCurrencyCode, "selectedCurrencyCode");
            this.f90651a = selectedMethod;
            this.f90652b = selectedCurrencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UaRestrictionDialog)) {
                return false;
            }
            UaRestrictionDialog uaRestrictionDialog = (UaRestrictionDialog) obj2;
            return Intrinsics.f(this.f90651a, uaRestrictionDialog.f90651a) && Intrinsics.f(this.f90652b, uaRestrictionDialog.f90652b);
        }

        public final int hashCode() {
            return this.f90652b.hashCode() + (this.f90651a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90651a, i);
            dest.writeString(this.f90652b);
        }
    }

    private TopupMethodsFlowContract$Step() {
    }
}
