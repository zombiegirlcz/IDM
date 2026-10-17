package com.revolut.feature.statements.impl.tools.transactions.extras;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/FraudState;", "", "<init>", "(Ljava/lang/String;I)V", "SUSPICIOUS", "JUSTIFIED", "FRAUDULENT", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FraudState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FraudState[] $VALUES;

    @b("SUSPICIOUS")
    public static final FraudState SUSPICIOUS = new FraudState("SUSPICIOUS", 0);

    @b("JUSTIFIED")
    public static final FraudState JUSTIFIED = new FraudState("JUSTIFIED", 1);

    @b("FRAUDULENT")
    public static final FraudState FRAUDULENT = new FraudState("FRAUDULENT", 2);

    private static final /* synthetic */ FraudState[] $values() {
        return new FraudState[]{SUSPICIOUS, JUSTIFIED, FRAUDULENT};
    }

    static {
        FraudState[] fraudStateArr$values = $values();
        $VALUES = fraudStateArr$values;
        $ENTRIES = s.n(fraudStateArr$values);
    }

    private FraudState(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static FraudState valueOf(String str) {
        return (FraudState) Enum.valueOf(FraudState.class, str);
    }

    public static FraudState[] values() {
        return (FraudState[]) $VALUES.clone();
    }
}
