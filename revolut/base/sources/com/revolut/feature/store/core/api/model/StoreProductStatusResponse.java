package com.revolut.feature.store.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1e.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/core/api/model/StoreProductStatusResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreProductStatusResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreProductStatusResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f88642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f88643c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreContentEntry.CREATOR, parcel, arrayList, iA, 1);
            }
            return new StoreProductStatusResponse(string, bVarValueOf, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreProductStatusResponse[i];
        }
    }

    public StoreProductStatusResponse(String id10, b state, ArrayList contentEntries, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentEntries, "contentEntries");
        this.f88641a = id10;
        this.f88642b = state;
        this.f88643c = contentEntries;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreProductStatusResponse)) {
            return false;
        }
        StoreProductStatusResponse storeProductStatusResponse = (StoreProductStatusResponse) obj2;
        return Intrinsics.f(this.f88641a, storeProductStatusResponse.f88641a) && this.f88642b == storeProductStatusResponse.f88642b && this.f88643c.equals(storeProductStatusResponse.f88643c) && Intrinsics.f(this.d, storeProductStatusResponse.d) && Intrinsics.f(this.e, storeProductStatusResponse.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f88643c, (this.f88642b.hashCode() + (this.f88641a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88641a);
        dest.writeString(this.f88642b.name());
        Iterator itY = j6.a.y(this.f88643c, dest);
        while (itY.hasNext()) {
            ((StoreContentEntry) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
