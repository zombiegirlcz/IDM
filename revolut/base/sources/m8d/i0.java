package m8d;

import aj0.k0;
import aj0.l0;
import aj0.m0;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f203505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f203506c;

    public /* synthetic */ i0(j0 j0Var, m mVar, int i) {
        this.f203504a = i;
        this.f203505b = j0Var;
        this.f203506c = mVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        switch (this.f203504a) {
            case 0:
                m0 details = (m0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(details, "details");
                l0 l0Var = details.d;
                String faqKey = details.f5366a;
                boolean z = l0Var instanceof aj0.e0;
                j0 j0Var = this.f203505b;
                if (z) {
                    o8d.b bVar = j0Var.f203509c;
                    aj0.e0 informational = (aj0.e0) l0Var;
                    Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                    Intrinsics.checkNotNullParameter(informational, "informational");
                    List<aj0.r> list = informational.f5349a;
                    arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (aj0.r rVar : list) {
                        p8d.a aVar = bVar.f223015a;
                        ArrayList arrayList2 = new ArrayList();
                        TextClause textClause = null;
                        for (aj0.d0 d0Var : rVar.f5373a) {
                            if (d0Var instanceof aj0.z) {
                                textClause = new TextClause(((aj0.z) d0Var).f5379a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            } else if (d0Var instanceof aj0.c0) {
                                arrayList2.add(aVar.a(((aj0.c0) d0Var).f5345a));
                            } else {
                                if (!(d0Var instanceof aj0.v)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                List items = ((aj0.v) d0Var).f5376a;
                                Intrinsics.checkNotNullParameter(items, "items");
                                StringBuilder sb6 = new StringBuilder("<ul>");
                                Iterator it8 = items.iterator();
                                while (it8.hasNext()) {
                                    a10.b.z(sb6, "<li>", nl0.f.c(aVar.f234145a, (String) it8.next(), aVar.f234146b), "</li>");
                                }
                                sb6.append("</ul>");
                                String string = sb6.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                arrayList2.add(new HtmlClause(0, 30, (Integer) null, (Object) null, string));
                            }
                        }
                        arrayList.add(new PlainTextDelegate.Model("BLOCK_LIST_ID", (UrlImage) null, textClause, new CompositeClause(arrayList2, o8d.b.f223014b, null, null, 12), (v5) null, (List) null, (String) null, (Object) null, l7d.a.b(faqKey), 0, 0, 0, 0, 31722));
                    }
                } else {
                    if (!(l0Var instanceof k0)) {
                        if (l0Var instanceof aj0.l) {
                            return zhm.f0.f322471a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    o8d.d dVar = j0Var.d;
                    k0 instructional = (k0) l0Var;
                    Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                    Intrinsics.checkNotNullParameter(instructional, "instructional");
                    List list2 = instructional.f5361a;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    int i = 0;
                    for (Object obj5 : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        aj0.i0 i0Var = (aj0.i0) obj5;
                        String strN = a0.d.n("INSTRUCTIONAL_ITEM_ID_", i2);
                        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i2, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorForeground), 16), false, false, 6);
                        TextClause textClause2 = new TextClause(i0Var.f5355a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str = i0Var.f5356b;
                        HtmlClause htmlClauseA = str != null ? dVar.f223016a.a(str) : null;
                        aj0.g gVar = i0Var.f5357c;
                        arrayList.add(new RowDelegate.Model(strN, image24, textClause2, null, 0, htmlClauseA, gVar != null ? new TextClause(gVar.f5351a, (Style) new Click(28, (Integer) null, (Object) gVar, gVar.f5352b, false), (Integer) null, false, (o9) null, (List) null, 124) : null, null, 0, null, false, null, false, null, null, null, null, null, null, null, l7d.a.b(faqKey), 0, 0, 0, 0, 528480152));
                        i = i2;
                    }
                }
                m mVar = this.f203506c;
                List list3 = (List) iii.c.f(mVar.e, new m62.l(15), new m56.g(19), new i0(j0Var, mVar, 1));
                o8d.h hVar = j0Var.f;
                Data needMoreHelpState = mVar.d;
                Intrinsics.checkNotNullParameter(needMoreHelpState, "needMoreHelpState");
                List list4 = (List) iii.c.f(needMoreHelpState, new o69.b(hVar, 25), new o4a.a(hVar), new ngh.i(hVar, 15));
                ArrayList arrayListE0 = zhm.d0.E0(list3, arrayList);
                yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
                return zhm.d0.E0(list4, arrayListE0);
            default:
                Feedback feedback = (Feedback) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(feedback, "feedback");
                return this.f203505b.f203508b.a(feedback, l7d.a.b(this.f203506c.f203512a), bp6.a.FAQ);
        }
    }
}
