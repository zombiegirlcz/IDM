package com.revolut.feature_retail_user_declarations.contact_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature_retail_user_declarations/contact_selection/ContactSelectionWorkflowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Chooser", "Lcom/revolut/feature_retail_user_declarations/contact_selection/ContactSelectionWorkflowContract$Step$Chooser;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContactSelectionWorkflowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/contact_selection/ContactSelectionWorkflowContract$Step$Chooser;", "Lcom/revolut/feature_retail_user_declarations/contact_selection/ContactSelectionWorkflowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chooser extends ContactSelectionWorkflowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ContactsChooserInputData f97530b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chooser(parcel.readString(), (ContactsChooserInputData) parcel.readParcelable(Chooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chooser[i];
            }
        }

        public Chooser(String workflowStepId, ContactsChooserInputData inputData) {
            Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f97529a = workflowStepId;
            this.f97530b = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Chooser)) {
                return false;
            }
            Chooser chooser = (Chooser) obj2;
            return Intrinsics.f(this.f97529a, chooser.f97529a) && Intrinsics.f(this.f97530b, chooser.f97530b);
        }

        public final int hashCode() {
            return this.f97530b.hashCode() + (this.f97529a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97529a);
            dest.writeParcelable(this.f97530b, i);
        }
    }

    private ContactSelectionWorkflowContract$Step() {
    }
}
