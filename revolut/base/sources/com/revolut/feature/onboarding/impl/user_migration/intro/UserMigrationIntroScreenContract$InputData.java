package com.revolut.feature.onboarding.impl.user_migration.intro;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/user_migration/intro/UserMigrationIntroScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserMigrationIntroScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UserMigrationIntroScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f78594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f78595b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserMigrationIntroScreenContract$InputData((Clause) parcel.readParcelable(UserMigrationIntroScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(UserMigrationIntroScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserMigrationIntroScreenContract$InputData[i];
        }
    }

    public UserMigrationIntroScreenContract$InputData(Clause clause, Clause clause2) {
        this.f78594a = clause;
        this.f78595b = clause2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserMigrationIntroScreenContract$InputData)) {
            return false;
        }
        UserMigrationIntroScreenContract$InputData userMigrationIntroScreenContract$InputData = (UserMigrationIntroScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78594a, userMigrationIntroScreenContract$InputData.f78594a) && Intrinsics.f(this.f78595b, userMigrationIntroScreenContract$InputData.f78595b);
    }

    public final int hashCode() {
        Clause clause = this.f78594a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f78595b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78594a, i);
        dest.writeParcelable(this.f78595b, i);
    }
}
