package mkh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f206331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestDocumentsDetailsScreenContract$InputData f206332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f206333c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f206334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f206335h;
    public final e4m.e i;

    public i(s sVar, BaseScreen baseScreen, InvestDocumentsDetailsScreenContract$InputData investDocumentsDetailsScreenContract$InputData) {
        this.f206333c = sVar;
        this.f206331a = baseScreen;
        this.f206332b = investDocumentsDetailsScreenContract$InputData;
        int i = 6;
        this.d = e4m.b.b(new mjl.b(sVar, this, 0, i));
        this.e = e4m.b.b(new mjl.b(sVar, this, 1, i));
        this.f = e4m.b.b(new mjl.b(sVar, this, 4, i));
        this.f206334g = e4m.b.b(new mjl.b(sVar, this, 3, i));
        this.f206335h = e4m.b.b(new mjl.b(sVar, this, 5, i));
        this.i = e4m.b.b(new mjl.b(sVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        Object ext = (d1h.e) this.e.get();
        Intrinsics.checkNotNullParameter(ext, "ext");
        yji.n nVar = (yji.n) ext;
        vc.s.k(nVar);
        return ImmutableSet.of(nVar);
    }

    @Override // sji.b
    public final Set g() {
        gah.f factory = ((u8h.b) this.f206333c.i).a();
        vc.s.j(factory);
        d1h.j view = (d1h.j) this.d.get();
        d1h.e modelExtension = (d1h.e) this.e.get();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        return ImmutableSet.of(new aah.g(view, modelExtension));
    }
}
