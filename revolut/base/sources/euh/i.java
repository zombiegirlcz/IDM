package euh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements vuh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseQuestionScreenContract$InputData f129605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f129606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f129607c;
    public final e4m.e d;

    public i(d dVar, e eVar, BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData) {
        this.f129606b = eVar;
        this.f129605a = baseQuestionScreenContract$InputData;
        int i = 2;
        this.f129607c = e4m.b.b(new a(this, 1, i));
        this.d = e4m.b.b(new a(this, 0, i));
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
