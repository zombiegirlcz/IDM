package com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files;

import android.os.Parcel;
import android.os.Parcelable;
import br7.f;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/upload_documents/files/UploadFilesListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UploadFilesListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UploadFilesListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestedDocument f75687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f75688b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UploadFilesListScreenContract$InputData(RequestedDocument.CREATOR.createFromParcel(parcel), f.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UploadFilesListScreenContract$InputData[i];
        }
    }

    public UploadFilesListScreenContract$InputData(RequestedDocument document, f mode) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f75687a = document;
        this.f75688b = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UploadFilesListScreenContract$InputData)) {
            return false;
        }
        UploadFilesListScreenContract$InputData uploadFilesListScreenContract$InputData = (UploadFilesListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75687a, uploadFilesListScreenContract$InputData.f75687a) && this.f75688b == uploadFilesListScreenContract$InputData.f75688b;
    }

    public final int hashCode() {
        return this.f75688b.hashCode() + (this.f75687a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f75687a.writeToParcel(dest, i);
        dest.writeString(this.f75688b.name());
    }
}
