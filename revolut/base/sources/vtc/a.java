package vtc;

import android.app.Activity;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddToClickToPayScreenContract$InputData f291943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f291944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f291945c;
    public final e4m.e d = e4m.b.b(new v4d.a(this, 1, 25));
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f291946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f291947h;

    public a(t tVar, ViewController viewController, AddToClickToPayScreenContract$InputData addToClickToPayScreenContract$InputData, Activity activity) {
        this.f291945c = tVar;
        this.f291943a = addToClickToPayScreenContract$InputData;
        this.f291944b = activity;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.f = e4m.b.b(new v4d.a(this, 2, i));
        this.f291946g = e4m.b.b(new v4d.a(this, 3, i));
        this.f291947h = e4m.b.b(new v4d.a(this, 0, i));
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
