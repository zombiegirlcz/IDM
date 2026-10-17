package com.revolut.feature.user.checklist.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/user/checklist/api/UserChecklistDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_user_checklist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserChecklistDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<UserChecklistDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserChecklistSource f94597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserChecklistContentType f94598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94599c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserChecklistDestination((UserChecklistSource) parcel.readParcelable(UserChecklistDestination.class.getClassLoader()), (UserChecklistContentType) parcel.readParcelable(UserChecklistDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserChecklistDestination[i];
        }
    }

    public UserChecklistDestination(UserChecklistSource source, UserChecklistContentType contentType, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f94597a = source;
        this.f94598b = contentType;
        this.f94599c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserChecklistDestination)) {
            return false;
        }
        UserChecklistDestination userChecklistDestination = (UserChecklistDestination) obj2;
        return Intrinsics.f(this.f94597a, userChecklistDestination.f94597a) && Intrinsics.f(this.f94598b, userChecklistDestination.f94598b) && this.f94599c == userChecklistDestination.f94599c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94599c) + ((this.f94598b.hashCode() + (this.f94597a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94597a, i);
        dest.writeParcelable(this.f94598b, i);
        dest.writeInt(this.f94599c ? 1 : 0);
    }
}
