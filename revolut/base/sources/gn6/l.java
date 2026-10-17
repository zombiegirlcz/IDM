package gn6;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.domain.models.openbanking.instructions.InstructionsSecondaryButton;
import com.revolut.domain.models.openbanking.instructions.InstructionsSection;
import com.revolut.domain.models.openbanking.instructions.SectionStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f144929a;

    public l(je6.h externalInstitutionLogoMapper) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        this.f144929a = externalInstitutionLogoMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        String str;
        Image imageB;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InstitutionInstructions institutionInstructions = domainState.f144915a;
        ArrayList arrayList = institutionInstructions.d;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            InstructionsSection instructionsSection = (InstructionsSection) obj2;
            ArrayList arrayList3 = instructionsSection.f60416c;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, i));
            int i5 = 0;
            for (Object obj3 : arrayList3) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                String strG = a0.d.g(i2, i5, "STEP_", "_");
                TextClause textClause = new TextClause(((SectionStep) obj3).f60417a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i21 = k.f144928a[instructionsSection.f60415b.ordinal()];
                if (i21 == 1) {
                    imageB = com.revolut.core.ui_kit_core.displayers.image.models.a.b(i6, Integer.valueOf(R$attr.uikit_colorWhite), Integer.valueOf(R$attr.uikit_colorBlack), null, 24);
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imageB = new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                }
                arrayList4.add(new RowDelegate.Model(strG, new RowDelegate.Model.MainImage.Image24(imageB, false, false, 6), textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                i5 = i6;
            }
            arrayList2.add(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(a0.d.n("SECTION_", i2), (Image) null, (Clause) new TextClause(instructionsSection.f60414a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            i2 = i3;
            i = 10;
        }
        ArrayList arrayListU = w.u(arrayList2);
        TextClause textClause2 = new TextClause(institutionInstructions.f60409a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = institutionInstructions.f60410b;
        TextClause textClause3 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Image imageB2 = ((di6.a) this.f144929a).b(domainState.f144916b);
        InstructionsSecondaryButton instructionsSecondaryButton = institutionInstructions.f60411c;
        return new g(arrayListU, textClause2, textClause3, imageB2, (instructionsSecondaryButton == null || (str = instructionsSecondaryButton.f60412a) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}
