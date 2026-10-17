package com.revolut.feature.junior_tasks.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_tasks/api/navigation/JuniorTasksListDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorTasksListDestination extends InternalDestination<IOData$EmptyInput> {

    @NotNull
    public static final Parcelable.Creator<JuniorTasksListDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f77359c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorTasksListDestination((TransitionAnimation) parcel.readParcelable(JuniorTasksListDestination.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorTasksListDestination[i];
        }
    }

    public /* synthetic */ JuniorTasksListDestination(String str, ZoomTransitionAnimation.Widgets widgets, int i) {
        this((i & 2) != 0 ? null : widgets, str, (i & 4) != 0);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF77359c() {
        return this.f77359c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorTasksListDestination)) {
            return false;
        }
        JuniorTasksListDestination juniorTasksListDestination = (JuniorTasksListDestination) obj2;
        return Intrinsics.f(this.f77358b, juniorTasksListDestination.f77358b) && Intrinsics.f(this.f77359c, juniorTasksListDestination.f77359c) && this.d == juniorTasksListDestination.d;
    }

    public final int hashCode() {
        int iHashCode = this.f77358b.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f77359c;
        return Boolean.hashCode(this.d) + ((iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode())) * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77358b);
        dest.writeParcelable(this.f77359c, i);
        dest.writeInt(this.d ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorTasksListDestination(TransitionAnimation transitionAnimation, String userId, boolean z) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f77358b = userId;
        this.f77359c = transitionAnimation;
        this.d = z;
    }
}
