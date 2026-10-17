package androidx.glance.layout;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/glance/layout/EmittableBox;", "Landroidx/glance/EmittableWithChildren;", "()V", "contentAlignment", "Landroidx/glance/layout/Alignment;", "getContentAlignment", "()Landroidx/glance/layout/Alignment;", "setContentAlignment", "(Landroidx/glance/layout/Alignment;)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "copy", "Landroidx/glance/Emittable;", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableBox extends EmittableWithChildren {

    @NotNull
    private Alignment contentAlignment;

    @NotNull
    private GlanceModifier modifier;

    public EmittableBox() {
        super(0, false, 3, null);
        this.modifier = GlanceModifier.INSTANCE;
        this.contentAlignment = Alignment.INSTANCE.getTopStart();
    }

    @Override // androidx.glance.Emittable
    @NotNull
    public Emittable copy() {
        EmittableBox emittableBox = new EmittableBox();
        emittableBox.setModifier(getModifier());
        emittableBox.contentAlignment = this.contentAlignment;
        List<Emittable> children = emittableBox.getChildren();
        List<Emittable> children2 = getChildren();
        ArrayList arrayList = new ArrayList(w.t(children2, 10));
        Iterator<T> it8 = children2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Emittable) it8.next()).copy());
        }
        children.addAll(arrayList);
        return emittableBox;
    }

    @NotNull
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.glance.Emittable
    @NotNull
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final void setContentAlignment(@NotNull Alignment alignment) {
        this.contentAlignment = alignment;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(@NotNull GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    @NotNull
    public String toString() {
        return "EmittableBox(modifier=" + getModifier() + ", contentAlignment=" + this.contentAlignment + "children=[\n" + childrenToString() + "\n])";
    }
}
