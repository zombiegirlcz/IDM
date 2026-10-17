package com.revolut.feature.contacts_chooser.impl.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.FeatureFlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/contacts_chooser/impl/bridge/ContactsChooserFlowContract$Step", "Lcom/revolut/kompot/FeatureFlowStep;", "<init>", "()V", "Chooser", "Lcom/revolut/feature/contacts_chooser/impl/bridge/ContactsChooserFlowContract$Step$Chooser;", "feature_contacts_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContactsChooserFlowContract$Step implements FeatureFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/impl/bridge/ContactsChooserFlowContract$Step$Chooser;", "Lcom/revolut/feature/contacts_chooser/impl/bridge/ContactsChooserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chooser extends ContactsChooserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContactsChooserFlowContract$InputData f66083a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chooser(ContactsChooserFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chooser[i];
            }
        }

        public Chooser(ContactsChooserFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f66083a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ContactsChooserFlowContract$InputData getF66083a() {
            return this.f66083a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chooser) && Intrinsics.f(this.f66083a, ((Chooser) obj2).f66083a);
        }

        public final int hashCode() {
            return this.f66083a.f66081a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66083a.writeToParcel(dest, i);
        }
    }

    private ContactsChooserFlowContract$Step() {
    }
}
