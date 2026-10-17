package com.revolut.feature.onboarding.api.user_migration.model;

import android.os.Parcel;
import android.os.Parcelable;
import b99.b;
import b99.c;
import b99.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/model/UserMigrationRequirement;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "b99/c", "b99/b", "b99/d", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserMigrationRequirement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserMigrationRequirement> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f78227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f78228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f78229c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserMigrationRequirement(c.valueOf(parcel.readString()), b.valueOf(parcel.readString()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserMigrationRequirement[i];
        }
    }

    public UserMigrationRequirement(c state, b name, d type) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f78227a = state;
        this.f78228b = name;
        this.f78229c = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserMigrationRequirement)) {
            return false;
        }
        UserMigrationRequirement userMigrationRequirement = (UserMigrationRequirement) obj2;
        return this.f78227a == userMigrationRequirement.f78227a && this.f78228b == userMigrationRequirement.f78228b && this.f78229c == userMigrationRequirement.f78229c;
    }

    public final int hashCode() {
        return this.f78229c.hashCode() + ((this.f78228b.hashCode() + (this.f78227a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78227a.name());
        dest.writeString(this.f78228b.name());
        dest.writeString(this.f78229c.name());
    }
}
