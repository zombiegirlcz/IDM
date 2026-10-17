package t5f;

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
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f268077a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f268077a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.trading.managed_portfolios.impl.data.network.template.model.TemplateIntroDto", cVar, 7);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("iconName", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("riskScore", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        pluginGeneratedSerialDescriptor.j("screens", false);
        pluginGeneratedSerialDescriptor.j("riskProfile", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = e.f268078h;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, lazyArr[4].getValue(), lazyArr[5].getValue(), nlm.a.c((KSerializer) lazyArr[6].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e.f268078h;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        List list = null;
        List list2 = null;
        b bVar = null;
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
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), bVar);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, list, list2, bVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e value = (e) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e.f268078h;
        String str = value.f268079a;
        b bVar = value.f268082g;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f268080b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f268081c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), bVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
