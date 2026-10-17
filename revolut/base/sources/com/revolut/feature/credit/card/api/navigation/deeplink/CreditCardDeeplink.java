package com.revolut.feature.credit.card.api.navigation.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import y99.c;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:!\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u0082\u0001\u001f$%&'()*+,-./0123456789:;<=>?@AB¨\u0006C"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "Landroid/os/Parcelable;", "Companion", "Home", "Details", "Repay", "AutoPay", "AutoPaySetup", "Cashback", "CashbackPrompt", "CardOrdering", "AddToWallet", "Statements", "Help", "InfoBalance", "InfoTerminated", "RevPointsLocked", "RevPointsNewAccount", "RevPointsExistingAccount", "AutopayFail", "BalanceTransferPayments", "SecurityDepositTopup", "CreditLimitDecreaseAccept", "AdditionalCardholders", "Instalments", "InstalmentsTransactions", "StatementDueDate", "AdditionalCardholderRemoved", "Faq", "StatementBottomSheet", "CreditLimitCap", "CreditLimitDecrease", "InAppStatementDetails", "Dialog", "yl4/b", "a", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AddToWallet;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AdditionalCardholderRemoved;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AdditionalCardholders;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AutoPay;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AutoPaySetup;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AutopayFail;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$BalanceTransferPayments;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CardOrdering;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Cashback;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CashbackPrompt;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CreditLimitCap;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CreditLimitDecrease;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CreditLimitDecreaseAccept;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Details;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Dialog;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Faq;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Help;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Home;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InAppStatementDetails;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InfoBalance;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InfoTerminated;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Instalments;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InstalmentsTransactions;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Repay;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$RevPointsExistingAccount;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$RevPointsLocked;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$RevPointsNewAccount;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$SecurityDepositTopup;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$StatementBottomSheet;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$StatementDueDate;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Statements;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardDeeplink implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f68988c = j.b(new c(this, 21));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AddToWallet;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddToWallet extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<AddToWallet> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new AddToWallet(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddToWallet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddToWallet(String uri2, Map parameters) {
            super("revolut://app/credit-card/add-to-wallet", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddToWallet)) {
                return false;
            }
            AddToWallet addToWallet = (AddToWallet) obj2;
            return Intrinsics.f(this.d, addToWallet.d) && Intrinsics.f(this.e, addToWallet.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AdditionalCardholderRemoved;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalCardholderRemoved extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<AdditionalCardholderRemoved> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new AdditionalCardholderRemoved(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCardholderRemoved[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalCardholderRemoved(String uri2, Map parameters) {
            super("revolut://app/credit-card/additional-cardholder/removed", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalCardholderRemoved)) {
                return false;
            }
            AdditionalCardholderRemoved additionalCardholderRemoved = (AdditionalCardholderRemoved) obj2;
            return Intrinsics.f(this.d, additionalCardholderRemoved.d) && Intrinsics.f(this.e, additionalCardholderRemoved.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AdditionalCardholders;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalCardholders extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<AdditionalCardholders> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new AdditionalCardholders(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCardholders[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalCardholders(String uri2, Map parameters) {
            super("revolut://app/credit-card/cardholders", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalCardholders)) {
                return false;
            }
            AdditionalCardholders additionalCardholders = (AdditionalCardholders) obj2;
            return Intrinsics.f(this.d, additionalCardholders.d) && Intrinsics.f(this.e, additionalCardholders.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AutoPay;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPay extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<AutoPay> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new AutoPay(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoPay(String uri2, Map parameters) {
            super("revolut://app/credit-card/autopay", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoPay)) {
                return false;
            }
            AutoPay autoPay = (AutoPay) obj2;
            return Intrinsics.f(this.d, autoPay.d) && Intrinsics.f(this.e, autoPay.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AutoPaySetup;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPaySetup extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<AutoPaySetup> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new AutoPaySetup(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPaySetup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoPaySetup(String uri2, Map parameters) {
            super("revolut://app/credit-card/autopay/setup", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoPaySetup)) {
                return false;
            }
            AutoPaySetup autoPaySetup = (AutoPaySetup) obj2;
            return Intrinsics.f(this.d, autoPaySetup.d) && Intrinsics.f(this.e, autoPaySetup.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$AutopayFail;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/card/api/navigation/deeplink/a", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutopayFail extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<AutopayFail> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new AutopayFail(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutopayFail[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutopayFail(String uri2, Map parameters) {
            super("revolut://app/credit-card/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/auto-payment/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/failed(?:\\?([^#]*))?", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutopayFail)) {
                return false;
            }
            AutopayFail autopayFail = (AutopayFail) obj2;
            return Intrinsics.f(this.d, autopayFail.d) && Intrinsics.f(this.e, autopayFail.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$BalanceTransferPayments;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceTransferPayments extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<BalanceTransferPayments> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new BalanceTransferPayments(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceTransferPayments[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceTransferPayments(String uri2, Map parameters) {
            super("revolut://app/credit-card/balance-transfer/payments", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalanceTransferPayments)) {
                return false;
            }
            BalanceTransferPayments balanceTransferPayments = (BalanceTransferPayments) obj2;
            return Intrinsics.f(this.d, balanceTransferPayments.d) && Intrinsics.f(this.e, balanceTransferPayments.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CardOrdering;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardOrdering extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<CardOrdering> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new CardOrdering(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrdering[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardOrdering(String uri2, Map parameters) {
            super("revolut://app/credit-card/card-ordering", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardOrdering)) {
                return false;
            }
            CardOrdering cardOrdering = (CardOrdering) obj2;
            return Intrinsics.f(this.d, cardOrdering.d) && Intrinsics.f(this.e, cardOrdering.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Cashback;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cashback extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Cashback> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Cashback(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cashback[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cashback(String uri2, Map parameters) {
            super("revolut://app/credit-card/cashback", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cashback)) {
                return false;
            }
            Cashback cashback = (Cashback) obj2;
            return Intrinsics.f(this.d, cashback.d) && Intrinsics.f(this.e, cashback.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CashbackPrompt;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashbackPrompt extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<CashbackPrompt> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new CashbackPrompt(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashbackPrompt[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CashbackPrompt(String uri2, Map parameters) {
            super("revolut://app/credit-card/cashback/prompt", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashbackPrompt)) {
                return false;
            }
            CashbackPrompt cashbackPrompt = (CashbackPrompt) obj2;
            return Intrinsics.f(this.d, cashbackPrompt.d) && Intrinsics.f(this.e, cashbackPrompt.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CreditLimitCap;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditLimitCap extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<CreditLimitCap> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new CreditLimitCap(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditLimitCap[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditLimitCap(String uri2, Map parameters) {
            super("revolut://app/credit-card/credit-limit-cap", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditLimitCap)) {
                return false;
            }
            CreditLimitCap creditLimitCap = (CreditLimitCap) obj2;
            return Intrinsics.f(this.d, creditLimitCap.d) && Intrinsics.f(this.e, creditLimitCap.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CreditLimitDecrease;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditLimitDecrease extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<CreditLimitDecrease> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new CreditLimitDecrease(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditLimitDecrease[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditLimitDecrease(String uri2, Map parameters) {
            super("revolut://app/credit-card/credit-limit-decrease", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditLimitDecrease)) {
                return false;
            }
            CreditLimitDecrease creditLimitDecrease = (CreditLimitDecrease) obj2;
            return Intrinsics.f(this.d, creditLimitDecrease.d) && Intrinsics.f(this.e, creditLimitDecrease.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$CreditLimitDecreaseAccept;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditLimitDecreaseAccept extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<CreditLimitDecreaseAccept> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new CreditLimitDecreaseAccept(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditLimitDecreaseAccept[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditLimitDecreaseAccept(String uri2, Map parameters) {
            super("revolut://app/credit/cc-cld/accept", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditLimitDecreaseAccept)) {
                return false;
            }
            CreditLimitDecreaseAccept creditLimitDecreaseAccept = (CreditLimitDecreaseAccept) obj2;
            return Intrinsics.f(this.d, creditLimitDecreaseAccept.d) && Intrinsics.f(this.e, creditLimitDecreaseAccept.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Details;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Details(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Details(String uri2, Map parameters) {
            super("revolut://app/credit-card/details", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.d, details.d) && Intrinsics.f(this.e, details.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Dialog;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Dialog(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialog[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(String uri2, Map parameters) {
            super("revolut://app/credit-card/dialog(?:\\?([^#]*))?", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj2;
            return Intrinsics.f(this.d, dialog.d) && Intrinsics.f(this.e, dialog.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Faq;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Faq extends CreditCardDeeplink {
        public final String d;
        public final Object e;

        @NotNull
        public static final Parcelable.Creator<Faq> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Faq(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Faq[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Faq(String uri2, Map parameters) {
            super("^revolut://app/credit-card/faq(?:\\?([^#]*))?", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Faq)) {
                return false;
            }
            Faq faq = (Faq) obj2;
            return Intrinsics.f(this.d, faq.d) && Intrinsics.f(this.e, faq.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Help;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Help extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Help(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Help[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Help(String uri2, Map parameters) {
            super("revolut://app/credit-card/help", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Help)) {
                return false;
            }
            Help help = (Help) obj2;
            return Intrinsics.f(this.d, help.d) && Intrinsics.f(this.e, help.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Home;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Home(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Home(String uri2, Map parameters) {
            super("revolut://app/credit-card", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Home)) {
                return false;
            }
            Home home = (Home) obj2;
            return Intrinsics.f(this.d, home.d) && Intrinsics.f(this.e, home.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InAppStatementDetails;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InAppStatementDetails extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<InAppStatementDetails> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new InAppStatementDetails(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InAppStatementDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppStatementDetails(String uri2, Map parameters) {
            super("revolut://app/credit-card/in-app-statement(?:\\?([^#]*))?", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InAppStatementDetails)) {
                return false;
            }
            InAppStatementDetails inAppStatementDetails = (InAppStatementDetails) obj2;
            return Intrinsics.f(this.d, inAppStatementDetails.d) && Intrinsics.f(this.e, inAppStatementDetails.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InfoBalance;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoBalance extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<InfoBalance> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new InfoBalance(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoBalance[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoBalance(String uri2, Map parameters) {
            super("revolut://app/credit-card/info/balance", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InfoBalance)) {
                return false;
            }
            InfoBalance infoBalance = (InfoBalance) obj2;
            return Intrinsics.f(this.d, infoBalance.d) && Intrinsics.f(this.e, infoBalance.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InfoTerminated;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoTerminated extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<InfoTerminated> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new InfoTerminated(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoTerminated[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoTerminated(String uri2, Map parameters) {
            super("revolut://app/credit-card/info/terminated", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InfoTerminated)) {
                return false;
            }
            InfoTerminated infoTerminated = (InfoTerminated) obj2;
            return Intrinsics.f(this.d, infoTerminated.d) && Intrinsics.f(this.e, infoTerminated.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Instalments;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instalments extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Instalments> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Instalments(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instalments[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Instalments(String uri2, Map parameters) {
            super("revolut://app/credit-card/instalments", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Instalments)) {
                return false;
            }
            Instalments instalments = (Instalments) obj2;
            return Intrinsics.f(this.d, instalments.d) && Intrinsics.f(this.e, instalments.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$InstalmentsTransactions;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/card/api/navigation/deeplink/b", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstalmentsTransactions extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<InstalmentsTransactions> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new InstalmentsTransactions(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstalmentsTransactions[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstalmentsTransactions(String uri2, Map parameters) {
            super("revolut://app/credit-card/instalments-transactions(?:\\?([^#]*))?", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InstalmentsTransactions)) {
                return false;
            }
            InstalmentsTransactions instalmentsTransactions = (InstalmentsTransactions) obj2;
            return Intrinsics.f(this.d, instalmentsTransactions.d) && Intrinsics.f(this.e, instalmentsTransactions.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Repay;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Repay extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Repay> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Repay(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Repay(String uri2, Map parameters) {
            super("revolut://app/credit-card/repay", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Repay)) {
                return false;
            }
            Repay repay = (Repay) obj2;
            return Intrinsics.f(this.d, repay.d) && Intrinsics.f(this.e, repay.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$RevPointsExistingAccount;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsExistingAccount extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<RevPointsExistingAccount> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new RevPointsExistingAccount(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsExistingAccount[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsExistingAccount(String uri2, Map parameters) {
            super("revolut://app/credit-card/rev-points/existing-account-notice(?:\\?([^#]*))?", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsExistingAccount)) {
                return false;
            }
            RevPointsExistingAccount revPointsExistingAccount = (RevPointsExistingAccount) obj2;
            return Intrinsics.f(this.d, revPointsExistingAccount.d) && Intrinsics.f(this.e, revPointsExistingAccount.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$RevPointsLocked;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsLocked extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<RevPointsLocked> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new RevPointsLocked(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsLocked[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsLocked(String uri2, Map parameters) {
            super("revolut://app/credit-card/info/rev-points/locked", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsLocked)) {
                return false;
            }
            RevPointsLocked revPointsLocked = (RevPointsLocked) obj2;
            return Intrinsics.f(this.d, revPointsLocked.d) && Intrinsics.f(this.e, revPointsLocked.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$RevPointsNewAccount;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsNewAccount extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<RevPointsNewAccount> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new RevPointsNewAccount(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsNewAccount[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsNewAccount(String uri2, Map parameters) {
            super("revolut://app/credit-card/rev-points/new-account-notice(?:\\?([^#]*))?", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsNewAccount)) {
                return false;
            }
            RevPointsNewAccount revPointsNewAccount = (RevPointsNewAccount) obj2;
            return Intrinsics.f(this.d, revPointsNewAccount.d) && Intrinsics.f(this.e, revPointsNewAccount.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$SecurityDepositTopup;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityDepositTopup extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<SecurityDepositTopup> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new SecurityDepositTopup(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityDepositTopup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecurityDepositTopup(String uri2, Map parameters) {
            super("revolut://app/credit-card/security-deposit/topup", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SecurityDepositTopup)) {
                return false;
            }
            SecurityDepositTopup securityDepositTopup = (SecurityDepositTopup) obj2;
            return Intrinsics.f(this.d, securityDepositTopup.d) && Intrinsics.f(this.e, securityDepositTopup.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$StatementBottomSheet;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementBottomSheet extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<StatementBottomSheet> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new StatementBottomSheet(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementBottomSheet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatementBottomSheet(String uri2, Map parameters) {
            super("revolut://app/credit-card/statement-bottom-sheet", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatementBottomSheet)) {
                return false;
            }
            StatementBottomSheet statementBottomSheet = (StatementBottomSheet) obj2;
            return Intrinsics.f(this.d, statementBottomSheet.d) && Intrinsics.f(this.e, statementBottomSheet.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$StatementDueDate;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementDueDate extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<StatementDueDate> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new StatementDueDate(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementDueDate[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatementDueDate(String uri2, Map parameters) {
            super("revolut://app/credit-card/statement-due-date", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatementDueDate)) {
                return false;
            }
            StatementDueDate statementDueDate = (StatementDueDate) obj2;
            return Intrinsics.f(this.d, statementDueDate.d) && Intrinsics.f(this.e, statementDueDate.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink$Statements;", "Lcom/revolut/feature/credit/card/api/navigation/deeplink/CreditCardDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Statements extends CreditCardDeeplink {

        @NotNull
        public static final Parcelable.Creator<Statements> CREATOR = new a();
        public final String d;
        public final Object e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Statements(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Statements[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Statements(String uri2, Map parameters) {
            super("revolut://app/credit-card/statements", uri2);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = uri2;
            this.e = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Statements)) {
                return false;
            }
            Statements statements = (Statements) obj2;
            return Intrinsics.f(this.d, statements.d) && Intrinsics.f(this.e, statements.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            Iterator itT = o.t(this.e, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static CreditCardDeeplink a(String uri2, Map parameters) {
            Object next;
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Iterator it8 = v.k(new Home(uri2, parameters), new Details(uri2, parameters), new Repay(uri2, parameters), new AutoPay(uri2, parameters), new AutoPaySetup(uri2, parameters), new Cashback(uri2, parameters), new CashbackPrompt(uri2, parameters), new CardOrdering(uri2, parameters), new AddToWallet(uri2, parameters), new Statements(uri2, parameters), new Help(uri2, parameters), new InfoBalance(uri2, parameters), new AutopayFail(uri2, parameters), new RevPointsNewAccount(uri2, parameters), new RevPointsExistingAccount(uri2, parameters), new RevPointsLocked(uri2, parameters), new BalanceTransferPayments(uri2, parameters), new SecurityDepositTopup(uri2, parameters), new CreditLimitDecreaseAccept(uri2, parameters), new InstalmentsTransactions(uri2, parameters), new Instalments(uri2, parameters), new AdditionalCardholders(uri2, parameters), new InfoTerminated(uri2, parameters), new StatementDueDate(uri2, parameters), new AdditionalCardholderRemoved(uri2, parameters), new Faq(uri2, parameters), new StatementBottomSheet(uri2, parameters), new CreditLimitCap(uri2, parameters), new CreditLimitDecrease(uri2, parameters), new InAppStatementDetails(uri2, parameters), new Dialog(uri2, parameters)).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((yl4.b) ((CreditCardDeeplink) next).f68988c.getValue()) != null) {
                    break;
                }
            }
            return (CreditCardDeeplink) next;
        }
    }

    public CreditCardDeeplink(String str, String str2) {
        this.f68986a = str;
        this.f68987b = str2;
    }

    public final yl4.b a() {
        yl4.b bVar = (yl4.b) this.f68988c.getValue();
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
