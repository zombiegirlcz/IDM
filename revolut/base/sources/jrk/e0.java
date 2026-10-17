package jrk;

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
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f178049a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e0 e0Var = new e0();
        f178049a = e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.StockFinancialsStatementItemDto", e0Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("format", false);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("children", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = g0.f;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(h0.f178057a), lazyArr[4].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g0.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        j0 j0Var = null;
        List list = null;
        boolean z = true;
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
            } else if (iD == 2) {
                strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                j0Var = (j0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, h0.f178057a, j0Var);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g0(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, j0Var, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g0 value = (g0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g0.f;
        String str = value.f178054a;
        j0 j0Var = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f178055b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f178056c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || j0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, h0.f178057a, j0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
