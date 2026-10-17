package androidx.glance.appwidget;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import fim.a;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import yhm.o;
import zhm.a1;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.GlanceAppWidgetManager$cleanReceivers$2", f = "GlanceAppWidgetManager.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "prefs"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidgetManager$cleanReceivers$2 extends i implements Function2<Preferences, Continuation<? super Preferences>, Object> {
    final /* synthetic */ Set<String> $receivers;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$cleanReceivers$2(Set<String> set, Continuation<? super GlanceAppWidgetManager$cleanReceivers$2> continuation) {
        super(2, continuation);
        this.$receivers = set;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        GlanceAppWidgetManager$cleanReceivers$2 glanceAppWidgetManager$cleanReceivers$2 = new GlanceAppWidgetManager$cleanReceivers$2(this.$receivers, continuation);
        glanceAppWidgetManager$cleanReceivers$2.L$0 = obj2;
        return glanceAppWidgetManager$cleanReceivers$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull Preferences preferences, Continuation<? super Preferences> continuation) {
        return ((GlanceAppWidgetManager$cleanReceivers$2) create(preferences, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        Preferences preferences = (Preferences) this.L$0;
        Set set = (Set) preferences.get(GlanceAppWidgetManager.providersKey);
        if (set != null) {
            Set<String> set2 = this.$receivers;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : set) {
                if (!set2.contains((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                MutablePreferences mutablePreferences = preferences.toMutablePreferences();
                mutablePreferences.set(GlanceAppWidgetManager.providersKey, a1.k(set, arrayList));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    mutablePreferences.remove(GlanceAppWidgetManager.Companion.providerKey((String) it8.next()));
                }
                return mutablePreferences.toPreferences();
            }
        }
        return preferences;
    }
}
