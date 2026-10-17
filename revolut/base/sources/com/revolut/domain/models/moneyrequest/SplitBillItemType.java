package com.revolut.domain.models.moneyrequest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/SplitBillItemType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "MANUAL", "TRANSACTION", "UNKNOWN", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SplitBillItemType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SplitBillItemType MANUAL = new SplitBillItemType("MANUAL", 0, "MANUAL");
    public static final SplitBillItemType TRANSACTION = new SplitBillItemType("TRANSACTION", 1, "TRANSACTION");
    public static final SplitBillItemType UNKNOWN = new SplitBillItemType("UNKNOWN", 2, "UNKNOWN");

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: com.revolut.domain.models.moneyrequest.SplitBillItemType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static SplitBillItemType a(String input) {
            SplitBillItemType splitBillItemType;
            Intrinsics.checkNotNullParameter(input, "input");
            SplitBillItemType[] splitBillItemTypeArrValues = SplitBillItemType.values();
            int length = splitBillItemTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    splitBillItemType = null;
                    break;
                }
                splitBillItemType = splitBillItemTypeArrValues[i];
                if (a0.z(splitBillItemType.getValue(), input, true)) {
                    break;
                }
                i++;
            }
            return splitBillItemType == null ? SplitBillItemType.UNKNOWN : splitBillItemType;
        }
    }

    private static final /* synthetic */ SplitBillItemType[] $values() {
        return new SplitBillItemType[]{MANUAL, TRANSACTION, UNKNOWN};
    }

    static {
        SplitBillItemType[] splitBillItemTypeArr$values = $values();
        $VALUES = splitBillItemTypeArr$values;
        $ENTRIES = s.n(splitBillItemTypeArr$values);
        INSTANCE = new Companion();
    }

    private SplitBillItemType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SplitBillItemType valueOf(String str) {
        return (SplitBillItemType) Enum.valueOf(SplitBillItemType.class, str);
    }

    public static SplitBillItemType[] values() {
        return (SplitBillItemType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
