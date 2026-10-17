package com.revolut.feature.security_hub.impl.repository;

import android.os.Parcel;
import android.os.Parcelable;
import cuc.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/OutboundTransactionLimitGroupConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OutboundTransactionLimitGroupConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OutboundTransactionLimitGroupConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f85492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85493c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OutboundTransactionLimitGroupConfig(parcel.readString(), h.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OutboundTransactionLimitGroupConfig[i];
        }
    }

    public OutboundTransactionLimitGroupConfig(String name, h limitType, String label, String icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f85491a = name;
        this.f85492b = limitType;
        this.f85493c = label;
        this.d = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OutboundTransactionLimitGroupConfig)) {
            return false;
        }
        OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig = (OutboundTransactionLimitGroupConfig) obj2;
        return Intrinsics.f(this.f85491a, outboundTransactionLimitGroupConfig.f85491a) && this.f85492b == outboundTransactionLimitGroupConfig.f85492b && Intrinsics.f(this.f85493c, outboundTransactionLimitGroupConfig.f85493c) && Intrinsics.f(this.d, outboundTransactionLimitGroupConfig.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f85492b.hashCode() + (this.f85491a.hashCode() * 31)) * 31, 31, this.f85493c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85491a);
        dest.writeString(this.f85492b.name());
        dest.writeString(this.f85493c);
        dest.writeString(this.d);
    }
}
