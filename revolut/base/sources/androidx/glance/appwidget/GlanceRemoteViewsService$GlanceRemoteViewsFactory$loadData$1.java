package androidx.glance.appwidget;

import androidx.glance.appwidget.GlanceRemoteViewsService;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1", f = "GlanceRemoteViewsService.kt", l = {112, 113}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GlanceRemoteViewsService.GlanceRemoteViewsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, Continuation<? super GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = glanceRemoteViewsFactory;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r7.startSessionAndWaitUntilReady(r1, r6) == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r7)
            goto L5d
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$0
            androidx.glance.appwidget.AppWidgetId r1 = (androidx.glance.appwidget.AppWidgetId) r1
            yhm.o.b(r7)
            goto L47
        L20:
            yhm.o.b(r7)
            androidx.glance.appwidget.AppWidgetId r1 = new androidx.glance.appwidget.AppWidgetId
            androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory r7 = r6.this$0
            int r7 = androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory.access$getAppWidgetId$p(r7)
            r1.<init>(r7)
            androidx.glance.session.SessionManager r7 = androidx.glance.session.SessionManagerKt.getGlanceSessionManager()
            androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory r4 = r6.this$0
            android.content.Context r4 = androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory.access$getContext$p(r4)
            java.lang.String r5 = androidx.glance.appwidget.AppWidgetUtilsKt.toSessionKey(r1)
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.isSessionRunning(r4, r5, r6)
            if (r7 != r0) goto L47
            goto L5c
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5d
            androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory r7 = r6.this$0
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory.access$startSessionAndWaitUntilReady(r7, r1, r6)
            if (r7 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
