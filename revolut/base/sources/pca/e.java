package pca;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e Send;

    @NotNull
    private final Clause title;

    static {
        e eVar = new e(new TextLocalisedClause(R$string.pix_send, null, null, 14));
        Send = eVar;
        e[] eVarArr = {eVar};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(TextLocalisedClause textLocalisedClause) {
        this.title = textLocalisedClause;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final Clause a() {
        return this.title;
    }
}
