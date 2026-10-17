package com.revolut.feature.retail.savings.api.challenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qib.j;
import r6.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallengeOnboarding;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Config", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsChallengeOnboarding implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingsChallengeOnboarding> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsChallenge f83099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f83100b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallengeOnboarding$Config;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "EntryPoint", "SuccessInfo", "ProductArticle", "Reward", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticle f83101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EntryPoint f83102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SuccessInfo f83103c;
        public final ArrayList d;
        public final Integer e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallengeOnboarding$Config$EntryPoint;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EntryPoint implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<EntryPoint> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83104a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f83105b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EntryPoint(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EntryPoint[i];
                }
            }

            public EntryPoint(String title, String description) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f83104a = title;
                this.f83105b = description;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EntryPoint)) {
                    return false;
                }
                EntryPoint entryPoint = (EntryPoint) obj2;
                return Intrinsics.f(this.f83104a, entryPoint.f83104a) && Intrinsics.f(this.f83105b, entryPoint.f83105b);
            }

            public final int hashCode() {
                return this.f83105b.hashCode() + (this.f83104a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83104a);
                dest.writeString(this.f83105b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallengeOnboarding$Config$ProductArticle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProductArticle implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LinkedHashMap f83107b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f83108c;

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
                    return new ProductArticle(string, linkedHashMap, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProductArticle[i];
                }
            }

            public ProductArticle(String templateId, LinkedHashMap substitutions, boolean z) {
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                Intrinsics.checkNotNullParameter(substitutions, "substitutions");
                this.f83106a = templateId;
                this.f83107b = substitutions;
                this.f83108c = z;
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
                return Intrinsics.f(this.f83106a, productArticle.f83106a) && this.f83107b.equals(productArticle.f83107b) && this.f83108c == productArticle.f83108c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f83108c) + b.e(this.f83107b, this.f83106a.hashCode() * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83106a);
                LinkedHashMap linkedHashMap = this.f83107b;
                dest.writeInt(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
                dest.writeInt(this.f83108c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallengeOnboarding$Config$Reward;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Reward implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Reward> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f83109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f83110b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f83111c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Reward(j.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Reward[i];
                }
            }

            public Reward(j type, String title, String description) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f83109a = type;
                this.f83110b = title;
                this.f83111c = description;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Reward)) {
                    return false;
                }
                Reward reward = (Reward) obj2;
                return this.f83109a == reward.f83109a && Intrinsics.f(this.f83110b, reward.f83110b) && Intrinsics.f(this.f83111c, reward.f83111c);
            }

            public final int hashCode() {
                return this.f83111c.hashCode() + p.a.c(this.f83109a.hashCode() * 31, 31, this.f83110b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83109a.name());
                dest.writeString(this.f83110b);
                dest.writeString(this.f83111c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallengeOnboarding$Config$SuccessInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SuccessInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<SuccessInfo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83112a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f83113b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SuccessInfo(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SuccessInfo[i];
                }
            }

            public SuccessInfo(String title, String description) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f83112a = title;
                this.f83113b = description;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SuccessInfo)) {
                    return false;
                }
                SuccessInfo successInfo = (SuccessInfo) obj2;
                return Intrinsics.f(this.f83112a, successInfo.f83112a) && Intrinsics.f(this.f83113b, successInfo.f83113b);
            }

            public final int hashCode() {
                return this.f83113b.hashCode() + (this.f83112a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83112a);
                dest.writeString(this.f83113b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ProductArticle productArticleCreateFromParcel = parcel.readInt() == 0 ? null : ProductArticle.CREATOR.createFromParcel(parcel);
                EntryPoint entryPointCreateFromParcel = EntryPoint.CREATOR.createFromParcel(parcel);
                SuccessInfo successInfoCreateFromParcel = parcel.readInt() == 0 ? null : SuccessInfo.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Reward.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Config(productArticleCreateFromParcel, entryPointCreateFromParcel, successInfoCreateFromParcel, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Config[i];
            }
        }

        public Config(ProductArticle productArticle, EntryPoint entryPoint, SuccessInfo successInfo, ArrayList rewards, Integer num) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            this.f83101a = productArticle;
            this.f83102b = entryPoint;
            this.f83103c = successInfo;
            this.d = rewards;
            this.e = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Config)) {
                return false;
            }
            Config config = (Config) obj2;
            return Intrinsics.f(this.f83101a, config.f83101a) && Intrinsics.f(this.f83102b, config.f83102b) && Intrinsics.f(this.f83103c, config.f83103c) && this.d.equals(config.d) && Intrinsics.f(this.e, config.e);
        }

        public final int hashCode() {
            ProductArticle productArticle = this.f83101a;
            int iHashCode = (this.f83102b.hashCode() + ((productArticle == null ? 0 : productArticle.hashCode()) * 31)) * 31;
            SuccessInfo successInfo = this.f83103c;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode + (successInfo == null ? 0 : successInfo.hashCode())) * 31, 31);
            Integer num = this.e;
            return iB + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ProductArticle productArticle = this.f83101a;
            if (productArticle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                productArticle.writeToParcel(dest, i);
            }
            this.f83102b.writeToParcel(dest, i);
            SuccessInfo successInfo = this.f83103c;
            if (successInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                successInfo.writeToParcel(dest, i);
            }
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((Reward) itY.next()).writeToParcel(dest, i);
            }
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsChallengeOnboarding(SavingsChallenge.CREATOR.createFromParcel(parcel), Config.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsChallengeOnboarding[i];
        }
    }

    public SavingsChallengeOnboarding(SavingsChallenge challenge, Config config) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f83099a = challenge;
        this.f83100b = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsChallengeOnboarding)) {
            return false;
        }
        SavingsChallengeOnboarding savingsChallengeOnboarding = (SavingsChallengeOnboarding) obj2;
        return Intrinsics.f(this.f83099a, savingsChallengeOnboarding.f83099a) && Intrinsics.f(this.f83100b, savingsChallengeOnboarding.f83100b);
    }

    public final int hashCode() {
        return this.f83100b.hashCode() + (this.f83099a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f83099a.writeToParcel(dest, i);
        this.f83100b.writeToParcel(dest, i);
    }
}
