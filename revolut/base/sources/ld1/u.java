package ld1;

import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f194000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194002c;
    public final e4m.e d;
    public final e4m.e e;

    public u(l lVar, m mVar, BaseScreen baseScreen) {
        this.f194001b = mVar;
        this.f194000a = baseScreen;
        this.f194002c = e4m.b.b(new q(lVar, mVar, this, 1, 1));
        int i = 1;
        this.d = e4m.b.b(new q(lVar, mVar, this, 2, i));
        this.e = e4m.b.b(new q(lVar, mVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        ArrayList arrayList = new ArrayList(2);
        m mVar = this.f194001b;
        kii.e.w(mVar.k, "Set contributions cannot be null", arrayList);
        return kii.e.C(mVar.f193977n, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }
}
