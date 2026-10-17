package com.revolut.core.backend_flow.impl.repository;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/backend_flow/impl/repository/BackendFlowSessionRepositoryImpl$SessionsMap", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class BackendFlowSessionRepositoryImpl$SessionsMap implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendFlowSessionRepositoryImpl$SessionsMap> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f51254a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readSerializable(), Long.valueOf(parcel.readLong()));
            }
            return new BackendFlowSessionRepositoryImpl$SessionsMap(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowSessionRepositoryImpl$SessionsMap[i];
        }
    }

    public BackendFlowSessionRepositoryImpl$SessionsMap(LinkedHashMap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f51254a = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BackendFlowSessionRepositoryImpl$SessionsMap) && this.f51254a.equals(((BackendFlowSessionRepositoryImpl$SessionsMap) obj2).f51254a);
    }

    public final int hashCode() {
        return this.f51254a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        LinkedHashMap linkedHashMap = this.f51254a;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeSerializable((Serializable) entry.getKey());
            dest.writeLong(((Number) entry.getValue()).longValue());
        }
    }
}
