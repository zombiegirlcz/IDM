package com.revolut.feature.cooldown_checker.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/cooldown_checker/api/CoolDownCheckerDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/cooldown_checker/api/CoolDownCheckerDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_cooldown_checker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CoolDownCheckerDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CoolDownCheckerDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserActivity f66096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f66097c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cooldown_checker/api/CoolDownCheckerDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cooldown_checker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserActivity f66098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66099b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(UserActivity.CREATOR.createFromParcel(parcel), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(UserActivity userActivity, long j2) {
            Intrinsics.checkNotNullParameter(userActivity, "userActivity");
            this.f66098a = userActivity;
            this.f66099b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return this.f66098a == inputData.f66098a && this.f66099b == inputData.f66099b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f66099b) + (this.f66098a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66098a.writeToParcel(dest, i);
            dest.writeLong(this.f66099b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoolDownCheckerDestination(UserActivity.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoolDownCheckerDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoolDownCheckerDestination(UserActivity userActivity, long j2) {
        super(new InputData(userActivity, j2));
        Intrinsics.checkNotNullParameter(userActivity, "userActivity");
        this.f66096b = userActivity;
        this.f66097c = j2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getF66097c() {
        return this.f66097c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UserActivity getF66096b() {
        return this.f66096b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CoolDownCheckerDestination)) {
            return false;
        }
        CoolDownCheckerDestination coolDownCheckerDestination = (CoolDownCheckerDestination) obj2;
        return this.f66096b == coolDownCheckerDestination.f66096b && this.f66097c == coolDownCheckerDestination.f66097c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f66097c) + (this.f66096b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f66096b.writeToParcel(dest, i);
        dest.writeLong(this.f66097c);
    }
}
