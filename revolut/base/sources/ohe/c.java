package ohe;

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

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f225357a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f225357a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.tab.accounts.impl.total_wealth.models.TotalWealthCategoryEntry", cVar, 2);
        pluginGeneratedSerialDescriptor.j("snapshot", false);
        pluginGeneratedSerialDescriptor.j("hasOnHoldItems", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e.f225358c[0].getValue(), qlm.h.f247648a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e.f225358c;
        dVarBeginStructure.getClass();
        yfe.h hVar = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                hVar = (yfe.h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), hVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e(i, hVar, zDecodeBooleanElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e value = (e) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        mlm.h hVar = (mlm.h) e.f225358c[0].getValue();
        yfe.h hVar2 = value.f225359a;
        boolean z = value.f225360b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, hVar2);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
