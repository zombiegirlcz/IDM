package com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CitizenshipPrompt", "ChooseCitizenshipPicker", "Lcom/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$Step$ChooseCitizenshipPicker;", "Lcom/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$Step$CitizenshipPrompt;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CollectCitizenshipFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$Step$ChooseCitizenshipPicker;", "Lcom/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$Step;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseCitizenshipPicker extends CollectCitizenshipFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseCitizenshipPicker f97518a = new ChooseCitizenshipPicker();

        @NotNull
        public static final Parcelable.Creator<ChooseCitizenshipPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseCitizenshipPicker.f97518a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseCitizenshipPicker[i];
            }
        }

        private ChooseCitizenshipPicker() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$Step$CitizenshipPrompt;", "Lcom/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CitizenshipPrompt extends CollectCitizenshipFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CitizenshipPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97519a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CitizenshipPrompt((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CitizenshipPrompt[i];
            }
        }

        public CitizenshipPrompt(wi0.b suggestedCitizenship) {
            Intrinsics.checkNotNullParameter(suggestedCitizenship, "suggestedCitizenship");
            this.f97519a = suggestedCitizenship;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CitizenshipPrompt) && Intrinsics.f(this.f97519a, ((CitizenshipPrompt) obj2).f97519a);
        }

        public final int hashCode() {
            return this.f97519a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97519a);
        }
    }

    private CollectCitizenshipFlowContract$Step() {
    }
}
