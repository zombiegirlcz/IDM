package com.revolut.camerakit.validators.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/validators/config/DocClassifierConfig;", "Lcom/revolut/camerakit/validators/config/ValidatorConfig;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocClassifierConfig implements ValidatorConfig {

    @NotNull
    public static final Parcelable.Creator<DocClassifierConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50905b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocClassifierConfig(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocClassifierConfig[i];
        }
    }

    public DocClassifierConfig(String modelName, String checkSum) {
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        this.f50904a = modelName;
        this.f50905b = checkSum;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocClassifierConfig)) {
            return false;
        }
        DocClassifierConfig docClassifierConfig = (DocClassifierConfig) obj2;
        return Intrinsics.f(this.f50904a, docClassifierConfig.f50904a) && Intrinsics.f(this.f50905b, docClassifierConfig.f50905b);
    }

    public final int hashCode() {
        return this.f50905b.hashCode() + (this.f50904a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50904a);
        dest.writeString(this.f50905b);
    }
}
