package ox2;

import android.os.Parcelable;
import au0.o0;
import au0.u0;
import au0.z0;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.r2;
import aw0.s8;
import aw0.s9;
import c2d.v0;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vc;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.boleto.api.BoletoFinderAction$Activate;
import com.revolut.feature.apm.bills.boleto.api.BoletoFinderAction$SeeAllBoletos;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import g03.b0;
import ip0.c50;
import ip0.ej;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.i60;
import ip0.j50;
import ip0.pl;
import ip0.qd0;
import ip0.rf0;
import ip0.vd0;
import ip0.xc;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import mel.j0;
import ms0.h4;
import mx0.c7;
import mx0.r5;
import mx0.v5;
import of9.k;
import org.joda.time.DateTime;
import org.joda.time.Period;
import pf9.g;
import pf9.h;
import pgb.a0;
import pgb.i;
import pgb.r;
import pgb.s;
import pgb.x;
import pgb.y;
import pkf.s1;
import pkf.u1;
import pvk.k0;
import pvk.m0;
import pvk.n0;
import pvk.z;
import q03.i0;
import q6h.j;
import qua.p;
import tgb.l;
import tgb.m;
import tgb.n;
import tgb.o;
import tof.a3;
import yp0.e0;
import yy0.j;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f230546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f230547c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f230545a = i;
        this.f230546b = obj2;
        this.f230547c = obj3;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r68v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Removed duplicated region for block: B:101:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0bcf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0c4b A[LOOP:4: B:234:0x0c45->B:236:0x0c4b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0c8a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0399  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r56, java.lang.Object r57, java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 3330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        boolean z;
        Iterable iterableG;
        List listC;
        om1.b status;
        RandomAccess randomAccessF0;
        g gVar = (g) this.f230546b;
        h hVar = (h) this.f230547c;
        qf9.a content = (qf9.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f245275a;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            BillFormField billFormField = (BillFormField) obj5;
            Map userValues = hVar.f235540b;
            Intrinsics.checkNotNullParameter(billFormField, "<this>");
            Intrinsics.checkNotNullParameter(userValues, "userValues");
            Map map = billFormField.k.f61273a;
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!Intrinsics.f(userValues.get((String) entry.getKey()), (String) entry.getValue())) {
                        break;
                    }
                }
            }
            arrayList.add(obj5);
        }
        ArrayList<BillFormField> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (((BillFormField) obj6).f61276c != xo1.c.BARCODE) {
                arrayList2.add(obj6);
            } else {
                arrayList3.add(obj6);
            }
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        boolean z3 = !zIsEmpty;
        if (arrayList2.isEmpty()) {
            z = true;
        } else {
            for (BillFormField billFormField2 : arrayList2) {
                String input = (String) hVar.f235540b.get(billFormField2.f61274a);
                if (input == null) {
                    input = "";
                }
                Intrinsics.checkNotNullParameter(billFormField2, "<this>");
                Intrinsics.checkNotNullParameter(input, "input");
                String str = billFormField2.f;
                Regex regex = str != null ? new Regex(str) : null;
                if (!(regex == null ? true : regex.f(input))) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        ArrayList arrayListB = k.b(gVar.f235537a, arrayList2, hVar.f235540b, null, null, null, 28);
        nm1.b bVar = gVar.f235538b;
        List boletoFinderItems = content.f245276b;
        om1.a aVar = hVar.f235541c;
        qm1.c cVar = (qm1.c) bVar;
        Intrinsics.checkNotNullParameter(boletoFinderItems, "boletoFinderItems");
        if (aVar == null || (status = aVar.getStatus()) == null) {
            iterableG = f0.f322471a;
        } else {
            int i = qm1.b.f247747a[status.ordinal()];
            if (i == 1) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_finder_status_not_onboarded_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_finder_status_not_onboarded_description, null, null, 14);
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(qm1.c.a(), null, null, false, null, false, 62);
                tf tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
                om1.c terms = aVar.getTerms();
                String id10 = terms != null ? terms.getId() : null;
                if (id10 == null) {
                    id10 = "";
                }
                iterableG = yp0.b.g(u.c(new RowDelegate.Model("BOLETO_FINDER_STATUS_ID", image40, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, new BoletoFinderAction$Activate(id10), null, 0, 0, 0, 0, 532675544)), new ListSubheaderDelegate.Model("BOLETO_FINDER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_hide_boletos_sheet_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            } else if (i == 2) {
                iterableG = yp0.b.g(u.c(new RowDelegate.Model("BOLETO_FINDER_STATUS_ID", new RowDelegate.Model.MainImage.Image40(qm1.c.a(), null, null, false, null, false, 62), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_finder_status_pending_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_finder_status_pending_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)), new ListSubheaderDelegate.Model("BOLETO_FINDER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_hide_boletos_sheet_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            } else if (i == 3) {
                if (boletoFinderItems.isEmpty()) {
                    randomAccessF0 = f0.f322471a;
                } else if (boletoFinderItems.size() > 2) {
                    List listV0 = d0.V0(boletoFinderItems, 2);
                    ArrayList arrayList4 = new ArrayList(w.t(listV0, 10));
                    Iterator it8 = listV0.iterator();
                    while (it8.hasNext()) {
                        arrayList4.add(cVar.c((p) it8.next()));
                    }
                    randomAccessF0 = d0.F0(new LargeActionButtonDelegate.Model("BOLETO_FINDER_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_see_all_boletos, null, null, 14), false, null, null, BoletoFinderAction$SeeAllBoletos.f61165a, null, 744), arrayList4);
                } else {
                    List list2 = boletoFinderItems;
                    ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList5.add(cVar.c((p) it9.next()));
                    }
                    randomAccessF0 = arrayList5;
                }
                Collection collectionC = (Collection) randomAccessF0;
                if (collectionC.isEmpty()) {
                    collectionC = u.c(new FullScreenStateDelegate.Model("BOLETO_FINDER_EMPTY_ITEMS_ID", new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_empty_title, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), null, null, false, null, null, false, 0, 0, 32756));
                }
                iterableG = yp0.b.g((List) collectionC, new ListSubheaderDelegate.Model("BOLETO_FINDER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_hide_boletos_sheet_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST), true, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262114), null, 0, 0, 126);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                iterableG = yp0.b.g(u.c(new RowDelegate.Model("BOLETO_FINDER_STATUS_ID", new RowDelegate.Model.MainImage.Image40(qm1.c.a(), null, null, false, null, false, 62), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_finder_status_pending_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_finder_status_deactivation_pending_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)), new ListSubheaderDelegate.Model("BOLETO_FINDER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_hide_boletos_sheet_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            }
        }
        ArrayList arrayListE0 = d0.E0(iterableG, arrayListB);
        if (z3) {
            listC = u.c(new LabelNavBarMenuItem("SCAN_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_scan_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.pay_bills_taxes_menu_scan, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, 504));
        } else {
            if (!zIsEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            listC = f0.f322471a;
        }
        return new xf9.b(R$string.pay_bills_taxes_title_boleto, arrayListE0, listC, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [au0.w0, aw0.s8, com.revolut.core.ui.models.Color$SolidRes] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v17, types: [aw0.e] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [au0.p0] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    private final Object d(Object obj2, Object obj3, Object obj4) {
        ?? r06;
        ?? eVar;
        ?? textClause;
        ?? r262;
        ArrayList arrayList;
        Iterator it8;
        boolean z;
        Iterator it9;
        boolean z3;
        Pair pair;
        Custom custom;
        Object obj5;
        a0 a0Var = (a0) this.f230546b;
        i iVar = (i) this.f230547c;
        o salaryHubData = (o) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(salaryHubData, "salaryHubData");
        tgb.g gVar = salaryHubData.d;
        tgb.h hVar = salaryHubData.f271158g;
        boolean z4 = salaryHubData.f271156b;
        String str = gVar.f271139c;
        TextClause textClause2 = null;
        if (str != null) {
            if (salaryHubData.f271155a == do3.g.GRACE_PERIOD) {
                obj5 = null;
                custom = new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254);
            } else {
                custom = null;
                obj5 = null;
            }
            r06 = obj5;
            textClause2 = new TextClause(str, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        } else {
            r06 = 0;
        }
        r rVar = new r(new TextClause(gVar.f271138b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(gVar.f271137a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) r06, (Color.SolidRes) r06, 14), new z0(new TextClause(gVar.f271138b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false), textClause2 != null ? new o0(textClause2) : r06, r06)));
        if (salaryHubData.i) {
            eVar = r06;
        } else if (z4) {
            Intrinsics.checkNotNullParameter(salaryHubData, "<this>");
            eVar = hVar.f271140a ? new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_primary_cta_unlock, null, null, 14), LargeActionButton.ButtonStyle.f58725a, new j(new ResourceImage(R$drawable.uikit_icn_24_lock_opened, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, false, null, null, null, 1016), null, null, 55) : 0;
        } else {
            tgb.f fVar = hVar.f271142c;
            if (fVar != null) {
                String str2 = fVar.f271135a;
                ArrayList arrayList2 = fVar.f271136b;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                int i = 0;
                ?? r09 = r06;
                for (Object obj6 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ?? r263 = r09;
                        v.s();
                        throw r263;
                    }
                    tgb.d dVar = (tgb.d) obj6;
                    arrayList3.add(new TextClause(dVar.f271131a, (Style) new Click(28, (Integer) null, (Object) dVar.f271132b, a0.d.n("SALARY_HUB_OPT_IN_DISCLAIMER_", i), false), (Integer) null, false, (o9) null, (List) null, 124));
                    i = i2;
                    r09 = r09;
                }
                r262 = r09;
                textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) arrayList3, 94);
            } else {
                ?? r264 = r06;
                textClause = r264;
                r262 = r264;
            }
            ?? r122 = r262;
            eVar = new aw0.e(true, textClause, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_primary_cta, r122, r122, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 52);
        }
        List list = iVar.f235842b;
        boolean z6 = iVar.f235843c;
        aim.e eVarB = u.b();
        eVarB.addAll(list);
        y yVar = a0Var.f235836a;
        ArrayList rewards = salaryHubData.e;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        aim.e eVarB2 = u.b();
        Iterator it10 = tgb.j.a().iterator();
        while (it10.hasNext()) {
            tgb.j jVar = (tgb.j) it10.next();
            switch (x.f235857a[jVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    arrayList = rewards;
                    it8 = it10;
                    z = z6;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj7 : arrayList) {
                        if (((l) obj7).f271146b == jVar) {
                            arrayList4.add(obj7);
                        }
                    }
                    l lVar = (l) d0.d0(arrayList4);
                    yVar.a(eVarB2, arrayList4, lVar != null ? y.e(lVar) : null, jVar, null);
                    break;
                case 7:
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj8 : rewards) {
                        ArrayList arrayList6 = rewards;
                        Iterator it11 = it10;
                        if (((l) obj8).f271146b == tgb.j.COMING) {
                            arrayList5.add(obj8);
                        }
                        rewards = arrayList6;
                        it10 = it11;
                    }
                    arrayList = rewards;
                    it8 = it10;
                    ArrayList<Pair> arrayList7 = new ArrayList();
                    Iterator it12 = arrayList5.iterator();
                    while (it12.hasNext()) {
                        l lVar2 = (l) it12.next();
                        Instant instant = lVar2.e;
                        if (instant != null) {
                            pair = new Pair(YearMonth.from(instant.atZone(ZoneId.systemDefault())), lVar2);
                            it9 = it12;
                            z3 = z6;
                        } else {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            it9 = it12;
                            z3 = z6;
                            rd0.d.a(rd0.c.ERROR, "SalaryHubV3RewardsSectionMapper", "Skipping COMING reward: availableFrom is missing.", null, h0Var);
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList7.add(pair);
                        }
                        it12 = it9;
                        z6 = z3;
                    }
                    z = z6;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Pair pair2 : arrayList7) {
                        YearMonth yearMonth = (YearMonth) pair2.f186385a;
                        Object arrayList8 = linkedHashMap.get(yearMonth);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            linkedHashMap.put(yearMonth, arrayList8);
                        }
                        ((List) arrayList8).add((l) pair2.f186386b);
                    }
                    for (Map.Entry entry : q0.e(linkedHashMap).entrySet()) {
                        YearMonth yearMonth2 = (YearMonth) entry.getKey();
                        List list2 = (List) entry.getValue();
                        Intrinsics.h(list2);
                        yVar.a(eVarB2, list2, y.e((l) d0.b0(list2)), tgb.j.COMING, yearMonth2.toString());
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            rewards = arrayList;
            it10 = it8;
            z6 = z;
        }
        boolean z11 = z6;
        eVarB.addAll(u.a(eVarB2));
        if (z4) {
            Intrinsics.checkNotNullParameter(salaryHubData, "<this>");
            if (!hVar.f271140a) {
                List listL = v.l(z11 ? new RowDelegate.Model("SALARY_HUB_SORT_SALARY", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_arrow_split, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_salary_tools_sort_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_salary_tools_sort_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, new tf(new j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, pgb.p.f235848a, null, 0, 0, 0, 0, 532675544) : null);
                e0 e0Var = e0.OUTSIDE_BOX;
                int i3 = R$attr.uikit_dp8;
                int i5 = R$attr.uikit_dp16;
                if (!listL.isEmpty()) {
                    listL = yp0.b.d(listL, new ListSubheaderDelegate.Model("SALARY_HUB_SALARY_TOOLS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_account_section_salary_tools_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i3, i3, i5, i5);
                }
                eVarB.addAll(listL);
                m mVar = salaryHubData.f;
                if (mVar != null) {
                    TextClause textClause3 = new TextClause(mVar.f271150a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                    TextClause textClause4 = new TextClause(mVar.f271151b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorWhite_80), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                    UrlMedia urlMedia = new UrlMedia(mVar.f271152c);
                    tgb.e eVar2 = mVar.d;
                    PromotionalMediumTileDelegate.Model model = new PromotionalMediumTileDelegate.Model("SALARY_HUB_REFERRAL_TILE", textClause3, textClause4, urlMedia, new vc(new i60(new TextClause(eVar2.f271133a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), h4.WHITE)), null, eVar2.f271134b, null, 672);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    eVarB.add(model);
                }
            }
        }
        n nVar = salaryHubData.f271159h;
        String str3 = nVar.f271153a;
        ArrayList arrayList9 = nVar.f271154b;
        ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
        int i6 = 0;
        for (Object obj9 : arrayList9) {
            int i21 = i6 + 1;
            if (i6 < 0) {
                v.s();
                throw null;
            }
            tgb.d dVar2 = (tgb.d) obj9;
            arrayList10.add(new TextClause(dVar2.f271131a, (Style) new Click(28, (Integer) null, (Object) dVar2.f271132b, a0.d.n("SALARY_HUB_TERMS_AND_CONDITIONS_", i6), false), (Integer) null, false, (o9) null, (List) null, 124));
            i6 = i21;
        }
        ej ejVar = new ej("SALARY_HUB_TERMS_AND_CONDITIONS", new c7(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) arrayList10, 94), false, null, 6));
        yp0.b.r(ejVar, 0, 0, 0, 0, 15);
        eVarB.add(ejVar);
        return new s(rVar, eVar, u.a(eVarB), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r47, java.lang.Object r48, java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        pk6.m mVar = (pk6.m) this.f230546b;
        pk6.e eVar = (pk6.e) this.f230547c;
        ExternalInstitution institution = (ExternalInstitution) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(institution, "institution");
        Collection collection = institution.d;
        if (collection == null) {
            collection = f0.f322471a;
        }
        io3.b bVar = institution.f66109c;
        String str = eVar.f236928b;
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : collection) {
                if (kotlin.text.d0.J(((ho3.a) obj5).f154219b, str, true)) {
                    arrayList.add(obj5);
                }
            }
            collection = arrayList;
        }
        aim.e eVarB = u.b();
        Collection<ho3.a> collection2 = collection;
        ArrayList arrayList2 = new ArrayList(w.t(collection2, 10));
        for (ho3.a aVar : collection2) {
            arrayList2.add(new RowDelegate.Model(aVar.f154218a, new RowDelegate.Model.MainImage.Image40(((di6.a) mVar.f236935a).c(bVar), null, null, false, null, false, 60), new TextClause(aVar.f154219b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        List listC = u.c(new RowDelegate.Model("LIST_ID_BRANCH_NOT_LISTED", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_bank, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorForeground_10)), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_branch_selection_branch_not_listed_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, pk6.k.f236934a, null, 0, 0, 0, 0, 532676600));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        return u.a(eVarB);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        u1 u1Var = (u1) this.f230546b;
        a3 a3Var = (a3) this.f230547c;
        wtd.a content = (wtd.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        u1Var.getClass();
        wtd.b bVar = content.f299929b;
        StakingProduct stakingProduct = content.f299930c;
        DateTime dateTime = content.f299928a;
        int i = s1.f237127a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return f0.f322471a;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_step_requested_title, null, null, 14);
            TimeClause timeClause = new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
            j50 j50Var = j50.NORMAL;
            return yp0.b.g(v.k(new ProgressStepVerticalV2Delegate.Model("REQUESTED_PROGRESS_STEP_LIST_ID", textLocalisedClause, timeClause, new h50(j50Var, c50.FIRST), false, null, 0, 0, 0, null, false, false, 32752), new ProgressStepVerticalV2Delegate.Model("COMPLETED_PROGRESS_STEP_LIST_ID", new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_step_completed_title, null, null, 14), new TimeClause(a3Var.f272593h.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), new f50(j50Var, c50.LAST, false), false, null, 0, 0, 0, null, false, false, 32752)), new ListSubheaderDelegate.Model("PROGRESS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_title_completed, v.k(2, 2), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_step_requested_title, null, null, 14);
        List listK = v.k(new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_step_requested_description, u.c(Integer.valueOf(stakingProduct.f88087b.f88062c)), null, 12));
        m70.a.a(t0.f186434a);
        ProgressStepVerticalV2Delegate.Model model = new ProgressStepVerticalV2Delegate.Model("REQUESTED_PROGRESS_STEP_LIST_ID", textLocalisedClause2, new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new f50(j50.NORMAL, c50.FIRST, false), false, null, 0, 0, 0, null, false, false, 32752);
        DateTime dateTimePlusDays = content.d;
        if (dateTimePlusDays == null) {
            dateTimePlusDays = a3Var.f272591g.plusDays(stakingProduct.f88087b.f88062c);
        }
        return yp0.b.g(v.k(model, new ProgressStepVerticalV2Delegate.Model("COMPLETED_PROGRESS_STEP_LIST_ID", new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_step_completed_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_estimated_date, u.c(new TimeClause(dateTimePlusDays.getMillis(), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12)), null, 12), new g50(c50.LAST), false, null, 0, 0, 0, null, false, false, 32752)), new ListSubheaderDelegate.Model("PROGRESS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_staking_unstaking_title_in_progress, v.k(1, 2), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final Object i(Object obj2, Object obj3, Object obj4) {
        pmb.r rVar;
        char c2;
        List list;
        boolean z;
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause;
        dj0.d dVarN;
        SavingsProduct savingsProduct;
        Iterator it8;
        TextLocalisedClause textLocalisedClause2;
        boolean z3;
        ?? r152;
        aim.e eVar;
        SavingsProductData savingsProductData;
        List list2;
        pmb.r rVar2;
        TextLocalisedClause textLocalisedClause3;
        pmb.r rVar3;
        Clause clauseA;
        pmb.r rVar4 = (pmb.r) this.f230546b;
        pmb.d dVar = (pmb.d) this.f230547c;
        pmb.c content = (pmb.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        LinkedHashMap linkedHashMap = content.f237526a;
        xi0.b baseCurrency = content.f237528c;
        List listD1 = d0.d1(linkedHashMap.keySet());
        ArrayList arrayList = content.f237527b;
        yik.h hVar = rVar4.f237546c;
        if (listD1.size() > 1) {
            List list3 = listD1;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            int i = 0;
            for (Object obj5 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                hha.d dVar2 = (hha.d) obj5;
                String strQ = j6.a.q("TAB_ITEM_ID_", dVar2.f152287a);
                if (i == 0) {
                    rVar3 = rVar4;
                    clauseA = new TextLocalisedClause(com.revolut.feature.vaults.R$string.mmf_choose_a_currency_tab_title_your_plan, null, null, 14);
                } else {
                    rVar3 = rVar4;
                    clauseA = fgk.b.a(hVar, dVar2);
                }
                arrayList2.add(new q(strQ, new t(clauseA), 58));
                i = i2;
                rVar4 = rVar3;
            }
            rVar = rVar4;
            c2 = 0;
            list = arrayList2;
        } else {
            rVar = rVar4;
            c2 = 0;
            list = f0.f322471a;
        }
        List list4 = list;
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it9 = linkedHashMap.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry = (Map.Entry) it9.next();
            hha.d dVar3 = (hha.d) entry.getKey();
            List list5 = (List) entry.getValue();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                Object next = it10.next();
                xi0.b.Companion.getClass();
                Iterator it11 = it10;
                ArrayList arrayList6 = arrayList;
                xi0.b[] elements = {baseCurrency, xi0.b.f306272g, xi0.b.i, xi0.b.f306273h};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (kotlin.collections.d.y0(elements).contains(((SavingsProductData) next).f86683a.f86618b)) {
                    arrayList4.add(next);
                } else {
                    arrayList5.add(next);
                }
                it10 = it11;
                arrayList = arrayList6;
            }
            ArrayList arrayList7 = arrayList;
            String str = dVar3.f152287a;
            hha.d dVar4 = (hha.d) d0.d0(listD1);
            boolean zF = Intrinsics.f(str, dVar4 != null ? dVar4.f152287a : null);
            SavingsProductData savingsProductData2 = dVar.f237530b;
            boolean zIsEmpty = arrayList5.isEmpty();
            String strQ2 = j6.a.q("VIEW_PAGER_ITEM_ID_", dVar3.f152287a);
            aim.e eVarB = u.b();
            pmb.j.Companion.getClass();
            Intrinsics.checkNotNullParameter(arrayList4, "<this>");
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            List listP0 = d0.P0(arrayList4, new k2j.d(new v0(3, baseCurrency), 28));
            if (zIsEmpty) {
                it8 = it9;
                textLocalisedClause2 = null;
                z3 = zIsEmpty;
                r152 = 0;
                eVar = eVarB;
                savingsProductData = savingsProductData2;
                arrayList = arrayList7;
                list2 = listP0;
                rVar2 = rVar;
            } else {
                it8 = it9;
                z3 = zIsEmpty;
                r152 = 0;
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_upsell_popular_subheader, null, null, 14);
                eVar = eVarB;
                savingsProductData = savingsProductData2;
                list2 = listP0;
                rVar2 = rVar;
                arrayList = arrayList7;
            }
            zhm.a0.x(rVar2.a(list2, arrayList, savingsProductData, zF, textLocalisedClause2), eVar);
            List listP02 = d0.P0(arrayList5, new pmb.q());
            if (z3) {
                textLocalisedClause3 = null;
            } else {
                textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_upsell_all_currencies_subheader, r152, r152, 14);
                rVar2 = rVar2;
            }
            zhm.a0.x(rVar2.a(listP02, arrayList, savingsProductData, zF, textLocalisedClause3), eVar);
            arrayList3.add(new xc(strQ2, u.a(eVar), 0, null, null, 0, 0, 0, 1020));
            rVar = rVar2;
            it9 = it8;
        }
        pmb.r rVar5 = rVar;
        SavingsProductData savingsProductData3 = dVar.f237530b;
        int i3 = dVar.f237531c;
        if (savingsProductData3 == null || (savingsProduct = savingsProductData3.f86683a) == null) {
            z = c2;
        } else {
            vlb.c cVar = rVar5.d;
            wi0.b userCountryCode = content.d;
            Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
            Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
            z = (savingsProduct.f86619c == ncd.g.SAVINGS_DEPOSITS && cVar.f290310a.contains(userCountryCode)) ? (char) 1 : c2;
        }
        SavingsProductData productData = (SavingsProductData) d0.b0((List) d0.a0(content.f237526a.values()));
        hha.d dVar5 = (hha.d) d0.e0(i3, listD1);
        char c3 = (i3 <= 0 || dVar5 == null) ? c2 : (char) 1;
        if (c3 == 1) {
            int i5 = com.revolut.feature.vaults.R$string.mmf_choose_a_currency_upsell_cta_button_title;
            Clause clauseA2 = fgk.b.a(hVar, dVar5);
            Period periodA = pi3.b.a(hha.i.MONTHLY);
            if (periodA == null || (dVarN = cp5.c.n(dVar5, periodA)) == null) {
                dj0.d.Companion.getClass();
                dVarN = dj0.d.e;
            }
            MoneyClause moneyClause = new MoneyClause(dVarN, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            Clause[] clauseArr = new Clause[2];
            clauseArr[c2] = clauseA2;
            clauseArr[1] = moneyClause;
            compositeClause = null;
            textLocalisedClause = v04.b.Q(new TextLocalisedClause(i5, v.k(clauseArr), null, 12), com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_upsell_discover);
        } else {
            compositeClause = null;
            if (c3 != 0) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_upsell_continue, null, null, 14);
        }
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        Intrinsics.checkNotNullParameter(productData, "productData");
        ProductGroup.TextWithExplanation textWithExplanation = productData.f86684b.f86525h.f86593b;
        CompositeClause compositeClauseB = compositeClause;
        if (textWithExplanation != null) {
            ProductGroup.ExplanationWithLabel explanationWithLabel = textWithExplanation.f86589b;
            Object gVar = compositeClause;
            if (explanationWithLabel != null) {
                gVar = new tmb.g(explanationWithLabel);
            }
            compositeClauseB = nkb.a.b(textWithExplanation, gVar);
        }
        pmb.b bVar = new pmb.b(textLocalisedClause, true, defaultFilledButton, compositeClauseB);
        int i6 = dVar.f237531c;
        return new pmb.i(arrayList3, list4, bVar, i6, rVar5.f237544a.a((List) r0.h(listD1.get(i6), linkedHashMap), baseCurrency), dVar.d, z);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object j(java.lang.Object r72, java.lang.Object r73, java.lang.Object r74) {
        /*
            Method dump skipped, instruction units count: 2510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e0  */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v28, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r94, java.lang.Object r95, java.lang.Object r96) {
        /*
            Method dump skipped, instruction units count: 2634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        List listC;
        ptf.n nVar = (ptf.n) this.f230546b;
        ptf.e eVar = (ptf.e) this.f230547c;
        whf.p content = (whf.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean zIsEmpty = content.f297646a.isEmpty();
        boolean z = eVar.f239660b != null;
        String str = eVar.f239661c;
        if (zIsEmpty && !kotlin.text.d0.W(str)) {
            listC = u.c(new FullScreenStateDelegate.Model("TRANSACTIONS_EMPTY_STATE_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.search_empty_title, null, null, 14), new TextLocalisedClause(R.string.search_no_transactions_found, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, null, YearClass.CLASS_2016));
        } else if (zIsEmpty) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transfer_reasons.api.R$string.transfer_reasons_refund_transaction_selection_empty_state_title, null, null, 14);
            int i = R$attr.uikit_dp32;
            List listC2 = u.c(new PlainTextDelegate.Model("TRANSACTIONS_EMPTY_STATE_ID", (Clause) null, (Clause) textLocalisedClause, (v5) r5.e, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, i, i, 0, 0, 53198));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            listC = listC2;
        } else {
            ArrayList<qv0.o> arrayListC = ((anf.w) nVar.f239672a).c(content, new whf.k(0), new whf.i(false));
            ArrayList arrayList = new ArrayList(w.t(arrayListC, 10));
            for (qv0.o oVarE : arrayListC) {
                SelectableDelegate.Model model = oVarE instanceof SelectableDelegate.Model ? (SelectableDelegate.Model) oVarE : null;
                if (model != null) {
                    Object obj5 = ((RowDelegate.Model) model.f53305b).u;
                    a3 a3Var = obj5 instanceof a3 ? (a3) obj5 : null;
                    String str2 = a3Var != null ? a3Var.f272581b : null;
                    oVarE = SelectableDelegate.Model.e(model, null, (str2 == null || !str2.equals(eVar.f239660b)) ? qd0.UNSELECTED : qd0.SELECTED, null, vd0.RADIO, 4194283);
                }
                arrayList.add(oVarE);
            }
            listC = arrayList;
        }
        return new ptf.h(listC, (!zIsEmpty) & z);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        puk.u uVar = (puk.u) this.f230546b;
        puk.f fVar = (puk.f) this.f230547c;
        nel.n instrument = (nel.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        f4h.d dVar = (f4h.d) uVar.f239963a;
        TextClause textClauseE = dVar.e(instrument);
        Clause clauseD = dVar.d(fVar.d, instrument);
        CompositeClause compositeClauseB = dVar.b(instrument);
        TextClause textClauseC = dVar.c(instrument);
        j jVarA = dVar.a(instrument);
        NavBarMenuItem[] elements = {q2d.a.a(), uVar.f239964b.a(fVar.e)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        Data data = fVar.i;
        return new puk.g(data != null ? (TagViewData) iii.c.f(data, new pui.a(8), new psl.m(19), new p2b.a(uVar, 29)) : null, clauseD, compositeClauseB, textClauseE, textClauseC, listL, jVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a9  */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.revolut.core.ui_kit.models.TextClause] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18, types: [com.revolut.core.ui_kit_core.displayers.image.Image, com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage] */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v20, types: [com.revolut.core.ui_kit.delegates.o] */
    /* JADX WARN: Type inference failed for: r27v22 */
    /* JADX WARN: Type inference failed for: r29v27 */
    /* JADX WARN: Type inference failed for: r29v28, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r29v31 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r57, java.lang.Object r58, java.lang.Object r59) {
        /*
            Method dump skipped, instruction units count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        char c2;
        Pair pair;
        pl plVar;
        TextLocalisedClause textLocalisedClause;
        pvk.o0 o0Var = (pvk.o0) this.f230546b;
        dj0.d dVar = (dj0.d) this.f230547c;
        mel.p insight = (mel.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(insight, "insights");
        n0 n0Var = o0Var.f240295a;
        Intrinsics.checkNotNullParameter(insight, "insight");
        j0 j0Var = insight.f204769a;
        mel.g annualExpectedReturn = insight.d;
        HeaderDelegate.Model model = null;
        TextLocalisedClause textLocalisedClauseM = mra.d.M(j0Var, null);
        j0 j0Var2 = insight.f204769a;
        int i = m0.f240292a[j0Var2.ordinal()];
        if (i == 1 || i == 2) {
            c2 = 1;
            TextLocalisedClause textLocalisedClause2 = annualExpectedReturn != null ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_summary_buy_description, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_summary_sp500, null, null, 14)), null, 12) : null;
            dj0.d dVar2 = insight.f;
            pair = (dVar2 == null || dVar == null) ? null : new Pair(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_suggestion_limit_buy, null, null, 14), n0Var.a(dVar, dVar2, textLocalisedClause2));
            if (pair == null) {
                pair = new Pair(textLocalisedClauseM, textLocalisedClause2);
            }
        } else if (i == 3 || i == 4) {
            if (annualExpectedReturn != null) {
                c2 = 1;
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_summary_sell_description, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_summary_sp500, null, null, 14)), null, 12);
            } else {
                c2 = 1;
                textLocalisedClause = null;
            }
            dj0.d dVar3 = insight.f204772g;
            pair = (dVar3 == null || dVar == null) ? null : new Pair(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_suggestion_limit_sell, null, null, 14), n0Var.a(dVar, dVar3, textLocalisedClause));
            if (pair == null) {
                pair = new Pair(textLocalisedClauseM, textLocalisedClause);
            }
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(mra.d.M(j0Var2, null), null);
            c2 = 1;
        }
        rf0 rf0Var = new rf0("summary-list-id", mra.d.m0(j0Var2, null, 3), (Clause) pair.f186385a, (Clause) pair.f186386b);
        yp0.b.l(rf0Var, 0, 0, 0, 0, null, false, 63);
        if (annualExpectedReturn != null) {
            mel.u uVar = annualExpectedReturn.f204747a;
            k0 k0Var = o0Var.f240296b;
            Intrinsics.checkNotNullParameter(annualExpectedReturn, "annualExpectedReturn");
            BigDecimal bigDecimal = uVar.f204777b;
            if (bigDecimal != null) {
                float fFloatValue = bigDecimal.floatValue();
                BigDecimal bigDecimal2 = annualExpectedReturn.f204748b.f204777b;
                plVar = new pl(new s9(fFloatValue, Float.valueOf(bigDecimal2 != null ? bigDecimal2.floatValue() : 0.5f), null, 12));
            } else {
                plVar = null;
            }
            PercentageClause percentageClauseB = ytk.c.b(k0Var.f240290b, uVar.f204776a, null, ytk.d.ONE, 2);
            z zVar = z.f240309a;
            HeaderDelegate.Model model2 = new HeaderDelegate.Model("graph-header-list-id", plVar, new r2(percentageClauseB, rvk.e.a(zVar)), null, null, k0Var.f240289a.a(annualExpectedReturn.f204751h), null, HeaderDelegate.a.C0407a.f52418a, new pvk.w(zVar), tx0.k0.MEDIUM, null, 90864);
            model2.f52412x = R$attr.uikit_dp16;
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            model = model2;
        }
        qv0.i[] elements = new qv0.i[2];
        elements[0] = rf0Var;
        elements[c2] = model;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        b0 b0Var = (b0) this.f230546b;
        i0 i0Var = (i0) this.f230547c;
        List contentItems = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        return d0.E0(zjh.j.v(b0Var.f139261b, i0Var.d), contentItems);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        q23.v vVar = (q23.v) this.f230546b;
        q23.q qVar = (q23.q) this.f230547c;
        Address address = (Address) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Locale localeB = ((s80.b) vVar.f241526a).b();
        Address address2 = o51.a.f222306a;
        Intrinsics.checkNotNullParameter(address, "<this>");
        return new RowDelegate.Model("ADDRESS_ROW_LIST_ID", null, new TextClause(o51.a.c(address, "\n", localeB), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, !qVar.f241512b, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868858);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        q6h.j jVar = (q6h.j) this.f230546b;
        q6h.a aVar = (q6h.a) this.f230547c;
        del.b portfolioBalance = (del.b) obj2;
        ((Boolean) obj3).booleanValue();
        j.a aVar2 = q6h.j.Companion;
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        return jVar.b(aVar, portfolioBalance);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x054f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r45, java.lang.Object r46, java.lang.Object r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.t(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0223  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 3604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox2.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
