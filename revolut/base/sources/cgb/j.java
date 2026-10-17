package cgb;

import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        int i2;
        int i3;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.salary_account_bottom_sheet_move_title, null, null, 14), null, null, null, false, 30);
        EnumEntries<a> enumEntriesA = a.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (a aVar2 : enumEntriesA) {
            String strName = aVar2.name();
            int[] iArr = i.f23903a;
            int i5 = iArr[aVar2.ordinal()];
            if (i5 == 1) {
                i = R$drawable.uikit_icn_24_salary;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_logo_revolut;
            }
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new GlyphImage(i, null, null, 6), null, null, false, null, false, 62);
            int i6 = iArr[aVar2.ordinal()];
            if (i6 == 1) {
                i2 = R$string.salary_account_bottom_sheet_move_move_salary_title;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.salary_account_bottom_sheet_move_switch_revolut_title;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
            int i21 = iArr[aVar2.ordinal()];
            if (i21 == 1) {
                i3 = R$string.salary_account_bottom_sheet_move_move_salary_subtitle;
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$string.salary_account_bottom_sheet_move_switch_revolut_subtitle;
            }
            arrayList.add(new RowDelegate.Model(strName, image40, textLocalisedClause, null, 0, new TextLocalisedClause(i3, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, aVar2, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
