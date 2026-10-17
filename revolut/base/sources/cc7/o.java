package cc7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.R$string;
import ip0.e80;
import ip0.f80;
import ip0.g80;
import ip0.h80;
import ip0.i80;
import ip0.k80;
import ip0.l80;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BAD;

    @NotNull
    public static final n Companion;
    public static final o GOOD;
    public static final o GREAT;
    public static final o OK;
    public static final o TERRIBLE;

    @NotNull
    private final l80 emoji;

    @NotNull
    private final Clause label;

    @NotNull
    private final zb7.c rating;

    static {
        o oVar = new o("TERRIBLE", 0, zb7.c.TERRIBLE, f80.f164215a, new TextLocalisedClause(R$string.uikit_widget_rating_terrible, null, null, 14));
        TERRIBLE = oVar;
        o oVar2 = new o("BAD", 1, zb7.c.BAD, g80.f164370a);
        BAD = oVar2;
        o oVar3 = new o("OK", 2, zb7.c.OK, e80.f164040a);
        OK = oVar3;
        o oVar4 = new o("GOOD", 3, zb7.c.GOOD, h80.f164520a);
        GOOD = oVar4;
        o oVar5 = new o("GREAT", 4, zb7.c.GREAT, i80.f164662a, new TextLocalisedClause(R$string.uikit_widget_rating_great, null, null, 14));
        GREAT = oVar5;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
        Companion = new n();
    }

    public o(String str, int i, zb7.c cVar, k80 k80Var, Clause clause) {
        this.rating = cVar;
        this.emoji = k80Var;
        this.label = clause;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final l80 a() {
        return this.emoji;
    }

    public final Clause b() {
        return this.label;
    }

    public final zb7.c c() {
        return this.rating;
    }

    public /* synthetic */ o(String str, int i, zb7.c cVar, k80 k80Var) {
        this(str, i, cVar, k80Var, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}
