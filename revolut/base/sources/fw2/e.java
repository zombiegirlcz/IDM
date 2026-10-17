package fw2;

import android.app.Activity;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddToGooglePayViewControllerContract$InputData f138534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f138535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f138536c;
    public final e4m.e d;
    public final e4m.e e;

    public e(d dVar, ViewController viewController, AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData, Activity activity) {
        this.f138536c = dVar;
        this.f138534a = addToGooglePayViewControllerContract$InputData;
        this.f138535b = activity;
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new f4g.m(dVar, this, 28));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
