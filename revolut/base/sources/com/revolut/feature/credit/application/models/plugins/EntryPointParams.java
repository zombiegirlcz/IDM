package com.revolut.feature.credit.application.models.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/plugins/EntryPointParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntryPointParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EntryPointParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f66246b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntryPointParams(parcel.readString(), r2.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryPointParams[i];
        }
    }

    public EntryPointParams(String str, r2 entryPointType) {
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        this.f66245a = str;
        this.f66246b = entryPointType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntryPointParams)) {
            return false;
        }
        EntryPointParams entryPointParams = (EntryPointParams) obj2;
        return Intrinsics.f(this.f66245a, entryPointParams.f66245a) && this.f66246b == entryPointParams.f66246b;
    }

    public final int hashCode() {
        String str = this.f66245a;
        return this.f66246b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66245a);
        dest.writeString(this.f66246b.name());
    }
}
