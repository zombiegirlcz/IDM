package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.navigable.flow.FlowStep;
import cv3.d0;
import hs3.j0;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Initial", "AnimatedIntro", "Prompt", "SelectType", "ProductArticle", "CreditToRefinance", "Calculator", "ChangeRepaymentDay", "Insurance", "FinalOffer", "Document", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$AnimatedIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$ChangeRepaymentDay;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$CreditToRefinance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$FinalOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Insurance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$ProductArticle;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$SelectType;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OfferV2FlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$AnimatedIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnimatedIntro extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AnimatedIntro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hs3.c f68098a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnimatedIntro((hs3.c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnimatedIntro[i];
            }
        }

        public AnimatedIntro(hs3.c intro) {
            Intrinsics.checkNotNullParameter(intro, "intro");
            this.f68098a = intro;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnimatedIntro) && Intrinsics.f(this.f68098a, ((AnimatedIntro) obj2).f68098a);
        }

        public final int hashCode() {
            return this.f68098a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68098a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Calculator extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Calculator> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f68100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OfferV2FlowContract$OfferUpdateContext f68101c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Calculator(string, boolValueOf, (OfferV2FlowContract$OfferUpdateContext) parcel.readParcelable(Calculator.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Calculator[i];
            }
        }

        public Calculator() {
            this(null, 7);
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
            return Intrinsics.f(this.f68099a, calculator.f68099a) && Intrinsics.f(this.f68100b, calculator.f68100b) && Intrinsics.f(this.f68101c, calculator.f68101c);
        }

        public final int hashCode() {
            String str = this.f68099a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f68100b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext = this.f68101c;
            return iHashCode2 + (offerV2FlowContract$OfferUpdateContext != null ? offerV2FlowContract$OfferUpdateContext.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68099a);
            Boolean bool = this.f68100b;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeParcelable(this.f68101c, i);
        }

        public Calculator(String str, Boolean bool, OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext) {
            this.f68099a = str;
            this.f68100b = bool;
            this.f68101c = offerV2FlowContract$OfferUpdateContext;
        }

        public /* synthetic */ Calculator(String str, int i) {
            this((i & 1) != 0 ? null : str, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$ChangeRepaymentDay;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeRepaymentDay extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeRepaymentDay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hu3.a f68102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OfferV2FlowContract$OfferUpdateContext f68103b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeRepaymentDay((hu3.a) parcel.readSerializable(), (OfferV2FlowContract$OfferUpdateContext) parcel.readParcelable(ChangeRepaymentDay.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeRepaymentDay[i];
            }
        }

        public ChangeRepaymentDay(hu3.a config, OfferV2FlowContract$OfferUpdateContext context) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f68102a = config;
            this.f68103b = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeRepaymentDay)) {
                return false;
            }
            ChangeRepaymentDay changeRepaymentDay = (ChangeRepaymentDay) obj2;
            return Intrinsics.f(this.f68102a, changeRepaymentDay.f68102a) && Intrinsics.f(this.f68103b, changeRepaymentDay.f68103b);
        }

        public final int hashCode() {
            return this.f68103b.hashCode() + (this.f68102a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68102a);
            dest.writeParcelable(this.f68103b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final su3.a f68106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DocumentViewerScreenConfig f68107c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(parcel.readString(), (su3.a) parcel.readSerializable(), (DocumentViewerScreenConfig) parcel.readParcelable(Document.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig, String str) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(document, "document");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f68105a = documentId;
            this.f68106b = document;
            this.f68107c = screenConfig;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Document)) {
                return false;
            }
            Document document = (Document) obj2;
            return Intrinsics.f(this.f68105a, document.f68105a) && Intrinsics.f(this.f68106b, document.f68106b) && Intrinsics.f(this.f68107c, document.f68107c) && Intrinsics.f(this.d, document.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f68107c.hashCode() + ((this.f68106b.hashCode() + (this.f68105a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68105a);
            dest.writeSerializable(this.f68106b);
            dest.writeParcelable(this.f68107c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$FinalOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinalOffer extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FinalOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f68108a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FinalOffer(j0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinalOffer[i];
            }
        }

        public FinalOffer(j0 layout) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.f68108a = layout;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FinalOffer) && this.f68108a == ((FinalOffer) obj2).f68108a;
        }

        public final int hashCode() {
            return this.f68108a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68108a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial extends OfferV2FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f68109a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f68109a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Insurance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Insurance extends OfferV2FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Insurance f68110a = new Insurance();

        @NotNull
        public static final Parcelable.Creator<Insurance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Insurance.f68110a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Insurance[i];
            }
        }

        private Insurance() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$ProductArticle;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cv3.c f68111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProductArticleParams f68112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SkipShownArticleBehaviour f68113c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((cv3.c) parcel.readSerializable(), (ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()), (SkipShownArticleBehaviour) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(cv3.c content, ProductArticleParams articleParams, SkipShownArticleBehaviour skipShownArticleBehaviour) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(articleParams, "articleParams");
            Intrinsics.checkNotNullParameter(skipShownArticleBehaviour, "skipShownArticleBehaviour");
            this.f68111a = content;
            this.f68112b = articleParams;
            this.f68113c = skipShownArticleBehaviour;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticle)) {
                return false;
            }
            ProductArticle productArticle = (ProductArticle) obj2;
            return Intrinsics.f(this.f68111a, productArticle.f68111a) && Intrinsics.f(this.f68112b, productArticle.f68112b) && Intrinsics.f(this.f68113c, productArticle.f68113c);
        }

        public final int hashCode() {
            return this.f68113c.hashCode() + ((this.f68112b.hashCode() + (this.f68111a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68111a);
            dest.writeParcelable(this.f68112b, i);
            dest.writeParcelable(this.f68113c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f68114a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((l0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(l0 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f68114a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Prompt) && Intrinsics.f(this.f68114a, ((Prompt) obj2).f68114a);
        }

        public final int hashCode() {
            return this.f68114a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68114a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$SelectType;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectType extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cv3.f f68115a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectType((cv3.f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectType[i];
            }
        }

        public SelectType(cv3.f content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f68115a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectType) && Intrinsics.f(this.f68115a, ((SelectType) obj2).f68115a);
        }

        public final int hashCode() {
            return this.f68115a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68115a);
        }
    }

    private OfferV2FlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step$CreditToRefinance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditToRefinance extends OfferV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreditToRefinance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f68104a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditToRefinance((d0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditToRefinance[i];
            }
        }

        public CreditToRefinance(d0 d0Var) {
            this.f68104a = d0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreditToRefinance) && Intrinsics.f(this.f68104a, ((CreditToRefinance) obj2).f68104a);
        }

        public final int hashCode() {
            d0 d0Var = this.f68104a;
            if (d0Var == null) {
                return 0;
            }
            return d0Var.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68104a);
        }

        public CreditToRefinance() {
            this(null);
        }
    }
}
