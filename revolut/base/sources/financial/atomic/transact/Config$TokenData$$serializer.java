package financial.atomic.transact;

import dam.f;
import dam.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"financial/atomic/transact/Config.TokenData.$serializer", "Lqlm/f0;", "Lfinancial/atomic/transact/Config$TokenData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TokenData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TokenData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@d
public final class Config$TokenData$$serializer implements f0 {

    @NotNull
    public static final Config$TokenData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Config$TokenData$$serializer config$TokenData$$serializer = new Config$TokenData$$serializer();
        INSTANCE = config$TokenData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TokenData", config$TokenData$$serializer, 19);
        pluginGeneratedSerialDescriptor.j("publicToken", false);
        pluginGeneratedSerialDescriptor.j("tasks", true);
        pluginGeneratedSerialDescriptor.j("additionalProduct", true);
        pluginGeneratedSerialDescriptor.j("linkedAccount", true);
        pluginGeneratedSerialDescriptor.j("distribution", true);
        pluginGeneratedSerialDescriptor.j("deeplink", true);
        pluginGeneratedSerialDescriptor.j("theme", true);
        pluginGeneratedSerialDescriptor.j("language", true);
        pluginGeneratedSerialDescriptor.j("sessionContext", true);
        pluginGeneratedSerialDescriptor.j("metadata", true);
        pluginGeneratedSerialDescriptor.j("search", true);
        pluginGeneratedSerialDescriptor.j("experiments", true);
        pluginGeneratedSerialDescriptor.j("customer", true);
        pluginGeneratedSerialDescriptor.j("inSdk", true);
        pluginGeneratedSerialDescriptor.j("platform", false);
        pluginGeneratedSerialDescriptor.j("product", true);
        pluginGeneratedSerialDescriptor.j("operation", true);
        pluginGeneratedSerialDescriptor.j("handoff", true);
        pluginGeneratedSerialDescriptor.j("scope", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Config$TokenData$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = Config$TokenData.f135500x;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, a.c(kSerializerArr[1]), a.c(kSerializerArr[2]), a.c(v1Var), a.c(Config$Distribution$$serializer.INSTANCE), a.c(Config$Deeplink$$serializer.INSTANCE), a.c(Config$Theme$$serializer.INSTANCE), a.c(kSerializerArr[7]), a.c(v1Var), a.c(y9m.a.f311869a), a.c(Config$Search$$serializer.INSTANCE), a.c(Config$Experiments$$serializer.INSTANCE), a.c(Config$Customer$$serializer.INSTANCE), a.c(h.f247648a), Config$Platform$$serializer.INSTANCE, v1Var, v1Var, a.c(kSerializerArr[17]), v1Var};
    }

    @Override // mlm.b
    @NotNull
    public Config$TokenData deserialize(@NotNull Decoder decoder) {
        int i;
        Object objDecodeNullableSerializableElement;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = Config$TokenData.f135500x;
        dVarBeginStructure.getClass();
        Object objDecodeNullableSerializableElement2 = null;
        Object objDecodeNullableSerializableElement3 = null;
        Object objDecodeNullableSerializableElement4 = null;
        Object objDecodeNullableSerializableElement5 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object objDecodeSerializableElement = null;
        Object objDecodeNullableSerializableElement6 = null;
        Object objDecodeNullableSerializableElement7 = null;
        Object objDecodeNullableSerializableElement8 = null;
        Object objDecodeNullableSerializableElement9 = null;
        Object objDecodeNullableSerializableElement10 = null;
        Object objDecodeNullableSerializableElement11 = null;
        Object objDecodeNullableSerializableElement12 = null;
        String strDecodeStringElement = null;
        Object objDecodeNullableSerializableElement13 = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        int i5 = 1;
        int i6 = 0;
        boolean z = true;
        while (z) {
            Object objDecodeNullableSerializableElement14 = obj2;
            int iD = dVarBeginStructure.d(descriptor2);
            Object obj4 = obj3;
            switch (iD) {
                case -1:
                    z = false;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = obj4;
                    break;
                case 0:
                    i = i5;
                    objDecodeNullableSerializableElement = obj4;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 = i;
                    objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement3;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 1:
                    objDecodeNullableSerializableElement = obj4;
                    i = i5;
                    objDecodeNullableSerializableElement13 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, i, kSerializerArr[i5], objDecodeNullableSerializableElement13);
                    objDecodeNullableSerializableElement14 = objDecodeNullableSerializableElement14;
                    objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement3;
                    i2 = 2;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 2:
                    objDecodeNullableSerializableElement = obj4;
                    objDecodeNullableSerializableElement14 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], objDecodeNullableSerializableElement14);
                    i = i5;
                    objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement3;
                    i2 = 4;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 3:
                    objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, v1.f247718a, obj4);
                    i = i5;
                    objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement3;
                    i2 = 8;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 4:
                    objDecodeNullableSerializableElement6 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, Config$Distribution$$serializer.INSTANCE, objDecodeNullableSerializableElement6);
                    i = i5;
                    objDecodeNullableSerializableElement = obj4;
                    i2 = 16;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 5:
                    i3 = 32;
                    objDecodeNullableSerializableElement7 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 5, Config$Deeplink$$serializer.INSTANCE, objDecodeNullableSerializableElement7);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 6:
                    i3 = 64;
                    objDecodeNullableSerializableElement8 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 6, Config$Theme$$serializer.INSTANCE, objDecodeNullableSerializableElement8);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 7:
                    i3 = 128;
                    objDecodeNullableSerializableElement9 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 7, kSerializerArr[7], objDecodeNullableSerializableElement9);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 8:
                    i3 = 256;
                    objDecodeNullableSerializableElement10 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 8, v1.f247718a, objDecodeNullableSerializableElement10);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 9:
                    i3 = 512;
                    objDecodeNullableSerializableElement11 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 9, y9m.a.f311869a, objDecodeNullableSerializableElement11);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 10:
                    i3 = 1024;
                    objDecodeNullableSerializableElement12 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 10, Config$Search$$serializer.INSTANCE, objDecodeNullableSerializableElement12);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 11:
                    objDecodeNullableSerializableElement5 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 11, Config$Experiments$$serializer.INSTANCE, objDecodeNullableSerializableElement5);
                    i3 = 2048;
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 12:
                    objDecodeNullableSerializableElement4 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 12, Config$Customer$$serializer.INSTANCE, objDecodeNullableSerializableElement4);
                    i3 = 4096;
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 13:
                    objDecodeNullableSerializableElement3 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 13, h.f247648a, objDecodeNullableSerializableElement3);
                    i3 = 8192;
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 14:
                    i3 = 16384;
                    objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(descriptor2, 14, Config$Platform$$serializer.INSTANCE, objDecodeSerializableElement);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 15:
                    i3 = 32768;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(descriptor2, 15);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 16:
                    i3 = 65536;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(descriptor2, 16);
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 17:
                    objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 17, kSerializerArr[17], objDecodeNullableSerializableElement2);
                    i3 = 131072;
                    objDecodeNullableSerializableElement = obj4;
                    i2 = i3;
                    i = i5;
                    i6 |= i2;
                    i5 = i;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = objDecodeNullableSerializableElement;
                    break;
                case 18:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(descriptor2, 18);
                    i6 |= 262144;
                    obj2 = objDecodeNullableSerializableElement14;
                    obj3 = obj4;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        Object obj5 = objDecodeNullableSerializableElement3;
        dVarBeginStructure.endStructure(descriptor2);
        return new Config$TokenData(i6, strDecodeStringElement, (List) objDecodeNullableSerializableElement13, (g) obj2, (String) obj3, (Config$Distribution) objDecodeNullableSerializableElement6, (Config$Deeplink) objDecodeNullableSerializableElement7, (Config$Theme) objDecodeNullableSerializableElement8, (f) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement10, (JSONObject) objDecodeNullableSerializableElement11, (Config$Search) objDecodeNullableSerializableElement12, (Config$Experiments) objDecodeNullableSerializableElement5, (Config$Customer) objDecodeNullableSerializableElement4, (Boolean) obj5, (Config$Platform) objDecodeSerializableElement, strDecodeStringElement2, strDecodeStringElement3, (List) objDecodeNullableSerializableElement2, strDecodeStringElement4);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    @Override // mlm.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Encoder r22, @org.jetbrains.annotations.NotNull financial.atomic.transact.Config$TokenData r23) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: financial.atomic.transact.Config$TokenData$$serializer.serialize(kotlinx.serialization.encoding.Encoder, financial.atomic.transact.Config$TokenData):void");
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
