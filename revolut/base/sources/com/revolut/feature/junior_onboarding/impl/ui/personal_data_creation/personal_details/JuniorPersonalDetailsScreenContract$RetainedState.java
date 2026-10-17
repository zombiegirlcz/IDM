package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorPersonalDetailsScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<JuniorPersonalDetailsScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77052c;
    public final JuniorPersonalDetailsScreenContract$DateOfBirthStatus d;
    public final bj0.b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorPersonalDetailsScreenContract$RetainedState(parcel.readString(), parcel.readString(), parcel.readString(), (JuniorPersonalDetailsScreenContract$DateOfBirthStatus) parcel.readParcelable(JuniorPersonalDetailsScreenContract$RetainedState.class.getClassLoader()), parcel.readInt() == 0 ? null : bj0.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorPersonalDetailsScreenContract$RetainedState[i];
        }
    }

    public JuniorPersonalDetailsScreenContract$RetainedState(String firstName, String firstLastName, String secondLastName, JuniorPersonalDetailsScreenContract$DateOfBirthStatus dobStatus, bj0.b bVar) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstLastName, "firstLastName");
        Intrinsics.checkNotNullParameter(secondLastName, "secondLastName");
        Intrinsics.checkNotNullParameter(dobStatus, "dobStatus");
        this.f77050a = firstName;
        this.f77051b = firstLastName;
        this.f77052c = secondLastName;
        this.d = dobStatus;
        this.e = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorPersonalDetailsScreenContract$RetainedState)) {
            return false;
        }
        JuniorPersonalDetailsScreenContract$RetainedState juniorPersonalDetailsScreenContract$RetainedState = (JuniorPersonalDetailsScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f77050a, juniorPersonalDetailsScreenContract$RetainedState.f77050a) && Intrinsics.f(this.f77051b, juniorPersonalDetailsScreenContract$RetainedState.f77051b) && Intrinsics.f(this.f77052c, juniorPersonalDetailsScreenContract$RetainedState.f77052c) && Intrinsics.f(this.d, juniorPersonalDetailsScreenContract$RetainedState.d) && this.e == juniorPersonalDetailsScreenContract$RetainedState.e;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f77050a.hashCode() * 31, 31, this.f77051b), 31, this.f77052c)) * 31;
        bj0.b bVar = this.e;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77050a);
        dest.writeString(this.f77051b);
        dest.writeString(this.f77052c);
        dest.writeParcelable(this.d, i);
        bj0.b bVar = this.e;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
