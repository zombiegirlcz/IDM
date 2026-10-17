package com.revolut.domain.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BankFieldFormat;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NONE", "NO_GAPS", "SPACE_EVERY_4", "DASH_EVERY_2", "INPUT_MASK", "DROPDOWN", "SEARCH_LIST", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankFieldFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BankFieldFormat[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final BankFieldFormat NONE = new BankFieldFormat("NONE", 0);
    public static final BankFieldFormat NO_GAPS = new BankFieldFormat("NO_GAPS", 1);
    public static final BankFieldFormat SPACE_EVERY_4 = new BankFieldFormat("SPACE_EVERY_4", 2);
    public static final BankFieldFormat DASH_EVERY_2 = new BankFieldFormat("DASH_EVERY_2", 3);
    public static final BankFieldFormat INPUT_MASK = new BankFieldFormat("INPUT_MASK", 4);
    public static final BankFieldFormat DROPDOWN = new BankFieldFormat("DROPDOWN", 5);
    public static final BankFieldFormat SEARCH_LIST = new BankFieldFormat("SEARCH_LIST", 6);

    /* JADX INFO: renamed from: com.revolut.domain.models.beneficiary.BankFieldFormat$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private static final /* synthetic */ BankFieldFormat[] $values() {
        return new BankFieldFormat[]{NONE, NO_GAPS, SPACE_EVERY_4, DASH_EVERY_2, INPUT_MASK, DROPDOWN, SEARCH_LIST};
    }

    static {
        BankFieldFormat[] bankFieldFormatArr$values = $values();
        $VALUES = bankFieldFormatArr$values;
        $ENTRIES = s.n(bankFieldFormatArr$values);
        INSTANCE = new Companion();
    }

    private BankFieldFormat(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BankFieldFormat valueOf(String str) {
        return (BankFieldFormat) Enum.valueOf(BankFieldFormat.class, str);
    }

    public static BankFieldFormat[] values() {
        return (BankFieldFormat[]) $VALUES.clone();
    }
}
