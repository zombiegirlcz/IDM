package com.revolut.feature.learn.shared.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.j0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnReward;", "Landroid/os/Parcelable;", "ToPocket", "ToInvestAccount", "NoReward", "Lcom/revolut/feature/learn/shared/models/domain/LearnReward$NoReward;", "Lcom/revolut/feature/learn/shared/models/domain/LearnReward$ToInvestAccount;", "Lcom/revolut/feature/learn/shared/models/domain/LearnReward$ToPocket;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LearnReward implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnReward$NoReward;", "Lcom/revolut/feature/learn/shared/models/domain/LearnReward;", "<init>", "()V", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoReward extends LearnReward {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoReward f78027a = new NoReward();

        @NotNull
        public static final Parcelable.Creator<NoReward> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoReward.f78027a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoReward[i];
            }
        }

        private NoReward() {
            j0 j0Var = j0.TO_POCKET;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnReward$ToInvestAccount;", "Lcom/revolut/feature/learn/shared/models/domain/LearnReward;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToInvestAccount extends LearnReward {

        @NotNull
        public static final Parcelable.Creator<ToInvestAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f78028a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ToInvestAccount((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToInvestAccount[i];
            }
        }

        public ToInvestAccount(d from) {
            Intrinsics.checkNotNullParameter(from, "from");
            j0 j0Var = j0.TO_POCKET;
            this.f78028a = from;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ToInvestAccount) && Intrinsics.f(this.f78028a, ((ToInvestAccount) obj2).f78028a);
        }

        public final int hashCode() {
            return this.f78028a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78028a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnReward$ToPocket;", "Lcom/revolut/feature/learn/shared/models/domain/LearnReward;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToPocket extends LearnReward {

        @NotNull
        public static final Parcelable.Creator<ToPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f78029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78030b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ToPocket((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToPocket[i];
            }
        }

        public ToPocket(d from, String targetCurrency) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
            j0 j0Var = j0.TO_POCKET;
            this.f78029a = from;
            this.f78030b = targetCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ToPocket)) {
                return false;
            }
            ToPocket toPocket = (ToPocket) obj2;
            return Intrinsics.f(this.f78029a, toPocket.f78029a) && Intrinsics.f(this.f78030b, toPocket.f78030b);
        }

        public final int hashCode() {
            return this.f78030b.hashCode() + (this.f78029a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78029a);
            dest.writeString(this.f78030b);
        }
    }
}
