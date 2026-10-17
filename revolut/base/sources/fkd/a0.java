package fkd;

import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import fkd.d0;
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
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f135748a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        f135748a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.todo.SlotNoButtonsTodoTile.Content", a0Var, 8);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("closeable", false);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("image", false);
        pluginGeneratedSerialDescriptor.j("imageAsset", true);
        pluginGeneratedSerialDescriptor.j("badgeAsset", true);
        pluginGeneratedSerialDescriptor.j("deeplink", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c0.i;
        KSerializer kSerializerC = nlm.a.c(d0.a.f135757a);
        KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[5].getValue());
        KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[6].getValue());
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, qlm.h.f247648a, kSerializerC, v1Var, kSerializerC2, kSerializerC3, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c0.i;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        d0 d0Var = null;
        String strDecodeStringElement3 = null;
        SlotIconAsset slotIconAsset = null;
        SlotIconAsset slotIconAsset2 = null;
        String strDecodeStringElement4 = null;
        int i = 0;
        boolean zDecodeBooleanElement = false;
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
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d0Var = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, d0.a.f135757a, d0Var);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    slotIconAsset = (SlotIconAsset) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), slotIconAsset);
                    i |= 32;
                    break;
                case 6:
                    slotIconAsset2 = (SlotIconAsset) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), slotIconAsset2);
                    i |= 64;
                    break;
                case 7:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c0(i, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, d0Var, strDecodeStringElement3, slotIconAsset, slotIconAsset2, strDecodeStringElement4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c0 value = (c0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c0.i;
        String str = value.f135750a;
        SlotIconAsset slotIconAsset = value.f135753g;
        SlotIconAsset slotIconAsset2 = value.f;
        d0 d0Var = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f135751b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f135752c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, d0.a.f135757a, d0Var);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || slotIconAsset2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), slotIconAsset2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || slotIconAsset != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), slotIconAsset);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f135754h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
