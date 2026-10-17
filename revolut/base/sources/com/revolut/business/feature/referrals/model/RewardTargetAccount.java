package com.revolut.business.feature.referrals.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.z;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/business/feature/referrals/model/RewardTargetAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ru/z", "feature_business_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardTargetAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardTargetAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50673c;
    public final z d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardTargetAccount(parcel.readString(), parcel.readString(), parcel.readString(), z.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardTargetAccount[i];
        }
    }

    public RewardTargetAccount(String id10, String name, String username, z type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f50671a = id10;
        this.f50672b = name;
        this.f50673c = username;
        this.d = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardTargetAccount)) {
            return false;
        }
        RewardTargetAccount rewardTargetAccount = (RewardTargetAccount) obj2;
        return Intrinsics.f(this.f50671a, rewardTargetAccount.f50671a) && Intrinsics.f(this.f50672b, rewardTargetAccount.f50672b) && Intrinsics.f(this.f50673c, rewardTargetAccount.f50673c) && this.d == rewardTargetAccount.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f50671a.hashCode() * 31, 31, this.f50672b), 31, this.f50673c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50671a);
        dest.writeString(this.f50672b);
        dest.writeString(this.f50673c);
        dest.writeString(this.d.name());
    }
}
