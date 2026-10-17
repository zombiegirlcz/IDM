package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent;", "Landroid/os/Parcelable;", "<init>", "()V", "Text", "Icon", "Link", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent$Icon;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent$Link;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent$Text;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CobrandedCardsPlanAdditionalValueRowContent implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent$Icon;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Icon extends CobrandedCardsPlanAdditionalValueRowContent {

        @NotNull
        public static final Parcelable.Creator<Icon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82323a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Icon(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Icon[i];
            }
        }

        public Icon(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f82323a = identifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Icon) && Intrinsics.f(this.f82323a, ((Icon) obj2).f82323a);
        }

        public final int hashCode() {
            return this.f82323a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82323a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent$Link;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Link extends CobrandedCardsPlanAdditionalValueRowContent {

        @NotNull
        public static final Parcelable.Creator<Link> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82325b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Link(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link(String text, String url2) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f82324a = text;
            this.f82325b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Link)) {
                return false;
            }
            Link link = (Link) obj2;
            return Intrinsics.f(this.f82324a, link.f82324a) && Intrinsics.f(this.f82325b, link.f82325b);
        }

        public final int hashCode() {
            return this.f82325b.hashCode() + (this.f82324a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82324a);
            dest.writeString(this.f82325b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent$Text;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueRowContent;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends CobrandedCardsPlanAdditionalValueRowContent {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82326a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        public Text(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f82326a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Text) && Intrinsics.f(this.f82326a, ((Text) obj2).f82326a);
        }

        public final int hashCode() {
            return this.f82326a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82326a);
        }
    }

    private CobrandedCardsPlanAdditionalValueRowContent() {
    }
}
