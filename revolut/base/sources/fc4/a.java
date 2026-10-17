package fc4;

import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import gsi.g;
import gsi.h;
import qgi.e;
import vc.s;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f133626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebViewContract$WebViewConfiguration f133627c;
    public final e d;

    public /* synthetic */ a(e eVar, int i) {
        this.f133625a = i;
        this.d = eVar;
    }

    @Override // gsi.g
    public final h build() {
        switch (this.f133625a) {
            case 0:
                s.h(this.f133626b, fsi.g.class);
                s.h(this.f133627c, WebViewContract$WebViewConfiguration.class);
                return new b((c) this.d, this.f133626b, this.f133627c);
            case 1:
                s.h(this.f133626b, fsi.g.class);
                s.h(this.f133627c, WebViewContract$WebViewConfiguration.class);
                return new k74.a((c) this.d, this.f133626b, this.f133627c);
            case 2:
                s.h(this.f133626b, fsi.g.class);
                s.h(this.f133627c, WebViewContract$WebViewConfiguration.class);
                return new lc4.a((c) this.d, this.f133626b, this.f133627c);
            default:
                s.h(this.f133626b, fsi.g.class);
                s.h(this.f133627c, WebViewContract$WebViewConfiguration.class);
                return new qgi.b((qgi.c) this.d, this.f133626b, this.f133627c);
        }
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f133625a) {
            case 0:
                this.f133626b = (xoi.d) gVar;
                break;
            case 1:
                this.f133626b = (xoi.d) gVar;
                break;
            case 2:
                this.f133626b = (xoi.d) gVar;
                break;
            default:
                this.f133626b = (xoi.d) gVar;
                break;
        }
        return this;
    }
}
