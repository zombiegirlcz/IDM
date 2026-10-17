package com.revolut.feature.defi.common.models.dto;

import c36.l;
import c36.n;
import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f71712a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f71712a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.models.dto.DeFiAssetAmountWithFiatDto", cVar, 3);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("fiatAmount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c36.a.f20896a, TokenAmountDto.a.f71708a, l.f20906a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        c36.c cVar = null;
        boolean z = true;
        int i = 0;
        TokenAmountDto tokenAmountDto = null;
        n nVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                cVar = (c36.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c36.a.f20896a, cVar);
                i |= 1;
            } else if (iD == 1) {
                tokenAmountDto = (TokenAmountDto) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, TokenAmountDto.a.f71708a, tokenAmountDto);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                nVar = (n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, l.f20906a, nVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, cVar, tokenAmountDto, nVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c36.a.f20896a, value.f71713a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, TokenAmountDto.a.f71708a, value.f71714b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, l.f20906a, value.f71715c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
