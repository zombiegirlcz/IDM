package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dv9.s;
import java.time.Instant;
import java.time.Period;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "Landroid/os/Parcelable;", "Referral", "SalaryReferral", "GiphyGifId", "Sticker", "Gif", "Emoji", "Text", "Key", "PricingPlanGift", "PlanReferral", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Emoji;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Gif;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$GiphyGifId;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Key;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$PlanReferral;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$PricingPlanGift;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Referral;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$SalaryReferral;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Sticker;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Text;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MessageType implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f79540a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Emoji;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Emoji extends MessageType {

        @NotNull
        public static final Parcelable.Creator<Emoji> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79541b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Emoji(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Emoji[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Emoji(String code) {
            super(s.EMOJI);
            Intrinsics.checkNotNullParameter(code, "code");
            this.f79541b = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Emoji) && Intrinsics.f(this.f79541b, ((Emoji) obj2).f79541b);
        }

        /* JADX INFO: renamed from: getCode, reason: from getter */
        public final String getF79541b() {
            return this.f79541b;
        }

        public final int hashCode() {
            return this.f79541b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79541b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Gif;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gif extends MessageType {

        @NotNull
        public static final Parcelable.Creator<Gif> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79542b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gif(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gif[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gif(String url2) {
            super(s.GIF);
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f79542b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Gif) && Intrinsics.f(this.f79542b, ((Gif) obj2).f79542b);
        }

        /* JADX INFO: renamed from: getUrl, reason: from getter */
        public final String getF79542b() {
            return this.f79542b;
        }

        public final int hashCode() {
            return this.f79542b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79542b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$GiphyGifId;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiphyGifId extends MessageType {

        @NotNull
        public static final Parcelable.Creator<GiphyGifId> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79544c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiphyGifId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiphyGifId[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GiphyGifId(String url2, String id10) {
            super(s.GIPHY_GIF_ID);
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f79543b = url2;
            this.f79544c = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GiphyGifId)) {
                return false;
            }
            GiphyGifId giphyGifId = (GiphyGifId) obj2;
            return Intrinsics.f(this.f79543b, giphyGifId.f79543b) && Intrinsics.f(this.f79544c, giphyGifId.f79544c);
        }

        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF79544c() {
            return this.f79544c;
        }

        /* JADX INFO: renamed from: getUrl, reason: from getter */
        public final String getF79543b() {
            return this.f79543b;
        }

        public final int hashCode() {
            return this.f79544c.hashCode() + (this.f79543b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79543b);
            dest.writeString(this.f79544c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Key;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Key extends MessageType {

        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79545b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Key[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Key(String keys) {
            super(s.KEY);
            Intrinsics.checkNotNullParameter(keys, "keys");
            this.f79545b = keys;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF79545b() {
            return this.f79545b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Key) && Intrinsics.f(this.f79545b, ((Key) obj2).f79545b);
        }

        public final int hashCode() {
            return this.f79545b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79545b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$PlanReferral;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/payments/messaging/data/api/model/a", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanReferral extends MessageType {

        @NotNull
        public static final Parcelable.Creator<PlanReferral> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.feature.payments.messaging.data.api.model.a f79547c;
        public final String d;
        public final Period e;
        public final double f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Instant f79548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f79549h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanReferral(parcel.readString(), com.revolut.feature.payments.messaging.data.api.model.a.valueOf(parcel.readString()), parcel.readString(), (Period) parcel.readSerializable(), parcel.readDouble(), (Instant) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanReferral[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanReferral(String id10, com.revolut.feature.payments.messaging.data.api.model.a state, String planTier, Period discountDuration, double d, Instant planReferralEndDate, String str) {
            super(s.PLAN_REFERRAL);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            Intrinsics.checkNotNullParameter(discountDuration, "discountDuration");
            Intrinsics.checkNotNullParameter(planReferralEndDate, "planReferralEndDate");
            this.f79546b = id10;
            this.f79547c = state;
            this.d = planTier;
            this.e = discountDuration;
            this.f = d;
            this.f79548g = planReferralEndDate;
            this.f79549h = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF79549h() {
            return this.f79549h;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Period getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final double getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Instant getF79548g() {
            return this.f79548g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanReferral)) {
                return false;
            }
            PlanReferral planReferral = (PlanReferral) obj2;
            return Intrinsics.f(this.f79546b, planReferral.f79546b) && this.f79547c == planReferral.f79547c && Intrinsics.f(this.d, planReferral.d) && Intrinsics.f(this.e, planReferral.e) && Double.compare(this.f, planReferral.f) == 0 && Intrinsics.f(this.f79548g, planReferral.f79548g) && Intrinsics.f(this.f79549h, planReferral.f79549h);
        }

        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF79546b() {
            return this.f79546b;
        }

        public final int hashCode() {
            int iC = r6.b.c(m72.b.c((this.e.hashCode() + p.a.c((this.f79547c.hashCode() + (this.f79546b.hashCode() * 31)) * 31, 31, this.d)) * 31, this.f, 31), 31, this.f79548g);
            String str = this.f79549h;
            return iC + (str == null ? 0 : str.hashCode());
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79546b);
            dest.writeString(this.f79547c.name());
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            dest.writeDouble(this.f);
            dest.writeSerializable(this.f79548g);
            dest.writeString(this.f79549h);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final com.revolut.feature.payments.messaging.data.api.model.a getF79547c() {
            return this.f79547c;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$PricingPlanGift;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/payments/messaging/data/api/model/c", "com/revolut/feature/payments/messaging/data/api/model/b", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PricingPlanGift extends MessageType {

        @NotNull
        public static final Parcelable.Creator<PricingPlanGift> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f79551c;
        public final Period d;
        public final String e;
        public final c f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PricingPlanGift(parcel.readString(), b.valueOf(parcel.readString()), (Period) parcel.readSerializable(), parcel.readString(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PricingPlanGift[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PricingPlanGift(String id10, b planTier, Period period, String str, c state) {
            super(s.PLAN_GIFTING);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f79550b = id10;
            this.f79551c = planTier;
            this.d = period;
            this.e = str;
            this.f = state;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Period getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getF79551c() {
            return this.f79551c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final c getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PricingPlanGift)) {
                return false;
            }
            PricingPlanGift pricingPlanGift = (PricingPlanGift) obj2;
            return Intrinsics.f(this.f79550b, pricingPlanGift.f79550b) && this.f79551c == pricingPlanGift.f79551c && Intrinsics.f(this.d, pricingPlanGift.d) && Intrinsics.f(this.e, pricingPlanGift.e) && this.f == pricingPlanGift.f;
        }

        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF79550b() {
            return this.f79550b;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.f79551c.hashCode() + (this.f79550b.hashCode() * 31)) * 31)) * 31;
            String str = this.e;
            return this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79550b);
            dest.writeString(this.f79551c.name());
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Referral;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "ReferralAction", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Referral extends MessageType {

        @NotNull
        public static final Parcelable.Creator<Referral> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79553c;
        public final String d;
        public final ReferralAction e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Referral$ReferralAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReferralAction implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ReferralAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79554a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f79555b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReferralAction(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ReferralAction[i];
                }
            }

            public ReferralAction(String message, String deeplink) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f79554a = message;
                this.f79555b = deeplink;
            }

            /* JADX INFO: renamed from: C0, reason: from getter */
            public final String getF79555b() {
                return this.f79555b;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF79554a() {
                return this.f79554a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ReferralAction)) {
                    return false;
                }
                ReferralAction referralAction = (ReferralAction) obj2;
                return Intrinsics.f(this.f79554a, referralAction.f79554a) && Intrinsics.f(this.f79555b, referralAction.f79555b);
            }

            public final int hashCode() {
                return this.f79555b.hashCode() + (this.f79554a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79554a);
                dest.writeString(this.f79555b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Referral(parcel.readString(), parcel.readString(), parcel.readString(), ReferralAction.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Referral[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Referral(String id10, String imageUrl, String message, ReferralAction action) {
            super(s.REFERRAL);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f79552b = id10;
            this.f79553c = imageUrl;
            this.d = message;
            this.e = action;
        }

        /* JADX INFO: renamed from: E6, reason: from getter */
        public final String getF79553c() {
            return this.f79553c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ReferralAction getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Referral)) {
                return false;
            }
            Referral referral = (Referral) obj2;
            return Intrinsics.f(this.f79552b, referral.f79552b) && Intrinsics.f(this.f79553c, referral.f79553c) && Intrinsics.f(this.d, referral.d) && Intrinsics.f(this.e, referral.e);
        }

        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF79552b() {
            return this.f79552b;
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(this.f79552b.hashCode() * 31, 31, this.f79553c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79552b);
            dest.writeString(this.f79553c);
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$SalaryReferral;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "SalaryReferralAction", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalaryReferral extends MessageType {

        @NotNull
        public static final Parcelable.Creator<SalaryReferral> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79557c;
        public final String d;
        public final Instant e;
        public final SalaryReferralAction f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$SalaryReferral$SalaryReferralAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SalaryReferralAction implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<SalaryReferralAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79558a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SalaryReferralAction(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SalaryReferralAction[i];
                }
            }

            public SalaryReferralAction(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f79558a = deeplink;
            }

            /* JADX INFO: renamed from: C0, reason: from getter */
            public final String getF79558a() {
                return this.f79558a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SalaryReferralAction) && Intrinsics.f(this.f79558a, ((SalaryReferralAction) obj2).f79558a);
            }

            public final int hashCode() {
                return this.f79558a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79558a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalaryReferral(parcel.readString(), parcel.readString(), parcel.readString(), (Instant) parcel.readSerializable(), SalaryReferralAction.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryReferral[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SalaryReferral(String id10, String imageUrl, String title, Instant expirationDate, SalaryReferralAction action) {
            super(s.SALARY_REFERRAL);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f79556b = id10;
            this.f79557c = imageUrl;
            this.d = title;
            this.e = expirationDate;
            this.f = action;
        }

        /* JADX INFO: renamed from: E6, reason: from getter */
        public final String getF79557c() {
            return this.f79557c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SalaryReferralAction getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SalaryReferral)) {
                return false;
            }
            SalaryReferral salaryReferral = (SalaryReferral) obj2;
            return Intrinsics.f(this.f79556b, salaryReferral.f79556b) && Intrinsics.f(this.f79557c, salaryReferral.f79557c) && Intrinsics.f(this.d, salaryReferral.d) && Intrinsics.f(this.e, salaryReferral.e) && Intrinsics.f(this.f, salaryReferral.f);
        }

        /* JADX INFO: renamed from: g7, reason: from getter */
        public final Instant getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF79556b() {
            return this.f79556b;
        }

        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.f79558a.hashCode() + r6.b.c(p.a.c(p.a.c(this.f79556b.hashCode() * 31, 31, this.f79557c), 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79556b);
            dest.writeString(this.f79557c);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            this.f.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Sticker;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sticker extends MessageType {

        @NotNull
        public static final Parcelable.Creator<Sticker> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79559b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sticker(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sticker[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sticker(String url2) {
            super(s.STICKER);
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f79559b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Sticker) && Intrinsics.f(this.f79559b, ((Sticker) obj2).f79559b);
        }

        /* JADX INFO: renamed from: getUrl, reason: from getter */
        public final String getF79559b() {
            return this.f79559b;
        }

        public final int hashCode() {
            return this.f79559b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79559b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageType$Text;", "Lcom/revolut/feature/payments/messaging/data/api/model/MessageType;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends MessageType {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79560b;

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String text) {
            super(s.TEXT);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f79560b = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Text) && Intrinsics.f(this.f79560b, ((Text) obj2).f79560b);
        }

        /* JADX INFO: renamed from: getText, reason: from getter */
        public final String getF79560b() {
            return this.f79560b;
        }

        public final int hashCode() {
            return this.f79560b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79560b);
        }
    }

    public MessageType(s sVar) {
        this.f79540a = sVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final s getF79540a() {
        return this.f79540a;
    }
}
