package jdl;

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
import qlm.x;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f173154a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f173154a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.model.index.IndexDto", aVar, 8);
        pluginGeneratedSerialDescriptor.j("symbol", false);
        pluginGeneratedSerialDescriptor.j("ref", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("shortOverview", true);
        pluginGeneratedSerialDescriptor.j("currency", true);
        pluginGeneratedSerialDescriptor.j("countryCode", true);
        pluginGeneratedSerialDescriptor.j("latitude", true);
        pluginGeneratedSerialDescriptor.j("longitude", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(ie0.d.f160593a);
        KSerializer kSerializerC4 = nlm.a.c(ie0.c.f160591a);
        x xVar = x.f247723a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(xVar), nlm.a.c(xVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        String str2 = null;
        xi0.b bVar = null;
        wi0.b bVar2 = null;
        Double d = null;
        Double d5 = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                    i |= 8;
                    break;
                case 4:
                    bVar = (xi0.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ie0.d.f160593a, bVar);
                    i |= 16;
                    break;
                case 5:
                    bVar2 = (wi0.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ie0.c.f160591a, bVar2);
                    i |= 32;
                    break;
                case 6:
                    d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, x.f247723a, d);
                    i |= 64;
                    break;
                case 7:
                    d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, x.f247723a, d5);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, strDecodeStringElement2, str, str2, bVar, bVar2, d, d5);
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
        String str = value.f173155a;
        Double d = value.f173159h;
        Double d5 = value.f173158g;
        wi0.b bVar = value.f;
        xi0.b bVar2 = value.e;
        String str2 = value.d;
        String str3 = value.f173157c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f173156b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, ie0.d.f160593a, bVar2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, ie0.c.f160591a, bVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, x.f247723a, d5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, x.f247723a, d);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
