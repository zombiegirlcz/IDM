package wtg;

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
public final /* synthetic */ class u implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f299973a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        f299973a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.account_closure.impl.data.network.model.AccountClosureProgressDetailsDto", uVar, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("portfolioId", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("updatedDate", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("tradingLegalEntityId", false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var)};
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
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String str = null;
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
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new w(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        w value = (w) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f299974a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f299975b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f299976c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f299977g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, value.f299978h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
