package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/agreements/v2/CreditAgreementsV2FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DocumentViewer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v2/CreditAgreementsV2FlowContract$Step$DocumentViewer;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditAgreementsV2FlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v2/CreditAgreementsV2FlowContract$Step$DocumentViewer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v2/CreditAgreementsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentViewer extends CreditAgreementsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentViewer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f67014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final su3.a f67015c;
        public final DocumentViewerScreenConfig d;
        public final List e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(DocumentViewer.class.getClassLoader());
                su3.a aVar = (su3.a) parcel.readSerializable();
                DocumentViewerScreenConfig documentViewerScreenConfig = (DocumentViewerScreenConfig) parcel.readParcelable(DocumentViewer.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new DocumentViewer(string, clause, aVar, documentViewerScreenConfig, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentViewer[i];
            }
        }

        public DocumentViewer(String documentId, Clause clause, su3.a document, DocumentViewerScreenConfig screenConfig, List checkboxes) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(document, "document");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
            this.f67013a = documentId;
            this.f67014b = clause;
            this.f67015c = document;
            this.d = screenConfig;
            this.e = checkboxes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentViewer)) {
                return false;
            }
            DocumentViewer documentViewer = (DocumentViewer) obj2;
            return Intrinsics.f(this.f67013a, documentViewer.f67013a) && Intrinsics.f(this.f67014b, documentViewer.f67014b) && Intrinsics.f(this.f67015c, documentViewer.f67015c) && Intrinsics.f(this.d, documentViewer.d) && Intrinsics.f(this.e, documentViewer.e);
        }

        public final int hashCode() {
            int iHashCode = this.f67013a.hashCode() * 31;
            Clause clause = this.f67014b;
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f67015c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67013a);
            dest.writeParcelable(this.f67014b, i);
            dest.writeSerializable(this.f67015c);
            dest.writeParcelable(this.d, i);
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    private CreditAgreementsV2FlowContract$Step() {
    }
}
