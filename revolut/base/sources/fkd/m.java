package fkd;

import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import fkd.p;
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
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f135774a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f135774a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.todo.SlotDefaultTodoTile.Content", mVar, 8);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("closeable", false);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("buttons", false);
        pluginGeneratedSerialDescriptor.j("image", false);
        pluginGeneratedSerialDescriptor.j("imageAsset", true);
        pluginGeneratedSerialDescriptor.j("badgeAsset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = o.i;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, qlm.h.f247648a, nlm.a.c(p.a.f135786a), lazyArr[4].getValue(), v1Var, nlm.a.c((KSerializer) lazyArr[6].getValue()), nlm.a.c((KSerializer) lazyArr[7].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.i;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        p pVar = null;
        List list = null;
        String strDecodeStringElement3 = null;
        SlotIconAsset slotIconAsset = null;
        SlotIconAsset slotIconAsset2 = null;
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
                    pVar = (p) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, p.a.f135786a, pVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    slotIconAsset = (SlotIconAsset) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), slotIconAsset);
                    i |= 64;
                    break;
                case 7:
                    slotIconAsset2 = (SlotIconAsset) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), slotIconAsset2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, pVar, list, strDecodeStringElement3, slotIconAsset, slotIconAsset2);
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
        Lazy[] lazyArr = o.i;
        String str = value.f135778a;
        SlotIconAsset slotIconAsset = value.f135782h;
        SlotIconAsset slotIconAsset2 = value.f135781g;
        p pVar = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f135779b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f135780c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || pVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, p.a.f135786a, pVar);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || slotIconAsset2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), slotIconAsset2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || slotIconAsset != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), slotIconAsset);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
