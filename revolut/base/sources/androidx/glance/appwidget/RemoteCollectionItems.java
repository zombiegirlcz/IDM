package androidx.glance.appwidget;

import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/glance/appwidget/RemoteCollectionItems;", "", "", "ids", "", "Landroid/widget/RemoteViews;", "views", "", "hasStableIds", "", "_viewTypeCount", "<init>", "([J[Landroid/widget/RemoteViews;ZI)V", "position", "", "getItemId", "(I)J", "getItemView", "(I)Landroid/widget/RemoteViews;", "()Z", "[J", "[Landroid/widget/RemoteViews;", "Z", "I", "getItemCount", "()I", "itemCount", "getViewTypeCount", "viewTypeCount", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteCollectionItems {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RemoteCollectionItems Empty = new RemoteCollectionItems(new long[0], new RemoteViews[0], false, 1);
    private final int _viewTypeCount;
    private final boolean hasStableIds;

    @NotNull
    private final long[] ids;

    @NotNull
    private final RemoteViews[] views;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/RemoteCollectionItems$Companion;", "", "()V", "Empty", "Landroidx/glance/appwidget/RemoteCollectionItems;", "getEmpty", "()Landroidx/glance/appwidget/RemoteCollectionItems;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RemoteCollectionItems getEmpty() {
            return RemoteCollectionItems.Empty;
        }

        private Companion() {
        }
    }

    private RemoteCollectionItems(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i) {
        this.ids = jArr;
        this.views = remoteViewsArr;
        this.hasStableIds = z;
        this._viewTypeCount = i;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = d0.U(arrayList).size();
        if (size <= this._viewTypeCount) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this._viewTypeCount + ", but the collection contains " + size + " different layout ids").toString());
    }

    public final int getItemCount() {
        return this.ids.length;
    }

    public final long getItemId(int position) {
        return this.ids[position];
    }

    @NotNull
    public final RemoteViews getItemView(int position) {
        return this.views[position];
    }

    /* JADX INFO: renamed from: getViewTypeCount, reason: from getter */
    public final int get_viewTypeCount() {
        return this._viewTypeCount;
    }

    /* JADX INFO: renamed from: hasStableIds, reason: from getter */
    public final boolean getHasStableIds() {
        return this.hasStableIds;
    }
}
