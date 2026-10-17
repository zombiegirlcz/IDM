package he9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import de9.n;
import java.util.Set;
import r7d.o;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151617a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PasscodeScreenContract$InputData f151618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseScreen f151619c;
    public final e4m.e d;
    public final e4m.e e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f151620g;

    public g(re9.a aVar, re9.b bVar, BaseScreen baseScreen, PasscodeScreenContract$InputData passcodeScreenContract$InputData) {
        this.f = aVar;
        this.f151618b = passcodeScreenContract$InputData;
        this.f151619c = baseScreen;
        int i = 7;
        this.d = e4m.b.b(new o(aVar, this, 1, i));
        this.e = e4m.b.b(new o(aVar, this, 0, i));
        this.f151620g = e4m.g.a(new o(aVar, this, 2, i));
    }

    @Override // he9.j
    public final n a() {
        switch (this.f151617a) {
        }
        return (n) this.e.get();
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f151617a) {
            case 0:
                fe9.h hVar = new fe9.h(((d) this.f151620g).f151607c.f151609b.a());
                h7d.a.d(hVar);
                return ImmutableSet.of(hVar);
            case 1:
                fe9.h hVar2 = new fe9.h(((re9.a) this.f).f253549b.a());
                h7d.a.d(hVar2);
                return ImmutableSet.of(hVar2);
            default:
                fe9.h hVar3 = new fe9.h(((tl9.c) this.f).d.a());
                h7d.a.d(hVar3);
                return ImmutableSet.of(hVar3);
        }
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f151617a) {
        }
        return ImmutableSet.of(h7d.a.c(j()));
    }

    @Override // he9.j
    public final a61.a h() {
        switch (this.f151617a) {
            case 0:
                return ((e) this.f).c();
            case 1:
                return ((re9.a) this.f).e.c();
            default:
                return ((tl9.c) this.f).f272029h.c();
        }
    }

    @Override // he9.j
    public final j70.a i() {
        switch (this.f151617a) {
            case 0:
                j70.a aVarK = ((e) this.f).f151610c.k();
                s.j(aVarK);
                return aVarK;
            case 1:
                j70.a aVarK2 = ((re9.a) this.f).f253550c.k();
                s.j(aVarK2);
                return aVarK2;
            default:
                j70.a aVarK3 = ((tl9.c) this.f).f272030j.k();
                s.j(aVarK3);
                return aVarK3;
        }
    }

    @Override // he9.j
    public final fe9.a j() {
        switch (this.f151617a) {
            case 0:
                return h7d.a.b(this.f151619c, (c) ((d) this.f151620g).e.get());
            case 1:
                return h7d.a.b(this.f151619c, (c) ((e4m.e) this.f151620g).get());
            default:
                return h7d.a.b(this.f151619c, (c) ((e4m.e) this.f151620g).get());
        }
    }

    @Override // he9.j
    public final de9.b k() {
        switch (this.f151617a) {
            case 0:
                le9.c.Companion.getClass();
                return new le9.a();
            case 1:
                we9.b.Companion.getClass();
                return new we9.a();
            default:
                am9.c.Companion.getClass();
                return new am9.a();
        }
    }

    public g(e eVar, d dVar, BaseScreen baseScreen, PasscodeScreenContract$InputData passcodeScreenContract$InputData) {
        this.f = eVar;
        this.f151620g = dVar;
        this.f151618b = passcodeScreenContract$InputData;
        this.f151619c = baseScreen;
        int i = 24;
        this.d = e4m.b.b(new ehe.o(eVar, dVar, this, 1, i));
        this.e = e4m.b.b(new ehe.o(eVar, dVar, this, 0, i));
    }

    public g(tl9.c cVar, tl9.a aVar, BaseScreen baseScreen, PasscodeScreenContract$InputData passcodeScreenContract$InputData) {
        this.f = cVar;
        this.f151618b = passcodeScreenContract$InputData;
        this.f151619c = baseScreen;
        int i = 3;
        this.d = e4m.b.b(new tg5.h(cVar, this, 1, i));
        this.e = e4m.b.b(new tg5.h(cVar, this, 0, i));
        this.f151620g = e4m.g.a(new tg5.h(cVar, this, 2, i));
    }
}
