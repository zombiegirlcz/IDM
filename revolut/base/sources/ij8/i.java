package ij8;

import ie0.m;
import java.time.LocalDate;
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
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f161733a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f161733a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_profile.api.models.JuniorProfileWithOfferedServices", iVar, 10);
        pluginGeneratedSerialDescriptor.j("individualId", false);
        pluginGeneratedSerialDescriptor.j("firstName", false);
        pluginGeneratedSerialDescriptor.j("lastName", false);
        pluginGeneratedSerialDescriptor.j("gender", false);
        pluginGeneratedSerialDescriptor.j("email", false);
        pluginGeneratedSerialDescriptor.j("phone", false);
        pluginGeneratedSerialDescriptor.j("username", false);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("birthDate", false);
        pluginGeneratedSerialDescriptor.j("offeredServices", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = com.revolut.feature.junior_profile.api.models.c.k;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, lazyArr[3].getValue(), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, m.f160609a, lazyArr[9].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = com.revolut.feature.junior_profile.api.models.c.k;
        dVarBeginStructure.getClass();
        LocalDate localDate = null;
        List list = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        bj0.b bVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String strDecodeStringElement4 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    bVar = (bj0.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), bVar);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str3);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, m.f160609a, localDate);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new com.revolut.feature.junior_profile.api.models.c(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, bVar, str, str2, str3, strDecodeStringElement4, localDate, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        com.revolut.feature.junior_profile.api.models.c value = (com.revolut.feature.junior_profile.api.models.c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = com.revolut.feature.junior_profile.api.models.c.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f77114a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f77115b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f77116c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f77117g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f77118h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, m.f160609a, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f77119j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
