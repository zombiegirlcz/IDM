package a8g;

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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2196a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f2196a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.search.AirflightSearchResultItemDto", aVar, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("bounds", false);
        pluginGeneratedSerialDescriptor.j("baggage", true);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("traits", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.f2204g;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, lazyArr[1].getValue(), nlm.a.c((KSerializer) lazyArr[2].getValue()), z7g.a.f319962a, nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[5].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.f2204g;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        List list = null;
        List list2 = null;
        z7g.c cVar = null;
        String str = null;
        List list3 = null;
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
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    cVar = (z7g.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, z7g.a.f319962a, cVar);
                    i |= 8;
                    break;
                case 4:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, list, list2, cVar, str, list3);
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
        Lazy[] lazyArr = c.f2204g;
        String str = value.f2205a;
        List list = value.f;
        String str2 = value.e;
        List list2 = value.f2207c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f2206b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), list2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, z7g.a.f319962a, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
