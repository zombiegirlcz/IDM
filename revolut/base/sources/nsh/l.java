package nsh;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.widgets.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.tracking.v3.FeedContextMenuContext;
import ish.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import op0.q;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WidgetContext f218880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f218881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f218882y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, WidgetContext widgetContext, String str, q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f218880w = widgetContext;
        this.f218881x = str;
        this.f218882y = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f218880w, this.f218881x, this.f218882y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objD;
        char c2;
        String str;
        o oVar = this.v;
        ish.h hVar = oVar.f218890p;
        ash.j jVar = oVar.f218887l;
        ash.i iVar = oVar.f218889n;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        int i2 = 0;
        String str2 = this.f218881x;
        char c3 = 1;
        Continuation continuation = null;
        WidgetContext widgetContext = this.f218880w;
        if (i == 0) {
            yhm.o.b(obj2);
            if (!oVar.f218894t) {
                oVar.f218894t = true;
                yji.n.l2(oVar, rd0.e.b(jVar.t0()), null, new h(oVar, continuation, i2), 3);
            }
            this.u = 1;
            objD = ((z) iVar).d(widgetContext, str2, this);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objD = obj2;
        }
        dsh.p pVar = (dsh.p) objD;
        if (pVar == null) {
            throw new IllegalStateException(a10.b.s("Can't find widget info to present popup (id=", str2, ")"));
        }
        dsh.e inputConfig = pVar.f117338c;
        String widgetType = pVar.f117337b;
        FeedContextMenuContext.a aVarNewBuilder = FeedContextMenuContext.newBuilder();
        aVarNewBuilder.c();
        ((FeedContextMenuContext) aVarNewBuilder.f49761b).setWidgetId(widgetType);
        int i3 = k.f218879a[this.f218882y.ordinal()];
        char c5 = 2;
        if (i3 == 1) {
            c2 = 0;
            str = "small";
        } else if (i3 == 2) {
            c2 = 0;
            str = "medium";
        } else if (i3 != 3) {
            c2 = 0;
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "dynamic";
        } else {
            c2 = 0;
            str = "large";
        }
        aVarNewBuilder.c();
        ((FeedContextMenuContext) aVarNewBuilder.f49761b).setSize(str);
        w0 w0VarA = aVarNewBuilder.a();
        AnalyticsContext.INSTANCE.getClass();
        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        List listA = hVar.e(widgetContext, widgetType).a(widgetType, inputConfig);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listA.iterator();
        while (true) {
            char c6 = c3;
            if (!it8.hasNext()) {
                ash.i iVar2 = iVar;
                char c7 = c5;
                AnalyticsContext analyticsContext = new AnalyticsContext(w0VarA2);
                dsh.j jVarB = hVar.b(widgetContext, widgetType, inputConfig);
                PopupMenuItem.Cell cellA = jVarB == null ? null : com.revolut.core.ui_kit.models.popup.a.a("customise_widget", jVarB.f117326a, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new b(pVar, null, widgetContext), analyticsContext, null, SyslogConstants.LOG_LOCAL3);
                z zVar = (z) iVar2;
                PopupMenuItem.Cell cellA2 = (zVar.g(widgetContext, widgetType) || zVar.k(widgetContext)) ? null : com.revolut.core.ui_kit.models.popup.a.a("add_widget", new TextLocalisedClause(R$string.widgets_popup_add_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, new b(pVar, null, widgetContext), new AnalyticsContext(w0VarA2), null, SyslogConstants.LOG_LOCAL3);
                PopupMenuItem.Cell cellA3 = !((z) iVar2).g(widgetContext, widgetType) ? com.revolut.core.ui_kit.models.popup.a.a("remove_widget", new TextLocalisedClause(R$string.widgets_popup_remove_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), null, new b(pVar, null, widgetContext), new AnalyticsContext(w0VarA2), null, SyslogConstants.LOG_LOCAL3) : null;
                PopupMenuItem[] elements = new PopupMenuItem[3];
                elements[c2] = cellA;
                elements[c6] = cellA2;
                elements[c7] = cellA3;
                Intrinsics.checkNotNullParameter(elements, "elements");
                a0.x(kotlin.collections.d.L(elements), arrayList);
                jVar.z1(str2, zi0.c.d(arrayList));
                return Unit.f186387a;
            }
            char c16 = c5;
            dsh.c cVar = (dsh.c) it8.next();
            AnalyticsContext analyticsContext2 = new AnalyticsContext(w0VarA2);
            if (!(cVar instanceof dsh.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dsh.b bVar = (dsh.b) cVar;
            String str3 = bVar.f117316a;
            TextLocalisedClause textLocalisedClause = bVar.f117317b;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_menu, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            List list = bVar.f117318c;
            ash.i iVar3 = iVar;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                dsh.a aVar2 = (dsh.a) it9.next();
                PopupMenuItem.Companion companion = PopupMenuItem.INSTANCE;
                Iterator it10 = it9;
                String str4 = aVar2.f117314a;
                arrayList2.add(PopupMenuItem.Companion.a(companion, str4, aVar2.f117315b, Intrinsics.f(bVar.d, str4), null, new b(pVar, bVar, widgetContext), null, null, 232));
                it9 = it10;
            }
            arrayList.add(new PopupMenuItem.NestedParent(str3, textLocalisedClause, resourceImage, arrayList2, null, analyticsContext2, null, 80));
            c5 = c16;
            c3 = c6;
            iVar = iVar3;
        }
    }
}
