package androidx.glance.appwidget;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1", f = "AppWidgetUtils.kt", l = {255}, m = "provideContent")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppWidgetUtilsKt$runGlance$1$receiver$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(AppWidgetUtilsKt$runGlance$1$receiver$1 appWidgetUtilsKt$runGlance$1$receiver$1, Continuation<? super AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1> continuation) {
        super(continuation);
        this.this$0 = appWidgetUtilsKt$runGlance$1$receiver$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.provideContent(null, this);
    }
}
