package com.revolut.feature.pay_with_photo.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_with_photo/api/PayWithPhotoPreviewControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_with_photo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayWithPhotoPreviewControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PayWithPhotoPreviewControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f78944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f78945b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayWithPhotoPreviewControllerDescriptor$InputData((File) parcel.readSerializable(), (Clause) parcel.readParcelable(PayWithPhotoPreviewControllerDescriptor$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayWithPhotoPreviewControllerDescriptor$InputData[i];
        }
    }

    public PayWithPhotoPreviewControllerDescriptor$InputData(File file, Clause footerText) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(footerText, "footerText");
        this.f78944a = file;
        this.f78945b = footerText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayWithPhotoPreviewControllerDescriptor$InputData)) {
            return false;
        }
        PayWithPhotoPreviewControllerDescriptor$InputData payWithPhotoPreviewControllerDescriptor$InputData = (PayWithPhotoPreviewControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f78944a, payWithPhotoPreviewControllerDescriptor$InputData.f78944a) && Intrinsics.f(this.f78945b, payWithPhotoPreviewControllerDescriptor$InputData.f78945b);
    }

    public final int hashCode() {
        return this.f78945b.hashCode() + (this.f78944a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78944a);
        dest.writeParcelable(this.f78945b, i);
    }
}
