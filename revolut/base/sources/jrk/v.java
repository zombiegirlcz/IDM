package jrk;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.n0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f178080a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v vVar = new v();
        f178080a = vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.StockFinancialsDto", vVar, 5);
        pluginGeneratedSerialDescriptor.j("year", false);
        pluginGeneratedSerialDescriptor.j("interimPeriod", false);
        pluginGeneratedSerialDescriptor.j("income", false);
        pluginGeneratedSerialDescriptor.j("balanceSheet", false);
        pluginGeneratedSerialDescriptor.j("cashFlows", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.f247680a;
        return new KSerializer[]{n0Var, nlm.a.c(n0Var), nlm.a.c(g.f178053a), nlm.a.c(a.f178038a), nlm.a.c(d.f178045a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        Integer num = null;
        i iVar = null;
        c cVar = null;
        f fVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, n0.f247680a, num);
                i |= 2;
            } else if (iD == 2) {
                iVar = (i) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, g.f178053a, iVar);
                i |= 4;
            } else if (iD == 3) {
                cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.f178038a, cVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, d.f178045a, fVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x(i, iDecodeIntElement, num, iVar, cVar, fVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f178081a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, n0.f247680a, value.f178082b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, g.f178053a, value.f178083c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, a.f178038a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, d.f178045a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
