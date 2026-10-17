package com.revolut.retail.feature.plan_rewards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/api/model/RewardInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102533c;
    public final ArrayList d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RewardInfoItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RewardInfo(string, string2, string3, parcel.readString(), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardInfo[i];
        }
    }

    public RewardInfo(String title, String subtitle, String icon, String buttonText, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f102531a = title;
        this.f102532b = subtitle;
        this.f102533c = icon;
        this.d = items;
        this.e = buttonText;
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
        if (!(obj2 instanceof RewardInfo)) {
            return false;
        }
        RewardInfo rewardInfo = (RewardInfo) obj2;
        return Intrinsics.f(this.f102531a, rewardInfo.f102531a) && Intrinsics.f(this.f102532b, rewardInfo.f102532b) && Intrinsics.f(this.f102533c, rewardInfo.f102533c) && this.d.equals(rewardInfo.d) && Intrinsics.f(this.e, rewardInfo.e) && Intrinsics.f(this.f, rewardInfo.f);
    }

    public final int hashCode() {
        int iC = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f102531a.hashCode() * 31, 31, this.f102532b), 31, this.f102533c), 31), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102531a);
        dest.writeString(this.f102532b);
        dest.writeString(this.f102533c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((RewardInfoItem) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
