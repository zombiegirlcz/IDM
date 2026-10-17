package com.revolut.feature.crypto.account.api.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/account/api/model/dto/CryptoAccountOnboardingDetailsDto;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_crypto_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class CryptoAccountOnboardingDetailsDto implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70751c;
    public final boolean d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoAccountOnboardingDetailsDto> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70752a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f70752a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDetailsDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("micaPromptWorkflowId", false);
            pluginGeneratedSerialDescriptor.j("micaPromptFormId", false);
            pluginGeneratedSerialDescriptor.j("rfiWorkflowId", false);
            pluginGeneratedSerialDescriptor.j("remediationRequired", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String str = null;
            String str2 = null;
            String str3 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i |= 2;
                } else if (iD == 2) {
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CryptoAccountOnboardingDetailsDto(i, str, zDecodeBooleanElement, str2, str3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            CryptoAccountOnboardingDetailsDto value = (CryptoAccountOnboardingDetailsDto) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            v1 v1Var = v1.f247718a;
            String str = value.f70749a;
            boolean z = value.d;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, str);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f70750b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f70751c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDetailsDto$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f70752a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAccountOnboardingDetailsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAccountOnboardingDetailsDto[i];
        }
    }

    public /* synthetic */ CryptoAccountOnboardingDetailsDto(int i, String str, boolean z, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f70752a.getDescriptor(), i, 7);
            throw null;
        }
        this.f70749a = str;
        this.f70750b = str2;
        this.f70751c = str3;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
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
        if (!(obj2 instanceof CryptoAccountOnboardingDetailsDto)) {
            return false;
        }
        CryptoAccountOnboardingDetailsDto cryptoAccountOnboardingDetailsDto = (CryptoAccountOnboardingDetailsDto) obj2;
        return Intrinsics.f(this.f70749a, cryptoAccountOnboardingDetailsDto.f70749a) && Intrinsics.f(this.f70750b, cryptoAccountOnboardingDetailsDto.f70750b) && Intrinsics.f(this.f70751c, cryptoAccountOnboardingDetailsDto.f70751c) && this.d == cryptoAccountOnboardingDetailsDto.d;
    }

    public final int hashCode() {
        String str = this.f70749a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70750b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70751c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70749a);
        dest.writeString(this.f70750b);
        dest.writeString(this.f70751c);
        dest.writeInt(this.d ? 1 : 0);
    }

    public CryptoAccountOnboardingDetailsDto(String str, String str2, String str3, boolean z) {
        this.f70749a = str;
        this.f70750b = str2;
        this.f70751c = str3;
        this.d = z;
    }
}
