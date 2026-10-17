package androidx.glance.appwidget;

import androidx.compose.ui.unit.DpSize;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.layout.SizeModifiersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR%\u0010\n\u001a\u00020\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/glance/appwidget/EmittableSizeBox;", "Landroidx/glance/EmittableWithChildren;", "()V", "<anonymous parameter 0>", "Landroidx/glance/GlanceModifier;", "modifier", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "size", "Landroidx/compose/ui/unit/DpSize;", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "J", "sizeMode", "Landroidx/glance/appwidget/SizeMode;", "getSizeMode", "()Landroidx/glance/appwidget/SizeMode;", "setSizeMode", "(Landroidx/glance/appwidget/SizeMode;)V", "copy", "Landroidx/glance/Emittable;", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableSizeBox extends EmittableWithChildren {
    private long size;

    @NotNull
    private SizeMode sizeMode;

    public EmittableSizeBox() {
        super(0, false, 3, null);
        this.size = DpSize.INSTANCE.m3326getUnspecifiedMYxV2XQ();
        this.sizeMode = SizeMode.Single.INSTANCE;
    }

    @Override // androidx.glance.Emittable
    @NotNull
    public Emittable copy() {
        EmittableSizeBox emittableSizeBox = new EmittableSizeBox();
        emittableSizeBox.size = this.size;
        emittableSizeBox.sizeMode = this.sizeMode;
        List<Emittable> children = emittableSizeBox.getChildren();
        List<Emittable> children2 = getChildren();
        ArrayList arrayList = new ArrayList(w.t(children2, 10));
        Iterator<T> it8 = children2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Emittable) it8.next()).copy());
        }
        children.addAll(arrayList);
        return emittableSizeBox;
    }

    @Override // androidx.glance.Emittable
    @NotNull
    public GlanceModifier getModifier() {
        GlanceModifier modifier;
        Emittable emittable = (Emittable) d0.M0(getChildren());
        return (emittable == null || (modifier = emittable.getModifier()) == null) ? SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE) : modifier;
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final SizeMode getSizeMode() {
        return this.sizeMode;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(@NotNull GlanceModifier glanceModifier) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    /* JADX INFO: renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m3492setSizeEaSLcWc(long j2) {
        this.size = j2;
    }

    public final void setSizeMode(@NotNull SizeMode sizeMode) {
        this.sizeMode = sizeMode;
    }

    @NotNull
    public String toString() {
        return "EmittableSizeBox(size=" + ((Object) DpSize.m3324toStringimpl(this.size)) + ", sizeMode=" + this.sizeMode + ", children=[\n" + childrenToString() + "\n])";
    }
}
