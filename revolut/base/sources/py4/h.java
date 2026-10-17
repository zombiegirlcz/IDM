package py4;

import android.widget.ImageView;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.t5;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f240667a;

    public h(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f240667a = uiResources;
    }

    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a aVar = domainState.f240660a;
        String str = aVar.f240657a;
        Clause textLocalisedClause = (str == null || str.length() == 0) ? new TextLocalisedClause(R$string.loan_management_default_bank_name, null, null, 14) : new TextClause(aVar.f240657a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = aVar.d;
        String str3 = aVar.f240658b;
        String str4 = aVar.f240659c;
        TextClause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        int i = R$drawable.uikit_icn_24_back_button_arrow;
        int i2 = R$drawable.uikit_icn_24_bank;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        ConfigurableResourceImage configurableResourceImage = new ConfigurableResourceImage(i2, Integer.valueOf(kli.a.x(R$attr.uikit_colorTeal, this.f240667a.f22265a)), null, null, 1012);
        t5[] elements = {(str2 == null || str2.length() == 0) ? null : new t5("ID_BENEFICIARY_NAME", new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.account_detail_beneficiary, null, null, 14), str2, null, null, 0, 0, 0, 0, 2024), new t5("ID_ACCOUNT_NUMBER", new TextClause(str4 == null ? "" : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.account_detail_account_number, null, null, 14), str4 == null ? "" : str4, null, null, 0, 0, 0, 0, 2024), new t5("ID_SORT_CODE", new TextClause(str3 == null ? "" : str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.credit_bank_account_details_sort_code_hint, null, null, 14), str3 == null ? "" : str3, null, null, 0, 0, 0, 0, 2024)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new d(textLocalisedClause, textClause, i, configurableResourceImage, listL);
    }
}
