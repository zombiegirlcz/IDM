package com.revolut.feature.defi.common.models.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigInteger;
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
import qlm.f0;
import qlm.j1;
import qlm.n0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/defi/common/models/dto/TokenAmountDto;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class TokenAmountDto implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f71706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71707b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TokenAmountDto> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71708a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f71708a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.models.dto.TokenAmountDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("decimals", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{ie0.b.f160589a, n0.f247680a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            BigInteger bigInteger = null;
            boolean z = true;
            int i = 0;
            int iDecodeIntElement = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    bigInteger = (BigInteger) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.b.f160589a, bigInteger);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new TokenAmountDto(i, iDecodeIntElement, bigInteger);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            TokenAmountDto value = (TokenAmountDto) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.b.f160589a, value.f71706a);
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f71707b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.defi.common.models.dto.TokenAmountDto$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f71708a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TokenAmountDto((BigInteger) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TokenAmountDto[i];
        }
    }

    public /* synthetic */ TokenAmountDto(int i, int i2, BigInteger bigInteger) {
        if (3 != (i & 3)) {
            j1.f(a.f71708a.getDescriptor(), i, 3);
            throw null;
        }
        this.f71706a = bigInteger;
        this.f71707b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TokenAmountDto)) {
            return false;
        }
        TokenAmountDto tokenAmountDto = (TokenAmountDto) obj2;
        return Intrinsics.f(this.f71706a, tokenAmountDto.f71706a) && this.f71707b == tokenAmountDto.f71707b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71707b) + (this.f71706a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71706a);
        dest.writeInt(this.f71707b);
    }

    public TokenAmountDto(BigInteger amount, int i) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f71706a = amount;
        this.f71707b = i;
    }
}
