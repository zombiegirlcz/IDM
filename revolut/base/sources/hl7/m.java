package hl7;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f153199a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f153199a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.BenefitDetailsDto", mVar, 4);
        pluginGeneratedSerialDescriptor.j("keyParams", false);
        pluginGeneratedSerialDescriptor.j("covered", false);
        pluginGeneratedSerialDescriptor.j("notCovered", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = o.e;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), nlm.a.c((KSerializer) lazyArr[3].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.e;
        dVarBeginStructure.getClass();
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else if (iD == 1) {
                list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                i |= 2;
            } else if (iD == 2) {
                list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list3);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list4);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, list, list2, list3, list4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o value = (o) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f153235a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f153236b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f153237c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
