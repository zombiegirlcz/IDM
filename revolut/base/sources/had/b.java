package had;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.invoices.impl.R$string;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f150483a;

    public b() {
        int i;
        EnumEntries enumEntriesA = u9d.b.a();
        int iB = q0.b(w.t(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : enumEntriesA) {
            switch (a.f150482a[((u9d.b) obj2).ordinal()]) {
                case 1:
                    i = R$string.invoices_shared_language_selector_bulgarian;
                    break;
                case 2:
                    i = R$string.invoices_shared_language_selector_croatian;
                    break;
                case 3:
                    i = R$string.invoices_shared_language_selector_czech;
                    break;
                case 4:
                    i = R$string.invoices_shared_language_selector_danish;
                    break;
                case 5:
                    i = R$string.invoices_shared_language_selector_dutch;
                    break;
                case 6:
                    i = R$string.invoices_shared_language_selector_english_au;
                    break;
                case 7:
                    i = R$string.invoices_shared_language_selector_english_uk;
                    break;
                case 8:
                    i = R$string.invoices_shared_language_selector_english_us;
                    break;
                case 9:
                    i = R$string.invoices_shared_language_selector_french;
                    break;
                case 10:
                    i = R$string.invoices_shared_language_selector_german;
                    break;
                case 11:
                    i = R$string.invoices_shared_language_selector_greek;
                    break;
                case 12:
                    i = R$string.invoices_shared_language_selector_hungarian;
                    break;
                case 13:
                    i = R$string.invoices_shared_language_selector_italian;
                    break;
                case 14:
                    i = R$string.invoices_shared_language_selector_latvian;
                    break;
                case 15:
                    i = R$string.invoices_shared_language_selector_lithuanian;
                    break;
                case 16:
                    i = R$string.invoices_shared_language_selector_polish;
                    break;
                case 17:
                    i = R$string.invoices_shared_language_selector_portuguese;
                    break;
                case 18:
                    i = R$string.invoices_shared_language_selector_romanian;
                    break;
                case 19:
                    i = R$string.invoices_shared_language_selector_russian;
                    break;
                case 20:
                    i = R$string.invoices_shared_language_selector_slovak;
                    break;
                case 21:
                    i = R$string.invoices_shared_language_selector_spanish;
                    break;
                case 22:
                    i = R$string.invoices_shared_language_selector_swedish;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            linkedHashMap.put(obj2, new TextLocalisedClause(i, null, null, 14));
        }
        this.f150483a = linkedHashMap;
    }

    public final Clause a(u9d.b language) {
        Intrinsics.checkNotNullParameter(language, "language");
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f150483a.get(language);
        return textLocalisedClause != null ? textLocalisedClause : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
