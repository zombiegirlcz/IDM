package yfe;

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

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f313309a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        f313309a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("youth_snapshot", uVar, 5);
        pluginGeneratedSerialDescriptor.j("money", false);
        pluginGeneratedSerialDescriptor.j("juniorId", false);
        pluginGeneratedSerialDescriptor.j("firstName", false);
        pluginGeneratedSerialDescriptor.j("fullName", false);
        pluginGeneratedSerialDescriptor.j("secondIcon", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c((KSerializer) a0.f313237h[4].getValue());
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{ie0.o.f160615a, v1Var, v1Var, v1Var, kSerializerC};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a0.f313237h;
        dVarBeginStructure.getClass();
        int i = 0;
        dj0.d dVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        w wVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, dVar);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                wVar = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), wVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a0(i, dVar, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, wVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a0 value = (a0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a0.f313237h;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, value.f313238c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f313239g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
