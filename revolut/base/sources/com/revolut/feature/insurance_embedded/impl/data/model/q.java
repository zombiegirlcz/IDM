package com.revolut.feature.insurance_embedded.impl.data.model;

import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f76029a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f76029a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("BOTTOM_SHEET", qVar, 1);
        pluginGeneratedSerialDescriptor.j("bottomSheet", false);
        pluginGeneratedSerialDescriptor.l(new bka.b(24));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BottomSheet.a.f75900a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        BottomSheet bottomSheet = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else {
                if (iD != 0) {
                    throw new UnknownFieldException(iD);
                }
                bottomSheet = (BottomSheet) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, BottomSheet.a.f75900a, bottomSheet);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, bottomSheet);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        gu7.h0 h0Var = r.Companion;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, BottomSheet.a.f75900a, value.f76030b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
