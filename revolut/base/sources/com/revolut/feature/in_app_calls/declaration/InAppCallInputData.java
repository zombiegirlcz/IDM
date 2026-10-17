package com.revolut.feature.in_app_calls.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import de7.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/declaration/InAppCallInputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InAppCallInputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InAppCallInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f74796a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InAppCallInputData(d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InAppCallInputData[i];
        }
    }

    public InAppCallInputData(d startPoint) {
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        this.f74796a = startPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InAppCallInputData) && this.f74796a == ((InAppCallInputData) obj2).f74796a;
    }

    public final int hashCode() {
        return this.f74796a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74796a.name());
    }
}
