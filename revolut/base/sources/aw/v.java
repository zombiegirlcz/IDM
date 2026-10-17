package aw;

import android.view.View;
import androidx.camera.core.ViewPort;
import androidx.camera.view.PreviewView;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class v implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f10213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eim.c f10214b;

    public v(w wVar, eim.c cVar) {
        this.f10213a = wVar;
        this.f10214b = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        Intrinsics.checkNotNullParameter(v, "v");
        PreviewView previewView = this.f10213a.f10215a;
        ViewPort viewPort = previewView.getViewPort();
        if (viewPort != null) {
            previewView.removeOnLayoutChangeListener(this);
            m.Companion companion = yhm.m.INSTANCE;
            this.f10214b.resumeWith(viewPort);
        }
    }
}
