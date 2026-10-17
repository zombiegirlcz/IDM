package qo6;

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
import qo6.s;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f248051a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f248051a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.models.open_banking_brazil.dto.BrazilInboundConsentDetailsDto", aVar, 6);
        pluginGeneratedSerialDescriptor.j("consentId", false);
        pluginGeneratedSerialDescriptor.j("alias", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("groups", false);
        pluginGeneratedSerialDescriptor.j("thirdParty", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.f248052g;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), lazyArr[3].getValue(), s.a.f248075a, nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.f248052g;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        List list = null;
        s sVar = null;
        String str2 = null;
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
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    sVar = (s) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, s.a.f248075a, sVar);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, strDecodeStringElement2, str, list, sVar, str2);
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
        Lazy[] lazyArr = c.f248052g;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f248053a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f248054b);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f248055c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, s.a.f248075a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
