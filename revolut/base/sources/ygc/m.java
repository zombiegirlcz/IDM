package ygc;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f313625a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f313625a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rewards.impl.data.network.concierge.ConciergeAlbertineDetailsLayoutDto", mVar, 6);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("faqButton", false);
        pluginGeneratedSerialDescriptor.j("feedbackButton", false);
        pluginGeneratedSerialDescriptor.j("footerButton", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("sections", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = j0.f313616g;
        d dVar = d.f313601a;
        return new KSerializer[]{x.f313637a, dVar, dVar, dVar, r.f313630a, lazyArr[5].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j0.f313616g;
        dVarBeginStructure.getClass();
        int i = 0;
        i0 i0Var = null;
        f fVar = null;
        f fVar2 = null;
        f fVar3 = null;
        w wVar = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i0Var = (i0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, x.f313637a, i0Var);
                    i |= 1;
                    break;
                case 1:
                    fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, d.f313601a, fVar);
                    i |= 2;
                    break;
                case 2:
                    fVar2 = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, d.f313601a, fVar2);
                    i |= 4;
                    break;
                case 3:
                    fVar3 = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, d.f313601a, fVar3);
                    i |= 8;
                    break;
                case 4:
                    wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, r.f313630a, wVar);
                    i |= 16;
                    break;
                case 5:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j0(i, i0Var, fVar, fVar2, fVar3, wVar, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j0 value = (j0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j0.f313616g;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, x.f313637a, value.f313617a);
        d dVar = d.f313601a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, dVar, value.f313618b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, dVar, value.f313619c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, dVar, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, r.f313630a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
