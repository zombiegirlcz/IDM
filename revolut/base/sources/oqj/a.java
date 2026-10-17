package oqj;

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
import qlm.f0;
import qlm.t0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f227910a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f227910a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.balance_history.network.BalanceHistoryDto", aVar, 5);
        pluginGeneratedSerialDescriptor.j("from", false);
        pluginGeneratedSerialDescriptor.j("to", false);
        pluginGeneratedSerialDescriptor.j("requestTimestamp", false);
        pluginGeneratedSerialDescriptor.j("data", false);
        pluginGeneratedSerialDescriptor.j("rangeToUpdate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.f;
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{t0Var, t0Var, t0Var, lazyArr[3].getValue(), nlm.a.c(h.f227919a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.f;
        dVarBeginStructure.getClass();
        List list = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        long jDecodeLongElement3 = 0;
        j jVar = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                jDecodeLongElement3 = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, h.f227919a, jVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, jDecodeLongElement, jDecodeLongElement2, jDecodeLongElement3, list, jVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.f;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f227911a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f227912b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f227913c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, h.f227919a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
