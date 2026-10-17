package ey;

import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f130486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CameraKitView f130487c;
    public CameraKitClientSettings d;
    public CameraKitUiSettings e;
    public vy.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final my.b f130488g;

    public /* synthetic */ c(my.b bVar, int i) {
        this.f130485a = i;
        this.f130488g = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f130485a) {
            case 0:
                this.f130486b = viewController;
                break;
            case 1:
                this.f130486b = viewController;
                break;
            case 2:
                this.f130486b = viewController;
                break;
            case 3:
                this.f130486b = viewController;
                break;
            default:
                this.f130486b = viewController;
                break;
        }
        return this;
    }

    public final c b(CameraKitClientSettings cameraKitClientSettings) {
        switch (this.f130485a) {
            case 0:
                cameraKitClientSettings.getClass();
                this.d = cameraKitClientSettings;
                break;
            case 1:
                cameraKitClientSettings.getClass();
                this.d = cameraKitClientSettings;
                break;
            case 2:
                cameraKitClientSettings.getClass();
                this.d = cameraKitClientSettings;
                break;
            case 3:
                cameraKitClientSettings.getClass();
                this.d = cameraKitClientSettings;
                break;
            default:
                cameraKitClientSettings.getClass();
                this.d = cameraKitClientSettings;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f130485a) {
            case 0:
                s.h(this.f130486b, ViewController.class);
                s.h(this.f130487c, CameraKitView.class);
                s.h(this.d, CameraKitClientSettings.class);
                s.h(this.e, CameraKitUiSettings.class);
                s.h(this.f, vy.a.class);
                return new d((b) this.f130488g, new oy.b(), new xy.b(), this.f130486b, this.f130487c, this.d, this.e, this.f);
            case 1:
                s.h(this.f130486b, ViewController.class);
                s.h(this.f130487c, CameraKitView.class);
                s.h(this.d, CameraKitClientSettings.class);
                s.h(this.e, CameraKitUiSettings.class);
                s.h(this.f, vy.a.class);
                return new d((mz.b) this.f130488g, new oy.b(), new xy.b(), this.f130486b, this.f130487c, this.d, this.e, this.f);
            case 2:
                s.h(this.f130486b, ViewController.class);
                s.h(this.f130487c, CameraKitView.class);
                s.h(this.d, CameraKitClientSettings.class);
                s.h(this.e, CameraKitUiSettings.class);
                s.h(this.f, vy.a.class);
                return new d((b) this.f130488g, new oy.b(), new xy.b(), this.f130486b, this.f130487c, this.d, this.e, this.f, (byte) 0);
            case 3:
                s.h(this.f130486b, ViewController.class);
                s.h(this.f130487c, CameraKitView.class);
                s.h(this.d, CameraKitClientSettings.class);
                s.h(this.e, CameraKitUiSettings.class);
                s.h(this.f, vy.a.class);
                return new oz.c((b) this.f130488g, new oy.b(), new xy.b(), this.f130486b, this.f130487c, this.d, this.e, this.f);
            default:
                s.h(this.f130486b, ViewController.class);
                s.h(this.f130487c, CameraKitView.class);
                s.h(this.d, CameraKitClientSettings.class);
                s.h(this.e, CameraKitUiSettings.class);
                s.h(this.f, vy.a.class);
                return new d((b) this.f130488g, new oy.b(), new xy.b(), this.f130486b, this.f130487c, this.d, this.e, this.f, (char) 0);
        }
    }

    public final c c(CameraKitUiSettings cameraKitUiSettings) {
        switch (this.f130485a) {
            case 0:
                cameraKitUiSettings.getClass();
                this.e = cameraKitUiSettings;
                break;
            case 1:
                cameraKitUiSettings.getClass();
                this.e = cameraKitUiSettings;
                break;
            case 2:
                cameraKitUiSettings.getClass();
                this.e = cameraKitUiSettings;
                break;
            case 3:
                cameraKitUiSettings.getClass();
                this.e = cameraKitUiSettings;
                break;
            default:
                cameraKitUiSettings.getClass();
                this.e = cameraKitUiSettings;
                break;
        }
        return this;
    }

    public final c d(CameraKitView cameraKitView) {
        switch (this.f130485a) {
            case 0:
                this.f130487c = cameraKitView;
                break;
            case 1:
                this.f130487c = cameraKitView;
                break;
            case 2:
                this.f130487c = cameraKitView;
                break;
            case 3:
                this.f130487c = cameraKitView;
                break;
            default:
                this.f130487c = cameraKitView;
                break;
        }
        return this;
    }

    public final c i(vy.a aVar) {
        switch (this.f130485a) {
            case 0:
                aVar.getClass();
                this.f = aVar;
                break;
            case 1:
                aVar.getClass();
                this.f = aVar;
                break;
            case 2:
                aVar.getClass();
                this.f = aVar;
                break;
            case 3:
                aVar.getClass();
                this.f = aVar;
                break;
            default:
                aVar.getClass();
                this.f = aVar;
                break;
        }
        return this;
    }
}
