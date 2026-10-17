package d01;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public abstract class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACTION_BAR;
    public static final e DEFAULT;

    static {
        e eVar = new e() { // from class: d01.d
            private final boolean forcesPillVariant;
            private final boolean hasRoundedItemBackground;
            private final boolean fillsAvailableWidth = true;
            private final boolean usesSuggestionStyleSpacing = true;

            @Override // d01.e
            public final boolean a() {
                return this.fillsAvailableWidth;
            }

            @Override // d01.e
            public final boolean b() {
                return this.forcesPillVariant;
            }

            @Override // d01.e
            public final boolean c() {
                return this.hasRoundedItemBackground;
            }

            @Override // d01.e
            public final boolean d() {
                return this.usesSuggestionStyleSpacing;
            }
        };
        DEFAULT = eVar;
        e eVar2 = new e() { // from class: d01.c
            private final boolean fillsAvailableWidth;
            private final boolean forcesPillVariant = true;
            private final boolean hasRoundedItemBackground = true;
            private final boolean usesSuggestionStyleSpacing;

            @Override // d01.e
            public final boolean a() {
                return this.fillsAvailableWidth;
            }

            @Override // d01.e
            public final boolean b() {
                return this.forcesPillVariant;
            }

            @Override // d01.e
            public final boolean c() {
                return this.hasRoundedItemBackground;
            }

            @Override // d01.e
            public final boolean d() {
                return this.usesSuggestionStyleSpacing;
            }
        };
        ACTION_BAR = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();
}
