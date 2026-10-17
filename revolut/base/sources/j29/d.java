package j29;

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
import m1c.o1;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f170747a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f170747a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.core.impl.data.model.dto.savings.LifestyleSavingsBottomSheetDto", dVar, 5);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("cta", false);
        pluginGeneratedSerialDescriptor.j("contentItems", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = l.f;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, o1.a.f201429a, nlm.a.c(i.f170754a), lazyArr[4].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        o1 o1Var = null;
        k kVar = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                o1Var = (o1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, o1.a.f201429a, o1Var);
                i |= 4;
            } else if (iD == 3) {
                kVar = (k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, i.f170754a, kVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, strDecodeStringElement, strDecodeStringElement2, o1Var, kVar, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l value = (l) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f170757a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f170758b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, o1.a.f201429a, value.f170759c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, i.f170754a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
