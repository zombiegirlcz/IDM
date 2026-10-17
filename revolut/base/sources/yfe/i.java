package yfe;

import java.util.List;
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
public final /* synthetic */ class i implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f313266a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f313266a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("default_active", iVar, 7);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("money", false);
        pluginGeneratedSerialDescriptor.j("count", false);
        pluginGeneratedSerialDescriptor.j("icons", true);
        pluginGeneratedSerialDescriptor.j("supplementary", true);
        pluginGeneratedSerialDescriptor.j("infoIconVisible", true);
        pluginGeneratedSerialDescriptor.j("moneyToDisplay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = k.f313273j;
        ie0.o oVar = ie0.o.f160615a;
        return new KSerializer[]{qlm.v1.f247718a, oVar, qlm.n0.f247680a, lazyArr[3].getValue(), nlm.a.c((KSerializer) lazyArr[4].getValue()), qlm.h.f247648a, oVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.f313273j;
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        dj0.d dVar = null;
        List list = null;
        t1 t1Var = null;
        dj0.d dVar2 = null;
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
                    dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, dVar);
                    i |= 2;
                    break;
                case 2:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    t1Var = (t1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), t1Var);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    dVar2 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, ie0.o.f160615a, dVar2);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, strDecodeStringElement, dVar, iDecodeIntElement, list, t1Var, zDecodeBooleanElement, dVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.f313273j;
        String str = value.f313274c;
        dj0.d dVar = value.i;
        boolean z = value.f313276h;
        t1 t1Var = value.f313275g;
        List list = value.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        ie0.o oVar = ie0.o.f160615a;
        dj0.d dVar2 = value.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, oVar, dVar2);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || t1Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), t1Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(dVar, dVar2)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, oVar, dVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
