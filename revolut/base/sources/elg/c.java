package elg;

import android.app.Activity;
import com.google.common.collect.ImmutableSet;
import ea2.p;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f127447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f127448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f127449c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f127450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f127451h;

    public c(e eVar, d dVar, Activity activity) {
        this.f127447a = activity;
        int i = 7;
        this.f127448b = e4m.b.b(new p(eVar, this, 1, i));
        this.f127449c = e4m.b.b(new p(eVar, this, 4, i));
        this.d = e4m.b.b(new p(eVar, this, 3, i));
        this.e = e4m.b.b(new p(eVar, this, 5, i));
        this.f = e4m.b.b(new p(eVar, this, 6, i));
        this.f127450g = e4m.b.b(new p(eVar, this, 2, i));
        this.f127451h = e4m.b.b(new p(eVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
