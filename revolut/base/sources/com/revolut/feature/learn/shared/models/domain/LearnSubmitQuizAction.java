package com.revolut.feature.learn.shared.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LearnSubmitQuizAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LearnSubmitQuizAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78035b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LearnSubmitQuizAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LearnSubmitQuizAction[i];
        }
    }

    public LearnSubmitQuizAction(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f78034a = title;
        this.f78035b = deeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LearnSubmitQuizAction)) {
            return false;
        }
        LearnSubmitQuizAction learnSubmitQuizAction = (LearnSubmitQuizAction) obj2;
        return Intrinsics.f(this.f78034a, learnSubmitQuizAction.f78034a) && Intrinsics.f(this.f78035b, learnSubmitQuizAction.f78035b);
    }

    public final int hashCode() {
        return this.f78035b.hashCode() + (this.f78034a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78034a);
        dest.writeString(this.f78035b);
    }
}
