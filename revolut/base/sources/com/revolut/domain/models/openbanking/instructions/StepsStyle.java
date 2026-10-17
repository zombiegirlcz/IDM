package com.revolut.domain.models.openbanking.instructions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/openbanking/instructions/StepsStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NUMBERS", "BULLETS", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StepsStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StepsStyle[] $VALUES;
    public static final StepsStyle NUMBERS = new StepsStyle("NUMBERS", 0);
    public static final StepsStyle BULLETS = new StepsStyle("BULLETS", 1);

    private static final /* synthetic */ StepsStyle[] $values() {
        return new StepsStyle[]{NUMBERS, BULLETS};
    }

    static {
        StepsStyle[] stepsStyleArr$values = $values();
        $VALUES = stepsStyleArr$values;
        $ENTRIES = s.n(stepsStyleArr$values);
    }

    private StepsStyle(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static StepsStyle valueOf(String str) {
        return (StepsStyle) Enum.valueOf(StepsStyle.class, str);
    }

    public static StepsStyle[] values() {
        return (StepsStyle[]) $VALUES.clone();
    }
}
