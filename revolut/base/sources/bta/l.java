package bta;

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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f18494a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f18494a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.raffle.impl.data.models.RaffleCampaignDto", lVar, 8);
        pluginGeneratedSerialDescriptor.j("competitionId", false);
        pluginGeneratedSerialDescriptor.j("checklistId", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        pluginGeneratedSerialDescriptor.j("primaryAction", false);
        pluginGeneratedSerialDescriptor.j("shareInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = z.i;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, n.f18495a, lazyArr[4].getValue(), nlm.a.c(v1Var), nlm.a.c(t.f18502a), nlm.a.c(w.f18506a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z.i;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        p pVar = null;
        List list = null;
        String str = null;
        v vVar = null;
        y yVar = null;
        int i = 0;
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
                    pVar = (p) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, n.f18495a, pVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    vVar = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, t.f18502a, vVar);
                    i |= 64;
                    break;
                case 7:
                    yVar = (y) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, w.f18506a, yVar);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, pVar, list, str, vVar, yVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z value = (z) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f18510a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f18511b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f18512c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, n.f18495a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, t.f18502a, value.f18513g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, w.f18506a, value.f18514h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
