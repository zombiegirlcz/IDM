package com.revolut.feature.defi.common.models.dto;

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
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f71709a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f71709a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.models.dto.AssetTokenAmountDto", aVar, 2);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c36.a.f20896a, TokenAmountDto.a.f71708a};
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
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                cVar = (c36.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c36.a.f20896a, cVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                tokenAmountDto = (TokenAmountDto) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, TokenAmountDto.a.f71708a, tokenAmountDto);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b(i, cVar, tokenAmountDto);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b value = (b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c36.a.f20896a, value.f71710a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, TokenAmountDto.a.f71708a, value.f71711b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
