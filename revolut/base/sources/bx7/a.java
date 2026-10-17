package bx7;

import androidx.recyclerview.widget.GridLayoutManager;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import ip0.nf0;
import koi.h;
import z4l.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f19507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f19508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f19509c;

    public a(j jVar, ScreenGridLayoutManager screenGridLayoutManager, ScreenGridLayoutManager screenGridLayoutManager2) {
        this.f19507a = jVar;
        this.f19508b = screenGridLayoutManager;
        this.f19509c = screenGridLayoutManager2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        koi.j jVarA = this.f19507a.a(i);
        this.f19508b.getSpanCount();
        if ((jVarA instanceof SmallCardDelegate.Model) || (jVarA instanceof nf0)) {
            return 1;
        }
        return this.f19509c.getSpanCount();
    }
}
