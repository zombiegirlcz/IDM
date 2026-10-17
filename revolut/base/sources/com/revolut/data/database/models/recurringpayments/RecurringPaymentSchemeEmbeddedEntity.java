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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "PIX", "DE", "BPAY", "NPP", "BOLETO", "NZ_BECS", "Companion", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final class RecurringPaymentSchemeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringPaymentSchemeEmbeddedEntity[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RecurringPaymentSchemeEmbeddedEntity PIX = new RecurringPaymentSchemeEmbeddedEntity("PIX", 0);
    public static final RecurringPaymentSchemeEmbeddedEntity DE = new RecurringPaymentSchemeEmbeddedEntity("DE", 1);
    public static final RecurringPaymentSchemeEmbeddedEntity BPAY = new RecurringPaymentSchemeEmbeddedEntity("BPAY", 2);
    public static final RecurringPaymentSchemeEmbeddedEntity NPP = new RecurringPaymentSchemeEmbeddedEntity("NPP", 3);
    public static final RecurringPaymentSchemeEmbeddedEntity BOLETO = new RecurringPaymentSchemeEmbeddedEntity("BOLETO", 4);
    public static final RecurringPaymentSchemeEmbeddedEntity NZ_BECS = new RecurringPaymentSchemeEmbeddedEntity("NZ_BECS", 5);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RecurringPaymentSchemeEmbeddedEntity.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ RecurringPaymentSchemeEmbeddedEntity[] $values() {
        return new RecurringPaymentSchemeEmbeddedEntity[]{PIX, DE, BPAY, NPP, BOLETO, NZ_BECS};
    }

    static {
        RecurringPaymentSchemeEmbeddedEntity[] recurringPaymentSchemeEmbeddedEntityArr$values = $values();
        $VALUES = recurringPaymentSchemeEmbeddedEntityArr$values;
        $ENTRIES = s.n(recurringPaymentSchemeEmbeddedEntityArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new c0(26));
    }

    private RecurringPaymentSchemeEmbeddedEntity(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return j1.a("com.revolut.data.database.models.recurringpayments.RecurringPaymentSchemeEmbeddedEntity", values(), new String[]{"PIX", "DE", "BPAY", "NPP", "BOLETO", "NZ_BECS"}, new Annotation[][]{null, null, null, null, null, null});
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RecurringPaymentSchemeEmbeddedEntity valueOf(String str) {
        return (RecurringPaymentSchemeEmbeddedEntity) Enum.valueOf(RecurringPaymentSchemeEmbeddedEntity.class, str);
    }

    public static RecurringPaymentSchemeEmbeddedEntity[] values() {
        return (RecurringPaymentSchemeEmbeddedEntity[]) $VALUES.clone();
    }
}
