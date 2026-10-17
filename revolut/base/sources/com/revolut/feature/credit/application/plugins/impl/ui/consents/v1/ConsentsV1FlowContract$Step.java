package com.revolut.feature.credit.application.plugins.impl.ui.consents.v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/consents/v1/ConsentsV1FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CreditApplicationDocumentViewer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consents/v1/ConsentsV1FlowContract$Step$CreditApplicationDocumentViewer;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConsentsV1FlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consents/v1/ConsentsV1FlowContract$Step$CreditApplicationDocumentViewer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consents/v1/ConsentsV1FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditApplicationDocumentViewer extends ConsentsV1FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreditApplicationDocumentViewer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final su3.a f67288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DocumentViewerScreenConfig f67289c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditApplicationDocumentViewer(parcel.readString(), (su3.a) parcel.readSerializable(), (DocumentViewerScreenConfig) parcel.readParcelable(CreditApplicationDocumentViewer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditApplicationDocumentViewer[i];
            }
        }

        public CreditApplicationDocumentViewer(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(document, "document");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f67287a = documentId;
            this.f67288b = document;
            this.f67289c = screenConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditApplicationDocumentViewer)) {
                return false;
            }
            CreditApplicationDocumentViewer creditApplicationDocumentViewer = (CreditApplicationDocumentViewer) obj2;
            return Intrinsics.f(this.f67287a, creditApplicationDocumentViewer.f67287a) && Intrinsics.f(this.f67288b, creditApplicationDocumentViewer.f67288b) && Intrinsics.f(this.f67289c, creditApplicationDocumentViewer.f67289c);
        }

        public final int hashCode() {
            return this.f67289c.hashCode() + ((this.f67288b.hashCode() + (this.f67287a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67287a);
            dest.writeSerializable(this.f67288b);
            dest.writeParcelable(this.f67289c, i);
        }
    }

    private ConsentsV1FlowContract$Step() {
    }
}
