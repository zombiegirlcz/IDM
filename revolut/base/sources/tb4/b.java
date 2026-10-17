package tb4;

import android.os.Parcelable;
import aw0.o9;
import ch.qos.logback.core.util.FileSize;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import whf.j;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f269438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f269439b;

    public b(je6.h externalInstitutionLogoMapper, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f269438a = externalInstitutionLogoMapper;
        this.f269439b = transactionsListMapper;
    }

    public static ListSubheaderDelegate.Model a(String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(R$string.financial_evidence_summary_section_title, zhm.u.c(str), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static ArrayList c(List documents) {
        String str;
        Intrinsics.checkNotNullParameter(documents, "documents");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = documents.iterator();
        while (it8.hasNext()) {
            ry3.a aVar = (ry3.a) it8.next();
            File file = aVar.f258207a;
            RowDelegate.Model model = null;
            if (file.exists()) {
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.financial_evidence_summary_cell_document_title, zhm.u.c(file.getName()), null, 12);
                int i = R$string.financial_evidence_summary_cell_document_subtitle;
                long length = file.length();
                if (length >= FileSize.MB_COEFFICIENT) {
                    long j2 = 1024;
                    length = (length / j2) * j2;
                    str = " Mb";
                } else if (length >= FileSize.KB_COEFFICIENT) {
                    length /= (long) 1024;
                    str = " Kb";
                } else {
                    str = " b";
                }
                model = new RowDelegate.Model(path, new RowDelegate.Model.MainImage.Image40(new FileImage(file, R.drawable.icon_document_placeholder, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG)), null, null, false, null, false, 62), textLocalisedClause, null, 0, new TextLocalisedClause(i, zhm.u.c(ch.qos.logback.core.util.a.p(length, str)), null, 12), null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true), true, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532673496);
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
        return arrayList;
    }

    public final ArrayList b(List accounts) {
        RowDelegate.Model model;
        String strL;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List<av3.a> list = accounts;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (av3.a aVar : list) {
            if (aVar instanceof av3.i) {
                av3.i iVar = (av3.i) aVar;
                String str = iVar.f9906a;
                xi0.b bVar = iVar.f9908c;
                io3.d dVar = iVar.f9907b;
                Image imageB = ((di6.a) this.f269438a).b(dVar.f163156r);
                if (imageB == null) {
                    imageB = new CountryImage(dVar.f163147c, (Integer) null, (ez0.e) null, 14);
                }
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(imageB, null, null, false, null, false, 62);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.financial_evidence_summary_cell_external_title, zhm.u.c(iVar.f9906a), null, 12);
                int i = R$string.financial_evidence_summary_cell_external_subtitle;
                String str2 = bVar.f306286a;
                io3.e eVar = iVar.d;
                if (eVar != null) {
                    m70.a.c(t0.f186434a);
                    strL = hx7.b.l(eVar, "");
                } else {
                    strL = null;
                }
                String[] elements = {str2, strL};
                Intrinsics.checkNotNullParameter(elements, "elements");
                model = new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(dVar.i, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4), new TextLocalisedClause(R$string.financial_evidence_summary_cell_balance, null, null, 14), null, false, 124), false, null, false, null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532675544);
            } else {
                if (!(aVar instanceof av3.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                av3.j jVar = (av3.j) aVar;
                model = new RowDelegate.Model("revolut-account", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, new Color.Solid(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite), 8.0f, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.financial_evidence_summary_cell_revolut_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.financial_evidence_summary_cell_revolut_subtitle, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(jVar.f9910b, jVar.f9909a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4), new TextLocalisedClause(R$string.financial_evidence_summary_cell_balance, null, null, 14), null, false, 124), false, null, false, null, null, null, null, null, null, jVar, null, 0, 0, 0, 0, 532667352);
            }
            arrayList.add(model);
        }
        return arrayList;
    }

    public final List d(whf.p transactionsContent) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        if ((!transactionsContent.f297646a.isEmpty() ? transactionsContent : null) != null) {
            return ((anf.w) this.f269439b).c(transactionsContent, new whf.l(0), j.a.f297643a);
        }
        return f0.f322471a;
    }
}
