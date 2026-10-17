package com.revolut.feature.junior_tasks.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import dp8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_tasks/api/navigation/JuniorTasksEditDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorTasksEditDestination extends InternalDestination<IOData$EmptyInput> {

    @NotNull
    public static final Parcelable.Creator<JuniorTasksEditDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f77357c;
    public final TransitionAnimation d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorTasksEditDestination(parcel.readString(), (b) parcel.readSerializable(), (TransitionAnimation) parcel.readParcelable(JuniorTasksEditDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorTasksEditDestination[i];
        }
    }

    public /* synthetic */ JuniorTasksEditDestination(String str, b bVar, int i) {
        this(str, bVar, null, (i & 8) == 0);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorTasksEditDestination)) {
            return false;
        }
        JuniorTasksEditDestination juniorTasksEditDestination = (JuniorTasksEditDestination) obj2;
        return Intrinsics.f(this.f77356b, juniorTasksEditDestination.f77356b) && Intrinsics.f(this.f77357c, juniorTasksEditDestination.f77357c) && Intrinsics.f(this.d, juniorTasksEditDestination.d) && this.e == juniorTasksEditDestination.e;
    }

    public final int hashCode() {
        int iHashCode = this.f77356b.hashCode() * 31;
        b bVar = this.f77357c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        TransitionAnimation transitionAnimation = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77356b);
        dest.writeSerializable(this.f77357c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorTasksEditDestination(String userId, b bVar, TransitionAnimation transitionAnimation, boolean z) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f77356b = userId;
        this.f77357c = bVar;
        this.d = transitionAnimation;
        this.e = z;
    }
}
