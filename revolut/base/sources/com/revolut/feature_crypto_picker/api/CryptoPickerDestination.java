package com.revolut.feature_crypto_picker.api;

import aii.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import g0i.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/feature_crypto_picker/api/CryptoPickerDestination;", "Laii/u;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "CryptoPickerInputData", "g0i/a", "g0i/b", "CryptoPickerConfig", "feature_crypto_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoPickerDestination implements u, KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoPickerDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoPickerInputData f96801a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_picker/api/CryptoPickerDestination$CryptoPickerConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoPickerConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CryptoPickerConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f96803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96804c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoPickerConfig(b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoPickerConfig[i];
            }
        }

        public CryptoPickerConfig() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoPickerConfig)) {
                return false;
            }
            CryptoPickerConfig cryptoPickerConfig = (CryptoPickerConfig) obj2;
            return this.f96802a == cryptoPickerConfig.f96802a && this.f96803b == cryptoPickerConfig.f96803b && this.f96804c == cryptoPickerConfig.f96804c && this.d == cryptoPickerConfig.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f96802a.hashCode() * 31, 31, this.f96803b), 31, this.f96804c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96802a.name());
            dest.writeInt(this.f96803b ? 1 : 0);
            dest.writeInt(this.f96804c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }

        public CryptoPickerConfig(b selectionMode, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            this.f96802a = selectionMode;
            this.f96803b = z;
            this.f96804c = z3;
            this.d = z4;
        }

        public /* synthetic */ CryptoPickerConfig(int i) {
            this(b.MULTI, true, true, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_picker/api/CryptoPickerDestination$CryptoPickerInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoPickerInputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<CryptoPickerInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f96805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f96806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96807c;
        public final CryptoPickerConfig d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iC2 = 0;
                while (iC2 != i2) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, 1);
                }
                return new CryptoPickerInputData(arrayList, arrayList2, parcel.readInt() != 0, CryptoPickerConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoPickerInputData[i];
            }
        }

        public CryptoPickerInputData() {
            this((List) null, (List) null, (CryptoPickerConfig) null, 15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoPickerInputData)) {
                return false;
            }
            CryptoPickerInputData cryptoPickerInputData = (CryptoPickerInputData) obj2;
            return Intrinsics.f(this.f96805a, cryptoPickerInputData.f96805a) && Intrinsics.f(this.f96806b, cryptoPickerInputData.f96806b) && this.f96807c == cryptoPickerInputData.f96807c && Intrinsics.f(this.d, cryptoPickerInputData.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c(p.a.d(this.f96805a.hashCode() * 31, 31, this.f96806b), 31, this.f96807c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f96805a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = p.a.v(this.f96806b, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            dest.writeInt(this.f96807c ? 1 : 0);
            this.d.writeToParcel(dest, i);
        }

        public CryptoPickerInputData(List preselectedCurrencies, List ignoredCurrencies, boolean z, CryptoPickerConfig config) {
            Intrinsics.checkNotNullParameter(preselectedCurrencies, "preselectedCurrencies");
            Intrinsics.checkNotNullParameter(ignoredCurrencies, "ignoredCurrencies");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f96805a = preselectedCurrencies;
            this.f96806b = ignoredCurrencies;
            this.f96807c = z;
            this.d = config;
        }

        public CryptoPickerInputData(List list, List list2, CryptoPickerConfig cryptoPickerConfig, int i) {
            this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? f0.f322471a : list2, (i & 4) == 0, (i & 8) != 0 ? new CryptoPickerConfig(0) : cryptoPickerConfig);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoPickerDestination(CryptoPickerInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoPickerDestination[i];
        }
    }

    public CryptoPickerDestination(CryptoPickerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f96801a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoPickerDestination) && Intrinsics.f(this.f96801a, ((CryptoPickerDestination) obj2).f96801a);
    }

    public final int hashCode() {
        return this.f96801a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96801a.writeToParcel(dest, i);
    }

    public CryptoPickerDestination() {
        this(new CryptoPickerInputData((List) null, (List) null, (CryptoPickerConfig) null, 15));
    }
}
