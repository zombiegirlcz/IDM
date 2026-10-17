package com.revolut.feature.incentive_reward.impl.model.lotteries;

import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails$ShareInfo;
import kf7.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f74856a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f74856a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails", aVar, 3);
        pluginGeneratedSerialDescriptor.j("campaignId", false);
        pluginGeneratedSerialDescriptor.j("result", false);
        pluginGeneratedSerialDescriptor.j("shareInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, kf7.b.f183292a, LotteryDrawDetails$ShareInfo.a.f74854a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        o oVar = null;
        LotteryDrawDetails$ShareInfo lotteryDrawDetails$ShareInfo = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kf7.b.f183292a, oVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                lotteryDrawDetails$ShareInfo = (LotteryDrawDetails$ShareInfo) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, LotteryDrawDetails$ShareInfo.a.f74854a, lotteryDrawDetails$ShareInfo);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b(i, strDecodeStringElement, oVar, lotteryDrawDetails$ShareInfo);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f74857a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, kf7.b.f183292a, value.f74858b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, LotteryDrawDetails$ShareInfo.a.f74854a, value.f74859c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
