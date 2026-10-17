package com.revolut.data.database.models.endcriteria;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import vc.s;
import yhm.j;
import yhm.k;
import yui.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "DATE", "COUNT", "Companion", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final class RecurringPaymentEndCriteriaTypeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringPaymentEndCriteriaTypeEmbeddedEntity[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RecurringPaymentEndCriteriaTypeEmbeddedEntity DATE = new RecurringPaymentEndCriteriaTypeEmbeddedEntity("DATE", 0);
    public static final RecurringPaymentEndCriteriaTypeEmbeddedEntity COUNT = new RecurringPaymentEndCriteriaTypeEmbeddedEntity("COUNT", 1);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaTypeEmbeddedEntity;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RecurringPaymentEndCriteriaTypeEmbeddedEntity.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ RecurringPaymentEndCriteriaTypeEmbeddedEntity[] $values() {
        return new RecurringPaymentEndCriteriaTypeEmbeddedEntity[]{DATE, COUNT};
    }

    static {
        RecurringPaymentEndCriteriaTypeEmbeddedEntity[] recurringPaymentEndCriteriaTypeEmbeddedEntityArr$values = $values();
        $VALUES = recurringPaymentEndCriteriaTypeEmbeddedEntityArr$values;
        $ENTRIES = s.n(recurringPaymentEndCriteriaTypeEmbeddedEntityArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new d(23));
    }

    private RecurringPaymentEndCriteriaTypeEmbeddedEntity(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return j1.a("com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaTypeEmbeddedEntity", values(), new String[]{"DATE", "COUNT"}, new Annotation[][]{null, null});
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RecurringPaymentEndCriteriaTypeEmbeddedEntity valueOf(String str) {
        return (RecurringPaymentEndCriteriaTypeEmbeddedEntity) Enum.valueOf(RecurringPaymentEndCriteriaTypeEmbeddedEntity.class, str);
    }

    public static RecurringPaymentEndCriteriaTypeEmbeddedEntity[] values() {
        return (RecurringPaymentEndCriteriaTypeEmbeddedEntity[]) $VALUES.clone();
    }
}
