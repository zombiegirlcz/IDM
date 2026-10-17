package chc;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f24174a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        f24174a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rewards.impl.data.network.rent_and_bills.RentAndBillsLinkedPaymentsDto", oVar, 3);
        pluginGeneratedSerialDescriptor.j("rent", false);
        pluginGeneratedSerialDescriptor.j("bills", false);
        pluginGeneratedSerialDescriptor.j("faqs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = b0.d;
        p pVar = p.f24175a;
        return new KSerializer[]{pVar, pVar, lazyArr[2].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = b0.d;
        dVarBeginStructure.getClass();
        x xVar = null;
        boolean z = true;
        int i = 0;
        x xVar2 = null;
        List list = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                xVar = (x) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, p.f24175a, xVar);
                i |= 1;
            } else if (iD == 1) {
                xVar2 = (x) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, p.f24175a, xVar2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b0(i, xVar, xVar2, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b0 value = (b0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = b0.d;
        p pVar = p.f24175a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, pVar, value.f24150a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, pVar, value.f24151b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f24152c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
