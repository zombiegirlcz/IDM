package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UpdateGender", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$ModalStep$UpdateGender;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorPersonalDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$ModalStep$UpdateGender;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateGender implements JuniorPersonalDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UpdateGender> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bj0.b f77049a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateGender(parcel.readInt() == 0 ? null : bj0.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateGender[i];
            }
        }

        public UpdateGender(bj0.b bVar) {
            this.f77049a = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdateGender) && this.f77049a == ((UpdateGender) obj2).f77049a;
        }

        public final int hashCode() {
            bj0.b bVar = this.f77049a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            bj0.b bVar = this.f77049a;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
        }
    }
}
