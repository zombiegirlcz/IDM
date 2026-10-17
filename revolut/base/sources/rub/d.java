package rub;

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
import qlm.x;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f257512a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f257512a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.buying.api.model.PointsBuyingPackage.OneOffPackage", dVar, 4);
        pluginGeneratedSerialDescriptor.j("pointsAmount", false);
        pluginGeneratedSerialDescriptor.j("price", false);
        pluginGeneratedSerialDescriptor.j("quoteToken", false);
        pluginGeneratedSerialDescriptor.j("discountPercent", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        x xVar = x.f247723a;
        return new KSerializer[]{xVar, ie0.o.f160615a, v1.f247718a, xVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        double dDecodeDoubleElement = 0.0d;
        double dDecodeDoubleElement2 = 0.0d;
        dj0.d dVar = null;
        String strDecodeStringElement = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, dVar);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, dDecodeDoubleElement, dVar, strDecodeStringElement, dDecodeDoubleElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 0, value.f257513a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, value.f257514b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f257515c);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
