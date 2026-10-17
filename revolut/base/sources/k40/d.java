package k40;

import com.revolut.chat.ui.assistant.widget.AssistantWidgetContext;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.InputLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.InputWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l30.b f180824b;

    public d(l30.b assistantChatUpdatesProvider) {
        Intrinsics.checkNotNullParameter(assistantChatUpdatesProvider, "assistantChatUpdatesProvider");
        this.f180824b = assistantChatUpdatesProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.FALSE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new InputLoadingWidgetDelegate.Model(new TextLocalisedClause(R$string.chat_assistant_widget_title, null, null, 14), id10);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return new InputWidgetDelegate.Model(str, new TextLocalisedClause(R$string.chat_assistant_widget_title, null, null, 14), false, null, new TextLocalisedClause(R$string.chat_assistant_widget_suggestion, null, null, 14));
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        AssistantWidgetContext widgetContext2 = (AssistantWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new c(this, widgetType, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((AssistantWidgetContext) widgetContext, str, eVar);
        return null;
    }
}
