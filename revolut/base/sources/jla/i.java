package jla;

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
import org.jetbrains.annotations.NotNull;
import qlm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f175664a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f175664a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.product_catalogue.impl.domain.ProductProperties", iVar, 6);
        pluginGeneratedSerialDescriptor.j("integerProperties", false);
        pluginGeneratedSerialDescriptor.j("decimalProperties", false);
        pluginGeneratedSerialDescriptor.j("booleanProperties", false);
        pluginGeneratedSerialDescriptor.j("textProperties", false);
        pluginGeneratedSerialDescriptor.j("currencyProperties", false);
        pluginGeneratedSerialDescriptor.j("countryProperties", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = k.f175665g;
        return new KSerializer[]{nlm.a.c((KSerializer) lazyArr[0].getValue()), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c((KSerializer) lazyArr[5].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.f175665g;
        dVarBeginStructure.getClass();
        int i = 0;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        Map map5 = null;
        Map map6 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), map);
                    i |= 1;
                    break;
                case 1:
                    map2 = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), map2);
                    i |= 2;
                    break;
                case 2:
                    map3 = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), map3);
                    i |= 4;
                    break;
                case 3:
                    map4 = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), map4);
                    i |= 8;
                    break;
                case 4:
                    map5 = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), map5);
                    i |= 16;
                    break;
                case 5:
                    map6 = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), map6);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, map, map2, map3, map4, map5, map6);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.f175665g;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f175666a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f175667b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f175668c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
