package quj;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m1c.m;
import no3.b;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f249470a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f249470a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.travel_trips.data.model.dto.TravelItineraryDto.ItemDto", iVar, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("isProposal", false);
        pluginGeneratedSerialDescriptor.j("eyebrow", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("subtitleColor", false);
        pluginGeneratedSerialDescriptor.j("thumbnail", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("deeplink", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("date", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, qlm.h.f247648a, nlm.a.c(v1Var), v1Var, v1Var, v1Var, nlm.a.c(m.a.f201407a), nlm.a.c(b.a.f217911a), nlm.a.c(v1Var), v1Var, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String str = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        m1c.m mVar = null;
        no3.b bVar = null;
        String str2 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        int i = 0;
        boolean zDecodeBooleanElement = false;
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
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    mVar = (m1c.m) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m.a.f201407a, mVar);
                    i |= 64;
                    break;
                case 7:
                    bVar = (no3.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b.a.f217911a, bVar);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str2);
                    i |= 256;
                    break;
                case 9:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, strDecodeStringElement, zDecodeBooleanElement, str, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, mVar, bVar, str2, strDecodeStringElement5, strDecodeStringElement6);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f249471a);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f249472b);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f249473c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, m.a.f201407a, value.f249474g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, b.a.f217911a, value.f249475h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.f249476j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
