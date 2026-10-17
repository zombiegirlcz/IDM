package mkh;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f206336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f206337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206338c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f206339g;

    public j(s sVar, BaseScreen baseScreen) {
        this.f206337b = sVar;
        this.f206336a = baseScreen;
        int i = 7;
        this.f206338c = e4m.b.b(new mjl.b(sVar, this, 0, i));
        this.d = e4m.b.b(new mjl.b(sVar, this, 1, i));
        this.e = e4m.b.b(new mjl.b(sVar, this, 4, i));
        this.f = e4m.b.b(new mjl.b(sVar, this, 3, i));
        this.f206339g = e4m.b.b(new mjl.b(sVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        Object ext = (d1h.e) this.d.get();
        Intrinsics.checkNotNullParameter(ext, "ext");
        yji.n nVar = (yji.n) ext;
        vc.s.k(nVar);
        return ImmutableSet.of(nVar);
    }

    @Override // sji.b
    public final Set g() {
        gah.f factory = ((u8h.b) this.f206337b.i).a();
        vc.s.j(factory);
        d1h.j view = (d1h.j) this.f206338c.get();
        d1h.e modelExtension = (d1h.e) this.d.get();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        return ImmutableSet.of(new aah.g(view, modelExtension));
    }
}
