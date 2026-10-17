package qh0;

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

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f246388a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f246388a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.mobile_services.impl.auth.models.GmsCreateCredentialRequest.PublicKey", aVar, 8);
        pluginGeneratedSerialDescriptor.j("challenge", false);
        pluginGeneratedSerialDescriptor.j("rp", false);
        pluginGeneratedSerialDescriptor.j("user", false);
        pluginGeneratedSerialDescriptor.j("pubKeyCredParams", false);
        pluginGeneratedSerialDescriptor.j("timeout", false);
        pluginGeneratedSerialDescriptor.j("excludeCredentials", false);
        pluginGeneratedSerialDescriptor.j("attestation", false);
        pluginGeneratedSerialDescriptor.j("authenticatorSelection", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = y.i;
        return new KSerializer[]{v1.f247718a, s.f246416a, v.f246419a, lazyArr[3].getValue(), qlm.n0.f247680a, lazyArr[5].getValue(), lazyArr[6].getValue(), e.f246393a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y.i;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        u uVar = null;
        x xVar = null;
        List list = null;
        List list2 = null;
        c cVar = null;
        k kVar = null;
        int i = 0;
        int iDecodeIntElement = 0;
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
                    uVar = (u) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, s.f246416a, uVar);
                    i |= 2;
                    break;
                case 2:
                    xVar = (x) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, v.f246419a, xVar);
                    i |= 4;
                    break;
                case 3:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), cVar);
                    i |= 64;
                    break;
                case 7:
                    kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, e.f246393a, kVar);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y(i, strDecodeStringElement, uVar, xVar, list, iDecodeIntElement, list2, cVar, kVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        y value = (y) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f246423a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, s.f246416a, value.f246424b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, v.f246419a, value.f246425c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f246426g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, e.f246393a, value.f246427h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
