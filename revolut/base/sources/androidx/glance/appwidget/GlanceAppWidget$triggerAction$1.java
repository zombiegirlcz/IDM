package androidx.glance.appwidget;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", l = {160, 162, 167}, m = "triggerAction$glance_appwidget_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidget$triggerAction$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$triggerAction$1(GlanceAppWidget glanceAppWidget, Continuation<? super GlanceAppWidget$triggerAction$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidget;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.triggerAction$glance_appwidget_release(null, 0, null, null, this);
    }
}
