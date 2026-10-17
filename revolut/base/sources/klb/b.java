package klb;

import android.os.Parcelable;
import aw0.eb;
import aw0.fb;
import aw0.o9;
import aw0.p6;
import aw0.t0;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.savings.models.info_sheets.Icon;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheet;
import com.revolut.feature.shared.savings.models.info_sheets.StyledText;
import com.youTransactor.uCube.rpc.Constants;
import hlb.p;
import hx7.e;
import ip0.ck0;
import ip0.e10;
import ip0.g10;
import ip0.t6;
import ip0.v6;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import qv0.o;
import rd0.d;
import yhm.m;
import yhm.n;
import yy0.j;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static int b(mcd.a aVar, int i) {
        Integer numC = c(aVar);
        if (numC != null) {
            return numC.intValue();
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown color " + aVar);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return i;
    }

    public static Integer c(mcd.a aVar) {
        switch (c.f185418c[aVar.ordinal()]) {
            case 1:
                return Integer.valueOf(R$attr.uikit_colorGreyTone50);
            case 2:
                return Integer.valueOf(R$attr.uikit_colorGreyTone10_90);
            case 3:
                return Integer.valueOf(R$attr.uikit_colorPerformancePositive);
            case 4:
                return Integer.valueOf(R$attr.uikit_colorAccent);
            case 5:
                return Integer.valueOf(R$attr.uikit_colorOrange);
            case 6:
                return Integer.valueOf(R$attr.uikit_colorForeground);
            case 7:
                return Integer.valueOf(R$attr.uikit_colorGreen);
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ResourceImage d(Icon icon) {
        Integer numValueOf;
        switch (c.d[icon.f86468a.ordinal()]) {
            case 1:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_info_outline);
                break;
            case 2:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_document);
                break;
            case 3:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_chevron_right);
                break;
            case 4:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cash);
                break;
            case 5:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_balance_sheet);
                break;
            case 6:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_lightning);
                break;
            case 7:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cal);
                break;
            case 8:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_plan_ultra);
                break;
            case 9:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_plan_premium);
                break;
            case 10:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_plan_plus);
                break;
            case 11:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_salary);
                break;
            case 12:
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_student);
                break;
            case 13:
                numValueOf = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        mcd.a aVar = icon.f86469b;
        return new ResourceImage(iIntValue, (Integer) null, (Integer) null, aVar != null ? c(aVar) : null, (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public final ArrayList a(ArrayList sections) {
        RowDelegate.Model.c cVar;
        o model;
        RowDelegate.Model.c bVar;
        ResourceImage resourceImageD;
        o e10Var;
        yj0 yj0Var;
        Object objA;
        String str;
        Clause textClause;
        TextClause textClause2;
        Custom custom;
        Intrinsics.checkNotNullParameter(sections, "sections");
        ArrayList arrayList = new ArrayList(w.t(sections, 10));
        Iterator it8 = sections.iterator();
        while (it8.hasNext()) {
            InfoSheet.Section section = (InfoSheet.Section) it8.next();
            InfoSheet.Section.Header header = section.f86475a;
            ArrayList<InfoSheet.Section.Item> arrayList2 = section.f86476b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (InfoSheet.Section.Item item : arrayList2) {
                if (item instanceof InfoSheet.Section.CellDetails) {
                    InfoSheet.Section.CellDetails cellDetails = (InfoSheet.Section.CellDetails) item;
                    String str2 = cellDetails.f86477a;
                    InfoSheet.Section.CellDetails.Value value = cellDetails.f86478b;
                    String strQ = j6.a.q("CELL_DETAILS_LIST_ID_", str2);
                    TextClause textClause3 = new TextClause(cellDetails.f86477a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str3 = cellDetails.f86479c;
                    t0 t0Var = new t0((Clause) textClause3, (Image) (str3 != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null), 0, false, 28);
                    String str4 = value.f86480a;
                    mcd.a aVar = value.f86481b;
                    TextClause textClause4 = new TextClause(str4, (Style) (aVar != null ? new Custom(c(aVar), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124);
                    StyledText styledText = value.f86482c;
                    if (styledText != null) {
                        String str5 = styledText.f86511a;
                        int i = c.f185416a[styledText.f86512b.ordinal()];
                        if (i == 1) {
                            custom = new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            custom = null;
                        }
                        textClause2 = new TextClause(str5, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                    } else {
                        textClause2 = null;
                    }
                    e10Var = new CellDetailsDelegate.Model(strQ, t0Var, textClause4, textClause2, str3 != null ? new p(str3) : null, null, null, 0, null, false, str3 != null, null, null, 28592);
                } else if (item instanceof InfoSheet.Section.CellProgress) {
                    InfoSheet.Section.CellProgress cellProgress = (InfoSheet.Section.CellProgress) item;
                    InfoSheet.Section.CellProgress.Progress progress = cellProgress.f86484b;
                    Float fValueOf = Float.valueOf(16.0f);
                    try {
                        m.Companion companion = m.INSTANCE;
                        objA = Integer.valueOf((progress.f86487b * 100) / progress.f86486a);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = m.a(objA);
                    if (thA != null) {
                        e.n(thA);
                    }
                    if (objA instanceof n) {
                        objA = null;
                    }
                    Integer num = (Integer) objA;
                    int iIntValue = num != null ? num.intValue() : 100;
                    String str6 = cellProgress.f86483a;
                    String str7 = cellProgress.d;
                    String strQ2 = j6.a.q("CELL_PROGRESS_LIST_ID_", str6);
                    if (str7 != null) {
                        str = str7;
                        List listK = v.k(new TextClause(cellProgress.f86483a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16));
                        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.t0.f186434a, "<this>");
                        textClause = new CompositeClause(listK, new TextClause("\u2002", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    } else {
                        str = str7;
                        textClause = new TextClause(cellProgress.f86483a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    Clause clause = textClause;
                    InfoSheet.Section.CellProgress.Value value2 = cellProgress.f86485c;
                    String str8 = value2.f86489a;
                    mcd.a aVar2 = value2.f86490b;
                    e10Var = new t6(strQ2, clause, iIntValue, new TextClause(str8, (Style) (aVar2 != null ? new Custom(c(aVar2), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124), str != null ? new p(str) : null, new v6(b(progress.f86488c, R$attr.uikit_colorGreyTone20_50), b(progress.d, R$attr.uikit_colorPerformancePositive)), DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                } else if (item instanceof InfoSheet.Section.PieChart) {
                    ArrayList<InfoSheet.Section.PieChart.Slice> arrayList4 = ((InfoSheet.Section.PieChart) item).f86494a;
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                    Iterator it9 = arrayList4.iterator();
                    while (it9.hasNext()) {
                        arrayList5.add(new g10(r9.f86495a, new Color.Solid(b(((InfoSheet.Section.PieChart.Slice) it9.next()).f86496b, R$attr.uikit_colorAccentNeutral))));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (InfoSheet.Section.PieChart.Slice slice : arrayList4) {
                        int iB = b(slice.f86496b, R$attr.uikit_colorAccentNeutral);
                        String str9 = slice.f86497c;
                        fb fbVar = str9 == null ? null : new fb(new p6(iB, Integer.valueOf(iB)), new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        if (fbVar != null) {
                            arrayList6.add(fbVar);
                        }
                    }
                    e10Var = new e10(arrayList5, new eb(arrayList6));
                } else {
                    if (item instanceof InfoSheet.Section.PlainText) {
                        InfoSheet.Section.PlainText plainText = (InfoSheet.Section.PlainText) item;
                        mcd.a aVar3 = plainText.f86500c;
                        if (aVar3 == null) {
                            aVar3 = mcd.a.FOREGROUND;
                        }
                        int iB2 = b(aVar3, R$attr.uikit_colorForeground);
                        String str10 = "PLAIN_TEXT_LIST_ID_" + f0.Q0(plainText.f86498a);
                        CompositeClause compositeClause = new CompositeClause(u.c(new HtmlClause(0, 28, (Integer) null, (Object) null, plainText.f86498a)), null, new Custom(Integer.valueOf(iB2), false, null, false, null, 254), null, 10);
                        com.revolut.feature.shared.savings.models.info_sheets.a aVar4 = plainText.f86499b;
                        int i2 = aVar4 == null ? -1 : c.f185417b[aVar4.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            yj0Var = yj0.START;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yj0Var = yj0.CENTER_HORIZONTAL;
                        }
                        model = new TextDelegate.Model(str10, compositeClause, false, new ck0(yj0Var), null, null, 0, 0, 0, 0, 2036);
                    } else {
                        if (!(item instanceof InfoSheet.Section.Row)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InfoSheet.Section.Row row = (InfoSheet.Section.Row) item;
                        InfoSheet.Section.Row.Title title = row.f86501a;
                        String str11 = title.f86504a;
                        Icon icon = title.f86505b;
                        String strQ3 = j6.a.q("ROW_LIST_ID_", str11);
                        TextClause textClause5 = new TextClause(str11, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        RowDelegate.Model.MainImage.Image24 image24 = (icon == null || (resourceImageD = d(icon)) == null) ? null : new RowDelegate.Model.MainImage.Image24(resourceImageD, false, false, 6);
                        String str12 = row.f86502b;
                        TextClause textClause6 = str12 != null ? new TextClause(str12, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                        InfoSheet.Section.Row.Value value3 = row.f86503c;
                        if (value3 != null) {
                            if (value3 instanceof InfoSheet.Section.Row.Value.Image) {
                                ResourceImage resourceImageD2 = d(((InfoSheet.Section.Row.Value.Image) value3).f86506a);
                                bVar = resourceImageD2 != null ? new tf(new j(resourceImageD2)) : null;
                            } else {
                                if (!(value3 instanceof InfoSheet.Section.Row.Value.Text)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar = new RowDelegate.Model.c.b(new TextClause(((InfoSheet.Section.Row.Value.Text) value3).f86507a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126);
                            }
                            cVar = bVar;
                        } else {
                            cVar = null;
                        }
                        String str13 = row.d;
                        model = new RowDelegate.Model(strQ3, image24, textClause5, null, 0, textClause6, null, null, 0, cVar, str13 != null, null, false, null, null, null, null, null, null, str13 != null ? new p(str13) : null, null, 0, 0, 0, 0, 532673496);
                    }
                    e10Var = model;
                }
                arrayList3.add(e10Var);
            }
            if (header != null) {
                String str14 = header.f86491a;
                String str15 = header.f86492b;
                String str16 = header.f86493c;
                arrayList3 = yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(j6.a.q("SUBHEADER_LIST_ID_", str14), (Image) null, (Clause) new TextClause(str14, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) (str15 != null ? new TextClause(str15, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (String) null, (ListSubheaderDelegate.Model.a) (str16 != null ? new ListSubheaderDelegate.Model.a.b(false, false, true, 3) : null), false, false, (Object) (str16 != null ? new p(str16) : null), (Parcelable) null, 0, 0, 0, 0, 64426), null, 0, 0, 126);
            } else {
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            }
            arrayList.add(arrayList3);
        }
        return w.u(arrayList);
    }
}
