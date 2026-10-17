package ovj;

import bwb.k;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItinerary;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryLifestyleWidget;
import com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext;
import cxe.u;
import dsh.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.t3;
import op0.m3;
import vkm.q;
import vkm.v1;
import w4l.i;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f230236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f230237c;

    public d(a tripItineraryWidgetAvailabilityInteractor, g tripItineraryWidgetItemsProvider) {
        Intrinsics.checkNotNullParameter(tripItineraryWidgetAvailabilityInteractor, "tripItineraryWidgetAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tripItineraryWidgetItemsProvider, "tripItineraryWidgetItemsProvider");
        this.f230236b = tripItineraryWidgetAvailabilityInteractor;
        this.f230237c = tripItineraryWidgetItemsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "TripItineraryMedium")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        jte.d dVar = (jte.d) this.f230236b.f230229a;
        return Boolean.valueOf(dVar.c(TravelTripsApi$Toggles$TripItinerary.f99257c) && dVar.c(TravelTripsApi$Toggles$TripItineraryLifestyleWidget.f99261c));
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "id");
        return PhotoBannerWidgetDelegate.Model.Companion.a(PhotoBannerWidgetDelegate.Model.INSTANCE, id10, m3.WRAP_CONTENT, 8);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i((TripItineraryWidgetContext) widgetContext, str, str2, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        TripItineraryWidgetContext widgetContext2 = (TripItineraryWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return mo3.a.g(new v1(new c(this, widgetType, id10, widgetContext2, null)), null, new oq3.e(24), 1);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((TripItineraryWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext r6, java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ovj.b
            if (r0 == 0) goto L13
            r0 = r9
            ovj.b r0 = (ovj.b) r0
            int r1 = r0.f230232y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230232y = r1
            goto L18
        L13:
            ovj.b r0 = new ovj.b
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f230230w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230232y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.v
            com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext r6 = r0.u
            yhm.o.b(r9)
            goto L4a
        L3a:
            yhm.o.b(r9)
            r0.u = r6
            r0.v = r7
            r0.f230232y = r4
            java.lang.Object r9 = r5.c(r8, r0)
            if (r9 != r1) goto L4a
            goto L6e
        L4a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r9 = 0
            if (r8 == 0) goto L70
            cxe.u r6 = r5.j(r7, r6)
            oq3.e r7 = new oq3.e
            r8 = 25
            r7.<init>(r8)
            jhi.b r6 = mo3.a.g(r6, r9, r7, r4)
            r0.u = r9
            r0.v = r9
            r0.f230232y = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r6
        L70:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r6 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r7 = 3
            r6.<init>(r9, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ovj.d.i(com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final u j(String id10, TripItineraryWidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        g gVar = this.f230237c;
        yuj.a aVar = gVar.f230239a;
        aVar.getClass();
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        tuj.g gVar2 = aVar.f317057a;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.y(nim.a.v(q.Q(new tse.c(gVar2.e.b(Unit.f186387a, loadingStrategy), gVar2, 4), new k(3, 13, null)), new t3(gVar, id10, 9)), new t3(gVar, id10, 10));
    }
}
