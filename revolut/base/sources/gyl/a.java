package gyl;

import hyl.l;
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
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f147914a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f147914a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.ui_kit_globe_view.mapper.GlobeLoadParamsDto", aVar, 9);
        pluginGeneratedSerialDescriptor.j("quality", false);
        pluginGeneratedSerialDescriptor.j("activeCountries", false);
        pluginGeneratedSerialDescriptor.j("markers", false);
        pluginGeneratedSerialDescriptor.j("skipRevealAnimation", false);
        pluginGeneratedSerialDescriptor.j("selectInitiallyFocusedCountry", false);
        pluginGeneratedSerialDescriptor.j("initiallyFocusedCountry", false);
        pluginGeneratedSerialDescriptor.j("topOffset", false);
        pluginGeneratedSerialDescriptor.j("transparentBackground", true);
        pluginGeneratedSerialDescriptor.j("edgeFade", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.f147915j;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), hVar, hVar, nlm.a.c(v1.f247718a), nlm.a.c(n0.f247680a), hVar, lazyArr[8].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.f147915j;
        dVarBeginStructure.getClass();
        List list = null;
        l lVar = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        Integer num = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    lVar = (l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), lVar);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, num);
                    i |= 64;
                    break;
                case 7:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, lVar, list2, list3, zDecodeBooleanElement, zDecodeBooleanElement2, str, num, zDecodeBooleanElement3, list);
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
        Lazy[] lazyArr = c.f147915j;
        mlm.h hVar = (mlm.h) lazyArr[0].getValue();
        l lVar = value.f147916a;
        List list = value.i;
        boolean z = value.f147920h;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, lVar);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f147917b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f147918c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, value.f147919g);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
