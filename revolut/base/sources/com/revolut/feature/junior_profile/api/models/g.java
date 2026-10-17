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
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f77126a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f77126a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("TRADING", gVar, 5);
        pluginGeneratedSerialDescriptor.j("registeredIdentityId", false);
        pluginGeneratedSerialDescriptor.j("registrationAddress", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("relationship", false);
        pluginGeneratedSerialDescriptor.j("company", false);
        pluginGeneratedSerialDescriptor.l(new hi9.g(3));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, po3.a.f237883a, h.f77127g[2].getValue(), kf8.c.f183314a, nlm.a.c(JuniorProfileCompany.a.f77110a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = h.f77127g;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        Address address = null;
        ij8.h hVar = null;
        kf8.b bVar = null;
        JuniorProfileCompany juniorProfileCompany = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                address = (Address) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, po3.a.f237883a, address);
                i |= 2;
            } else if (iD == 2) {
                hVar = (ij8.h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), hVar);
                i |= 4;
            } else if (iD == 3) {
                bVar = (kf8.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kf8.c.f183314a, bVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                juniorProfileCompany = (JuniorProfileCompany) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, JuniorProfileCompany.a.f77110a, juniorProfileCompany);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h(i, strDecodeStringElement, address, hVar, bVar, juniorProfileCompany);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h value = (h) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = h.f77127g;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f77128b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, po3.a.f237883a, value.f77129c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, kf8.c.f183314a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, JuniorProfileCompany.a.f77110a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
