package euh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import ea2.p;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements ruh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseQuestionScreenContract$InputData f129587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f129588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f129589c;
    public final e4m.e d;

    public f(d dVar, e eVar, BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData) {
        this.f129588b = eVar;
        this.f129587a = baseQuestionScreenContract$InputData;
        int i = 12;
        this.f129589c = e4m.b.b(new p(eVar, this, 1, i));
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
