package euh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements kuh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseQuestionScreenContract$InputData f129567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f129568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f129569c;
    public final e4m.e d;

    public b(d dVar, e eVar, BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData) {
        this.f129568b = eVar;
        this.f129567a = baseQuestionScreenContract$InputData;
        int i = 0;
        this.f129569c = e4m.b.b(new a(this, 1, i));
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
