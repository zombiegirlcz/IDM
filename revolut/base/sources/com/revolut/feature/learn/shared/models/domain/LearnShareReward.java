package com.revolut.feature.learn.shared.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnShareReward;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LearnShareReward implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LearnShareReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f78031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78033c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LearnShareReward((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LearnShareReward[i];
        }
    }

    public LearnShareReward(d reward, String shareText, String buttonText, String amountDescription, String backgroundImageUrl, String str) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(shareText, "shareText");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(amountDescription, "amountDescription");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        this.f78031a = reward;
        this.f78032b = shareText;
        this.f78033c = buttonText;
        this.d = amountDescription;
        this.e = backgroundImageUrl;
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
        if (!(obj2 instanceof LearnShareReward)) {
            return false;
        }
        LearnShareReward learnShareReward = (LearnShareReward) obj2;
        return Intrinsics.f(this.f78031a, learnShareReward.f78031a) && Intrinsics.f(this.f78032b, learnShareReward.f78032b) && Intrinsics.f(this.f78033c, learnShareReward.f78033c) && Intrinsics.f(this.d, learnShareReward.d) && Intrinsics.f(this.e, learnShareReward.e) && Intrinsics.f(this.f, learnShareReward.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f78031a.hashCode() * 31, 31, this.f78032b), 31, this.f78033c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78031a);
        dest.writeString(this.f78032b);
        dest.writeString(this.f78033c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
