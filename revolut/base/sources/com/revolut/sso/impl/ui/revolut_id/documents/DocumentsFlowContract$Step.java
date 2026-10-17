package com.revolut.sso.impl.ui.revolut_id.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "HelpPrompt", "IdentityDocuments", "DocumentPhoto", "Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step$DocumentPhoto;", "Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step$HelpPrompt;", "Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step$IdentityDocuments;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DocumentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step$DocumentPhoto;", "Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentPhoto extends DocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentPhoto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106736a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentPhoto(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentPhoto[i];
            }
        }

        public DocumentPhoto(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.f106736a = imageUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentPhoto) && Intrinsics.f(this.f106736a, ((DocumentPhoto) obj2).f106736a);
        }

        public final int hashCode() {
            return this.f106736a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106736a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step$HelpPrompt;", "Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HelpPrompt extends DocumentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HelpPrompt f106737a = new HelpPrompt();

        @NotNull
        public static final Parcelable.Creator<HelpPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HelpPrompt.f106737a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HelpPrompt[i];
            }
        }

        private HelpPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step$IdentityDocuments;", "Lcom/revolut/sso/impl/ui/revolut_id/documents/DocumentsFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IdentityDocuments extends DocumentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IdentityDocuments f106738a = new IdentityDocuments();

        @NotNull
        public static final Parcelable.Creator<IdentityDocuments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IdentityDocuments.f106738a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentityDocuments[i];
            }
        }

        private IdentityDocuments() {
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

    private DocumentsFlowContract$Step() {
    }
}
