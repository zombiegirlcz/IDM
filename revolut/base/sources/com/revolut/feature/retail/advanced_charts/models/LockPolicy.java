package com.revolut.feature.retail.advanced_charts.models;

import android.os.Parcel;
import android.os.Parcelable;
import d1b.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/models/LockPolicy;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LockPolicy implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f82088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82089b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<LockPolicy> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LockPolicy f82087c = new LockPolicy(3);

    /* JADX INFO: renamed from: com.revolut.feature.retail.advanced_charts.models.LockPolicy$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 == i) {
                    break;
                }
                c cVarValueOf = c.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z = false;
                }
                linkedHashMap.put(cVarValueOf, Boolean.valueOf(z));
                i2++;
            }
            return new LockPolicy(linkedHashMap, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LockPolicy[i];
        }
    }

    static {
        new LockPolicy(1);
    }

    public LockPolicy() {
        this(3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LockPolicy)) {
            return false;
        }
        LockPolicy lockPolicy = (LockPolicy) obj2;
        return Intrinsics.f(this.f82088a, lockPolicy.f82088a) && this.f82089b == lockPolicy.f82089b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f82089b) + (this.f82088a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itT = o.t(this.f82088a, dest);
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            dest.writeString(((c) entry.getKey()).name());
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.f82089b ? 1 : 0);
    }

    public LockPolicy(Map overrides, boolean z) {
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.f82088a = overrides;
        this.f82089b = z;
    }

    public /* synthetic */ LockPolicy(int i) {
        this(r0.g(), (i & 2) == 0);
    }
}
