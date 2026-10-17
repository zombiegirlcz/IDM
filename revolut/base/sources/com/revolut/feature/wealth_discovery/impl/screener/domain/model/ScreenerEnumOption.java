package com.revolut.feature.wealth_discovery.impl.screener.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerEnumOption;", "", "T", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerEnumOption<T extends Enum<T>> implements ScreenerOption {

    @NotNull
    public static final Parcelable.Creator<ScreenerEnumOption<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum f96153a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerEnumOption((Enum) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerEnumOption[i];
        }
    }

    public ScreenerEnumOption(Enum value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f96153a = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ScreenerEnumOption) && Intrinsics.f(this.f96153a, ((ScreenerEnumOption) obj2).f96153a);
    }

    @Override // com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerOption
    /* JADX INFO: renamed from: getName */
    public final String getF96152a() {
        return this.f96153a.name();
    }

    public final int hashCode() {
        return this.f96153a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96153a);
    }
}
