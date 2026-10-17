package m4j;

import aw0.o9;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.domain.models.beneficiary.BeneficiarySearchListItem;
import com.revolut.retail.common.ui.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.n {

    @NotNull
    public static final l Companion = new l();

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        RowDelegate.Model.MainImage.Image40 image40;
        String str;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str2 = domainState.f202733a;
        List list2 = domainState.f202734b;
        if (!d0.W(str2)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                BeneficiarySearchListItem item = (BeneficiarySearchListItem) obj2;
                String query = domainState.f202733a;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(query, "query");
                if (d0.W(query) || d0.J(item.f60294b, query, true) || ((str = item.f60295c) != null && d0.J(str, query, true))) {
                    arrayList.add(obj2);
                }
            }
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("NO_SEARCH_RESULT_LIST_ID", new TextLocalisedClause(R$string.search_empty_title, null, null, 14), new TextLocalisedClause(R$string.search_empty_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            list = listC;
        } else {
            List<BeneficiarySearchListItem> list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (BeneficiarySearchListItem item2 : list3) {
                BankFieldDefinition bankFieldDefinition = domainState.d;
                String str3 = item2.f60293a;
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
                String str4 = item2.d;
                if (str4 != null) {
                    LayeredImage layeredImageA = Intrinsics.f(bankFieldDefinition.f60271a, "IL_BANK_CODE") ? LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorWidgetBackground), 12.0f, Float.valueOf(40.0f), 32) : null;
                    image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(str4, (String) null, (UrlImageDrawable) (layeredImageA != null ? new UrlImageDrawable.ImagePlaceholder(layeredImageA) : null), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282), null, null, false, null, false, 62);
                } else {
                    image40 = null;
                }
                TextClause textClause = new TextClause(item2.f60294b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str5 = item2.f60295c;
                arrayList2.add(new RowDelegate.Model(str3, image40, textClause, null, 0, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, item2, null, 0, 0, 0, 0, 532676568));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            list = arrayList2;
        }
        Clause clause = domainState.f202735c;
        return new j(clause, new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.beneficiary_creation_search_list_field_title, u.c(clause), null, 12), list);
    }
}
