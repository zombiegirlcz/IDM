package ib9;

import ib9.d;
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
import qlm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f160134a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f160134a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.onboarding.impl.onboarding.model.OnboardingCountriesDto", eVar, 3);
        pluginGeneratedSerialDescriptor.j("directOnboarding", false);
        pluginGeneratedSerialDescriptor.j("retailAppOnboarding", false);
        pluginGeneratedSerialDescriptor.j("companies", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = g.d;
        d.a aVar = d.a.f160133a;
        return new KSerializer[]{nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c((KSerializer) lazyArr[2].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g.d;
        dVarBeginStructure.getClass();
        d dVar = null;
        boolean z = true;
        int i = 0;
        d dVar2 = null;
        List list = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, d.a.f160133a, dVar);
                i |= 1;
            } else if (iD == 1) {
                dVar2 = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, d.a.f160133a, dVar2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g(i, dVar, dVar2, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g value = (g) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g.d;
        d.a aVar = d.a.f160133a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, aVar, value.f160135a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, aVar, value.f160136b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f160137c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
