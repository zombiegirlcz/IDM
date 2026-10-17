package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmRecipientSettingsNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Recipient", "Id", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmRecipientSettingsNavigation$InputData$Id;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmRecipientSettingsNavigation$InputData$Recipient;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmRecipientSettingsNavigation$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmRecipientSettingsNavigation$InputData$Id;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmRecipientSettingsNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id implements ApmRecipientSettingsNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmRecipientSettingsValue f62269b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Id(parcel.readString(), (ApmRecipientSettingsValue) parcel.readParcelable(Id.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String recipientId, ApmRecipientSettingsValue settings) {
            Intrinsics.checkNotNullParameter(recipientId, "recipientId");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f62268a = recipientId;
            this.f62269b = settings;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientSettingsNavigation$InputData
        /* JADX INFO: renamed from: V, reason: from getter */
        public final ApmRecipientSettingsValue getF62271b() {
            return this.f62269b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Id)) {
                return false;
            }
            Id id10 = (Id) obj2;
            return Intrinsics.f(this.f62268a, id10.f62268a) && Intrinsics.f(this.f62269b, id10.f62269b);
        }

        public final int hashCode() {
            return this.f62269b.hashCode() + (this.f62268a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62268a);
            dest.writeParcelable(this.f62269b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmRecipientSettingsNavigation$InputData$Recipient;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmRecipientSettingsNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Recipient implements ApmRecipientSettingsNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<Recipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmRecipient f62270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmRecipientSettingsValue f62271b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recipient((ApmRecipient) parcel.readParcelable(Recipient.class.getClassLoader()), (ApmRecipientSettingsValue) parcel.readParcelable(Recipient.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Recipient[i];
            }
        }

        public Recipient(ApmRecipient recipient, ApmRecipientSettingsValue settings) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f62270a = recipient;
            this.f62271b = settings;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientSettingsNavigation$InputData
        /* JADX INFO: renamed from: V, reason: from getter */
        public final ApmRecipientSettingsValue getF62271b() {
            return this.f62271b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Recipient)) {
                return false;
            }
            Recipient recipient = (Recipient) obj2;
            return Intrinsics.f(this.f62270a, recipient.f62270a) && Intrinsics.f(this.f62271b, recipient.f62271b);
        }

        public final int hashCode() {
            return this.f62271b.hashCode() + (this.f62270a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62270a, i);
            dest.writeParcelable(this.f62271b, i);
        }
    }

    /* JADX INFO: renamed from: V */
    ApmRecipientSettingsValue getF62271b();
}
