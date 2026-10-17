package zsc;

import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    private static final n Companion;
    public static final p MIDDLE_OF_THE_WORD;

    @Deprecated
    public static final char SPACE_CHAR = ' ';
    public static final p WORD_PREFIX;

    static {
        p pVar = new p("WORD_PREFIX", 0);
        WORD_PREFIX = pVar;
        p pVar2 = new p("MIDDLE_OF_THE_WORD", 1);
        MIDDLE_OF_THE_WORD = pVar2;
        p[] pVarArr = {pVar, pVar2};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
        Companion = new n();
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final boolean a(String query, Collection targetCollection) {
        int iS;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        int i = o.f324879a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Collection collection = targetCollection;
            if (!collection.isEmpty()) {
                Iterator it8 = collection.iterator();
                while (it8.hasNext()) {
                    if (d0.J((String) it8.next(), query, true)) {
                        return true;
                    }
                }
            }
            return false;
        }
        Collection<String> collection2 = targetCollection;
        if (!collection2.isEmpty()) {
            for (String str : collection2) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean zG = false;
                while (i2 >= 0 && i2 <= length) {
                    zG = a0.G(i2, str, true, query);
                    if (zG || i2 == length || (iS = d0.S(str, SPACE_CHAR, i2 + 1, 4)) < 0) {
                        break;
                    }
                    i2 = iS + 1;
                }
                if (zG) {
                    return true;
                }
            }
        }
        return false;
    }
}
