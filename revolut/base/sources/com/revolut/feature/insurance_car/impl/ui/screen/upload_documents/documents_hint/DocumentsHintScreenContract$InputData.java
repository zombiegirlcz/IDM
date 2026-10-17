package com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/upload_documents/documents_hint/DocumentsHintScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsHintScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DocumentsHintScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestedDocument f75682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f75683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f75684c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentsHintScreenContract$InputData(RequestedDocument.CREATOR.createFromParcel(parcel), (ResourceImage) parcel.readParcelable(DocumentsHintScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(DocumentsHintScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentsHintScreenContract$InputData[i];
        }
    }

    public DocumentsHintScreenContract$InputData(RequestedDocument document, ResourceImage closeButtonImage, Clause clause) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        this.f75682a = document;
        this.f75683b = closeButtonImage;
        this.f75684c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentsHintScreenContract$InputData)) {
            return false;
        }
        DocumentsHintScreenContract$InputData documentsHintScreenContract$InputData = (DocumentsHintScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75682a, documentsHintScreenContract$InputData.f75682a) && Intrinsics.f(this.f75683b, documentsHintScreenContract$InputData.f75683b) && Intrinsics.f(this.f75684c, documentsHintScreenContract$InputData.f75684c);
    }

    public final int hashCode() {
        int iB = org.bouncycastle.jcajce.provider.digest.a.b(this.f75683b, this.f75682a.hashCode() * 31, 31);
        Clause clause = this.f75684c;
        return iB + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f75682a.writeToParcel(dest, i);
        dest.writeParcelable(this.f75683b, i);
        dest.writeParcelable(this.f75684c, i);
    }

    public /* synthetic */ DocumentsHintScreenContract$InputData(RequestedDocument requestedDocument, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause, int i) {
        this(requestedDocument, (i & 2) != 0 ? new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : resourceImage, (i & 4) != 0 ? null : textLocalisedClause);
    }
}
