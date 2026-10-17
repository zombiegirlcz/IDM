package au0;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes19.dex */
public final class y4 extends View implements ix0.v0, ny0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9446a;

    public y4(Context context) {
        super(context);
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return this.f9446a;
    }

    @Override // ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return true;
    }

    public void setFitsReadableArea(boolean z) {
        this.f9446a = z;
    }
}
