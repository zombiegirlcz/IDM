package com.revolut.shared.feature.offboarding.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s8l.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/offboarding/api/domain/model/OffboardingScreenAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_offboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OffboardingScreenAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OffboardingScreenAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OffboardingActionIcon f104879c;
    public final b d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OffboardingScreenAction(parcel.readString(), parcel.readString(), (OffboardingActionIcon) parcel.readParcelable(OffboardingScreenAction.class.getClassLoader()), b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OffboardingScreenAction[i];
        }
    }

    public OffboardingScreenAction(String title, String subtitle, OffboardingActionIcon icon, b status, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f104877a = title;
        this.f104878b = subtitle;
        this.f104879c = icon;
        this.d = status;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OffboardingScreenAction)) {
            return false;
        }
        OffboardingScreenAction offboardingScreenAction = (OffboardingScreenAction) obj2;
        return Intrinsics.f(this.f104877a, offboardingScreenAction.f104877a) && Intrinsics.f(this.f104878b, offboardingScreenAction.f104878b) && Intrinsics.f(this.f104879c, offboardingScreenAction.f104879c) && this.d == offboardingScreenAction.d && Intrinsics.f(this.e, offboardingScreenAction.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f104879c.hashCode() + p.a.c(this.f104877a.hashCode() * 31, 31, this.f104878b)) * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104877a);
        dest.writeString(this.f104878b);
        dest.writeParcelable(this.f104879c, i);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
    }
}
