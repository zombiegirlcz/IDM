package com.revolut.feature.onboarding.impl.user_migration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/user_migration/UserMigrationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserMigrationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UserMigrationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f78579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f78580b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserMigrationFlowContract$InputData((Clause) parcel.readParcelable(UserMigrationFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(UserMigrationFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserMigrationFlowContract$InputData[i];
        }
    }

    public UserMigrationFlowContract$InputData(Clause clause, Clause clause2) {
        this.f78579a = clause;
        this.f78580b = clause2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserMigrationFlowContract$InputData)) {
            return false;
        }
        UserMigrationFlowContract$InputData userMigrationFlowContract$InputData = (UserMigrationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78579a, userMigrationFlowContract$InputData.f78579a) && Intrinsics.f(this.f78580b, userMigrationFlowContract$InputData.f78580b);
    }

    public final int hashCode() {
        Clause clause = this.f78579a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f78580b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78579a, i);
        dest.writeParcelable(this.f78580b, i);
    }
}
