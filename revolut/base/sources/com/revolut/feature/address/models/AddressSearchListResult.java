package com.revolut.feature.address.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/address/models/AddressSearchListResult;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "items", "", "Lcom/revolut/feature/address/models/AddressSearchResult;", "sessionId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressSearchListResult implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<AddressSearchListResult> CREATOR = new Creator();

    @NotNull
    private final List<AddressSearchResult> items;
    private final String sessionId;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressSearchListResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchListResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(AddressSearchResult.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AddressSearchListResult(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchListResult[] newArray(int i) {
            return new AddressSearchListResult[i];
        }
    }

    public AddressSearchListResult(@NotNull List<AddressSearchResult> items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.sessionId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSearchListResult copy$default(AddressSearchListResult addressSearchListResult, List list, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = addressSearchListResult.items;
        }
        if ((i & 2) != 0) {
            str = addressSearchListResult.sessionId;
        }
        return addressSearchListResult.copy(list, str);
    }

    @NotNull
    public final List<AddressSearchResult> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final AddressSearchListResult copy(@NotNull List<AddressSearchResult> items, String sessionId) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AddressSearchListResult(items, sessionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSearchListResult)) {
            return false;
        }
        AddressSearchListResult addressSearchListResult = (AddressSearchListResult) other;
        return Intrinsics.f(this.items, addressSearchListResult.items) && Intrinsics.f(this.sessionId, addressSearchListResult.sessionId);
    }

    @NotNull
    public final List<AddressSearchResult> getItems() {
        return this.items;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.sessionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.items, dest);
        while (itV.hasNext()) {
            ((AddressSearchResult) itV.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.sessionId);
    }
}
