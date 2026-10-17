package oda;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddNewPocketContract$InputData f224355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f224356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224357c;
    public final o41.b d;
    public final e4m.e e;

    public f(o oVar, AddNewPocketContract$InputData addNewPocketContract$InputData) {
        this.f224356b = oVar;
        this.f224355a = addNewPocketContract$InputData;
        int i = 18;
        this.f224357c = e4m.b.b(new o41.b(oVar, this, 0, i));
        this.d = new o41.b(oVar, this, 2, i);
        this.e = e4m.b.b(new o41.b(oVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f224357c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
