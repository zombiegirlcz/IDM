package aw;

import androidx.camera.core.ViewPort;
import androidx.camera.view.PreviewView;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreviewView f10215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqe.a f10216b;

    public w(PreviewView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f10215a = view;
        this.f10216b = new aqe.a(this, 19);
    }

    public final Object a(gim.c frame) {
        eim.c cVar = new eim.c(fim.h.b(frame));
        PreviewView previewView = this.f10215a;
        ViewPort viewPort = previewView.getViewPort();
        if (viewPort != null) {
            m.Companion companion = yhm.m.INSTANCE;
            cVar.resumeWith(viewPort);
        } else {
            previewView.addOnLayoutChangeListener(new v(this, cVar));
        }
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }
}
