package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenUrl", "CopyAndOpenUrl", "Subscribe", "Cancel", "ShowBottomSheet", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$Cancel;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$CopyAndOpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$OpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$ShowBottomSheet;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$Subscribe;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RewardFooterAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$Cancel;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancel extends RewardFooterAction {

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f84856c;
        public final ArrayList d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(AttributedText.CREATOR, parcel, arrayList, iA2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(RewardFooterDetailsItem.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Cancel(string, string2, parcel.readString(), parcel.readString(), arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        public Cancel(String merchantAvatar, String title, String keepButtonText, String str, ArrayList subtitleParts, ArrayList detailsRows) {
            Intrinsics.checkNotNullParameter(merchantAvatar, "merchantAvatar");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitleParts, "subtitleParts");
            Intrinsics.checkNotNullParameter(detailsRows, "detailsRows");
            Intrinsics.checkNotNullParameter(keepButtonText, "keepButtonText");
            this.f84854a = merchantAvatar;
            this.f84855b = title;
            this.f84856c = subtitleParts;
            this.d = detailsRows;
            this.e = keepButtonText;
            this.f = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cancel)) {
                return false;
            }
            Cancel cancel = (Cancel) obj2;
            return Intrinsics.f(this.f84854a, cancel.f84854a) && Intrinsics.f(this.f84855b, cancel.f84855b) && this.f84856c.equals(cancel.f84856c) && this.d.equals(cancel.d) && Intrinsics.f(this.e, cancel.e) && Intrinsics.f(this.f, cancel.f);
        }

        public final int hashCode() {
            int iC = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f84856c, p.a.c(this.f84854a.hashCode() * 31, 31, this.f84855b), 31), 31), 31, this.e);
            String str = this.f;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84854a);
            dest.writeString(this.f84855b);
            Iterator itY = j6.a.y(this.f84856c, dest);
            while (itY.hasNext()) {
                ((AttributedText) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.d, dest);
            while (itY2.hasNext()) {
                ((RewardFooterDetailsItem) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$CopyAndOpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CopyAndOpenUrl extends RewardFooterAction {

        @NotNull
        public static final Parcelable.Creator<CopyAndOpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84858b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CopyAndOpenUrl(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CopyAndOpenUrl[i];
            }
        }

        public CopyAndOpenUrl(String copyable, String url2) {
            Intrinsics.checkNotNullParameter(copyable, "copyable");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f84857a = copyable;
            this.f84858b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CopyAndOpenUrl)) {
                return false;
            }
            CopyAndOpenUrl copyAndOpenUrl = (CopyAndOpenUrl) obj2;
            return Intrinsics.f(this.f84857a, copyAndOpenUrl.f84857a) && Intrinsics.f(this.f84858b, copyAndOpenUrl.f84858b);
        }

        public final int hashCode() {
            return this.f84858b.hashCode() + (this.f84857a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84857a);
            dest.writeString(this.f84858b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$OpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenUrl extends RewardFooterAction {

        @NotNull
        public static final Parcelable.Creator<OpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84859a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenUrl[i];
            }
        }

        public OpenUrl(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f84859a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenUrl) && Intrinsics.f(this.f84859a, ((OpenUrl) obj2).f84859a);
        }

        public final int hashCode() {
            return this.f84859a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84859a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$ShowBottomSheet;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowBottomSheet extends RewardFooterAction {

        @NotNull
        public static final Parcelable.Creator<ShowBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RewardBottomSheet f84860a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowBottomSheet(RewardBottomSheet.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBottomSheet[i];
            }
        }

        public ShowBottomSheet(RewardBottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f84860a = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowBottomSheet) && Intrinsics.f(this.f84860a, ((ShowBottomSheet) obj2).f84860a);
        }

        public final int hashCode() {
            return this.f84860a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84860a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction$Subscribe;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscribe extends RewardFooterAction {

        @NotNull
        public static final Parcelable.Creator<Subscribe> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExistingSubscriptionCheck f84862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ActivationNotice f84863c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subscribe(parcel.readString(), parcel.readInt() == 0 ? null : ExistingSubscriptionCheck.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ActivationNotice.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscribe[i];
            }
        }

        public Subscribe(String merchantAvatar, ExistingSubscriptionCheck existingSubscriptionCheck, ActivationNotice activationNotice) {
            Intrinsics.checkNotNullParameter(merchantAvatar, "merchantAvatar");
            this.f84861a = merchantAvatar;
            this.f84862b = existingSubscriptionCheck;
            this.f84863c = activationNotice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Subscribe)) {
                return false;
            }
            Subscribe subscribe = (Subscribe) obj2;
            return Intrinsics.f(this.f84861a, subscribe.f84861a) && Intrinsics.f(this.f84862b, subscribe.f84862b) && Intrinsics.f(this.f84863c, subscribe.f84863c);
        }

        public final int hashCode() {
            int iHashCode = this.f84861a.hashCode() * 31;
            ExistingSubscriptionCheck existingSubscriptionCheck = this.f84862b;
            int iHashCode2 = (iHashCode + (existingSubscriptionCheck == null ? 0 : existingSubscriptionCheck.hashCode())) * 31;
            ActivationNotice activationNotice = this.f84863c;
            return iHashCode2 + (activationNotice != null ? activationNotice.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84861a);
            ExistingSubscriptionCheck existingSubscriptionCheck = this.f84862b;
            if (existingSubscriptionCheck == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                existingSubscriptionCheck.writeToParcel(dest, i);
            }
            ActivationNotice activationNotice = this.f84863c;
            if (activationNotice == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                activationNotice.writeToParcel(dest, i);
            }
        }
    }

    private RewardFooterAction() {
    }
}
