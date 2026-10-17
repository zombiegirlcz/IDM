package fy4;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.t7;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dx4.a1;
import dx4.c1;
import dx4.d1;
import dx4.m2;
import dx4.n2;
import dx4.o2;
import dx4.p2;
import dx4.q2;
import dx4.r2;
import dx4.s2;
import dx4.u2;
import dx4.v2;
import dx4.w2;
import dx4.x2;
import dx4.y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jmrtd.lds.LDSFile;
import zhm.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f138904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx4.u f138905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx4.h f138906c;

    public r(t inputData, mx4.u imageMapper, mx4.h actionFooterMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
        this.f138904a = inputData;
        this.f138905b = imageMapper;
        this.f138906c = actionFooterMapper;
    }

    public final List a(y2 y2Var) {
        RowDelegate.Model.MainImage image40;
        Image imageT1;
        Media urlVideo;
        Image imageT12;
        ResourceImage resourceImage;
        Custom.Color.Solid solid;
        Custom custom;
        TextLocalisedClause textLocalisedClause;
        image24 = null;
        RowDelegate.Model.MainImage.Image24 image24 = null;
        if (y2Var instanceof v2) {
            v2 v2Var = (v2) y2Var;
            String str = v2Var.f120801a;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_constructor_info_item_note_description, prk.o.v(0, 30, null, null, str), null, 12);
            a1 a1Var = v2Var.f120802b;
            return zhm.u.c(new ListCellDelegate.Model(str, a1Var != null ? new j8(a1Var.T1()) : null, null, textLocalisedClause2, false, null, null, 0, 0, 0, 0, 4068));
        }
        boolean z = false;
        if (y2Var instanceof r2) {
            r2 r2Var = (r2) y2Var;
            q2 q2Var = r2Var.f;
            q2 q2Var2 = q2.FOREGROUND;
            int i = q2Var == q2Var2 ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50;
            String str2 = r2Var.f120743a;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_constructor_info_item_cell_title, zhm.u.c(new TextClause(str2, (Style) null, q2Var == q2Var2 ? Integer.valueOf(R$attr.uikit_colorForeground) : null, false, (o9) null, (List) null, 122)), null, 12);
            dx4.q qVar = r2Var.f120747h;
            if (qVar != null) {
                Integer numValueOf = Integer.valueOf(i);
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                resourceImage = new ResourceImage(c8g.c.v(qVar), (Integer) null, (Integer) null, numValueOf, (List) null, (ImageTransformations) null, (Clause) null, 246);
            } else {
                resourceImage = null;
            }
            t0 t0Var = new t0(textLocalisedClause3, resourceImage, 0, r2Var.f120746g != null, 20);
            o2 o2Var = r2Var.f120745c;
            n2 n2Var = r2Var.d;
            if (o2Var == o2.DEFAULT && n2Var == null) {
                custom = null;
            } else {
                boolean z3 = o2Var == o2.CROSSED;
                if (n2Var == null) {
                    solid = null;
                } else {
                    if (q.f138903b[n2Var.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    solid = new Custom.Color.Solid(R$attr.uikit_colorGreyTone20);
                }
                custom = new Custom(solid, z3, false, Constants.TAG_FC_SPEED_MODE);
            }
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_constructor_info_item_cell_description, zhm.u.c(new TextClause(r2Var.f120744b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), custom, 8);
            p2 p2Var = r2Var.e;
            if (p2Var != null) {
                textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_info_item_cell_second_description, zhm.u.c(p2Var.f120709a), p2Var.f120710b == o2.CROSSED ? new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION) : null, 8);
            } else {
                textLocalisedClause = null;
            }
            return zhm.u.c(new CellDetailsDelegate.Model(str2, t0Var, textLocalisedClause4, textLocalisedClause, r2Var.f120746g, null, null, 0, null, false, false, null, null, 32688));
        }
        int i2 = 6;
        if (y2Var instanceof w2) {
            w2 w2Var = (w2) y2Var;
            String str3 = w2Var.f120814a;
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_application_constructor_info_item_row_title, zhm.u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            String str4 = w2Var.f120815b;
            TextLocalisedClause textLocalisedClause6 = str4 != null ? new TextLocalisedClause(R$string.credit_application_constructor_info_item_row_description, zhm.u.c(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
            c1 c1Var = w2Var.f120816c;
            if (c1Var != null && (imageT12 = c1Var.T1()) != null) {
                image24 = new RowDelegate.Model.MainImage.Image24(imageT12, z, z, i2);
            }
            return zhm.u.c(new RowDelegate.Model(str3, image24, textLocalisedClause5, null, 0, textLocalisedClause6, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        if (y2Var instanceof u2) {
            u2 u2Var = (u2) y2Var;
            String str5 = u2Var.f120786a;
            int i3 = q.f138902a[u2Var.f120787b.ordinal()];
            if (i3 == 1) {
                urlVideo = new UrlVideo(u2Var.f120788c, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG);
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                urlVideo = new UrlImage(u2Var.f120788c, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
            }
            return zhm.u.c(new LightPromptDelegate.Model(str5, urlVideo, t7.f54744a));
        }
        if (y2Var instanceof x2) {
            String str6 = ((x2) y2Var).f120830a;
            return zhm.u.c(new PlainTextDelegate.Model(str6, (Clause) null, (Clause) new TextLocalisedClause(R$string.credit_application_constructor_info_item_text_text, prk.o.v(0, 30, null, null, str6), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
        }
        if (y2Var instanceof s2) {
            s2 s2Var = (s2) y2Var;
            aim.e eVarB = zhm.u.b();
            String str7 = s2Var.f120762a;
            ListSubheaderDelegate.Model model = str7 != null ? new ListSubheaderDelegate.Model(str7, (Image) null, (Clause) new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null;
            List list = s2Var.f120763b;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                a0.x(a((y2) it8.next()), arrayList);
            }
            if (model != null) {
                arrayList = yp0.b.g(arrayList, model, null, 0, 0, 126);
            } else {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            }
            eVarB.addAll(arrayList);
            return zhm.u.a(eVarB);
        }
        if (!(y2Var instanceof m2)) {
            throw new NoWhenBranchMatchedException();
        }
        m2 m2Var = (m2) y2Var;
        String str8 = m2Var.f120677a;
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_application_constructor_info_item_row_title, zhm.u.c(new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str9 = m2Var.f120678b;
        TextLocalisedClause textLocalisedClause8 = str9 != null ? new TextLocalisedClause(R$string.credit_application_constructor_info_item_row_description, zhm.u.c(new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        c1 c1Var2 = m2Var.d;
        if (c1Var2 == null || (imageT1 = c1Var2.T1()) == null) {
            d1 d1Var = m2Var.f120679c;
            image40 = d1Var != null ? new RowDelegate.Model.MainImage.Image40(this.f138905b.a(d1Var), null, null, false, null, false, 62) : null;
        } else {
            image40 = new RowDelegate.Model.MainImage.Image24(imageT1, z, z, i2);
        }
        a1 a1Var2 = m2Var.e;
        tf tfVar = a1Var2 != null ? new tf(6, new ResourceImage(a1Var2.c(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null;
        dx4.l lVar = m2Var.f;
        return zhm.u.c(new RowDelegate.Model(str8, image40, textLocalisedClause7, null, 0, textLocalisedClause8, null, null, 0, tfVar, lVar != null, null, false, null, null, null, null, null, null, lVar, null, 0, 0, 0, 0, 532673496));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079 A[LOOP:0: B:15:0x0073->B:17:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[SYNTHETIC] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r26) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fy4.r.c(cli.j):cli.o");
    }
}
