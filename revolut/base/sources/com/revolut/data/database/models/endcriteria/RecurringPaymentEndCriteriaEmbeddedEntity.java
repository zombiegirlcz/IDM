package com.revolut.data.database.models.endcriteria;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.j;
import yhm.k;
import yui.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0018\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "", "type", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity;", "date", "", "count", "", "<init>", "(Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity;", "getDate$annotations", "getDate", "()Ljava/lang/String;", "getCount$annotations", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/Integer;)Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$retail_data_release", "$serializer", "Companion", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RecurringPaymentEndCriteriaEmbeddedEntity {
    private final Integer count;
    private final String date;

    @NotNull
    private final RecurringPaymentEndCriteriaTypeEmbeddedEntity type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {j.c(k.PUBLICATION, new d(22)), null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RecurringPaymentEndCriteriaEmbeddedEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RecurringPaymentEndCriteriaEmbeddedEntity(int i, RecurringPaymentEndCriteriaTypeEmbeddedEntity recurringPaymentEndCriteriaTypeEmbeddedEntity, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            j1.f(RecurringPaymentEndCriteriaEmbeddedEntity$$serializer.INSTANCE.getDescriptor(), i, 7);
            throw null;
        }
        this.type = recurringPaymentEndCriteriaTypeEmbeddedEntity;
        this.date = str;
        this.count = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return RecurringPaymentEndCriteriaTypeEmbeddedEntity.INSTANCE.serializer();
    }

    public static /* synthetic */ RecurringPaymentEndCriteriaEmbeddedEntity copy$default(RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntity, RecurringPaymentEndCriteriaTypeEmbeddedEntity recurringPaymentEndCriteriaTypeEmbeddedEntity, String str, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            recurringPaymentEndCriteriaTypeEmbeddedEntity = recurringPaymentEndCriteriaEmbeddedEntity.type;
        }
        if ((i & 2) != 0) {
            str = recurringPaymentEndCriteriaEmbeddedEntity.date;
        }
        if ((i & 4) != 0) {
            num = recurringPaymentEndCriteriaEmbeddedEntity.count;
        }
        return recurringPaymentEndCriteriaEmbeddedEntity.copy(recurringPaymentEndCriteriaTypeEmbeddedEntity, str, num);
    }

    public static /* synthetic */ void getCount$annotations() {
    }

    public static /* synthetic */ void getDate$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$retail_data_release(RecurringPaymentEndCriteriaEmbeddedEntity self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (h) $childSerializers[0].getValue(), self.type);
        output.encodeNullableSerializableElement(serialDesc, 1, v1.f247718a, self.date);
        output.encodeNullableSerializableElement(serialDesc, 2, n0.f247680a, self.count);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecurringPaymentEndCriteriaTypeEmbeddedEntity getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @NotNull
    public final RecurringPaymentEndCriteriaEmbeddedEntity copy(@NotNull RecurringPaymentEndCriteriaTypeEmbeddedEntity type, String date, Integer count) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new RecurringPaymentEndCriteriaEmbeddedEntity(type, date, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentEndCriteriaEmbeddedEntity)) {
            return false;
        }
        RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntity = (RecurringPaymentEndCriteriaEmbeddedEntity) other;
        return this.type == recurringPaymentEndCriteriaEmbeddedEntity.type && Intrinsics.f(this.date, recurringPaymentEndCriteriaEmbeddedEntity.date) && Intrinsics.f(this.count, recurringPaymentEndCriteriaEmbeddedEntity.count);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final RecurringPaymentEndCriteriaTypeEmbeddedEntity getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public RecurringPaymentEndCriteriaEmbeddedEntity(@NotNull RecurringPaymentEndCriteriaTypeEmbeddedEntity type, String str, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.date = str;
        this.count = num;
    }
}
