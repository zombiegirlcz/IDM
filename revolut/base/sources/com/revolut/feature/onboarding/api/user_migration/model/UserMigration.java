package com.revolut.feature.onboarding.api.user_migration.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/model/UserMigration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "b99/a", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserMigration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserMigration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b99.a f78225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f78226b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b99.a aVarValueOf = b99.a.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(UserMigrationRequirement.CREATOR, parcel, arrayList, iA, 1);
            }
            return new UserMigration(aVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserMigration[i];
        }
    }

    public UserMigration(b99.a status, ArrayList requirements) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        this.f78225a = status;
        this.f78226b = requirements;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserMigration)) {
            return false;
        }
        UserMigration userMigration = (UserMigration) obj2;
        return this.f78225a == userMigration.f78225a && this.f78226b.equals(userMigration.f78226b);
    }

    public final int hashCode() {
        return this.f78226b.hashCode() + (this.f78225a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78225a.name());
        Iterator itY = j6.a.y(this.f78226b, dest);
        while (itY.hasNext()) {
            ((UserMigrationRequirement) itY.next()).writeToParcel(dest, i);
        }
    }
}
