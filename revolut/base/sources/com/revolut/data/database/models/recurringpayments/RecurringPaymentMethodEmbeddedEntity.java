package com.revolut.data.database.models.recurringpayments;

import chc.c0;
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

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "BOLETO", "BPAY", "PIX", "Companion", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final class RecurringPaymentMethodEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringPaymentMethodEmbeddedEntity[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RecurringPaymentMethodEmbeddedEntity BOLETO = new RecurringPaymentMethodEmbeddedEntity("BOLETO", 0);
    public static final RecurringPaymentMethodEmbeddedEntity BPAY = new RecurringPaymentMethodEmbeddedEntity("BPAY", 1);
    public static final RecurringPaymentMethodEmbeddedEntity PIX = new RecurringPaymentMethodEmbeddedEntity("PIX", 2);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RecurringPaymentMethodEmbeddedEntity.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ RecurringPaymentMethodEmbeddedEntity[] $values() {
        return new RecurringPaymentMethodEmbeddedEntity[]{BOLETO, BPAY, PIX};
    }

    static {
        RecurringPaymentMethodEmbeddedEntity[] recurringPaymentMethodEmbeddedEntityArr$values = $values();
        $VALUES = recurringPaymentMethodEmbeddedEntityArr$values;
        $ENTRIES = s.n(recurringPaymentMethodEmbeddedEntityArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new c0(25));
    }

    private RecurringPaymentMethodEmbeddedEntity(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return j1.a("com.revolut.data.database.models.recurringpayments.RecurringPaymentMethodEmbeddedEntity", values(), new String[]{"BOLETO", "BPAY", "PIX"}, new Annotation[][]{null, null, null});
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RecurringPaymentMethodEmbeddedEntity valueOf(String str) {
        return (RecurringPaymentMethodEmbeddedEntity) Enum.valueOf(RecurringPaymentMethodEmbeddedEntity.class, str);
    }

    public static RecurringPaymentMethodEmbeddedEntity[] values() {
        return (RecurringPaymentMethodEmbeddedEntity[]) $VALUES.clone();
    }
}
