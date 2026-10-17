package com.revolut.feature.acquiring.card_reader.data.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import fa1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.d0;
import lg.b;
import nkm.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/data/api/domain/model/CardReaderDevice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "name", "b", "address", "feature_acquiring_card_reader_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardReaderDevice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardReaderDevice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("address")
    @NotNull
    private final String address;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardReaderDevice(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderDevice[i];
        }
    }

    public CardReaderDevice(String name, String address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.name = name;
        this.address = address;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final String b() {
        return d0.H0(d0.g0(this.name, c())).toString();
    }

    public final String c() {
        MatchResult matchResult = (MatchResult) y.w(Regex.c(i.f133189a, this.name));
        String value = matchResult != null ? matchResult.getValue() : null;
        return value == null ? "" : value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardReaderDevice)) {
            return false;
        }
        CardReaderDevice cardReaderDevice = (CardReaderDevice) obj2;
        return Intrinsics.f(this.name, cardReaderDevice.name) && Intrinsics.f(this.address, cardReaderDevice.address);
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.address.hashCode() + (this.name.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.address);
    }
}
