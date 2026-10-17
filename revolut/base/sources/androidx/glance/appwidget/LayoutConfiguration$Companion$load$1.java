package androidx.glance.appwidget;

import androidx.glance.appwidget.LayoutConfiguration;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.LayoutConfiguration$Companion", f = "WidgetLayout.kt", l = {97}, m = "load$glance_appwidget_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class LayoutConfiguration$Companion$load$1 extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LayoutConfiguration.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutConfiguration$Companion$load$1(LayoutConfiguration.Companion companion, Continuation<? super LayoutConfiguration$Companion$load$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load$glance_appwidget_release(null, 0, this);
    }
}
