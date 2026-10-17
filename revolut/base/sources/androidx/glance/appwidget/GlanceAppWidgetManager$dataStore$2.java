package androidx.glance.appwidget;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidgetManager$dataStore$2 extends u implements Function0<DataStore<Preferences>> {
    final /* synthetic */ GlanceAppWidgetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$dataStore$2(GlanceAppWidgetManager glanceAppWidgetManager) {
        super(0);
        this.this$0 = glanceAppWidgetManager;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DataStore<Preferences> invoke() {
        return this.this$0.getOrCreateDataStore();
    }
}
