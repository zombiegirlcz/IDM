package fkd;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f135773a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        f135773a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.todo.SlotProgressTodoTile.Content", l0Var, 5);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("closeable", false);
        pluginGeneratedSerialDescriptor.j("buttons", false);
        pluginGeneratedSerialDescriptor.j("progress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = n0.f;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, qlm.h.f247648a, lazyArr[3].getValue(), o0.f135783a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n0.f;
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        List list = null;
        q0 q0Var = null;
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
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                q0Var = (q0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, o0.f135783a, q0Var);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n0(i, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, list, q0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n0 value = (n0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n0.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f135775a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f135776b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f135777c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, o0.f135783a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
