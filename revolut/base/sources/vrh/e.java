package vrh;

import vkm.j2;
import xq2.c;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a f291604b;

    public /* synthetic */ e(com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a aVar, int i) {
        this.f291603a = i;
        this.f291604b = aVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f291603a) {
            case 0:
                this.f291604b.d0(false, false);
                break;
            case 1:
                j2 j2Var = this.f291604b.z;
                c.b bVar = new c.b();
                j2Var.getClass();
                j2Var.g(null, bVar);
                break;
            case 2:
                j2 j2Var2 = this.f291604b.z;
                j2Var2.getClass();
                j2Var2.g(null, c.a.f308054a);
                break;
            default:
                com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a aVar = this.f291604b;
                aVar.d0(false, false);
                j2 j2Var3 = aVar.z;
                j2Var3.getClass();
                j2Var3.g(null, c.a.f308054a);
                break;
        }
    }
}
