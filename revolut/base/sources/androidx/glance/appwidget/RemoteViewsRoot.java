package androidx.glance.appwidget;

import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/glance/appwidget/RemoteViewsRoot;", "Landroidx/glance/EmittableWithChildren;", "maxDepth", "", "(I)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "copy", "Landroidx/glance/Emittable;", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsRoot extends EmittableWithChildren {
    private final int maxDepth;

    @NotNull
    private GlanceModifier modifier;

    public RemoteViewsRoot(int i) {
        super(i, false, 2, null);
        this.maxDepth = i;
        this.modifier = GlanceModifier.INSTANCE;
    }

    @Override // androidx.glance.Emittable
    @NotNull
    public Emittable copy() {
        RemoteViewsRoot remoteViewsRoot = new RemoteViewsRoot(this.maxDepth);
        remoteViewsRoot.setModifier(getModifier());
        List<Emittable> children = remoteViewsRoot.getChildren();
        List<Emittable> children2 = getChildren();
        ArrayList arrayList = new ArrayList(w.t(children2, 10));
        Iterator<T> it8 = children2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Emittable) it8.next()).copy());
        }
        children.addAll(arrayList);
        return remoteViewsRoot;
    }

    @Override // androidx.glance.Emittable
    @NotNull
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(@NotNull GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    @NotNull
    public String toString() {
        return "RemoteViewsRoot(modifier=" + getModifier() + ", children=[\n" + childrenToString() + "\n])";
    }
}
