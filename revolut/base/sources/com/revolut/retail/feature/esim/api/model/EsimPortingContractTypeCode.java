package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPortingContractTypeCode;", "Landroid/os/Parcelable;", "Companion", "a", "value", "", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimPortingContractTypeCode implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100415a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<EsimPortingContractTypeCode> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.retail.feature.esim.api.model.EsimPortingContractTypeCode$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new EsimPortingContractTypeCode(v7.t(parcel, "parcel", "value"));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPortingContractTypeCode[i];
        }
    }

    public /* synthetic */ EsimPortingContractTypeCode(String str) {
        this.f100415a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof EsimPortingContractTypeCode) {
            return Intrinsics.f(this.f100415a, ((EsimPortingContractTypeCode) obj2).f100415a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f100415a.hashCode();
    }

    public final String toString() {
        return a.p("EsimPortingContractTypeCode(value=", this.f100415a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100415a);
    }
}
