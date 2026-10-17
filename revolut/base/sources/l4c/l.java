package l4c;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolut_shop.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f192097a;

    public l(f orderItemMapper) {
        Intrinsics.checkNotNullParameter(orderItemMapper, "orderItemMapper");
        this.f192097a = orderItemMapper;
    }

    public static aim.e a(d3c.h hVar, int i, d3c.m mVar) {
        aim.e eVarB = u.b();
        String str = mVar.d;
        if (str != null) {
            String str2 = mVar.e;
            String strH = a0.d.h(i, "_SHIPMENT_TRACKING_LIST_ID");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_order_section_tracking_title, null, null, 14);
            TextClause textClause = new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_link_external, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            model = new CellDetailsDelegate.Model(strH, textLocalisedClause, textClause, null, null, false, 0, null, str2 != null ? new j4c.m(str2) : null, j2.H6, null, 0, resourceImage, str2 != null, null, 0, 0, 0, 0, 1022440);
        }
        aim.e eVarB2 = u.b();
        eVarB2.add(c(hVar, i, mVar));
        if (model != null) {
            eVarB2.add(model);
        }
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        a0.x(eVarA, eVarB);
        return u.a(eVarB);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate.Model c(d3c.h r17, int r18, d3c.m r19) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4c.l.c(d3c.h, int, d3c.m):com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate$Model");
    }

    public final ArrayList b(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        while (true) {
            Object obj2 = null;
            if (!it8.hasNext()) {
                break;
            }
            d3c.n nVar = (d3c.n) it8.next();
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next = it9.next();
                if (Intrinsics.f(((d3c.j) next).f111034a, nVar.f111047a)) {
                    obj2 = next;
                    break;
                }
            }
            d3c.j jVar = (d3c.j) obj2;
            if (jVar != null) {
                arrayList3.add(jVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it10 = arrayList3.iterator();
        while (it10.hasNext()) {
            arrayList4.add(this.f192097a.a((d3c.j) it10.next()));
        }
        if (i2 > 1) {
            return yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(a0.d.h(i, "_SHIPMENT_SUBHEADER_LIST_ID"), (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_order_section_delivery_title, v.k(Integer.valueOf(i + 1), Integer.valueOf(i2)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        return arrayList4;
    }
}
