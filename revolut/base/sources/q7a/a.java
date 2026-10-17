package q7a;

import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.e;
import java.util.Collections;
import java.util.Set;
import ppd.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionsControllerContract$InputData f242786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f242787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f242788c;

    public a(b bVar, ViewController viewController, PermissionsControllerContract$InputData permissionsControllerContract$InputData) {
        this.f242786a = permissionsControllerContract$InputData;
        this.f242787b = viewController;
        this.f242788c = e4m.b.b(new u(bVar, this, 25));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
