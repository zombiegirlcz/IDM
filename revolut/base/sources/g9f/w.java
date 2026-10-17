package g9f;

import java.time.ZonedDateTime;
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
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f141577a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        f141577a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.trading.transfer.investments.impl.data.network.model.TransferRequestDto", wVar, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", true);
        pluginGeneratedSerialDescriptor.j("receivedDate", false);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("direction", false);
        pluginGeneratedSerialDescriptor.j("brokerName", false);
        pluginGeneratedSerialDescriptor.j("brokerIcon", false);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("fee", false);
        pluginGeneratedSerialDescriptor.j("steps", false);
        pluginGeneratedSerialDescriptor.j("positions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = y.f141578l;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, lazyArr[1].getValue(), ie0.l.f160606a, lazyArr[3].getValue(), lazyArr[4].getValue(), v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(a.C1001a.f176860a), lazyArr[9].getValue(), lazyArr[10].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = y.f141578l;
        dVarBeginStructure.getClass();
        jo3.a aVar = null;
        List list = null;
        List list2 = null;
        String strDecodeStringElement = null;
        g0 g0Var = null;
        ZonedDateTime zonedDateTime = null;
        n0 n0Var = null;
        v vVar = null;
        String strDecodeStringElement2 = null;
        String str = null;
        String strDecodeStringElement3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    g0Var = (g0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), g0Var);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    zonedDateTime = (ZonedDateTime) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.l.f160606a, zonedDateTime);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    n0Var = (n0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), n0Var);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    vVar = (v) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), vVar);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, a.C1001a.f176860a, aVar);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), list2);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y(i, strDecodeStringElement, g0Var, zonedDateTime, n0Var, vVar, strDecodeStringElement2, str, strDecodeStringElement3, aVar, list, list2);
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
        Lazy[] lazyArr = y.f141578l;
        String str = value.f141579a;
        n0 n0Var = value.d;
        g0 g0Var = value.f141580b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || g0Var != g0.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), g0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.l.f160606a, value.f141581c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || n0Var != n0.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), n0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, value.f141582g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f141583h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, a.C1001a.f176860a, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f141584j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
