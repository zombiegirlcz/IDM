package com.revolut.feature.user.checklist.impl.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.api.UserChecklistSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/user/checklist/impl/ui/screen/UserChecklistContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_user_checklist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserChecklistContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UserChecklistContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserChecklistSource f94612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserChecklistContentType f94613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94614c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserChecklistContract$InputData((UserChecklistSource) parcel.readParcelable(UserChecklistContract$InputData.class.getClassLoader()), (UserChecklistContentType) parcel.readParcelable(UserChecklistContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserChecklistContract$InputData[i];
        }
    }

    public UserChecklistContract$InputData(UserChecklistSource source, UserChecklistContentType contentType, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f94612a = source;
        this.f94613b = contentType;
        this.f94614c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserChecklistContract$InputData)) {
            return false;
        }
        UserChecklistContract$InputData userChecklistContract$InputData = (UserChecklistContract$InputData) obj2;
        return Intrinsics.f(this.f94612a, userChecklistContract$InputData.f94612a) && Intrinsics.f(this.f94613b, userChecklistContract$InputData.f94613b) && this.f94614c == userChecklistContract$InputData.f94614c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94614c) + ((this.f94613b.hashCode() + (this.f94612a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94612a, i);
        dest.writeParcelable(this.f94613b, i);
        dest.writeInt(this.f94614c ? 1 : 0);
    }
}
