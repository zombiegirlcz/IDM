package jrk;

import java.time.Instant;
import ko3.a;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m2l.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class s implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f178076a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        f178076a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.RecommendationItemDto", sVar, 3);
        pluginGeneratedSerialDescriptor.j("date", false);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("price", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ie0.j.f160602a, nlm.a.c((KSerializer) u.d[1].getValue()), a.C1054a.f186208a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = u.d;
        dVarBeginStructure.getClass();
        Instant instant = null;
        boolean z = true;
        int i = 0;
        k0 k0Var = null;
        ko3.a aVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.j.f160602a, instant);
                i |= 1;
            } else if (iD == 1) {
                k0Var = (k0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), k0Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                aVar = (ko3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1054a.f186208a, aVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, instant, k0Var, aVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u value = (u) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = u.d;
        ie0.j jVar = ie0.j.f160602a;
        Instant instant = value.f178077a;
        k0 k0Var = value.f178078b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, jVar, instant);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || k0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), k0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, a.C1054a.f186208a, value.f178079c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
