package com.revolut.feature.crypto.exchange.fees.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.exchange.fees.impl.model.TieredPricingFacade;
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
import qlm.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/model/CryptoExchangeFeesFacadeV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class CryptoExchangeFeesFacadeV2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f70828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TieredPricingFacade f70829b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFeesFacadeV2> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70830a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f70830a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacadeV2", aVar, 2);
            pluginGeneratedSerialDescriptor.j("currentFeePercentage", false);
            pluginGeneratedSerialDescriptor.j("tieredPricing", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{x.f247723a, nlm.a.c(TieredPricingFacade.a.f70834a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            double dDecodeDoubleElement = 0.0d;
            TieredPricingFacade tieredPricingFacade = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    tieredPricingFacade = (TieredPricingFacade) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TieredPricingFacade.a.f70834a, tieredPricingFacade);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CryptoExchangeFeesFacadeV2(i, dDecodeDoubleElement, tieredPricingFacade);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            CryptoExchangeFeesFacadeV2 value = (CryptoExchangeFeesFacadeV2) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            double d = value.f70828a;
            TieredPricingFacade tieredPricingFacade = value.f70829b;
            compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 0, d);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || tieredPricingFacade != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, TieredPricingFacade.a.f70834a, tieredPricingFacade);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacadeV2$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f70830a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangeFeesFacadeV2(parcel.readDouble(), parcel.readInt() == 0 ? null : TieredPricingFacade.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFeesFacadeV2[i];
        }
    }

    public CryptoExchangeFeesFacadeV2(double d, TieredPricingFacade tieredPricingFacade) {
        this.f70828a = d;
        this.f70829b = tieredPricingFacade;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeFeesFacadeV2)) {
            return false;
        }
        CryptoExchangeFeesFacadeV2 cryptoExchangeFeesFacadeV2 = (CryptoExchangeFeesFacadeV2) obj2;
        return Double.compare(this.f70828a, cryptoExchangeFeesFacadeV2.f70828a) == 0 && Intrinsics.f(this.f70829b, cryptoExchangeFeesFacadeV2.f70829b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f70828a) * 31;
        TieredPricingFacade tieredPricingFacade = this.f70829b;
        return iHashCode + (tieredPricingFacade == null ? 0 : tieredPricingFacade.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f70828a);
        TieredPricingFacade tieredPricingFacade = this.f70829b;
        if (tieredPricingFacade == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tieredPricingFacade.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ CryptoExchangeFeesFacadeV2(int i, double d, TieredPricingFacade tieredPricingFacade) {
        if (1 != (i & 1)) {
            j1.f(a.f70830a.getDescriptor(), i, 1);
            throw null;
        }
        this.f70828a = d;
        if ((i & 2) == 0) {
            this.f70829b = null;
        } else {
            this.f70829b = tieredPricingFacade;
        }
    }
}
