package nhl;

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
public final /* synthetic */ class o0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f215543a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o0 o0Var = new o0();
        f215543a = o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.models.ScreenerSearchRequest", o0Var, 7);
        pluginGeneratedSerialDescriptor.j("securityTypes", false);
        pluginGeneratedSerialDescriptor.j("filters", false);
        pluginGeneratedSerialDescriptor.j("sortingMetric", false);
        pluginGeneratedSerialDescriptor.j("extraMetrics", false);
        pluginGeneratedSerialDescriptor.j("sortOrder", false);
        pluginGeneratedSerialDescriptor.j("limit", false);
        pluginGeneratedSerialDescriptor.j("accountTypes", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = q0.f215552h;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{lazyArr[0].getValue(), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c(v1Var), nlm.a.c(qlm.n0.f247680a), nlm.a.c((KSerializer) lazyArr[6].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q0.f215552h;
        dVarBeginStructure.getClass();
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        List list3 = null;
        String str2 = null;
        Integer num = null;
        List list4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.n0.f247680a, num);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list4);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q0(i, list, list2, str, list3, str2, num, list4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q0 value = (q0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q0.f215552h;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f215553a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f215554b);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f215555c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.n0.f247680a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f215556g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
