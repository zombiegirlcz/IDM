package androidx.glance.appwidget;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/glance/appwidget/RemoteCollectionItemsInMemoryStore;", "", "<init>", "()V", "", "appWidgetId", "viewId", "", "sizeInfo", "key", "(IILjava/lang/String;)Ljava/lang/String;", "Landroidx/glance/appwidget/RemoteCollectionItems;", "getItems", "(IILjava/lang/String;)Landroidx/glance/appwidget/RemoteCollectionItems;", "", "removeItems", "(IILjava/lang/String;)V", "", "items", "Ljava/util/Map;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RemoteCollectionItemsInMemoryStore {

    @NotNull
    private final Map<String, RemoteCollectionItems> items = new LinkedHashMap();

    private final String key(int appWidgetId, int viewId, String sizeInfo) {
        return appWidgetId + CoreConstants.DASH_CHAR + viewId + CoreConstants.DASH_CHAR + sizeInfo;
    }

    @NotNull
    public final RemoteCollectionItems getItems(int appWidgetId, int viewId, @NotNull String sizeInfo) {
        RemoteCollectionItems remoteCollectionItems = this.items.get(key(appWidgetId, viewId, sizeInfo));
        return remoteCollectionItems == null ? RemoteCollectionItems.INSTANCE.getEmpty() : remoteCollectionItems;
    }

    public final void removeItems(int appWidgetId, int viewId, @NotNull String sizeInfo) {
        this.items.remove(key(appWidgetId, viewId, sizeInfo));
    }
}
