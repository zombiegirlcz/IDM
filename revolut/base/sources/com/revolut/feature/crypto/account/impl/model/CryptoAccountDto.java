package com.revolut.feature.crypto.account.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDto;
import com.revolut.feature.crypto.account.impl.model.AutoEarnDto;
import com.revolut.feature.crypto.account.impl.model.CryptoAvailabilityDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.b;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/account/impl/model/CryptoAccountDto;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_crypto_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class CryptoAccountDto implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f70765g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f70767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoAccountOnboardingDto f70768c;
    public final CryptoAvailabilityDto d;
    public final List e;
    public final AutoEarnDto f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoAccountDto> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70769a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f70769a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.account.impl.model.CryptoAccountDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("cryptoEntity", false);
            pluginGeneratedSerialDescriptor.j("promotions", true);
            pluginGeneratedSerialDescriptor.j("onboarding", true);
            pluginGeneratedSerialDescriptor.j("availability", true);
            pluginGeneratedSerialDescriptor.j("productOnboardings", true);
            pluginGeneratedSerialDescriptor.j("autoEarn", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = CryptoAccountDto.f70765g;
            return new KSerializer[]{v1.f247718a, nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c(CryptoAccountOnboardingDto.a.f70756a), nlm.a.c(CryptoAvailabilityDto.a.f70774a), nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c(AutoEarnDto.a.f70764a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = CryptoAccountDto.f70765g;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            List list = null;
            CryptoAccountOnboardingDto cryptoAccountOnboardingDto = null;
            CryptoAvailabilityDto cryptoAvailabilityDto = null;
            List list2 = null;
            AutoEarnDto autoEarnDto = null;
            boolean z = true;
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
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), list);
                        i |= 2;
                        break;
                    case 2:
                        cryptoAccountOnboardingDto = (CryptoAccountOnboardingDto) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CryptoAccountOnboardingDto.a.f70756a, cryptoAccountOnboardingDto);
                        i |= 4;
                        break;
                    case 3:
                        cryptoAvailabilityDto = (CryptoAvailabilityDto) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CryptoAvailabilityDto.a.f70774a, cryptoAvailabilityDto);
                        i |= 8;
                        break;
                    case 4:
                        list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (b) lazyArr[4].getValue(), list2);
                        i |= 16;
                        break;
                    case 5:
                        autoEarnDto = (AutoEarnDto) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, AutoEarnDto.a.f70764a, autoEarnDto);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CryptoAccountDto(i, strDecodeStringElement, list, cryptoAccountOnboardingDto, cryptoAvailabilityDto, list2, autoEarnDto);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            CryptoAccountDto value = (CryptoAccountDto) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = CryptoAccountDto.f70765g;
            String str = value.f70766a;
            AutoEarnDto autoEarnDto = value.f;
            List list = value.e;
            CryptoAvailabilityDto cryptoAvailabilityDto = value.d;
            CryptoAccountOnboardingDto cryptoAccountOnboardingDto = value.f70768c;
            List list2 = value.f70767b;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), list2);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || cryptoAccountOnboardingDto != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, CryptoAccountOnboardingDto.a.f70756a, cryptoAccountOnboardingDto);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || cryptoAvailabilityDto != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, CryptoAvailabilityDto.a.f70774a, cryptoAvailabilityDto);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (h) lazyArr[4].getValue(), list);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || autoEarnDto != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, AutoEarnDto.a.f70764a, autoEarnDto);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.account.impl.model.CryptoAccountDto$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f70769a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iE = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CryptoAccountPromotionDto.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            CryptoAccountOnboardingDto cryptoAccountOnboardingDto = (CryptoAccountOnboardingDto) parcel.readParcelable(CryptoAccountDto.class.getClassLoader());
            CryptoAvailabilityDto cryptoAvailabilityDtoCreateFromParcel = parcel.readInt() == 0 ? null : CryptoAvailabilityDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(CryptoAccountDto.class, parcel, arrayList2, iE, 1);
                }
            }
            return new CryptoAccountDto(string, arrayList, cryptoAccountOnboardingDto, cryptoAvailabilityDtoCreateFromParcel, arrayList2, parcel.readInt() != 0 ? AutoEarnDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAccountDto[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f70765g = new Lazy[]{null, j.c(kVar, new ja3.b(1)), null, null, j.c(kVar, new ja3.b(2)), null};
    }

    public /* synthetic */ CryptoAccountDto(int i, String str, List list, CryptoAccountOnboardingDto cryptoAccountOnboardingDto, CryptoAvailabilityDto cryptoAvailabilityDto, List list2, AutoEarnDto autoEarnDto) {
        if (1 != (i & 1)) {
            j1.f(a.f70769a.getDescriptor(), i, 1);
            throw null;
        }
        this.f70766a = str;
        if ((i & 2) == 0) {
            this.f70767b = null;
        } else {
            this.f70767b = list;
        }
        if ((i & 4) == 0) {
            this.f70768c = null;
        } else {
            this.f70768c = cryptoAccountOnboardingDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cryptoAvailabilityDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = autoEarnDto;
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
        if (!(obj2 instanceof CryptoAccountDto)) {
            return false;
        }
        CryptoAccountDto cryptoAccountDto = (CryptoAccountDto) obj2;
        return Intrinsics.f(this.f70766a, cryptoAccountDto.f70766a) && Intrinsics.f(this.f70767b, cryptoAccountDto.f70767b) && Intrinsics.f(this.f70768c, cryptoAccountDto.f70768c) && Intrinsics.f(this.d, cryptoAccountDto.d) && Intrinsics.f(this.e, cryptoAccountDto.e) && Intrinsics.f(this.f, cryptoAccountDto.f);
    }

    public final int hashCode() {
        int iHashCode = this.f70766a.hashCode() * 31;
        List list = this.f70767b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CryptoAccountOnboardingDto cryptoAccountOnboardingDto = this.f70768c;
        int iHashCode3 = (iHashCode2 + (cryptoAccountOnboardingDto == null ? 0 : cryptoAccountOnboardingDto.hashCode())) * 31;
        CryptoAvailabilityDto cryptoAvailabilityDto = this.d;
        int iHashCode4 = (iHashCode3 + (cryptoAvailabilityDto == null ? 0 : Boolean.hashCode(cryptoAvailabilityDto.f70773a))) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AutoEarnDto autoEarnDto = this.f;
        return iHashCode5 + (autoEarnDto != null ? Boolean.hashCode(autoEarnDto.f70763a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70766a);
        List list = this.f70767b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((CryptoAccountPromotionDto) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeParcelable(this.f70768c, i);
        CryptoAvailabilityDto cryptoAvailabilityDto = this.d;
        if (cryptoAvailabilityDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoAvailabilityDto.writeToParcel(dest, i);
        }
        List list2 = this.e;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeParcelable((Parcelable) itQ2.next(), i);
            }
        }
        AutoEarnDto autoEarnDto = this.f;
        if (autoEarnDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autoEarnDto.writeToParcel(dest, i);
        }
    }

    public CryptoAccountDto(String cryptoEntity, ArrayList arrayList, CryptoAccountOnboardingDto cryptoAccountOnboardingDto, CryptoAvailabilityDto cryptoAvailabilityDto, ArrayList arrayList2, AutoEarnDto autoEarnDto) {
        Intrinsics.checkNotNullParameter(cryptoEntity, "cryptoEntity");
        this.f70766a = cryptoEntity;
        this.f70767b = arrayList;
        this.f70768c = cryptoAccountOnboardingDto;
        this.d = cryptoAvailabilityDto;
        this.e = arrayList2;
        this.f = autoEarnDto;
    }
}
