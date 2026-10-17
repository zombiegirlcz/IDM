package com.revolut.feature.invest.smart_notifications.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import dii.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/api/domain/InsightPublicationPriceDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Ldii/g;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsightPublicationPriceDescriptor implements ParcelableControllerDescriptor<g> {

    @NotNull
    public static final Parcelable.Creator<InsightPublicationPriceDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76421a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsightPublicationPriceDescriptor(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsightPublicationPriceDescriptor[i];
        }
    }

    public InsightPublicationPriceDescriptor(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f76421a = symbol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InsightPublicationPriceDescriptor) && Intrinsics.f(this.f76421a, ((InsightPublicationPriceDescriptor) obj2).f76421a);
    }

    public final int hashCode() {
        return this.f76421a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76421a);
    }
}
