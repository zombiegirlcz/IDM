package jrk;

import jo3.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f178045a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f178045a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.CashFlowsDto", dVar, 4);
        pluginGeneratedSerialDescriptor.j("operating", false);
        pluginGeneratedSerialDescriptor.j("financing", false);
        pluginGeneratedSerialDescriptor.j("investing", false);
        pluginGeneratedSerialDescriptor.j("freeCashFlow", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c1001a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        jo3.a aVar3 = null;
        jo3.a aVar4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                i |= 1;
            } else if (iD == 1) {
                aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                i |= 2;
            } else if (iD == 2) {
                aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar3);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                aVar4 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar4);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, aVar, aVar2, aVar3, aVar4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, c1001a, value.f178050a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, c1001a, value.f178051b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, c1001a, value.f178052c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c1001a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
