package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient;", "Landroid/os/Parcelable;", "Outgoing", "Contact", "OpenRequest", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$Outgoing;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmTransferRecipient extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$Contact;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$Outgoing;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Contact implements Outgoing {

        @NotNull
        public static final Parcelable.Creator<Contact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmContact f62299a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Contact((ApmContact) parcel.readParcelable(Contact.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contact[i];
            }
        }

        public Contact(ApmContact contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f62299a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Contact) && Intrinsics.f(this.f62299a, ((Contact) obj2).f62299a);
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient
        /* JADX INFO: renamed from: getDisplayName */
        public final String getF62300a() {
            return this.f62299a.getDisplayName();
        }

        public final int hashCode() {
            return this.f62299a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62299a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$OpenRequest;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$Outgoing;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenRequest implements Outgoing {

        @NotNull
        public static final Parcelable.Creator<OpenRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmProduct f62301b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenRequest(parcel.readString(), (ApmProduct) parcel.readParcelable(OpenRequest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenRequest[i];
            }
        }

        public OpenRequest(String recipientName, ApmProduct product) {
            Intrinsics.checkNotNullParameter(recipientName, "recipientName");
            Intrinsics.checkNotNullParameter(product, "product");
            this.f62300a = recipientName;
            this.f62301b = product;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenRequest)) {
                return false;
            }
            OpenRequest openRequest = (OpenRequest) obj2;
            return Intrinsics.f(this.f62300a, openRequest.f62300a) && Intrinsics.f(this.f62301b, openRequest.f62301b);
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient
        /* JADX INFO: renamed from: getDisplayName, reason: from getter */
        public final String getF62300a() {
            return this.f62300a;
        }

        public final int hashCode() {
            return this.f62301b.hashCode() + (this.f62300a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62300a);
            dest.writeParcelable(this.f62301b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$Outgoing;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$Contact;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferRecipient$OpenRequest;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Outgoing extends ApmTransferRecipient {
    }

    /* JADX INFO: renamed from: getDisplayName */
    String getF62300a();
}
