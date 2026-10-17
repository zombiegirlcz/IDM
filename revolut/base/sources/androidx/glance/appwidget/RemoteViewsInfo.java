package androidx.glance.appwidget;

import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/glance/appwidget/RemoteViewsInfo;", "", "Landroid/widget/RemoteViews;", "remoteViews", "Landroidx/glance/appwidget/InsertedViewInfo;", "view", "<init>", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/InsertedViewInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/widget/RemoteViews;", "getRemoteViews", "()Landroid/widget/RemoteViews;", "Landroidx/glance/appwidget/InsertedViewInfo;", "getView", "()Landroidx/glance/appwidget/InsertedViewInfo;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RemoteViewsInfo {

    @NotNull
    private final RemoteViews remoteViews;

    @NotNull
    private final InsertedViewInfo view;

    public RemoteViewsInfo(@NotNull RemoteViews remoteViews, @NotNull InsertedViewInfo insertedViewInfo) {
        this.remoteViews = remoteViews;
        this.view = insertedViewInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteViewsInfo)) {
            return false;
        }
        RemoteViewsInfo remoteViewsInfo = (RemoteViewsInfo) other;
        return Intrinsics.f(this.remoteViews, remoteViewsInfo.remoteViews) && Intrinsics.f(this.view, remoteViewsInfo.view);
    }

    @NotNull
    public final RemoteViews getRemoteViews() {
        return this.remoteViews;
    }

    @NotNull
    public final InsertedViewInfo getView() {
        return this.view;
    }

    public int hashCode() {
        return this.view.hashCode() + (this.remoteViews.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.remoteViews + ", view=" + this.view + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
