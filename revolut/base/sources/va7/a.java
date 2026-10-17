package va7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.feature.hidden_accounts.impl.R$string;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.e0;
import o97.r;
import o97.y;
import wa7.m;
import yp0.b;
import yy0.i;
import yy0.l;
import z87.d;
import zhm.f0;
import zhm.u;
import zi0.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f287170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f287171b;

    public a(m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f287170a = hiddenAccountsInteractor;
        this.f287171b = r.SECRET_ACCOUNTS_PHRASE_MATCH;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        m mVar = this.f287170a;
        if (!mVar.d() || !mVar.e(searchQuery)) {
            return c.j(f0.f322471a);
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_lock, null, null, 6), null, null, false, null, false, 62);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.secret_accounts_search_title, null, null, 14);
        i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        RowDelegate.Model model = new RowDelegate.Model("SECRET_ACCOUNTS_SEARCH_RESULT_ROW_LIST_ID", image40, textLocalisedClause, null, 0, null, null, null, 0, new tf(i.a(resourceImage)), true, null, false, null, null, null, null, null, null, new y(this.f287171b, null, null, 62), null, 0, 0, 0, 0, 532673528);
        b.l(model, 0, 0, 0, 0, null, false, 63);
        return c.j(u.c(new e0(model)));
    }

    @Override // z87.f
    public final r h() {
        return this.f287171b;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        return new o97.b(new qa7.d(HiddenAccountsConfig.Accounts.f74647b, na7.b.SECRET));
    }
}
