package fs7;

import fs7.t;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f137615a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f137615a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_credit.impl.data.dto.coverages.CoverageDetailsLayoutDto", aVar, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("restrictions", false);
        pluginGeneratedSerialDescriptor.j("exclusions", false);
        pluginGeneratedSerialDescriptor.j("disclaimer", false);
        pluginGeneratedSerialDescriptor.j("primaryButton", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(t.a.f137646a), nlm.a.c(f.f137625a), nlm.a.c(c.f137617a), nlm.a.c(i.f137629a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        t tVar = null;
        h hVar = null;
        e eVar = null;
        m mVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    tVar = (t) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, t.a.f137646a, tVar);
                    i |= 8;
                    break;
                case 4:
                    hVar = (h) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, f.f137625a, hVar);
                    i |= 16;
                    break;
                case 5:
                    eVar = (e) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, c.f137617a, eVar);
                    i |= 32;
                    break;
                case 6:
                    mVar = (m) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, i.f137629a, mVar);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, strDecodeStringElement, strDecodeStringElement2, str, tVar, hVar, eVar, mVar);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f137647a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f137648b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f137649c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t.a.f137646a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, f.f137625a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, c.f137617a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, i.f137629a, value.f137650g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
