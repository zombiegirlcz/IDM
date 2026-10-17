package dsh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.widgets.api.R$string;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static b a(a aVar, e initialConfig, List list, String str, int i) {
            String str2;
            TextLocalisedClause title = new TextLocalisedClause(R$string.widgets_popup_show_up_to_title, null, null, 14);
            if ((i & 4) != 0) {
                list = v.k(new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_one, null, null, 14), "1"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_two, null, null, 14), "2"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_three, null, null, 14), "3"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_five, null, null, 14), "5"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_ten, null, null, 14), "10"));
            }
            List options = list;
            if ((i & 8) != 0) {
                str = "2";
            }
            aVar.getClass();
            Intrinsics.checkNotNullParameter(initialConfig, "initialConfig");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(options, "options");
            String strA = initialConfig.a("itemsCountLimit");
            if (strA != null) {
                str = strA;
            }
            List list2 = options;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                str2 = null;
            } else {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((dsh.a) it8.next()).f117314a, str)) {
                        str2 = str;
                        break;
                    }
                }
                str2 = null;
            }
            return new b("default_items_count_selector_id", title, options, str2, new q(initialConfig, 0));
        }

        public static int b(e eVar, int i) {
            String strA;
            return (eVar == null || (strA = eVar.a("itemsCountLimit")) == null) ? i : Integer.parseInt(strA);
        }

        public static /* synthetic */ int c(a aVar, e eVar) {
            aVar.getClass();
            return b(eVar, 2);
        }
    }
}
