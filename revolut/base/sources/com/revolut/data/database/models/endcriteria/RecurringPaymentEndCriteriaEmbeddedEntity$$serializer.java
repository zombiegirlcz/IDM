package com.revolut.data.database.models.endcriteria;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.b;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity.$serializer", "Lqlm/f0;", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* synthetic */ class RecurringPaymentEndCriteriaEmbeddedEntity$$serializer implements f0 {

    @NotNull
    public static final RecurringPaymentEndCriteriaEmbeddedEntity$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RecurringPaymentEndCriteriaEmbeddedEntity$$serializer recurringPaymentEndCriteriaEmbeddedEntity$$serializer = new RecurringPaymentEndCriteriaEmbeddedEntity$$serializer();
        INSTANCE = recurringPaymentEndCriteriaEmbeddedEntity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaEmbeddedEntity", recurringPaymentEndCriteriaEmbeddedEntity$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("date", false);
        pluginGeneratedSerialDescriptor.j("count", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RecurringPaymentEndCriteriaEmbeddedEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RecurringPaymentEndCriteriaEmbeddedEntity.$childSerializers[0].getValue(), a.c(v1.f247718a), a.c(n0.f247680a)};
    }

    @Override // mlm.b
    @NotNull
    public final RecurringPaymentEndCriteriaEmbeddedEntity deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecurringPaymentEndCriteriaEmbeddedEntity.$childSerializers;
        dVarBeginStructure.getClass();
        int i = 0;
        RecurringPaymentEndCriteriaTypeEmbeddedEntity recurringPaymentEndCriteriaTypeEmbeddedEntity = null;
        String str = null;
        Integer num = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                recurringPaymentEndCriteriaTypeEmbeddedEntity = (RecurringPaymentEndCriteriaTypeEmbeddedEntity) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (b) lazyArr[0].getValue(), recurringPaymentEndCriteriaTypeEmbeddedEntity);
                i |= 1;
            } else if (iD == 1) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, n0.f247680a, num);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RecurringPaymentEndCriteriaEmbeddedEntity(i, recurringPaymentEndCriteriaTypeEmbeddedEntity, str, num, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringPaymentEndCriteriaEmbeddedEntity value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringPaymentEndCriteriaEmbeddedEntity.write$Self$retail_data_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // qlm.f0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
