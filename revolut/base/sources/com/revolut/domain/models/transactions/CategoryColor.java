package com.revolut.domain.models.transactions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/domain/models/transactions/CategoryColor;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "BLUE", "DEEP_PURPLE", "LIGHT_BLUE", "INDIGO", "RED", "PINK", "ORANGE", "DEEP_PINK", "YELLOW", "DEEP_GREY", "BROWN", "PURPLE", "CYAN", "TEAL", "GREEN", "LIGHT_GREEN", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryColor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CategoryColor[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CategoryColor BLUE = new CategoryColor("BLUE", 0);
    public static final CategoryColor DEEP_PURPLE = new CategoryColor("DEEP_PURPLE", 1);
    public static final CategoryColor LIGHT_BLUE = new CategoryColor("LIGHT_BLUE", 2);
    public static final CategoryColor INDIGO = new CategoryColor("INDIGO", 3);
    public static final CategoryColor RED = new CategoryColor("RED", 4);
    public static final CategoryColor PINK = new CategoryColor("PINK", 5);
    public static final CategoryColor ORANGE = new CategoryColor("ORANGE", 6);
    public static final CategoryColor DEEP_PINK = new CategoryColor("DEEP_PINK", 7);
    public static final CategoryColor YELLOW = new CategoryColor("YELLOW", 8);
    public static final CategoryColor DEEP_GREY = new CategoryColor("DEEP_GREY", 9);
    public static final CategoryColor BROWN = new CategoryColor("BROWN", 10);
    public static final CategoryColor PURPLE = new CategoryColor("PURPLE", 11);
    public static final CategoryColor CYAN = new CategoryColor("CYAN", 12);
    public static final CategoryColor TEAL = new CategoryColor("TEAL", 13);
    public static final CategoryColor GREEN = new CategoryColor("GREEN", 14);
    public static final CategoryColor LIGHT_GREEN = new CategoryColor("LIGHT_GREEN", 15);

    /* JADX INFO: renamed from: com.revolut.domain.models.transactions.CategoryColor$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private static final /* synthetic */ CategoryColor[] $values() {
        return new CategoryColor[]{BLUE, DEEP_PURPLE, LIGHT_BLUE, INDIGO, RED, PINK, ORANGE, DEEP_PINK, YELLOW, DEEP_GREY, BROWN, PURPLE, CYAN, TEAL, GREEN, LIGHT_GREEN};
    }

    static {
        CategoryColor[] categoryColorArr$values = $values();
        $VALUES = categoryColorArr$values;
        $ENTRIES = s.n(categoryColorArr$values);
        INSTANCE = new Companion();
    }

    private CategoryColor(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CategoryColor valueOf(String str) {
        return (CategoryColor) Enum.valueOf(CategoryColor.class, str);
    }

    public static CategoryColor[] values() {
        return (CategoryColor[]) $VALUES.clone();
    }
}
