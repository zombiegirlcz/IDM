package krk;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.n0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KSerializer f188888a;

    @NotNull
    private final SerialDescriptor descriptor;

    private g() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.data_points.AssetSeriesDataDto.PointDto", this, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("fiscalYear", false);
        pluginGeneratedSerialDescriptor.j("fiscalQuarter", false);
        pluginGeneratedSerialDescriptor.j("value", true);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = k.e;
        return new KSerializer[]{lazyArr[0].getValue(), n0.f247680a, nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c(this.f188888a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = this.descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.e;
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        j jVar = null;
        i iVar = null;
        Object objDecodeNullableSerializableElement = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jVar = (j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), jVar);
                i |= 1;
            } else if (iD == 1) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                iVar = (i) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), iVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, this.f188888a, objDecodeNullableSerializableElement);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, jVar, iDecodeIntElement, iVar, objDecodeNullableSerializableElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.e;
        mlm.h hVar = (mlm.h) lazyArr[0].getValue();
        j jVar = value.f188889a;
        Object obj3 = value.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, jVar);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f188890b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f188891c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || obj3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, this.f188888a, obj3);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.f188888a};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(KSerializer typeSerial0) {
        this();
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        this.f188888a = typeSerial0;
    }
}
