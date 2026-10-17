package com.revolut.feature.crypto.account.api.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDetailsDto;
import kotlin.Metadata;
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
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/account/api/model/dto/CryptoAccountOnboardingDto;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_crypto_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class CryptoAccountOnboardingDto implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70755c;
    public final CryptoAccountOnboardingDetailsDto d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoAccountOnboardingDto> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70756a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f70756a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("status", false);
            pluginGeneratedSerialDescriptor.j("required", false);
            pluginGeneratedSerialDescriptor.j("flowType", true);
            pluginGeneratedSerialDescriptor.j("details", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, h.f247648a, nlm.a.c(v1Var), nlm.a.c(CryptoAccountOnboardingDetailsDto.a.f70752a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String strDecodeStringElement = null;
            String str = null;
            CryptoAccountOnboardingDetailsDto cryptoAccountOnboardingDetailsDto = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    cryptoAccountOnboardingDetailsDto = (CryptoAccountOnboardingDetailsDto) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CryptoAccountOnboardingDetailsDto.a.f70752a, cryptoAccountOnboardingDetailsDto);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CryptoAccountOnboardingDto(i, strDecodeStringElement, zDecodeBooleanElement, str, cryptoAccountOnboardingDetailsDto);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            CryptoAccountOnboardingDto value = (CryptoAccountOnboardingDto) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            String str = value.f70753a;
            String str2 = value.f70755c;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f70754b);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
            }
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, CryptoAccountOnboardingDetailsDto.a.f70752a, value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDto$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f70756a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAccountOnboardingDto(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : CryptoAccountOnboardingDetailsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAccountOnboardingDto[i];
        }
    }

    public /* synthetic */ CryptoAccountOnboardingDto(int i, String str, boolean z, String str2, CryptoAccountOnboardingDetailsDto cryptoAccountOnboardingDetailsDto) {
        if (11 != (i & 11)) {
            j1.f(a.f70756a.getDescriptor(), i, 11);
            throw null;
        }
        this.f70753a = str;
        this.f70754b = z;
        if ((i & 4) == 0) {
            this.f70755c = null;
        } else {
            this.f70755c = str2;
        }
        this.d = cryptoAccountOnboardingDetailsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAccountOnboardingDto)) {
            return false;
        }
        CryptoAccountOnboardingDto cryptoAccountOnboardingDto = (CryptoAccountOnboardingDto) obj2;
        return Intrinsics.f(this.f70753a, cryptoAccountOnboardingDto.f70753a) && this.f70754b == cryptoAccountOnboardingDto.f70754b && Intrinsics.f(this.f70755c, cryptoAccountOnboardingDto.f70755c) && Intrinsics.f(this.d, cryptoAccountOnboardingDto.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f70753a.hashCode() * 31, 31, this.f70754b);
        String str = this.f70755c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        CryptoAccountOnboardingDetailsDto cryptoAccountOnboardingDetailsDto = this.d;
        return iHashCode + (cryptoAccountOnboardingDetailsDto != null ? cryptoAccountOnboardingDetailsDto.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70753a);
        dest.writeInt(this.f70754b ? 1 : 0);
        dest.writeString(this.f70755c);
        CryptoAccountOnboardingDetailsDto cryptoAccountOnboardingDetailsDto = this.d;
        if (cryptoAccountOnboardingDetailsDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoAccountOnboardingDetailsDto.writeToParcel(dest, i);
        }
    }

    public CryptoAccountOnboardingDto(String status, boolean z, String str, CryptoAccountOnboardingDetailsDto cryptoAccountOnboardingDetailsDto) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f70753a = status;
        this.f70754b = z;
        this.f70755c = str;
        this.d = cryptoAccountOnboardingDetailsDto;
    }
}
