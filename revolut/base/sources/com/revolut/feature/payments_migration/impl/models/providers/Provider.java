package com.revolut.feature.payments_migration.impl.models.providers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import te0.w;
import x5a.b;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/Provider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "x5a/b", "PointsRewardRate", "CashAmount", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class Provider implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80213c;
    public final String d;
    public final String e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f80214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f80215h;
    public final PointsRewardRate i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<Provider> CREATOR = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f80210j = {null, null, null, null, null, j.c(k.PUBLICATION, new x1e.g(25)), null, null, null};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/Provider$CashAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class CashAmount implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f80216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80217b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<CashAmount> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f80218a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f80218a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments_migration.impl.models.providers.Provider.CashAmount", aVar, 2);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("currency", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{t0.f247706a, v1.f247718a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                long jDecodeLongElement = 0;
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new CashAmount(i, jDecodeLongElement, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                CashAmount value = (CashAmount) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f80216a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f80217b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.Provider$CashAmount$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f80218a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashAmount(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashAmount[i];
            }
        }

        public /* synthetic */ CashAmount(int i, long j2, String str) {
            if (3 != (i & 3)) {
                j1.f(a.f80218a.getDescriptor(), i, 3);
                throw null;
            }
            this.f80216a = j2;
            this.f80217b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashAmount)) {
                return false;
            }
            CashAmount cashAmount = (CashAmount) obj2;
            return this.f80216a == cashAmount.f80216a && Intrinsics.f(this.f80217b, cashAmount.f80217b);
        }

        public final int hashCode() {
            return this.f80217b.hashCode() + (Long.hashCode(this.f80216a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f80216a);
            dest.writeString(this.f80217b);
        }

        public CashAmount(long j2, String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f80216a = j2;
            this.f80217b = currency;
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80223a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f80223a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments_migration.impl.models.providers.Provider", aVar, 9);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("description", true);
            pluginGeneratedSerialDescriptor.j("asset", true);
            pluginGeneratedSerialDescriptor.j("url", false);
            pluginGeneratedSerialDescriptor.j("paymentType", false);
            pluginGeneratedSerialDescriptor.j("cover", true);
            pluginGeneratedSerialDescriptor.j("alreadyMoved", true);
            pluginGeneratedSerialDescriptor.j("pointsRewardRate", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = Provider.f80210j;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, lazyArr[5].getValue(), nlm.a.c(v1Var), h.f247648a, nlm.a.c(PointsRewardRate.a.f80222a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Provider.f80210j;
            dVarBeginStructure.getClass();
            PointsRewardRate pointsRewardRate = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            String str2 = null;
            String strDecodeStringElement3 = null;
            b bVar = null;
            String str3 = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                        break;
                    case 3:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), bVar);
                        i |= 32;
                        break;
                    case 6:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str3);
                        i |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i |= 128;
                        break;
                    case 8:
                        pointsRewardRate = (PointsRewardRate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, PointsRewardRate.a.f80222a, pointsRewardRate);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new Provider(i, strDecodeStringElement, strDecodeStringElement2, str, str2, strDecodeStringElement3, bVar, str3, zDecodeBooleanElement, pointsRewardRate);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            Provider value = (Provider) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Provider.f80210j;
            String str = value.f80211a;
            PointsRewardRate pointsRewardRate = value.i;
            boolean z = value.f80215h;
            String str2 = value.f80214g;
            String str3 = value.d;
            String str4 = value.f80213c;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f80212b);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str4);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
            }
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str2);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || pointsRewardRate != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, PointsRewardRate.a.f80222a, pointsRewardRate);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.Provider$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f80223a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Provider(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PointsRewardRate.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Provider[i];
        }
    }

    public /* synthetic */ Provider(int i, String str, String str2, String str3, String str4, String str5, b bVar, String str6, boolean z, PointsRewardRate pointsRewardRate) {
        if (51 != (i & 51)) {
            j1.f(a.f80223a.getDescriptor(), i, 51);
            throw null;
        }
        this.f80211a = str;
        this.f80212b = str2;
        if ((i & 4) == 0) {
            this.f80213c = null;
        } else {
            this.f80213c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        this.f = bVar;
        if ((i & 64) == 0) {
            this.f80214g = null;
        } else {
            this.f80214g = str6;
        }
        if ((i & 128) == 0) {
            this.f80215h = false;
        } else {
            this.f80215h = z;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = pointsRewardRate;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Provider)) {
            return false;
        }
        Provider provider = (Provider) obj2;
        return Intrinsics.f(this.f80211a, provider.f80211a) && Intrinsics.f(this.f80212b, provider.f80212b) && Intrinsics.f(this.f80213c, provider.f80213c) && Intrinsics.f(this.d, provider.d) && Intrinsics.f(this.e, provider.e) && this.f == provider.f && Intrinsics.f(this.f80214g, provider.f80214g) && this.f80215h == provider.f80215h && Intrinsics.f(this.i, provider.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f80211a.hashCode() * 31, 31, this.f80212b);
        String str = this.f80213c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (this.f.hashCode() + p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e)) * 31;
        String str3 = this.f80214g;
        int iC2 = j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f80215h);
        PointsRewardRate pointsRewardRate = this.i;
        return iC2 + (pointsRewardRate != null ? pointsRewardRate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80211a);
        dest.writeString(this.f80212b);
        dest.writeString(this.f80213c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.f80214g);
        dest.writeInt(this.f80215h ? 1 : 0);
        PointsRewardRate pointsRewardRate = this.i;
        if (pointsRewardRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pointsRewardRate.writeToParcel(dest, i);
        }
    }

    public Provider(String id10, String name, String str, String str2, String url2, b paymentType, String str3, boolean z, PointsRewardRate pointsRewardRate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        this.f80211a = id10;
        this.f80212b = name;
        this.f80213c = str;
        this.d = str2;
        this.e = url2;
        this.f = paymentType;
        this.f80214g = str3;
        this.f80215h = z;
        this.i = pointsRewardRate;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/Provider$PointsRewardRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class PointsRewardRate implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CashAmount f80220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f80221c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<PointsRewardRate> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f80222a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f80222a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments_migration.impl.models.providers.Provider.PointsRewardRate", aVar, 2);
                pluginGeneratedSerialDescriptor.j("pointsReward", false);
                pluginGeneratedSerialDescriptor.j("cashAmount", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, CashAmount.a.f80218a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                CashAmount cashAmount = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        cashAmount = (CashAmount) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, CashAmount.a.f80218a, cashAmount);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new PointsRewardRate(i, strDecodeStringElement, cashAmount);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                PointsRewardRate value = (PointsRewardRate) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f80219a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, CashAmount.a.f80218a, value.f80220b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.Provider$PointsRewardRate$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f80222a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PointsRewardRate(parcel.readString(), CashAmount.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PointsRewardRate[i];
            }
        }

        public /* synthetic */ PointsRewardRate(int i, String str, CashAmount cashAmount) {
            if (3 != (i & 3)) {
                j1.f(a.f80222a.getDescriptor(), i, 3);
                throw null;
            }
            this.f80219a = str;
            this.f80220b = cashAmount;
            final int i2 = 1;
            this.f80221c = w.y0(new Function0(this) { // from class: x5a.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Provider.PointsRewardRate f302923b;

                {
                    this.f302923b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            Provider.CashAmount cashAmount2 = this.f302923b.f80220b;
                            long j2 = cashAmount2.f80216a;
                            xi0.a aVar = xi0.b.Companion;
                            String str2 = cashAmount2.f80217b;
                            aVar.getClass();
                            return new dj0.d(j2, xi0.a.a(str2));
                        default:
                            Provider.CashAmount cashAmount3 = this.f302923b.f80220b;
                            long j3 = cashAmount3.f80216a;
                            xi0.a aVar2 = xi0.b.Companion;
                            String str3 = cashAmount3.f80217b;
                            aVar2.getClass();
                            return new dj0.d(j3, xi0.a.a(str3));
                    }
                }
            });
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PointsRewardRate)) {
                return false;
            }
            PointsRewardRate pointsRewardRate = (PointsRewardRate) obj2;
            return Intrinsics.f(this.f80219a, pointsRewardRate.f80219a) && Intrinsics.f(this.f80220b, pointsRewardRate.f80220b);
        }

        public final int hashCode() {
            return this.f80220b.hashCode() + (this.f80219a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80219a);
            this.f80220b.writeToParcel(dest, i);
        }

        public PointsRewardRate(String pointsReward, CashAmount cashAmount) {
            Intrinsics.checkNotNullParameter(pointsReward, "pointsReward");
            Intrinsics.checkNotNullParameter(cashAmount, "cashAmount");
            this.f80219a = pointsReward;
            this.f80220b = cashAmount;
            final int i = 0;
            this.f80221c = w.y0(new Function0(this) { // from class: x5a.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Provider.PointsRewardRate f302923b;

                {
                    this.f302923b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            Provider.CashAmount cashAmount2 = this.f302923b.f80220b;
                            long j2 = cashAmount2.f80216a;
                            xi0.a aVar = xi0.b.Companion;
                            String str2 = cashAmount2.f80217b;
                            aVar.getClass();
                            return new dj0.d(j2, xi0.a.a(str2));
                        default:
                            Provider.CashAmount cashAmount3 = this.f302923b.f80220b;
                            long j3 = cashAmount3.f80216a;
                            xi0.a aVar2 = xi0.b.Companion;
                            String str3 = cashAmount3.f80217b;
                            aVar2.getClass();
                            return new dj0.d(j3, xi0.a.a(str3));
                    }
                }
            });
        }
    }
}
