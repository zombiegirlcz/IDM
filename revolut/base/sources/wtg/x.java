package wtg;

import java.time.LocalDate;
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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f299979a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x xVar = new x();
        f299979a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.account_closure.impl.data.network.model.AccountClosureProgressDto", xVar, 6);
        pluginGeneratedSerialDescriptor.j("accountClosure", false);
        pluginGeneratedSerialDescriptor.j("currentStep", false);
        pluginGeneratedSerialDescriptor.j("pendingSteps", false);
        pluginGeneratedSerialDescriptor.j("completedSteps", false);
        pluginGeneratedSerialDescriptor.j("blocked", false);
        pluginGeneratedSerialDescriptor.j("estimatedCompletionDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = z.f299980g;
        return new KSerializer[]{u.f299973a, a0.f299940a, lazyArr[2].getValue(), lazyArr[3].getValue(), qlm.h.f247648a, ie0.m.f160609a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z.f299980g;
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        w wVar = null;
        c0 c0Var = null;
        List list = null;
        List list2 = null;
        LocalDate localDate = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, u.f299973a, wVar);
                    i |= 1;
                    break;
                case 1:
                    c0Var = (c0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a0.f299940a, c0Var);
                    i |= 2;
                    break;
                case 2:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, ie0.m.f160609a, localDate);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z(i, wVar, c0Var, list, list2, zDecodeBooleanElement, localDate);
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
        Lazy[] lazyArr = z.f299980g;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, u.f299973a, value.f299981a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, a0.f299940a, value.f299982b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f299983c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, ie0.m.f160609a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
