package yof;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface k {

    @NotNull
    public static final j Companion = j.f315679a;

    static /* synthetic */ qv0.i a(k kVar, String str, TextLocalisedClause textLocalisedClause, int i) {
        if ((i & 2) != 0) {
            textLocalisedClause = new TextLocalisedClause(R$string.transfer_note_hint_add, null, null, 14);
        }
        return ((ppf.d) kVar).g(textLocalisedClause, str, (i & 4) != 0);
    }
}
