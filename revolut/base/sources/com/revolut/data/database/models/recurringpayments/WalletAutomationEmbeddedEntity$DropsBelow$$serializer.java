package com.revolut.data.database.models.recurringpayments;

import com.revolut.data.database.models.recurringpayments.WalletAutomationEmbeddedEntity;
import jo3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity.DropsBelow.$serializer", "Lqlm/f0;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* synthetic */ class WalletAutomationEmbeddedEntity$DropsBelow$$serializer implements f0 {

    @NotNull
    public static final WalletAutomationEmbeddedEntity$DropsBelow$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WalletAutomationEmbeddedEntity$DropsBelow$$serializer walletAutomationEmbeddedEntity$DropsBelow$$serializer = new WalletAutomationEmbeddedEntity$DropsBelow$$serializer();
        INSTANCE = walletAutomationEmbeddedEntity$DropsBelow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DROPS_BELOW", walletAutomationEmbeddedEntity$DropsBelow$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("threshold", false);
        pluginGeneratedSerialDescriptor.j("topupAmount", false);
        pluginGeneratedSerialDescriptor.j("monitoredPocket", false);
        pluginGeneratedSerialDescriptor.j("topupFrom", false);
        pluginGeneratedSerialDescriptor.j("limitMax", true);
        pluginGeneratedSerialDescriptor.j("limitPeriod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WalletAutomationEmbeddedEntity$DropsBelow$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        b.a aVar = b.a.f176863a;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{aVar, aVar, v1Var, v1Var, a.c(aVar), a.c(v1Var)};
    }

    @Override // mlm.b
    @NotNull
    public final WalletAutomationEmbeddedEntity.DropsBelow deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        b bVar = null;
        b bVar2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        b bVar3 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b.a.f176863a, bVar);
                    i |= 1;
                    break;
                case 1:
                    bVar2 = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, b.a.f176863a, bVar2);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    bVar3 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b.a.f176863a, bVar3);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new WalletAutomationEmbeddedEntity.DropsBelow(i, bVar, bVar2, strDecodeStringElement, strDecodeStringElement2, bVar3, str, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletAutomationEmbeddedEntity.DropsBelow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletAutomationEmbeddedEntity.DropsBelow.write$Self$retail_data_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // qlm.f0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
