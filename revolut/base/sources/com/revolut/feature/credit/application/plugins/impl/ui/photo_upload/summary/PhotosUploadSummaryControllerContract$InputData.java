package com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary;

import android.os.Parcel;
import android.os.Parcelable;
import bz3.f;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/photo_upload/summary/PhotosUploadSummaryControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhotosUploadSummaryControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PhotosUploadSummaryControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f68204b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhotosUploadSummaryControllerContract$InputData(parcel.readString(), (f) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotosUploadSummaryControllerContract$InputData[i];
        }
    }

    public PhotosUploadSummaryControllerContract$InputData(String applicationId, f configuration) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f68203a = applicationId;
        this.f68204b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PhotosUploadSummaryControllerContract$InputData)) {
            return false;
        }
        PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData = (PhotosUploadSummaryControllerContract$InputData) obj2;
        return Intrinsics.f(this.f68203a, photosUploadSummaryControllerContract$InputData.f68203a) && Intrinsics.f(this.f68204b, photosUploadSummaryControllerContract$InputData.f68204b);
    }

    public final int hashCode() {
        return this.f68204b.hashCode() + (this.f68203a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68203a);
        dest.writeSerializable(this.f68204b);
    }
}
