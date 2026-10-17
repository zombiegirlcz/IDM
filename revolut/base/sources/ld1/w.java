package ld1;

import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f194006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f194007b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194008c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public w(l lVar, BaseFlow baseFlow) {
        this.f194006a = lVar;
        int i = 13;
        this.f194008c = e4m.b.b(new l9f.z(lVar, this, 0, i));
        this.d = e4m.b.b(new l9f.z(lVar, this, 1, i));
        this.e = e4m.b.b(e4m.c.a(baseFlow));
        this.f = e4m.b.b(new l9f.z(lVar, this, 2, 13));
    }

    @Override // dki.t
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // dki.q
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
