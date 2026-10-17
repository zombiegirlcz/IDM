package com.revolut.feature.insurance_embedded.impl.data.model;

import com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout;
import gu7.p1;
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
public final /* synthetic */ class h0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f75994a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h0 h0Var = new h0();
        f75994a = h0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DETAILS", h0Var, 1);
        pluginGeneratedSerialDescriptor.j("details", false);
        pluginGeneratedSerialDescriptor.l(new bka.b(26));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CoverageDetailsLayout.a.f75937a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        CoverageDetailsLayout coverageDetailsLayout = null;
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
                coverageDetailsLayout = (CoverageDetailsLayout) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, CoverageDetailsLayout.a.f75937a, coverageDetailsLayout);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i0(i, coverageDetailsLayout);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i0 value = (i0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        p1 p1Var = i0.Companion;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, CoverageDetailsLayout.a.f75937a, value.f75996b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
