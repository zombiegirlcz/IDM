package euh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import ea2.p;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements puh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseQuestionScreenContract$InputData f129570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f129571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f129572c;
    public final e4m.e d;

    public c(d dVar, e eVar, BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData) {
        this.f129571b = eVar;
        this.f129570a = baseQuestionScreenContract$InputData;
        int i = 10;
        this.f129572c = e4m.b.b(new p(eVar, this, 1, i));
        this.d = e4m.b.b(new p(eVar, this, 0, i));
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
