package com.revolut.core.backend_flow.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/backend_flow/ui/BackendFlowContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendFlowContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51310c;
    public final AnalyticsProduct d;
    public final Object e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            int iD = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(BackendFlowContract$Configuration.class.getClassLoader());
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            while (iD != i3) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, i);
            }
            return new BackendFlowContract$Configuration(string, i2, z, analyticsProduct, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowContract$Configuration[i];
        }
    }

    public BackendFlowContract$Configuration(String flowName, int i, boolean z, AnalyticsProduct analyticsProduct, Map extraParams) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        this.f51308a = flowName;
        this.f51309b = i;
        this.f51310c = z;
        this.d = analyticsProduct;
        this.e = extraParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendFlowContract$Configuration)) {
            return false;
        }
        BackendFlowContract$Configuration backendFlowContract$Configuration = (BackendFlowContract$Configuration) obj2;
        return Intrinsics.f(this.f51308a, backendFlowContract$Configuration.f51308a) && this.f51309b == backendFlowContract$Configuration.f51309b && this.f51310c == backendFlowContract$Configuration.f51310c && Intrinsics.f(this.d, backendFlowContract$Configuration.d) && Intrinsics.f(this.e, backendFlowContract$Configuration.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.f51309b, this.f51308a.hashCode() * 31, 31), 31, this.f51310c);
        AnalyticsProduct analyticsProduct = this.d;
        return this.e.hashCode() + ((iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51308a);
        dest.writeInt(this.f51309b);
        dest.writeInt(this.f51310c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        Iterator itT = o.t(this.e, dest);
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ BackendFlowContract$Configuration(int i, AnalyticsProduct analyticsProduct, String str) {
        this(str, 0, (i & 4) != 0, (i & 8) != 0 ? null : analyticsProduct, r0.g());
    }
}
