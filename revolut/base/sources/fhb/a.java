package fhb;

import gr2.w;
import gr2.y;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f135192a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f135192a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.switch_assistant.data.model.SalarySwitchRequestStatusDto", aVar, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("method", true);
        pluginGeneratedSerialDescriptor.j("tracker", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.e;
        return new KSerializer[]{v1.f247718a, lazyArr[1].getValue(), lazyArr[2].getValue(), nlm.a.c(w.f145872a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        ghb.d dVar = null;
        ghb.b bVar = null;
        y yVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                dVar = (ghb.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), dVar);
                i |= 2;
            } else if (iD == 2) {
                bVar = (ghb.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), bVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                yVar = (y) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, w.f145872a, yVar);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, dVar, bVar, yVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.e;
        String str = value.f135193a;
        y yVar = value.d;
        ghb.b bVar = value.f135195c;
        ghb.d dVar = value.f135194b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || dVar != ghb.d.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), dVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != ghb.b.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), bVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || yVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, w.f145872a, yVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
