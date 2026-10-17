package jc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$ShowAddNewWidget;
import com.revolut.feature.add.new_product.api.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.slot_manager.api.SlotManagerApi$Toggles;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tf1.c0;
import tf1.p;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of1.b f172741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final of1.a f172742c;

    public c(of1.b addNewProductWidgetInteractor, of1.a addNewProductFeatureAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(addNewProductWidgetInteractor, "addNewProductWidgetInteractor");
        Intrinsics.checkNotNullParameter(addNewProductFeatureAvailabilityProvider, "addNewProductFeatureAvailabilityProvider");
        this.f172741b = addNewProductWidgetInteractor;
        this.f172742c = addNewProductFeatureAvailabilityProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(j());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        c0 c0Var = (c0) this.f172741b;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (((p) c0Var.d).a()) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            return PhotoBannerWidgetDelegate.Model.Companion.a(PhotoBannerWidgetDelegate.Model.INSTANCE, listId, null, 14);
        }
        Intrinsics.checkNotNullParameter(listId, "listId");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, listId, new TextLocalisedClause(R$string.add_new_widget_title, null, null, 14), 2, null, 24);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.valueOf(j());
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        return i(str, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new b(this, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Personal) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof jc7.a
            if (r0 == 0) goto L13
            r0 = r10
            jc7.a r0 = (jc7.a) r0
            int r1 = r0.f172738w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172738w = r1
            goto L1a
        L13:
            jc7.a r0 = new jc7.a
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172738w
            r3 = 1
            r4 = 3
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            goto L7b
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r10)
            boolean r10 = r8.j()
            if (r10 == 0) goto L8c
            of1.a r10 = r8.f172742c
            tf1.p r10 = (tf1.p) r10
            boolean r10 = r10.a()
            if (r10 != 0) goto L86
            r0.f172738w = r3
            of1.b r10 = r8.f172741b
            tf1.c0 r10 = (tf1.c0) r10
            jt0.b r2 = r10.f270150b
            java.lang.Object r3 = r2.f178265b
            qm.e r3 = (qm.e) r3
            akg.n r3 = r3.f()
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.q0 r3 = rd0.e.n(r3, r6)
            s9b.n r6 = new s9b.n
            r7 = 27
            r6.<init>(r5, r2, r7)
            wkm.l r2 = vkm.q.Q(r3, r6)
            amh.w r3 = new amh.w
            r6 = 29
            r3.<init>(r2, r6)
            t38.e r2 = new t38.e
            r6 = 2
            r2.<init>(r3, r6, r10, r9)
            java.lang.Object r10 = vkm.q.x(r2, r0)
            if (r10 != r1) goto L7b
            return r1
        L7b:
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r10 = (com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model) r10
            if (r10 == 0) goto L80
            return r10
        L80:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r9 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r9.<init>(r5, r4)
            throw r9
        L86:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r9 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r9.<init>(r5, r4)
            throw r9
        L8c:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r9 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r9.<init>(r5, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jc7.c.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean j() {
        p pVar = (p) this.f172742c;
        gte.a aVar = pVar.f270193a;
        return (((jte.d) aVar).c(AddNewProductFeatureAvailabilityApi$Toggles$ShowAddNewWidget.f60850c) || pVar.a()) && !((jte.d) aVar).c(SlotManagerApi$Toggles.CmsP4U.f87253c);
    }
}
