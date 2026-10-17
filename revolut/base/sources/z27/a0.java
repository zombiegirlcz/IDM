package z27;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final x Companion = new x();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        final f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 1;
        q qVar = (q) iii.c.f(domainState.f318978a, new z1i.l(14), new z0f.a0(9), new Function3(this) { // from class: z27.w
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i2;
                String str;
                TextLocalisedClause textLocalisedClause;
                TextLocalisedClause textLocalisedClause2;
                TextLocalisedClause textLocalisedClause3;
                TextLocalisedClause textLocalisedClause4;
                int i3;
                Image imageB;
                RowDelegate.Model model;
                TextLocalisedClause textLocalisedClause5;
                TextLocalisedClause textLocalisedClause6;
                TextLocalisedClause textLocalisedClause7;
                int i5 = i;
                int i6 = 1;
                String str2 = "countryCode";
                String str3 = null;
                textNavBarMenuItem = null;
                textNavBarMenuItem = null;
                TextNavBarMenuItem textNavBarMenuItem = null;
                int i21 = 2;
                f fVar = domainState;
                switch (i5) {
                    case 0:
                        e taxInfo = (e) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
                        List list = taxInfo.f318976a.f117246a.f73488j;
                        ArrayList arrayList = new ArrayList();
                        int i22 = 0;
                        for (Object obj5 : list) {
                            int i32 = i22 + 1;
                            if (i22 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TaxHubAssessmentStep taxHubAssessmentStep = (TaxHubAssessmentStep) obj5;
                            String str4 = taxHubAssessmentStep.f73480a;
                            ds6.o stepType = taxHubAssessmentStep.f73481b;
                            Intrinsics.checkNotNullParameter(stepType, "stepType");
                            int[] iArr = b37.a.f12012b;
                            int i33 = iArr[stepType.ordinal()];
                            if (i33 == i6) {
                                i2 = R$string.freelancer_tax_profile_checklist_step_export_transactions_title;
                            } else if (i33 == i21) {
                                i2 = R$string.freelancer_tax_profile_checklist_step_complete_your_return_title;
                            } else {
                                if (i33 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i2 = R$string.freelancer_tax_profile_checklist_step_make_payment_title;
                            }
                            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(i2, null, null, 14);
                            ds6.j taxType = fVar.f318979b;
                            wi0.b bVarY = do3.q.y(taxInfo.f318977b);
                            String str5 = bVarY.f297794a;
                            Intrinsics.checkNotNullParameter(stepType, "stepType");
                            Intrinsics.checkNotNullParameter(taxType, "taxType");
                            Intrinsics.checkNotNullParameter(bVarY, str2);
                            int i43 = iArr[stepType.ordinal()];
                            if (i43 == 1) {
                                str = str2;
                                int i59 = b37.a.f12011a[taxType.ordinal()];
                                if (i59 != 1) {
                                    if (i59 == 2) {
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297760n0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_social_security_fr, null, null, 14);
                                        } else {
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.SOCIAL_SECURITY + "-" + ds6.o.EXPORT_TRANSACTIONS);
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            textLocalisedClause2 = null;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                            textLocalisedClause4 = textLocalisedClause2;
                                        }
                                    } else {
                                        if (i59 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297750h0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_es, null, null, 14);
                                        } else {
                                            if (bVarY.equals(wi0.b.p0)) {
                                                textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_gb, null, null, 14);
                                            } else if (bVarY.equals(wi0.b.L0)) {
                                                textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_ie, null, null, 14);
                                            } else if (bVarY.equals(wi0.b.T0)) {
                                                textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_it, null, null, 14);
                                            } else {
                                                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.VAT + "-" + ds6.o.EXPORT_TRANSACTIONS);
                                                h0 h0Var2 = h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                                                textLocalisedClause4 = null;
                                            }
                                            textLocalisedClause4 = textLocalisedClause3;
                                        }
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                } else {
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_fr, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_it, null, null, 14);
                                    } else {
                                        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.INCOME + "-" + ds6.o.EXPORT_TRANSACTIONS);
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                }
                            } else if (i43 == 2) {
                                str = str2;
                                int i66 = b37.a.f12011a[taxType.ordinal()];
                                if (i66 != 1) {
                                    if (i66 == 2) {
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297760n0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_social_security_fr, null, null, 14);
                                        } else {
                                            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.SOCIAL_SECURITY + "-" + ds6.o.GO_TO_TAX_AUTHORITY);
                                            h0 h0Var4 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                            textLocalisedClause2 = null;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException4, h0Var4);
                                            textLocalisedClause4 = textLocalisedClause2;
                                        }
                                    } else {
                                        if (i66 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297750h0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_vat_es, null, null, 14);
                                        } else if (bVarY.equals(wi0.b.p0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_vat_gb, null, null, 14);
                                        } else if (bVarY.equals(wi0.b.L0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_vat_ie, null, null, 14);
                                        } else if (bVarY.equals(wi0.b.T0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_vat_it, null, null, 14);
                                        } else {
                                            IllegalArgumentException illegalArgumentException5 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.VAT + "-" + ds6.o.GO_TO_TAX_AUTHORITY);
                                            h0 h0Var5 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException5, h0Var5);
                                            textLocalisedClause4 = null;
                                        }
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                } else {
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_fr, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_it, null, null, 14);
                                    } else {
                                        IllegalArgumentException illegalArgumentException6 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.INCOME + "-" + ds6.o.GO_TO_TAX_AUTHORITY);
                                        h0 h0Var6 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException6, h0Var6);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                }
                            } else {
                                if (i43 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i74 = b37.a.f12011a[taxType.ordinal()];
                                if (i74 == 1) {
                                    str = str2;
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_fr, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_it, null, null, 14);
                                    } else {
                                        IllegalArgumentException illegalArgumentException7 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.INCOME + "-" + ds6.o.MAKE_PAYMENT);
                                        h0 h0Var7 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException7, h0Var7);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                } else if (i74 == 2) {
                                    str = str2;
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_social_security_fr, null, null, 14);
                                        textLocalisedClause4 = textLocalisedClause;
                                    } else {
                                        IllegalArgumentException illegalArgumentException8 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.SOCIAL_SECURITY + "-" + ds6.o.MAKE_PAYMENT);
                                        h0 h0Var8 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                                        textLocalisedClause2 = null;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException8, h0Var8);
                                        textLocalisedClause4 = textLocalisedClause2;
                                    }
                                } else {
                                    if (i74 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_it, null, null, 14);
                                    } else {
                                        str = str2;
                                        IllegalArgumentException illegalArgumentException9 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.VAT + "-" + ds6.o.MAKE_PAYMENT);
                                        h0 h0Var9 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList9 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException9, h0Var9);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause5;
                                    str = str2;
                                }
                            }
                            if (textLocalisedClause4 == null) {
                                i3 = 2;
                                model = null;
                            } else {
                                int i92 = z.f319006a[taxHubAssessmentStep.f73482c.ordinal()];
                                if (i92 != 1) {
                                    i3 = 2;
                                    if (i92 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    imageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_check, Integer.valueOf(R$attr.uikit_colorBackground), R$attr.uikit_colorStatusSuccess, 4.0f, null, null, 48);
                                } else {
                                    i3 = 2;
                                    imageB = com.revolut.core.ui_kit_core.displayers.image.models.a.b(i32, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8);
                                }
                                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(imageB, false, false, 6);
                                yy0.i iVar = yy0.l.Companion;
                                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                                iVar.getClass();
                                tf tfVar = new tf(yy0.i.a(resourceImage), sf.TOP);
                                ds6.m mVar = taxInfo.f318976a;
                                RowDelegate.Model model2 = new RowDelegate.Model(str4, image24, textLocalisedClause8, null, 0, textLocalisedClause4, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, new y(taxHubAssessmentStep, mVar.f117247b, mVar.f117246a), new AnalyticsContext(x47.a.a(fVar.f318979b)), 0, 0, 0, 0, 524286936);
                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                model = model2;
                            }
                            if (model != null) {
                                arrayList.add(model);
                            }
                            i21 = i3;
                            i22 = i32;
                            str2 = str;
                            i6 = 1;
                            str3 = null;
                        }
                        boolean zIsEmpty = arrayList.isEmpty();
                        List listB = arrayList;
                        if (zIsEmpty) {
                            listB = iii.c.b(str3, str3, 6, false);
                        }
                        return listB;
                    default:
                        e taxInfo2 = (e) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(taxInfo2, "taxInfo");
                        ds6.j taxType2 = fVar.f318979b;
                        wi0.b countryCode = do3.q.y(taxInfo2.f318977b);
                        String str6 = countryCode.f297794a;
                        Intrinsics.checkNotNullParameter(taxType2, "taxType");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        int[] iArr2 = b37.a.f12011a;
                        int i96 = iArr2[taxType2.ordinal()];
                        if (i96 == 1) {
                            wi0.b.Companion.getClass();
                            if (countryCode.equals(wi0.b.f297750h0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_es, null, null, 14);
                            } else if (countryCode.equals(wi0.b.f297760n0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_fr, null, null, 14);
                            } else if (countryCode.equals(wi0.b.p0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_gb, null, null, 14);
                            } else if (countryCode.equals(wi0.b.L0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_ie, null, null, 14);
                            } else if (countryCode.equals(wi0.b.T0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException10 = new IllegalArgumentException("No title supported for " + str6 + "-" + ds6.j.INCOME);
                                h0 h0Var10 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList10 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException10, h0Var10);
                                textLocalisedClause6 = null;
                            }
                        } else if (i96 == 2) {
                            wi0.b.Companion.getClass();
                            if (countryCode.equals(wi0.b.f297760n0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_social_security_fr, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException11 = new IllegalArgumentException("No title supported for " + str6 + "-" + ds6.j.SOCIAL_SECURITY);
                                h0 h0Var11 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList11 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException11, h0Var11);
                                textLocalisedClause6 = null;
                            }
                        } else {
                            if (i96 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            wi0.b.Companion.getClass();
                            if (countryCode.equals(wi0.b.f297750h0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_es, null, null, 14);
                            } else if (countryCode.equals(wi0.b.p0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_gb, null, null, 14);
                            } else if (countryCode.equals(wi0.b.L0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_ie, null, null, 14);
                            } else if (countryCode.equals(wi0.b.T0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException12 = new IllegalArgumentException("No title supported for " + str6 + "-" + ds6.j.VAT);
                                h0 h0Var12 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList12 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException12, h0Var12);
                                textLocalisedClause6 = null;
                            }
                        }
                        TextLocalisedClause textLocalisedClause9 = textLocalisedClause6 != null ? new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title, zhm.u.c(textLocalisedClause6), null, 12) : null;
                        ds6.j taxType3 = fVar.f318979b;
                        wi0.b countryCode2 = do3.q.y(taxInfo2.f318977b);
                        String str7 = countryCode2.f297794a;
                        Intrinsics.checkNotNullParameter(taxType3, "taxType");
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        int i99 = iArr2[taxType3.ordinal()];
                        if (i99 == 1) {
                            wi0.b.Companion.getClass();
                            if (countryCode2.equals(wi0.b.f297750h0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_es, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.f297760n0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_fr, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.p0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_gb, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.L0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_ie, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.T0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException13 = new IllegalArgumentException("No caption supported for " + str7 + "-" + ds6.j.INCOME);
                                h0 h0Var13 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList13 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException13, h0Var13);
                                textLocalisedClause7 = null;
                            }
                        } else if (i99 == 2) {
                            wi0.b.Companion.getClass();
                            if (countryCode2.equals(wi0.b.f297760n0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_social_security_fr, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException14 = new IllegalArgumentException("No caption supported for " + str7 + "-" + ds6.j.SOCIAL_SECURITY);
                                h0 h0Var14 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList14 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException14, h0Var14);
                                textLocalisedClause7 = null;
                            }
                        } else {
                            if (i99 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            wi0.b.Companion.getClass();
                            if (countryCode2.equals(wi0.b.f297750h0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_es, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.p0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_gb, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.L0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_ie, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.T0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException15 = new IllegalArgumentException("No caption supported for " + str7 + "-" + ds6.j.VAT);
                                h0 h0Var15 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList15 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException15, h0Var15);
                                textLocalisedClause7 = null;
                            }
                        }
                        if (textLocalisedClause9 == null || textLocalisedClause7 == null) {
                            return o.f318991a;
                        }
                        TaxHubCalendarEvent taxHubCalendarEvent = taxInfo2.f318976a.f117246a;
                        if (taxHubCalendarEvent.f73485c != ds6.t.COMPLETED) {
                            List list2 = taxHubCalendarEvent.f73488j;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it8 = list2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        if (((TaxHubAssessmentStep) it8.next()).f73482c == ds6.n.ACTIVE) {
                                            textNavBarMenuItem = new TextNavBarMenuItem("LIST_ID_MENU_MARK_AS_PAID", new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_action_mark_as_completed, null, null, 14), null, null, 12);
                                        }
                                    }
                                }
                            }
                        }
                        return new n(textLocalisedClause9, textLocalisedClause7, zhm.v.l(textNavBarMenuItem));
                }
            }
        });
        final int i2 = 0;
        return new r(qVar, new m(qVar instanceof n ? new TextLocalisedClause(R$string.freelancer_tax_profile_common_disclaimer_footer, null, null, 14) : null), (List) iii.c.f(domainState.f318978a, new z1i.l(this), new z0f.a0(this, 8), new Function3(this) { // from class: z27.w
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i22;
                String str;
                TextLocalisedClause textLocalisedClause;
                TextLocalisedClause textLocalisedClause2;
                TextLocalisedClause textLocalisedClause3;
                TextLocalisedClause textLocalisedClause4;
                int i3;
                Image imageB;
                RowDelegate.Model model;
                TextLocalisedClause textLocalisedClause5;
                TextLocalisedClause textLocalisedClause6;
                TextLocalisedClause textLocalisedClause7;
                int i5 = i2;
                int i6 = 1;
                String str2 = "countryCode";
                String str3 = null;
                textNavBarMenuItem = null;
                textNavBarMenuItem = null;
                TextNavBarMenuItem textNavBarMenuItem = null;
                int i21 = 2;
                f fVar = domainState;
                switch (i5) {
                    case 0:
                        e taxInfo = (e) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
                        List list = taxInfo.f318976a.f117246a.f73488j;
                        ArrayList arrayList = new ArrayList();
                        int i222 = 0;
                        for (Object obj5 : list) {
                            int i32 = i222 + 1;
                            if (i222 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TaxHubAssessmentStep taxHubAssessmentStep = (TaxHubAssessmentStep) obj5;
                            String str4 = taxHubAssessmentStep.f73480a;
                            ds6.o stepType = taxHubAssessmentStep.f73481b;
                            Intrinsics.checkNotNullParameter(stepType, "stepType");
                            int[] iArr = b37.a.f12012b;
                            int i33 = iArr[stepType.ordinal()];
                            if (i33 == i6) {
                                i22 = R$string.freelancer_tax_profile_checklist_step_export_transactions_title;
                            } else if (i33 == i21) {
                                i22 = R$string.freelancer_tax_profile_checklist_step_complete_your_return_title;
                            } else {
                                if (i33 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i22 = R$string.freelancer_tax_profile_checklist_step_make_payment_title;
                            }
                            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(i22, null, null, 14);
                            ds6.j taxType = fVar.f318979b;
                            wi0.b bVarY = do3.q.y(taxInfo.f318977b);
                            String str5 = bVarY.f297794a;
                            Intrinsics.checkNotNullParameter(stepType, "stepType");
                            Intrinsics.checkNotNullParameter(taxType, "taxType");
                            Intrinsics.checkNotNullParameter(bVarY, str2);
                            int i43 = iArr[stepType.ordinal()];
                            if (i43 == 1) {
                                str = str2;
                                int i59 = b37.a.f12011a[taxType.ordinal()];
                                if (i59 != 1) {
                                    if (i59 == 2) {
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297760n0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_social_security_fr, null, null, 14);
                                        } else {
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.SOCIAL_SECURITY + "-" + ds6.o.EXPORT_TRANSACTIONS);
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            textLocalisedClause2 = null;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                            textLocalisedClause4 = textLocalisedClause2;
                                        }
                                    } else {
                                        if (i59 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297750h0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_es, null, null, 14);
                                        } else {
                                            if (bVarY.equals(wi0.b.p0)) {
                                                textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_gb, null, null, 14);
                                            } else if (bVarY.equals(wi0.b.L0)) {
                                                textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_ie, null, null, 14);
                                            } else if (bVarY.equals(wi0.b.T0)) {
                                                textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_vat_it, null, null, 14);
                                            } else {
                                                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.VAT + "-" + ds6.o.EXPORT_TRANSACTIONS);
                                                h0 h0Var2 = h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                                                textLocalisedClause4 = null;
                                            }
                                            textLocalisedClause4 = textLocalisedClause3;
                                        }
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                } else {
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_fr, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_export_transactions_description_income_it, null, null, 14);
                                    } else {
                                        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.INCOME + "-" + ds6.o.EXPORT_TRANSACTIONS);
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                }
                            } else if (i43 == 2) {
                                str = str2;
                                int i66 = b37.a.f12011a[taxType.ordinal()];
                                if (i66 != 1) {
                                    if (i66 == 2) {
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297760n0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_social_security_fr, null, null, 14);
                                        } else {
                                            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.SOCIAL_SECURITY + "-" + ds6.o.GO_TO_TAX_AUTHORITY);
                                            h0 h0Var4 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                            textLocalisedClause2 = null;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException4, h0Var4);
                                            textLocalisedClause4 = textLocalisedClause2;
                                        }
                                    } else {
                                        if (i66 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        wi0.b.Companion.getClass();
                                        if (bVarY.equals(wi0.b.f297750h0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_vat_es, null, null, 14);
                                        } else if (bVarY.equals(wi0.b.p0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_vat_gb, null, null, 14);
                                        } else if (bVarY.equals(wi0.b.L0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_vat_ie, null, null, 14);
                                        } else if (bVarY.equals(wi0.b.T0)) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_tax_filling_description_vat_it, null, null, 14);
                                        } else {
                                            IllegalArgumentException illegalArgumentException5 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.VAT + "-" + ds6.o.GO_TO_TAX_AUTHORITY);
                                            h0 h0Var5 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException5, h0Var5);
                                            textLocalisedClause4 = null;
                                        }
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                } else {
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_fr, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_complete_your_return_description_income_it, null, null, 14);
                                    } else {
                                        IllegalArgumentException illegalArgumentException6 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.INCOME + "-" + ds6.o.GO_TO_TAX_AUTHORITY);
                                        h0 h0Var6 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException6, h0Var6);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                }
                            } else {
                                if (i43 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i74 = b37.a.f12011a[taxType.ordinal()];
                                if (i74 == 1) {
                                    str = str2;
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_fr, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_income_it, null, null, 14);
                                    } else {
                                        IllegalArgumentException illegalArgumentException7 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.INCOME + "-" + ds6.o.MAKE_PAYMENT);
                                        h0 h0Var7 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException7, h0Var7);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause;
                                } else if (i74 == 2) {
                                    str = str2;
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297760n0)) {
                                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_social_security_fr, null, null, 14);
                                        textLocalisedClause4 = textLocalisedClause;
                                    } else {
                                        IllegalArgumentException illegalArgumentException8 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.SOCIAL_SECURITY + "-" + ds6.o.MAKE_PAYMENT);
                                        h0 h0Var8 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                                        textLocalisedClause2 = null;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException8, h0Var8);
                                        textLocalisedClause4 = textLocalisedClause2;
                                    }
                                } else {
                                    if (i74 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    wi0.b.Companion.getClass();
                                    if (bVarY.equals(wi0.b.f297750h0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_es, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.p0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_gb, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.L0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_ie, null, null, 14);
                                    } else if (bVarY.equals(wi0.b.T0)) {
                                        textLocalisedClause5 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_step_make_payment_description_vat_it, null, null, 14);
                                    } else {
                                        str = str2;
                                        IllegalArgumentException illegalArgumentException9 = new IllegalArgumentException("No subtitle supported for " + str5 + "-" + ds6.j.VAT + "-" + ds6.o.MAKE_PAYMENT);
                                        h0 h0Var9 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList9 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException9, h0Var9);
                                        textLocalisedClause4 = null;
                                    }
                                    textLocalisedClause4 = textLocalisedClause5;
                                    str = str2;
                                }
                            }
                            if (textLocalisedClause4 == null) {
                                i3 = 2;
                                model = null;
                            } else {
                                int i92 = z.f319006a[taxHubAssessmentStep.f73482c.ordinal()];
                                if (i92 != 1) {
                                    i3 = 2;
                                    if (i92 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    imageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_check, Integer.valueOf(R$attr.uikit_colorBackground), R$attr.uikit_colorStatusSuccess, 4.0f, null, null, 48);
                                } else {
                                    i3 = 2;
                                    imageB = com.revolut.core.ui_kit_core.displayers.image.models.a.b(i32, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8);
                                }
                                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(imageB, false, false, 6);
                                yy0.i iVar = yy0.l.Companion;
                                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                                iVar.getClass();
                                tf tfVar = new tf(yy0.i.a(resourceImage), sf.TOP);
                                ds6.m mVar = taxInfo.f318976a;
                                RowDelegate.Model model2 = new RowDelegate.Model(str4, image24, textLocalisedClause8, null, 0, textLocalisedClause4, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, new y(taxHubAssessmentStep, mVar.f117247b, mVar.f117246a), new AnalyticsContext(x47.a.a(fVar.f318979b)), 0, 0, 0, 0, 524286936);
                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                model = model2;
                            }
                            if (model != null) {
                                arrayList.add(model);
                            }
                            i21 = i3;
                            i222 = i32;
                            str2 = str;
                            i6 = 1;
                            str3 = null;
                        }
                        boolean zIsEmpty = arrayList.isEmpty();
                        List listB = arrayList;
                        if (zIsEmpty) {
                            listB = iii.c.b(str3, str3, 6, false);
                        }
                        return listB;
                    default:
                        e taxInfo2 = (e) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(taxInfo2, "taxInfo");
                        ds6.j taxType2 = fVar.f318979b;
                        wi0.b countryCode = do3.q.y(taxInfo2.f318977b);
                        String str6 = countryCode.f297794a;
                        Intrinsics.checkNotNullParameter(taxType2, "taxType");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        int[] iArr2 = b37.a.f12011a;
                        int i96 = iArr2[taxType2.ordinal()];
                        if (i96 == 1) {
                            wi0.b.Companion.getClass();
                            if (countryCode.equals(wi0.b.f297750h0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_es, null, null, 14);
                            } else if (countryCode.equals(wi0.b.f297760n0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_fr, null, null, 14);
                            } else if (countryCode.equals(wi0.b.p0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_gb, null, null, 14);
                            } else if (countryCode.equals(wi0.b.L0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_ie, null, null, 14);
                            } else if (countryCode.equals(wi0.b.T0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_income_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException10 = new IllegalArgumentException("No title supported for " + str6 + "-" + ds6.j.INCOME);
                                h0 h0Var10 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList10 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException10, h0Var10);
                                textLocalisedClause6 = null;
                            }
                        } else if (i96 == 2) {
                            wi0.b.Companion.getClass();
                            if (countryCode.equals(wi0.b.f297760n0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_social_security_fr, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException11 = new IllegalArgumentException("No title supported for " + str6 + "-" + ds6.j.SOCIAL_SECURITY);
                                h0 h0Var11 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList11 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException11, h0Var11);
                                textLocalisedClause6 = null;
                            }
                        } else {
                            if (i96 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            wi0.b.Companion.getClass();
                            if (countryCode.equals(wi0.b.f297750h0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_es, null, null, 14);
                            } else if (countryCode.equals(wi0.b.p0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_gb, null, null, 14);
                            } else if (countryCode.equals(wi0.b.L0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_ie, null, null, 14);
                            } else if (countryCode.equals(wi0.b.T0)) {
                                textLocalisedClause6 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title_vat_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException12 = new IllegalArgumentException("No title supported for " + str6 + "-" + ds6.j.VAT);
                                h0 h0Var12 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList12 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException12, h0Var12);
                                textLocalisedClause6 = null;
                            }
                        }
                        TextLocalisedClause textLocalisedClause9 = textLocalisedClause6 != null ? new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_title, zhm.u.c(textLocalisedClause6), null, 12) : null;
                        ds6.j taxType3 = fVar.f318979b;
                        wi0.b countryCode2 = do3.q.y(taxInfo2.f318977b);
                        String str7 = countryCode2.f297794a;
                        Intrinsics.checkNotNullParameter(taxType3, "taxType");
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        int i99 = iArr2[taxType3.ordinal()];
                        if (i99 == 1) {
                            wi0.b.Companion.getClass();
                            if (countryCode2.equals(wi0.b.f297750h0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_es, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.f297760n0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_fr, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.p0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_gb, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.L0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_ie, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.T0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_income_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException13 = new IllegalArgumentException("No caption supported for " + str7 + "-" + ds6.j.INCOME);
                                h0 h0Var13 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList13 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException13, h0Var13);
                                textLocalisedClause7 = null;
                            }
                        } else if (i99 == 2) {
                            wi0.b.Companion.getClass();
                            if (countryCode2.equals(wi0.b.f297760n0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_social_security_fr, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException14 = new IllegalArgumentException("No caption supported for " + str7 + "-" + ds6.j.SOCIAL_SECURITY);
                                h0 h0Var14 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList14 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException14, h0Var14);
                                textLocalisedClause7 = null;
                            }
                        } else {
                            if (i99 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            wi0.b.Companion.getClass();
                            if (countryCode2.equals(wi0.b.f297750h0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_es, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.p0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_gb, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.L0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_ie, null, null, 14);
                            } else if (countryCode2.equals(wi0.b.T0)) {
                                textLocalisedClause7 = new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_header_caption_vat_it, null, null, 14);
                            } else {
                                IllegalArgumentException illegalArgumentException15 = new IllegalArgumentException("No caption supported for " + str7 + "-" + ds6.j.VAT);
                                h0 h0Var15 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList15 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException15, h0Var15);
                                textLocalisedClause7 = null;
                            }
                        }
                        if (textLocalisedClause9 == null || textLocalisedClause7 == null) {
                            return o.f318991a;
                        }
                        TaxHubCalendarEvent taxHubCalendarEvent = taxInfo2.f318976a.f117246a;
                        if (taxHubCalendarEvent.f73485c != ds6.t.COMPLETED) {
                            List list2 = taxHubCalendarEvent.f73488j;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it8 = list2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        if (((TaxHubAssessmentStep) it8.next()).f73482c == ds6.n.ACTIVE) {
                                            textNavBarMenuItem = new TextNavBarMenuItem("LIST_ID_MENU_MARK_AS_PAID", new TextLocalisedClause(R$string.freelancer_tax_profile_checklist_action_mark_as_completed, null, null, 14), null, null, 12);
                                        }
                                    }
                                }
                            }
                        }
                        return new n(textLocalisedClause9, textLocalisedClause7, zhm.v.l(textNavBarMenuItem));
                }
            }
        }));
    }
}
