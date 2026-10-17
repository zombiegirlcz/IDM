package mp3;

import java.util.List;
import jo3.a;
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
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f207722a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f207722a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("credit_cards_account_add_new_item", bVar, 10);
        pluginGeneratedSerialDescriptor.j("itemId", false);
        pluginGeneratedSerialDescriptor.j("entryPoint", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("creditLimit", false);
        pluginGeneratedSerialDescriptor.j("cashbackRate", false);
        pluginGeneratedSerialDescriptor.j("isPremiumEnabled", false);
        pluginGeneratedSerialDescriptor.j("iconRes", false);
        pluginGeneratedSerialDescriptor.j("productArticleId", false);
        pluginGeneratedSerialDescriptor.j("tags", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = d.k;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, lazyArr[1].getValue(), nlm.a.c(v1Var), nlm.a.c(v1Var), a.C1001a.f176860a, nlm.a.c(v1Var), qlm.h.f247648a, nlm.a.c(n0.f247680a), nlm.a.c(v1Var), lazyArr[9].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d.k;
        dVarBeginStructure.getClass();
        String str = null;
        List list = null;
        String strDecodeStringElement = null;
        fs3.b bVar = null;
        String str2 = null;
        String str3 = null;
        jo3.a aVar = null;
        String str4 = null;
        Integer num = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
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
                    bVar = (fs3.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), bVar);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                    i |= 8;
                    break;
                case 4:
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str4);
                    i |= 32;
                    break;
                case 6:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, n0.f247680a, num);
                    i |= 128;
                    break;
                case 8:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str);
                    i |= 256;
                    break;
                case 9:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, strDecodeStringElement, bVar, str2, str3, aVar, str4, zDecodeBooleanElement, num, str, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f207723a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f207724b);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f207725c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, value.f207726g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, n0.f247680a, value.f207727h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f207728j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
