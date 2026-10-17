package htj;

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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f155419a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f155419a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.income_sorter.network.dto.IncomeSorterDto", jVar, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("walletId", false);
        pluginGeneratedSerialDescriptor.j("baseTransactionId", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("approvalMode", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("updatedDate", false);
        pluginGeneratedSerialDescriptor.j("destinations", false);
        pluginGeneratedSerialDescriptor.j("remainderDestination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = l.k;
        v1 v1Var = v1.f247718a;
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), t0Var, t0Var, lazyArr[8].getValue(), nlm.a.c(d0.f155403a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.k;
        dVarBeginStructure.getClass();
        List list = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String str = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        int i = 0;
        boolean z = true;
        f0 f0Var = null;
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
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    f0Var = (f0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, d0.f155403a, f0Var);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, str, jDecodeLongElement, jDecodeLongElement2, list, f0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l value = (l) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f155421a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f155422b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f155423c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, value.f);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.f155424g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.f155425h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, d0.f155403a, value.f155426j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
