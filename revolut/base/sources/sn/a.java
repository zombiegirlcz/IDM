package sn;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hve.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import uo.d1;
import uo.l;
import uo.q;
import uo.q0;
import uo.u;
import vkm.v1;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements on.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f264468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f264469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f264470c;
    public final ugc.a d;
    public final q0 e;
    public final l f;

    public a(d1 viewAdapterDetailsFinder, q sectionFinder, u widgetFinder, ugc.a sectionParser, q0 screenNameFinder, l productMapper) {
        Intrinsics.checkNotNullParameter(viewAdapterDetailsFinder, "viewAdapterDetailsFinder");
        Intrinsics.checkNotNullParameter(sectionFinder, "sectionFinder");
        Intrinsics.checkNotNullParameter(widgetFinder, "widgetFinder");
        Intrinsics.checkNotNullParameter(sectionParser, "sectionParser");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        this.f264468a = viewAdapterDetailsFinder;
        this.f264469b = sectionFinder;
        this.f264470c = widgetFinder;
        this.d = sectionParser;
        this.e = screenNameFinder;
        this.f = productMapper;
    }

    public static void d(List list, View view) {
        if (view instanceof RecyclerView) {
            list.add(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof RecyclerView) {
                    list.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    d(list, childAt);
                }
            }
        }
    }

    public static float f(Rect rect, View view) {
        if (view.getVisibility() == 0 && view.getRootView().getParent() != null && view.getGlobalVisibleRect(rect)) {
            float fWidth = rect.width() * rect.height();
            float width = view.getWidth() * view.getHeight();
            if (width > BitmapDescriptorFactory.HUE_RED) {
                return fWidth / width;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final v1 b(View rootView, boolean z) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        return new v1(new i(this, rootView, z, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zn.e c(android.view.View r12, float r13, java.lang.String r14, com.revolut.analytics.tracking.v3.AnalyticsProduct r15) {
        /*
            r11 = this;
            r1 = 0
            uo.d1 r0 = r11.f264468a     // Catch: java.lang.Exception -> L9
            uo.c1 r0 = r0.a(r12)     // Catch: java.lang.Exception -> L9
            r2 = r0
            goto L22
        L9:
            r0 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to find view adapter details for view "
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            rd0.d.a(r3, r1, r4, r0, r2)
            r2 = r1
        L22:
            if (r2 == 0) goto L45
            uo.q r0 = r11.f264469b     // Catch: java.lang.Exception -> L2b
            uo.p r0 = r0.a(r2)     // Catch: java.lang.Exception -> L2b
            goto L46
        L2b:
            r0 = move-exception
            zhm.h0 r3 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to find section for view "
            r5.<init>(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            rd0.d.a(r4, r1, r5, r0, r3)
            r3 = r1
            goto L47
        L45:
            r0 = r1
        L46:
            r3 = r0
        L47:
            if (r3 == 0) goto L70
            koi.j r0 = r3.f281498a     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L70
            ugc.a r4 = r11.d     // Catch: java.lang.Exception -> L56
            koi.j r0 = (koi.j) r0     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = r4.d(r0)     // Catch: java.lang.Exception -> L56
            goto L71
        L56:
            r0 = move-exception
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to extract section name for view "
            r6.<init>(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            rd0.d.a(r5, r1, r6, r0, r4)
            r6 = r1
            goto L72
        L70:
            r0 = r1
        L71:
            r6 = r0
        L72:
            if (r2 == 0) goto L95
            uo.u r0 = r11.f264470c     // Catch: java.lang.Exception -> L7b
            com.revolut.tracking.v3.WidgetDescription r12 = r0.b(r2)     // Catch: java.lang.Exception -> L7b
            goto L96
        L7b:
            r0 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to find widget for view "
            r5.<init>(r7)
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            rd0.d.a(r4, r1, r12, r0, r2)
            r8 = r1
            goto L97
        L95:
            r12 = r1
        L96:
            r8 = r12
        L97:
            zn.e r4 = new zn.e
            if (r3 == 0) goto La1
            int r12 = r3.f281499b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
        La1:
            r5 = r13
            r9 = r14
            r10 = r15
            r7 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.a.c(android.view.View, float, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct):zn.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r22, java.util.concurrent.ConcurrentHashMap r23, android.graphics.Rect r24, java.util.List r25, java.lang.String r26, com.revolut.analytics.tracking.v3.AnalyticsProduct r27) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.a.e(android.view.View, java.util.concurrent.ConcurrentHashMap, android.graphics.Rect, java.util.List, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct):void");
    }
}
