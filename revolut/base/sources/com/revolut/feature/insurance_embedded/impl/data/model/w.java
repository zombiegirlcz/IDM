package com.revolut.feature.insurance_embedded.impl.data.model;

import com.revolut.feature.insurance_embedded.impl.data.model.Website;
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
public final /* synthetic */ class w implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f76036a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        f76036a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CLAIMS_VIA_CARD", wVar, 2);
        pluginGeneratedSerialDescriptor.j("eligibleCardsIds", false);
        pluginGeneratedSerialDescriptor.j("website", false);
        pluginGeneratedSerialDescriptor.l(new bka.b(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{x.d[0].getValue(), Website.a.f75974a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x.d;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        Website website = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                website = (Website) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, Website.a.f75974a, website);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x(i, list, website);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) x.d[0].getValue(), value.f76037b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, Website.a.f75974a, value.f76038c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
