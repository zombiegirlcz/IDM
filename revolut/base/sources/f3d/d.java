package f3d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f131938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f131939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dsh.e f131940y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str, dsh.e eVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.f131938w = iVar;
        this.f131939x = str;
        this.f131940y = eVar;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f131938w, this.f131939x, this.f131940y, this.z, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (vkm.q.u(r0, r8, r7) == r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.u
            r3 = 2
            r4 = 1
            f3d.i r5 = r7.f131938w
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            yhm.o.b(r8)
            goto L63
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            yhm.o.b(r8)
            goto L32
        L22:
            yhm.o.b(r8)
            r7.v = r0
            r7.u = r4
            s1d.a r8 = r5.e
            java.lang.Object r8 = r8.d(r7)
            if (r8 != r1) goto L32
            goto L62
        L32:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L66
            dsh.e r8 = r7.f131940y
            java.lang.String r4 = "WATCHLIST_WIDGET_ASSET_IDS"
            java.lang.String r8 = r8.a(r4)
            java.lang.String r4 = r7.z
            if (r8 == 0) goto L4d
            r6 = 0
            kotlinx.coroutines.flow.Flow r8 = r5.k(r4, r8, r6)
            goto L58
        L4d:
            com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate$Model r8 = f3d.i.j(r4)
            go.g r4 = new go.g
            r5 = 2
            r4.<init>(r8, r5)
            r8 = r4
        L58:
            r7.v = r2
            r7.u = r3
            java.lang.Object r8 = vkm.q.u(r0, r8, r7)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L66:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r8 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r0 = 3
            r8.<init>(r2, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f3d.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
