package com.revolut.feature.junior_profile.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import h35.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_profile/api/navigation/JuniorAccountSimplePickerDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAccountSimplePickerDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorAccountSimplePickerDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f77130a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new JuniorAccountSimplePickerDestination(0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAccountSimplePickerDestination[i];
        }
    }

    public JuniorAccountSimplePickerDestination() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JuniorAccountSimplePickerDestination) && Intrinsics.f(this.f77130a, ((JuniorAccountSimplePickerDestination) obj2).f77130a);
    }

    public final int hashCode() {
        return this.f77130a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public JuniorAccountSimplePickerDestination(int i) {
        c onJuniorSelectedDestinationProvider = new c(28);
        Intrinsics.checkNotNullParameter(onJuniorSelectedDestinationProvider, "onJuniorSelectedDestinationProvider");
        this.f77130a = onJuniorSelectedDestinationProvider;
    }
}
