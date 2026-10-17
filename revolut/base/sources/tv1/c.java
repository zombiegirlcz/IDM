package tv1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.breb.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c Send;

    @NotNull
    private final Clause title;

    static {
        c cVar = new c(new TextLocalisedClause(R$string.bre_b_send_title, null, null, 14));
        Send = cVar;
        c[] cVarArr = {cVar};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(TextLocalisedClause textLocalisedClause) {
        this.title = textLocalisedClause;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final Clause a() {
        return this.title;
    }
}
