package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import cv3.s;
import dx4.u1;
import hs3.j0;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy3.q;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LoadingTopItemOffer", "Intro", "OfferContent", "Calculator", "Prompt", "Document", "Confirmation", "SingleSelection", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Confirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$LoadingTopItemOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$OfferContent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$SingleSelection;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MortgageOfferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Calculator extends MortgageOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Calculator> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wy3.c f67974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f67975c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Calculator(parcel.readString(), wy3.c.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Calculator[i];
            }
        }

        public Calculator(String screenId, wy3.c presentationStyle, boolean z) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
            this.f67973a = screenId;
            this.f67974b = presentationStyle;
            this.f67975c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Calculator)) {
                return false;
            }
            Calculator calculator = (Calculator) obj2;
            return Intrinsics.f(this.f67973a, calculator.f67973a) && this.f67974b == calculator.f67974b && this.f67975c == calculator.f67975c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f67975c) + ((this.f67974b.hashCode() + (this.f67973a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67973a);
            dest.writeString(this.f67974b.name());
            dest.writeInt(this.f67975c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Confirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends MortgageOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wy3.b f67976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MortgageOfferFlowContract$OfferUpdateContext f67977b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((wy3.b) parcel.readSerializable(), (MortgageOfferFlowContract$OfferUpdateContext) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(wy3.b configuration, MortgageOfferFlowContract$OfferUpdateContext offerUpdateContext) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(offerUpdateContext, "offerUpdateContext");
            this.f67976a = configuration;
            this.f67977b = offerUpdateContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f67976a, confirmation.f67976a) && Intrinsics.f(this.f67977b, confirmation.f67977b);
        }

        public final int hashCode() {
            return this.f67977b.hashCode() + (this.f67976a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67976a);
            dest.writeParcelable(this.f67977b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document extends MortgageOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u1 f67978a;

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
            this.f67978a = documentConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Document) && Intrinsics.f(this.f67978a, ((Document) obj2).f67978a);
        }

        public final int hashCode() {
            return this.f67978a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67978a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro extends MortgageOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hs3.c f67979a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((hs3.c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(hs3.c intro) {
            Intrinsics.checkNotNullParameter(intro, "intro");
            this.f67979a = intro;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f67979a, ((Intro) obj2).f67979a);
        }

        public final int hashCode() {
            return this.f67979a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67979a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$LoadingTopItemOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoadingTopItemOffer extends MortgageOfferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadingTopItemOffer f67980a = new LoadingTopItemOffer();

        @NotNull
        public static final Parcelable.Creator<LoadingTopItemOffer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoadingTopItemOffer.f67980a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadingTopItemOffer[i];
            }
        }

        private LoadingTopItemOffer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt extends MortgageOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l0 f67985b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt(parcel.readString(), (l0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(String screenId, l0 config) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67984a = screenId;
            this.f67985b = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) obj2;
            return Intrinsics.f(this.f67984a, prompt.f67984a) && Intrinsics.f(this.f67985b, prompt.f67985b);
        }

        public final int hashCode() {
            return this.f67985b.hashCode() + (this.f67984a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67984a);
            dest.writeSerializable(this.f67985b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$SingleSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleSelection extends MortgageOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SingleSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f67986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MortgageOfferFlowContract$OfferUpdateContext f67987b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleSelection((q) parcel.readSerializable(), (MortgageOfferFlowContract$OfferUpdateContext) parcel.readParcelable(SingleSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleSelection[i];
            }
        }

        public SingleSelection(q configuration, MortgageOfferFlowContract$OfferUpdateContext offerUpdateContext) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(offerUpdateContext, "offerUpdateContext");
            this.f67986a = configuration;
            this.f67987b = offerUpdateContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleSelection)) {
                return false;
            }
            SingleSelection singleSelection = (SingleSelection) obj2;
            return Intrinsics.f(this.f67986a, singleSelection.f67986a) && Intrinsics.f(this.f67987b, singleSelection.f67987b);
        }

        public final int hashCode() {
            return this.f67987b.hashCode() + (this.f67986a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67986a);
            dest.writeParcelable(this.f67987b, i);
        }
    }

    private MortgageOfferFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step$OfferContent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfferContent extends MortgageOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OfferContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j0 f67982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f67983c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OfferContent(parcel.readString(), j0.valueOf(parcel.readString()), (s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfferContent[i];
            }
        }

        public OfferContent(String str, j0 layout, s sVar) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.f67981a = str;
            this.f67982b = layout;
            this.f67983c = sVar;
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
            return Intrinsics.f(this.f67981a, offerContent.f67981a) && this.f67982b == offerContent.f67982b && Intrinsics.f(this.f67983c, offerContent.f67983c);
        }

        public final int hashCode() {
            String str = this.f67981a;
            int iHashCode = (this.f67982b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            s sVar = this.f67983c;
            return iHashCode + (sVar != null ? sVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67981a);
            dest.writeString(this.f67982b.name());
            dest.writeSerializable(this.f67983c);
        }

        public /* synthetic */ OfferContent(String str, j0 j0Var, s sVar, int i) {
            this((i & 1) != 0 ? null : str, j0Var, (i & 4) != 0 ? null : sVar);
        }
    }
}
