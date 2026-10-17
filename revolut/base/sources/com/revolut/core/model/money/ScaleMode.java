package com.revolut.core.model.money;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/model/money/ScaleMode;", "Landroid/os/Parcelable;", "SimpleLen", "PrettyFormat", "CryptoHoldingFormat", "TradingPrecise", "Lcom/revolut/core/model/money/ScaleMode$CryptoHoldingFormat;", "Lcom/revolut/core/model/money/ScaleMode$PrettyFormat;", "Lcom/revolut/core/model/money/ScaleMode$SimpleLen;", "Lcom/revolut/core/model/money/ScaleMode$TradingPrecise;", "core_currency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScaleMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/money/ScaleMode$CryptoHoldingFormat;", "Lcom/revolut/core/model/money/ScaleMode;", "<init>", "()V", "core_currency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoHoldingFormat implements ScaleMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoHoldingFormat f51439a = new CryptoHoldingFormat();

        @NotNull
        public static final Parcelable.Creator<CryptoHoldingFormat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoHoldingFormat.f51439a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoHoldingFormat[i];
            }
        }

        private CryptoHoldingFormat() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/money/ScaleMode$PrettyFormat;", "Lcom/revolut/core/model/money/ScaleMode;", "<init>", "()V", "core_currency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrettyFormat implements ScaleMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrettyFormat f51440a = new PrettyFormat();

        @NotNull
        public static final Parcelable.Creator<PrettyFormat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrettyFormat.f51440a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrettyFormat[i];
            }
        }

        private PrettyFormat() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/money/ScaleMode$SimpleLen;", "Lcom/revolut/core/model/money/ScaleMode;", "", "toString", "()Ljava/lang/String;", "core_currency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SimpleLen implements ScaleMode {

        @NotNull
        public static final Parcelable.Creator<SimpleLen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RoundingMode f51442b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SimpleLen(parcel.readInt(), RoundingMode.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimpleLen[i];
            }
        }

        public SimpleLen() {
            this(0, 3);
        }

        public static SimpleLen a(SimpleLen simpleLen, int i) {
            RoundingMode roundingMode = simpleLen.f51442b;
            Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
            return new SimpleLen(i, roundingMode);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF51441a() {
            return this.f51441a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final RoundingMode getF51442b() {
            return this.f51442b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SimpleLen)) {
                return false;
            }
            SimpleLen simpleLen = (SimpleLen) obj2;
            return this.f51441a == simpleLen.f51441a && this.f51442b == simpleLen.f51442b;
        }

        public final int hashCode() {
            return this.f51442b.hashCode() + (Integer.hashCode(this.f51441a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51441a);
            dest.writeString(this.f51442b.name());
        }

        public SimpleLen(int i, RoundingMode roundingMode) {
            Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
            this.f51441a = i;
            this.f51442b = roundingMode;
        }

        public /* synthetic */ SimpleLen(int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, RoundingMode.FLOOR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/money/ScaleMode$TradingPrecise;", "Lcom/revolut/core/model/money/ScaleMode;", "<init>", "()V", "core_currency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TradingPrecise implements ScaleMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TradingPrecise f51443a = new TradingPrecise();

        @NotNull
        public static final Parcelable.Creator<TradingPrecise> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TradingPrecise.f51443a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingPrecise[i];
            }
        }

        private TradingPrecise() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
