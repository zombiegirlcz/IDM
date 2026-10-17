package com.revolut.feature.retail.main_screen.container.models.action_payload;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ChecklistPayload;", "Landroid/os/Parcelable;", "Companion", "FincrimeChecklist", "AdoptionJourneyDeeplinkAction", "a", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ChecklistPayload$AdoptionJourneyDeeplinkAction;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ChecklistPayload$FincrimeChecklist;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChecklistPayload extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f82757a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ChecklistPayload$AdoptionJourneyDeeplinkAction;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ChecklistPayload;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdoptionJourneyDeeplinkAction implements ChecklistPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AdoptionJourneyDeeplinkAction f82755a = new AdoptionJourneyDeeplinkAction();

        @NotNull
        public static final Parcelable.Creator<AdoptionJourneyDeeplinkAction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AdoptionJourneyDeeplinkAction.f82755a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdoptionJourneyDeeplinkAction[i];
            }
        }

        private AdoptionJourneyDeeplinkAction() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof AdoptionJourneyDeeplinkAction);
        }

        public final int hashCode() {
            return -604946269;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ChecklistPayload$FincrimeChecklist;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ChecklistPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FincrimeChecklist implements ChecklistPayload {

        @NotNull
        public static final Parcelable.Creator<FincrimeChecklist> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82756a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FincrimeChecklist(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FincrimeChecklist[i];
            }
        }

        public FincrimeChecklist(boolean z) {
            this.f82756a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FincrimeChecklist) && this.f82756a == ((FincrimeChecklist) obj2).f82756a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82756a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f82756a ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.retail.main_screen.container.models.action_payload.ChecklistPayload$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f82757a = new Companion();

        private Companion() {
        }
    }
}
