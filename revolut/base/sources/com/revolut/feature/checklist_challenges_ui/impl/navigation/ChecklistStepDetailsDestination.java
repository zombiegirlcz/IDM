package com.revolut.feature.checklist_challenges_ui.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checklist_challenges_ui/impl/navigation/ChecklistStepDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_checklist_challenges_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChecklistStepDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ChecklistStepDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65811b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChecklistStepDetailsDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChecklistStepDetailsDestination[i];
        }
    }

    public ChecklistStepDetailsDestination(String campaignId, String stepId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f65810a = campaignId;
        this.f65811b = stepId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChecklistStepDetailsDestination)) {
            return false;
        }
        ChecklistStepDetailsDestination checklistStepDetailsDestination = (ChecklistStepDetailsDestination) obj2;
        return Intrinsics.f(this.f65810a, checklistStepDetailsDestination.f65810a) && Intrinsics.f(this.f65811b, checklistStepDetailsDestination.f65811b);
    }

    public final int hashCode() {
        return this.f65811b.hashCode() + (this.f65810a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65810a);
        dest.writeString(this.f65811b);
    }
}
