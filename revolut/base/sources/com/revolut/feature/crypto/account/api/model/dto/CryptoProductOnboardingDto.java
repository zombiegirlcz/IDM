package com.revolut.feature.crypto.account.api.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.account.api.model.dto.CryptoProductOnboardingDetailsDto;
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
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/account/api/model/dto/CryptoProductOnboardingDto;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_crypto_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class CryptoProductOnboardingDto implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoProductOnboardingDetailsDto f70761c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoProductOnboardingDto> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70762a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f70762a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.account.api.model.dto.CryptoProductOnboardingDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("product", false);
            pluginGeneratedSerialDescriptor.j("status", false);
            pluginGeneratedSerialDescriptor.j("details", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(CryptoProductOnboardingDetailsDto.a.f70758a);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, kSerializerC};
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
            String strDecodeStringElement2 = null;
            CryptoProductOnboardingDetailsDto cryptoProductOnboardingDetailsDto = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    cryptoProductOnboardingDetailsDto = (CryptoProductOnboardingDetailsDto) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CryptoProductOnboardingDetailsDto.a.f70758a, cryptoProductOnboardingDetailsDto);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CryptoProductOnboardingDto(i, strDecodeStringElement, strDecodeStringElement2, cryptoProductOnboardingDetailsDto);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            CryptoProductOnboardingDto value = (CryptoProductOnboardingDto) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f70759a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f70760b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, CryptoProductOnboardingDetailsDto.a.f70758a, value.f70761c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.account.api.model.dto.CryptoProductOnboardingDto$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f70762a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoProductOnboardingDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CryptoProductOnboardingDetailsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoProductOnboardingDto[i];
        }
    }

    public /* synthetic */ CryptoProductOnboardingDto(int i, String str, String str2, CryptoProductOnboardingDetailsDto cryptoProductOnboardingDetailsDto) {
        if (7 != (i & 7)) {
            j1.f(a.f70762a.getDescriptor(), i, 7);
            throw null;
        }
        this.f70759a = str;
        this.f70760b = str2;
        this.f70761c = cryptoProductOnboardingDetailsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoProductOnboardingDto)) {
            return false;
        }
        CryptoProductOnboardingDto cryptoProductOnboardingDto = (CryptoProductOnboardingDto) obj2;
        return Intrinsics.f(this.f70759a, cryptoProductOnboardingDto.f70759a) && Intrinsics.f(this.f70760b, cryptoProductOnboardingDto.f70760b) && Intrinsics.f(this.f70761c, cryptoProductOnboardingDto.f70761c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f70759a.hashCode() * 31, 31, this.f70760b);
        CryptoProductOnboardingDetailsDto cryptoProductOnboardingDetailsDto = this.f70761c;
        return iC + (cryptoProductOnboardingDetailsDto == null ? 0 : cryptoProductOnboardingDetailsDto.f70757a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70759a);
        dest.writeString(this.f70760b);
        CryptoProductOnboardingDetailsDto cryptoProductOnboardingDetailsDto = this.f70761c;
        if (cryptoProductOnboardingDetailsDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoProductOnboardingDetailsDto.writeToParcel(dest, i);
        }
    }

    public CryptoProductOnboardingDto(String product, String status, CryptoProductOnboardingDetailsDto cryptoProductOnboardingDetailsDto) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f70759a = product;
        this.f70760b = status;
        this.f70761c = cryptoProductOnboardingDetailsDto;
    }
}
