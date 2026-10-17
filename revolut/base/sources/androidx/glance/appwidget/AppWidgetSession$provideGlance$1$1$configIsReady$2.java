package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.glance.state.ConfigManager;
import androidx.glance.state.GlanceStateDefinition;
import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1$configIsReady$2", f = "AppWidgetSession.kt", l = {103}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class AppWidgetSession$provideGlance$1$1$configIsReady$2 extends i implements Function2<ProduceStateScope<Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AppWidgetManager $manager;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$provideGlance$1$1$configIsReady$2(AppWidgetSession appWidgetSession, AppWidgetManager appWidgetManager, Context context, Continuation<? super AppWidgetSession$provideGlance$1$1$configIsReady$2> continuation) {
        super(2, continuation);
        this.this$0 = appWidgetSession;
        this.$manager = appWidgetManager;
        this.$context = context;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        AppWidgetSession$provideGlance$1$1$configIsReady$2 appWidgetSession$provideGlance$1$1$configIsReady$2 = new AppWidgetSession$provideGlance$1$1$configIsReady$2(this.this$0, this.$manager, this.$context, continuation);
        appWidgetSession$provideGlance$1$1$configIsReady$2.L$0 = obj2;
        return appWidgetSession$provideGlance$1$1$configIsReady$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull ProduceStateScope<Boolean> produceStateScope, Continuation<? super Unit> continuation) {
        return ((AppWidgetSession$provideGlance$1$1$configIsReady$2) create(produceStateScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        ProduceStateScope produceStateScope;
        MutableState mutableState;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            produceStateScope = (ProduceStateScope) this.L$0;
            MutableState mutableState2 = this.this$0.options;
            Bundle appWidgetOptions = this.this$0.initialOptions;
            if (appWidgetOptions == null) {
                appWidgetOptions = this.$manager.getAppWidgetOptions(this.this$0.id.getAppWidgetId());
            }
            mutableState2.setValue(appWidgetOptions);
            GlanceStateDefinition<?> stateDefinition = this.this$0.widget.getStateDefinition();
            if (stateDefinition != null) {
                AppWidgetSession appWidgetSession = this.this$0;
                Context context = this.$context;
                MutableState mutableState3 = appWidgetSession.glanceState;
                ConfigManager configManager = appWidgetSession.configManager;
                String key = appWidgetSession.getKey();
                this.L$0 = produceStateScope;
                this.L$1 = mutableState3;
                this.label = 1;
                obj2 = configManager.getValue(context, stateDefinition, key, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                mutableState = mutableState3;
            }
            produceStateScope.setValue(Boolean.TRUE);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState = (MutableState) this.L$1;
        produceStateScope = (ProduceStateScope) this.L$0;
        o.b(obj2);
        mutableState.setValue(obj2);
        produceStateScope.setValue(Boolean.TRUE);
        return Unit.f186387a;
    }
}
