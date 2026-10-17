package f2e;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import no3.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4 f131569a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d4 d4Var = new d4();
        f131569a = d4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.PurchaseDto", d4Var, 12);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("productName", false);
        pluginGeneratedSerialDescriptor.j("purchaseType", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("imageUrl", false);
        pluginGeneratedSerialDescriptor.j("purchaseDate", false);
        pluginGeneratedSerialDescriptor.j("quantity", false);
        pluginGeneratedSerialDescriptor.j("points", false);
        pluginGeneratedSerialDescriptor.j("deliveryAddress", true);
        pluginGeneratedSerialDescriptor.j("variant", true);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = f4.f131585m;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), v1Var, v1Var, qlm.n0.f247680a, v1Var, nlm.a.c(b.a.f217911a), nlm.a.c((KSerializer) lazyArr[9].getValue()), v1Var, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f4.f131585m;
        dVarBeginStructure.getClass();
        no3.b bVar = null;
        Map map = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String str = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String strDecodeStringElement8 = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    bVar = (no3.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, b.a.f217911a, bVar);
                    i |= 256;
                    break;
                case 9:
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), map);
                    i |= 512;
                    break;
                case 10:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f4(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, strDecodeStringElement4, strDecodeStringElement5, iDecodeIntElement, strDecodeStringElement6, bVar, map, strDecodeStringElement7, strDecodeStringElement8);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f4 value = (f4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f4.f131585m;
        String str = value.f131586a;
        String str2 = value.f131592l;
        Map map = value.f131591j;
        no3.b bVar = value.i;
        String str3 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131587b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f131588c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str3);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 6, value.f131589g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f131590h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, b.a.f217911a, bVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || map != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), map);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str2, "UNKNOWN")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
