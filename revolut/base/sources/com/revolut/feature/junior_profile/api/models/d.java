package com.revolut.feature.junior_profile.api.models;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.junior_profile.api.models.JuniorProfileCompany;
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
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f77120a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f77120a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("BANKING", dVar, 7);
        pluginGeneratedSerialDescriptor.j("registeredIdentityId", false);
        pluginGeneratedSerialDescriptor.j("registrationAddress", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("relationship", false);
        pluginGeneratedSerialDescriptor.j("company", false);
        pluginGeneratedSerialDescriptor.j("requestedTermination", false);
        pluginGeneratedSerialDescriptor.j("receiveTransferUrl", false);
        pluginGeneratedSerialDescriptor.l(new hi9.g(3));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = e.i;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, po3.a.f237883a, lazyArr[2].getValue(), kf8.c.f183314a, nlm.a.c(JuniorProfileCompany.a.f77110a), qlm.h.f247648a, nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e.i;
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        Address address = null;
        ij8.h hVar = null;
        kf8.b bVar = null;
        JuniorProfileCompany juniorProfileCompany = null;
        String str = null;
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
                    address = (Address) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, po3.a.f237883a, address);
                    i |= 2;
                    break;
                case 2:
                    hVar = (ij8.h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), hVar);
                    i |= 4;
                    break;
                case 3:
                    bVar = (kf8.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kf8.c.f183314a, bVar);
                    i |= 8;
                    break;
                case 4:
                    juniorProfileCompany = (JuniorProfileCompany) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, JuniorProfileCompany.a.f77110a, juniorProfileCompany);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e(i, strDecodeStringElement, address, hVar, bVar, juniorProfileCompany, zDecodeBooleanElement, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e value = (e) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f77121b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, po3.a.f237883a, value.f77122c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, kf8.c.f183314a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, JuniorProfileCompany.a.f77110a, value.f);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f77123g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, value.f77124h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
