package euh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements tuh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseQuestionScreenContract$InputData f129590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f129591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f129592c;
    public final e4m.e d;
    public final e4m.e e;

    public g(d dVar, e eVar, BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData) {
        this.f129591b = dVar;
        this.f129592c = eVar;
        this.f129590a = baseQuestionScreenContract$InputData;
        int i = 1;
        this.d = e4m.b.b(new a(this, 1, i));
        this.e = e4m.b.b(new a(this, 0, i));
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
