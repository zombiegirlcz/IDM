package qem;

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
import qlm.j1;
import qlm.n0;
import qlm.t0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f245194a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f245194a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", bVar, 9);
        pluginGeneratedSerialDescriptor.j("seconds", false);
        pluginGeneratedSerialDescriptor.j("minutes", false);
        pluginGeneratedSerialDescriptor.j("hours", false);
        pluginGeneratedSerialDescriptor.j("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.j("dayOfMonth", false);
        pluginGeneratedSerialDescriptor.j("dayOfYear", false);
        pluginGeneratedSerialDescriptor.j("month", false);
        pluginGeneratedSerialDescriptor.j("year", false);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = d.f245195j;
        n0 n0Var = n0.f247680a;
        return new KSerializer[]{n0Var, n0Var, n0Var, lazyArr[3].getValue(), n0Var, n0Var, lazyArr[6].getValue(), n0Var, t0.f247706a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d.f245195j;
        dVarBeginStructure.getClass();
        f fVar = null;
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        int iDecodeIntElement3 = 0;
        int iDecodeIntElement4 = 0;
        int iDecodeIntElement5 = 0;
        int iDecodeIntElement6 = 0;
        h hVar = null;
        long jDecodeLongElement = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    hVar = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), hVar);
                    i |= 8;
                    break;
                case 4:
                    iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iDecodeIntElement5 = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), fVar);
                    i |= 64;
                    break;
                case 7:
                    iDecodeIntElement6 = dVarBeginStructure.decodeIntElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, hVar, iDecodeIntElement4, iDecodeIntElement5, fVar, iDecodeIntElement6, jDecodeLongElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d.f245195j;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f245196a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f245197b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f245198c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f245199g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.f245200h);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
