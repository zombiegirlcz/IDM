package gmg;

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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f144817a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f144817a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.user.checklist.impl.data.models.dto.UserChecklistDto", aVar, 5);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("sections", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("specialFlags", false);
        pluginGeneratedSerialDescriptor.j("canSkipBottomsheet", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = a0.f;
        return new KSerializer[]{nlm.a.c(f.f144824a), lazyArr[1].getValue(), nlm.a.c(b.f144821a), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c(qlm.h.f247648a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a0.f;
        dVarBeginStructure.getClass();
        int i = 0;
        k kVar = null;
        List list = null;
        d dVar = null;
        List list2 = null;
        Boolean bool = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                kVar = (k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, f.f144824a, kVar);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else if (iD == 2) {
                dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.f144821a, dVar);
                i |= 4;
            } else if (iD == 3) {
                list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.h.f247648a, bool);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a0(i, kVar, list, dVar, list2, bool);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a0 value = (a0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a0.f;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, f.f144824a, value.f144818a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f144819b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, b.f144821a, value.f144820c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.h.f247648a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
