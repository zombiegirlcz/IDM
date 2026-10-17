package jl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import qlm.v1;

/* JADX INFO: loaded from: classes17.dex */
public final class o0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f175560a = new o0();
    private static final /* synthetic */ EnumDescriptor descriptor;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.onfido.workflow.internal.network.InteractiveTaskStatus", 4);
        enumDescriptor.j("abandoned", false);
        enumDescriptor.j("error", false);
        enumDescriptor.j("finished", false);
        enumDescriptor.j("running", false);
        descriptor = enumDescriptor;
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return q0.values()[decoder.decodeEnum(descriptor)];
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q0 value = (q0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeEnum(descriptor, value.ordinal());
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return qlm.j1.f247666a;
    }
}
