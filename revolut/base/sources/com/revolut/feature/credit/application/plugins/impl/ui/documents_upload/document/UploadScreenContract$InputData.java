package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny3.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/documents_upload/document/UploadScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UploadScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UploadScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f67577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67578c;
    public final zv3.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UploadScreenContract$InputData(parcel.readString(), (f) parcel.readSerializable(), parcel.readInt() != 0, zv3.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UploadScreenContract$InputData[i];
        }
    }

    public UploadScreenContract$InputData(String context, f configuration, boolean z, zv3.a navigationIcon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f67576a = context;
        this.f67577b = configuration;
        this.f67578c = z;
        this.d = navigationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UploadScreenContract$InputData)) {
            return false;
        }
        UploadScreenContract$InputData uploadScreenContract$InputData = (UploadScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67576a, uploadScreenContract$InputData.f67576a) && Intrinsics.f(this.f67577b, uploadScreenContract$InputData.f67577b) && this.f67578c == uploadScreenContract$InputData.f67578c && this.d == uploadScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f67577b.hashCode() + (this.f67576a.hashCode() * 31)) * 31, 31, this.f67578c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67576a);
        dest.writeSerializable(this.f67577b);
        dest.writeInt(this.f67578c ? 1 : 0);
        dest.writeString(this.d.name());
    }
}
