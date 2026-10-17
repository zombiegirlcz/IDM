package androidx.glance.appwidget;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import fim.a;
import gim.d;
import gim.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import yhm.o;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.GlanceAppWidgetManager$updateReceiver$2", f = "GlanceAppWidgetManager.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "R", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "P", "Landroidx/glance/appwidget/GlanceAppWidget;", "pref"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidgetManager$updateReceiver$2 extends i implements Function2<Preferences, Continuation<? super Preferences>, Object> {
    final /* synthetic */ String $providerName;
    final /* synthetic */ String $receiverName;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$updateReceiver$2(String str, String str2, Continuation<? super GlanceAppWidgetManager$updateReceiver$2> continuation) {
        super(2, continuation);
        this.$receiverName = str;
        this.$providerName = str2;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        GlanceAppWidgetManager$updateReceiver$2 glanceAppWidgetManager$updateReceiver$2 = new GlanceAppWidgetManager$updateReceiver$2(this.$receiverName, this.$providerName, continuation);
        glanceAppWidgetManager$updateReceiver$2.L$0 = obj2;
        return glanceAppWidgetManager$updateReceiver$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull Preferences preferences, Continuation<? super Preferences> continuation) {
        return ((GlanceAppWidgetManager$updateReceiver$2) create(preferences, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        Preferences preferences = (Preferences) this.L$0;
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        String str = this.$receiverName;
        String str2 = this.$providerName;
        Preferences.Key key = GlanceAppWidgetManager.providersKey;
        Set set = (Set) preferences.get(GlanceAppWidgetManager.providersKey);
        if (set == null) {
            set = h0.f322473a;
        }
        mutablePreferences.set(key, a1.m(set, str));
        mutablePreferences.set(GlanceAppWidgetManager.Companion.providerKey(str), str2);
        return mutablePreferences.toPreferences();
    }
}
