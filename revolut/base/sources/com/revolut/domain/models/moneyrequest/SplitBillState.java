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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/SplitBillState;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "UNDEFINED", "CANCELLED", "PENDING", "DECLINED", "SETTLED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SplitBillState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final SplitBillState UNDEFINED = new SplitBillState("UNDEFINED", 0, "UNDEFINED");
    public static final SplitBillState CANCELLED = new SplitBillState("CANCELLED", 1, "CANCELLED");
    public static final SplitBillState PENDING = new SplitBillState("PENDING", 2, "PENDING");
    public static final SplitBillState DECLINED = new SplitBillState("DECLINED", 3, "DECLINED");
    public static final SplitBillState SETTLED = new SplitBillState("SETTLED", 4, "COMPLETED");

    /* JADX INFO: renamed from: com.revolut.domain.models.moneyrequest.SplitBillState$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static SplitBillState a(String input) {
            SplitBillState splitBillState;
            Intrinsics.checkNotNullParameter(input, "input");
            SplitBillState[] splitBillStateArrValues = SplitBillState.values();
            int length = splitBillStateArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    splitBillState = null;
                    break;
                }
                splitBillState = splitBillStateArrValues[i];
                if (a0.z(splitBillState.getValue(), input, true)) {
                    break;
                }
                i++;
            }
            return splitBillState == null ? SplitBillState.UNDEFINED : splitBillState;
        }
    }

    private static final /* synthetic */ SplitBillState[] $values() {
        return new SplitBillState[]{UNDEFINED, CANCELLED, PENDING, DECLINED, SETTLED};
    }

    static {
        SplitBillState[] splitBillStateArr$values = $values();
        $VALUES = splitBillStateArr$values;
        $ENTRIES = s.n(splitBillStateArr$values);
        INSTANCE = new Companion();
    }

    private SplitBillState(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SplitBillState valueOf(String str) {
        return (SplitBillState) Enum.valueOf(SplitBillState.class, str);
    }

    public static SplitBillState[] values() {
        return (SplitBillState[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
