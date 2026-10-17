package wvj;

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
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f300526a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f300526a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.trips.network.TripDto", jVar, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("startDate", false);
        pluginGeneratedSerialDescriptor.j("endDate", false);
        pluginGeneratedSerialDescriptor.j("countryCode", false);
        pluginGeneratedSerialDescriptor.j("transactionAdjustments", false);
        pluginGeneratedSerialDescriptor.j("deleted", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = l.f300527h;
        v1 v1Var = v1.f247718a;
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{v1Var, nlm.a.c(t0Var), nlm.a.c(t0Var), v1Var, lazyArr[4].getValue(), nlm.a.c(qlm.h.f247648a), t0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.f300527h;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        Long l2 = null;
        Long l3 = null;
        String strDecodeStringElement2 = null;
        List list = null;
        Boolean bool = null;
        long jDecodeLongElement = 0;
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
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, t0.f247706a, l2);
                    i |= 2;
                    break;
                case 2:
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t0.f247706a, l3);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, bool);
                    i |= 32;
                    break;
                case 6:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, strDecodeStringElement, l2, l3, strDecodeStringElement2, list, bool, jDecodeLongElement);
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
        Lazy[] lazyArr = l.f300527h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f300528a);
        t0 t0Var = t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, value.f300529b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, value.f300530c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, value.f);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.f300531g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
