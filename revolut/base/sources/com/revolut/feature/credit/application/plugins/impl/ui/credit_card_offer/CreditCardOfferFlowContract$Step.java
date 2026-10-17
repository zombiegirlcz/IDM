package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$CreditOfferConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import cv3.s;
import dx4.u1;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Loading", "PromoOffer", "OfferContent", "Benefits", "StatementDueDaySelection", "PlanSelection", "Document", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$Benefits;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$Loading;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$OfferContent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$PlanSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$PromoOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$StatementDueDaySelection;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardOfferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$Benefits;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Benefits extends CreditCardOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Benefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nu3.d f67363a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Benefits((nu3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Benefits[i];
            }
        }

        public Benefits(nu3.d benefits) {
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.f67363a = benefits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Benefits) && Intrinsics.f(this.f67363a, ((Benefits) obj2).f67363a);
        }

        public final int hashCode() {
            return this.f67363a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67363a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document extends CreditCardOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u1 f67364a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document((u1) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(u1 documentConfiguration) {
            Intrinsics.checkNotNullParameter(documentConfiguration, "documentConfiguration");
            this.f67364a = documentConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Document) && Intrinsics.f(this.f67364a, ((Document) obj2).f67364a);
        }

        public final int hashCode() {
            return this.f67364a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67364a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$Loading;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading extends CreditCardOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer f67365a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Loading(CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading(CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67365a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Loading) && Intrinsics.f(this.f67365a, ((Loading) obj2).f67365a);
        }

        public final int hashCode() {
            return this.f67365a.f67360a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f67365a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$OfferContent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfferContent extends CreditCardOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OfferContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer f67366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f67367b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OfferContent(CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer.CREATOR.createFromParcel(parcel), (s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfferContent[i];
            }
        }

        public OfferContent(CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer config, s sVar) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67366a = config;
            this.f67367b = sVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OfferContent)) {
                return false;
            }
            OfferContent offerContent = (OfferContent) obj2;
            return Intrinsics.f(this.f67366a, offerContent.f67366a) && Intrinsics.f(this.f67367b, offerContent.f67367b);
        }

        public final int hashCode() {
            int iHashCode = this.f67366a.f67360a.hashCode() * 31;
            s sVar = this.f67367b;
            return iHashCode + (sVar == null ? 0 : sVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f67366a.writeToParcel(dest, i);
            dest.writeSerializable(this.f67367b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$PlanSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSelection extends CreditCardOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f67368a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSelection(parcel.readInt() == 0 ? null : w0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSelection[i];
            }
        }

        public PlanSelection(w0 w0Var) {
            this.f67368a = w0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanSelection) && this.f67368a == ((PlanSelection) obj2).f67368a;
        }

        public final int hashCode() {
            w0 w0Var = this.f67368a;
            if (w0Var == null) {
                return 0;
            }
            return w0Var.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            w0 w0Var = this.f67368a;
            if (w0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(w0Var.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$PromoOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromoOffer extends CreditCardOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PromoOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardOfferFlowContract$CreditOfferConfig.PromoOffer f67369a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PromoOffer(CreditCardOfferFlowContract$CreditOfferConfig.PromoOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromoOffer[i];
            }
        }

        public PromoOffer(CreditCardOfferFlowContract$CreditOfferConfig.PromoOffer config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67369a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PromoOffer) && Intrinsics.f(this.f67369a, ((PromoOffer) obj2).f67369a);
        }

        public final int hashCode() {
            return this.f67369a.f67359a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f67369a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step$StatementDueDaySelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementDueDaySelection extends CreditCardOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StatementDueDaySelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nu3.g f67370a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatementDueDaySelection((nu3.g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementDueDaySelection[i];
            }
        }

        public StatementDueDaySelection(nu3.g statementDueDaySelection) {
            Intrinsics.checkNotNullParameter(statementDueDaySelection, "statementDueDaySelection");
            this.f67370a = statementDueDaySelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StatementDueDaySelection) && Intrinsics.f(this.f67370a, ((StatementDueDaySelection) obj2).f67370a);
        }

        public final int hashCode() {
            return this.f67370a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67370a);
        }
    }

    private CreditCardOfferFlowContract$Step() {
    }
}
