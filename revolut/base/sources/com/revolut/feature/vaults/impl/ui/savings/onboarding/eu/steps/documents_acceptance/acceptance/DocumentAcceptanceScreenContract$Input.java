package com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/acceptance/DocumentAcceptanceScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentAcceptanceScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DocumentAcceptanceScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsDocumentToAccept f94796a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentAcceptanceScreenContract$Input((SavingsDocumentToAccept) parcel.readParcelable(DocumentAcceptanceScreenContract$Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentAcceptanceScreenContract$Input[i];
        }
    }

    public DocumentAcceptanceScreenContract$Input(SavingsDocumentToAccept document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f94796a = document;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DocumentAcceptanceScreenContract$Input) && Intrinsics.f(this.f94796a, ((DocumentAcceptanceScreenContract$Input) obj2).f94796a);
    }

    public final int hashCode() {
        return this.f94796a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94796a, i);
    }
}
