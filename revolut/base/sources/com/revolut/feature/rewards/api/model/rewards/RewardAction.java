package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Activate", "ExternalRegistration", "OpenMap", "RedeemPromocodeAndOpenUrl", "OpenUrl", "OpenPromoUrl", "EmptyAction", "ComplexAction", "Footer", "PartnerMembershipAction", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$Activate;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$ComplexAction;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$EmptyAction;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$ExternalRegistration;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$Footer;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$OpenMap;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$OpenPromoUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$OpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$RedeemPromocodeAndOpenUrl;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RewardAction implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$Activate;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "<init>", "()V", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Activate extends RewardAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Activate f84812a = new Activate();

        @NotNull
        public static final Parcelable.Creator<Activate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Activate.f84812a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Activate[i];
            }
        }

        private Activate() {
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a */
        public final boolean getF84835b() {
            return false;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$ComplexAction;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ComplexAction extends RewardAction {

        @NotNull
        public static final Parcelable.Creator<ComplexAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OpenUrlAction f84813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OpenMap f84814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f84815c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComplexAction((OpenUrlAction) parcel.readParcelable(ComplexAction.class.getClassLoader()), OpenMap.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComplexAction[i];
            }
        }

        public ComplexAction(OpenUrlAction primaryAction, OpenMap openMapAction) {
            Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
            Intrinsics.checkNotNullParameter(openMapAction, "openMapAction");
            this.f84813a = primaryAction;
            this.f84814b = openMapAction;
            this.f84815c = openMapAction.d;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF84835b() {
            return this.f84815c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ComplexAction)) {
                return false;
            }
            ComplexAction complexAction = (ComplexAction) obj2;
            return Intrinsics.f(this.f84813a, complexAction.f84813a) && Intrinsics.f(this.f84814b, complexAction.f84814b);
        }

        public final int hashCode() {
            return this.f84814b.hashCode() + (this.f84813a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84813a, i);
            this.f84814b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$ExternalRegistration;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "Lcom/revolut/feature/rewards/api/model/rewards/OpenUrlAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalRegistration extends RewardAction implements OpenUrlAction {

        @NotNull
        public static final Parcelable.Creator<ExternalRegistration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84819c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalRegistration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalRegistration[i];
            }
        }

        public ExternalRegistration(String rewardId, String merchantName, String merchantWebsite, boolean z) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(merchantWebsite, "merchantWebsite");
            this.f84817a = rewardId;
            this.f84818b = merchantName;
            this.f84819c = merchantWebsite;
            this.d = z;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF84835b() {
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
            if (!(obj2 instanceof ExternalRegistration)) {
                return false;
            }
            ExternalRegistration externalRegistration = (ExternalRegistration) obj2;
            return Intrinsics.f(this.f84817a, externalRegistration.f84817a) && Intrinsics.f(this.f84818b, externalRegistration.f84818b) && Intrinsics.f(this.f84819c, externalRegistration.f84819c) && this.d == externalRegistration.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f84817a.hashCode() * 31, 31, this.f84818b), 31, this.f84819c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84817a);
            dest.writeString(this.f84818b);
            dest.writeString(this.f84819c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$Footer;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Footer extends RewardAction {

        @NotNull
        public static final Parcelable.Creator<Footer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RewardFooter f84820a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Footer(RewardFooter.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Footer[i];
            }
        }

        public Footer(RewardFooter footer) {
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.f84820a = footer;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a */
        public final boolean getF84835b() {
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Footer) && Intrinsics.f(this.f84820a, ((Footer) obj2).f84820a);
        }

        public final int hashCode() {
            return this.f84820a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84820a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$OpenMap;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenMap extends RewardAction {

        @NotNull
        public static final Parcelable.Creator<OpenMap> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final co3.a f84822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84823c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenMap(parcel.readString(), (co3.a) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenMap[i];
            }
        }

        public OpenMap(String rewardId, co3.a location, String merchantName, boolean z) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f84821a = rewardId;
            this.f84822b = location;
            this.f84823c = merchantName;
            this.d = z;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF84835b() {
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
            if (!(obj2 instanceof OpenMap)) {
                return false;
            }
            OpenMap openMap = (OpenMap) obj2;
            return Intrinsics.f(this.f84821a, openMap.f84821a) && Intrinsics.f(this.f84822b, openMap.f84822b) && Intrinsics.f(this.f84823c, openMap.f84823c) && this.d == openMap.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.c((this.f84822b.hashCode() + (this.f84821a.hashCode() * 31)) * 31, 31, this.f84823c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84821a);
            dest.writeSerializable(this.f84822b);
            dest.writeString(this.f84823c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$OpenPromoUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "Lcom/revolut/feature/rewards/api/model/rewards/OpenUrlAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenPromoUrl extends RewardAction implements OpenUrlAction {

        @NotNull
        public static final Parcelable.Creator<OpenPromoUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f84826c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenPromoUrl(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenPromoUrl[i];
            }
        }

        public OpenPromoUrl(String rewardId, String merchantName, boolean z) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f84824a = rewardId;
            this.f84825b = merchantName;
            this.f84826c = z;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF84835b() {
            return this.f84826c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenPromoUrl)) {
                return false;
            }
            OpenPromoUrl openPromoUrl = (OpenPromoUrl) obj2;
            return Intrinsics.f(this.f84824a, openPromoUrl.f84824a) && Intrinsics.f(this.f84825b, openPromoUrl.f84825b) && this.f84826c == openPromoUrl.f84826c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84826c) + p.a.c(this.f84824a.hashCode() * 31, 31, this.f84825b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84824a);
            dest.writeString(this.f84825b);
            dest.writeInt(this.f84826c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$OpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "Lcom/revolut/feature/rewards/api/model/rewards/OpenUrlAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenUrl extends RewardAction implements OpenUrlAction {

        @NotNull
        public static final Parcelable.Creator<OpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f84829c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenUrl(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenUrl[i];
            }
        }

        public OpenUrl(String rewardId, String merchantName, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f84827a = rewardId;
            this.f84828b = merchantName;
            this.f84829c = z;
            this.d = z3;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF84835b() {
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
            if (!(obj2 instanceof OpenUrl)) {
                return false;
            }
            OpenUrl openUrl = (OpenUrl) obj2;
            return Intrinsics.f(this.f84827a, openUrl.f84827a) && Intrinsics.f(this.f84828b, openUrl.f84828b) && this.f84829c == openUrl.f84829c && this.d == openUrl.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f84827a.hashCode() * 31, 31, this.f84828b), 31, this.f84829c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84827a);
            dest.writeString(this.f84828b);
            dest.writeInt(this.f84829c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "<init>", "()V", "RequestActivation", "Activated", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction$Activated;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction$RequestActivation;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class PartnerMembershipAction extends RewardAction {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction$Activated;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction;", "<init>", "()V", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Activated extends PartnerMembershipAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Activated f84830a = new Activated();

            @NotNull
            public static final Parcelable.Creator<Activated> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Activated.f84830a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Activated[i];
                }
            }

            private Activated() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction$RequestActivation;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$PartnerMembershipAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestActivation extends PartnerMembershipAction {

            @NotNull
            public static final Parcelable.Creator<RequestActivation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f84831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f84832b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f84833c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RequestActivation(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RequestActivation[i];
                }
            }

            public RequestActivation(String webhook, String rewardId, String rewardMerchantName) {
                Intrinsics.checkNotNullParameter(webhook, "webhook");
                Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                Intrinsics.checkNotNullParameter(rewardMerchantName, "rewardMerchantName");
                this.f84831a = webhook;
                this.f84832b = rewardId;
                this.f84833c = rewardMerchantName;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof RequestActivation)) {
                    return false;
                }
                RequestActivation requestActivation = (RequestActivation) obj2;
                return Intrinsics.f(this.f84831a, requestActivation.f84831a) && Intrinsics.f(this.f84832b, requestActivation.f84832b) && Intrinsics.f(this.f84833c, requestActivation.f84833c);
            }

            public final int hashCode() {
                return this.f84833c.hashCode() + p.a.c(this.f84831a.hashCode() * 31, 31, this.f84832b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f84831a);
                dest.writeString(this.f84832b);
                dest.writeString(this.f84833c);
            }
        }

        private PartnerMembershipAction() {
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a */
        public final boolean getF84835b() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$RedeemPromocodeAndOpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "Lcom/revolut/feature/rewards/api/model/rewards/OpenUrlAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedeemPromocodeAndOpenUrl extends RewardAction implements OpenUrlAction {

        @NotNull
        public static final Parcelable.Creator<RedeemPromocodeAndOpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84835b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedeemPromocodeAndOpenUrl(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RedeemPromocodeAndOpenUrl[i];
            }
        }

        public RedeemPromocodeAndOpenUrl(String rewardId, boolean z) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            this.f84834a = rewardId;
            this.f84835b = z;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF84835b() {
            return this.f84835b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RedeemPromocodeAndOpenUrl)) {
                return false;
            }
            RedeemPromocodeAndOpenUrl redeemPromocodeAndOpenUrl = (RedeemPromocodeAndOpenUrl) obj2;
            return Intrinsics.f(this.f84834a, redeemPromocodeAndOpenUrl.f84834a) && this.f84835b == redeemPromocodeAndOpenUrl.f84835b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84835b) + (this.f84834a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84834a);
            dest.writeInt(this.f84835b ? 1 : 0);
        }
    }

    private RewardAction() {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getF84835b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardAction$EmptyAction;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmptyAction extends RewardAction {

        @NotNull
        public static final Parcelable.Creator<EmptyAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84816a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmptyAction(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmptyAction[i];
            }
        }

        public EmptyAction(boolean z) {
            this.f84816a = z;
        }

        @Override // com.revolut.feature.rewards.api.model.rewards.RewardAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF84835b() {
            return this.f84816a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmptyAction) && this.f84816a == ((EmptyAction) obj2).f84816a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84816a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f84816a ? 1 : 0);
        }

        public EmptyAction() {
            this(false);
        }
    }
}
