package tq8;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.h;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f273535a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f273535a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_transfer.impl.model.dto.JuniorDetailedTransferSettingsDto", aVar, 9);
        pluginGeneratedSerialDescriptor.j("ownerId", false);
        pluginGeneratedSerialDescriptor.j("counterpartyId", false);
        pluginGeneratedSerialDescriptor.j("completeBlock", false);
        pluginGeneratedSerialDescriptor.j("firstName", false);
        pluginGeneratedSerialDescriptor.j("lastName", false);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("username", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("pricingPlanTier", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, h.f247648a, v1Var, v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String str = null;
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
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
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
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, str);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f273536a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f273537b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f273538c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f273539g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f273540h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
