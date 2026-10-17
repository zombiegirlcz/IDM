package e60;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends yji.p implements a, t80.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f122867c;
    public final t80.v d;
    public final rp0.m e;
    public final t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.j f122868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RowDelegate f122869h;
    public final PhotoDelegate i;

    public s(com.revolut.kompot.navigable.a controller, t80.v mediaPicker, z itemsProvider, rp0.m dialogDisplayer, t extensionModel, nji.b controllerUtils) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(mediaPicker, "mediaPicker");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(extensionModel, "extensionModel");
        Intrinsics.checkNotNullParameter(controllerUtils, "controllerUtils");
        this.f122867c = controller;
        this.d = mediaPicker;
        this.e = dialogDisplayer;
        this.f = extensionModel;
        this.f122868g = p.a.D("toSerialized(...)");
        this.f122869h = new RowDelegate(null, null, 7);
        this.i = new PhotoDelegate();
    }

    @Override // yji.d
    public final boolean I() {
        return S();
    }

    @Override // t80.h
    public final void K(List files, t80.l source) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(source, "source");
        R(new m(files, source, this.f.Z2()));
    }

    @Override // yji.d
    public final void M() {
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(this.f.b3()), new p(this, continuation, 0), 3);
        yji.d.H(this, rd0.e.b(this.f122869h.f53218h), new q(this, null), 3);
        yji.d.H(this, rd0.e.b(this.i.f52920c), new r(this, null), 3);
        yji.d.H(this, vkm.q.q(rd0.e.b(this.e.h())), new p(this, continuation, 1), 3);
    }

    @Override // yji.p
    public final String Q() {
        return "MEDIA_PICKER_EXTENSION";
    }

    public final void R(l lVar) {
        if (lVar != null) {
            this.f122868g.onNext(lVar);
        }
        this.e.b(false);
        this.f.e3();
    }

    public final boolean S() {
        if (!this.e.a()) {
            return false;
        }
        R(null);
        return true;
    }

    public final void T(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (this.e.a()) {
            return;
        }
        Activity activityM2 = this.f122867c.m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        e0m.e.c((AppCompatActivity) activityM2);
        this.f.f3(inputData);
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.d.f(state);
        ((y) this.f).e(state);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.d.g(outState);
        ((y) this.f).g(outState);
    }

    @Override // yji.d
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.d.b(i, i2, intent);
        this.f.onActivityResult(i, i2, intent);
    }

    @Override // yji.d
    public final void onCreate() {
        Intrinsics.checkNotNullParameter(this, "listener");
        this.d.f268788m = this;
        com.revolut.kompot.navigable.a controller = this.f122867c;
        Activity activityM2 = controller.m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity activity = (AppCompatActivity) activityM2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        ControllerContainerFrameLayout parentView = controller.C2().h3();
        rp0.m mVar = this.e;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        mki.c cVar = mVar.e;
        if (cVar != null) {
            LifecycleOwner lifecycleOwner = mVar.d;
            if (lifecycleOwner == null) {
                Intrinsics.r("lifecycleOwner");
                throw null;
            }
            lifecycleOwner.getLifecycle().removeObserver(cVar);
        }
        mVar.e = null;
        rp0.o oVar = mVar.f;
        if (oVar != null) {
            mVar.f = null;
            oVar.b();
        }
        mVar.f256118b = parentView;
        mVar.d = activity;
        mVar.f256119c = activity;
        mVar.i(new e58.e(this, 1));
    }

    @Override // yji.d
    public final void onDestroy() {
        this.d.f268788m = null;
    }

    @Override // t80.h
    public final void p(t80.m reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        R(new j(reason, this.f.Z2()));
    }
}
