package zab;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.login.ResendRequestDto;
import com.revolut.domain.models.login.ChannelType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f320600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xk3.a f320601c;
    public final ifm.b d;
    public final ing.b e;
    public final ihm.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.j f320602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.j f320603h;
    public final ihm.j i;

    public d(h state, xk3.a verificationCodeInteractor, ifm.b compositeDisposable, ing.b legacyUserStorage) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(verificationCodeInteractor, "verificationCodeInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(legacyUserStorage, "legacyUserStorage");
        this.f320600b = state;
        this.f320601c = verificationCodeInteractor;
        this.d = compositeDisposable;
        this.e = legacyUserStorage;
        this.f = p.a.D("toSerialized(...)");
        this.f320602g = p.a.D("toSerialized(...)");
        this.f320603h = p.a.D("toSerialized(...)");
        this.i = p.a.D("toSerialized(...)");
    }

    @Override // ori.a, nri.a
    public final void i3() {
        te0.w.j0(this.d, this.f320600b.j0().c(te0.q.f270015a).filter(new b(1, new a(this, 1))).subscribe(new b(2, new a(this, 2))));
    }

    public final ufm.n j3() {
        h hVar = this.f320600b;
        Object obj2 = hVar.getPhone().get();
        if (kotlin.text.d0.W((String) obj2)) {
            obj2 = null;
        }
        String phone = (String) obj2;
        if (phone == null && (phone = this.e.a()) == null) {
            phone = "";
        }
        p61.b auth = (p61.b) te0.w.O(hVar.E());
        al3.a aVar = this.f320601c.f306607a;
        Intrinsics.checkNotNullParameter(phone, "phone");
        if (auth == null) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(phone, "phone");
            efm.d0<List<zk3.a>> d0VarRequestVerificationOptions = aVar.f6140b.requestVerificationOptions(phone);
            ai0.j jVar = new ai0.j(new aik.d(23), 5);
            d0VarRequestVerificationOptions.getClass();
            ufm.i iVar = new ufm.i(d0VarRequestVerificationOptions, jVar, 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return te0.w.i0(iVar);
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(auth, "auth");
        efm.d0<List<zk3.a>> d0VarRequestVerificationOptions2 = aVar.f6140b.requestVerificationOptions(phone, yh5.b.S(auth, aVar.f6139a));
        ai0.j jVar2 = new ai0.j(new aik.d(22), 4);
        d0VarRequestVerificationOptions2.getClass();
        ufm.i iVar2 = new ufm.i(d0VarRequestVerificationOptions2, jVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return te0.w.i0(iVar2);
    }

    public final String k3() {
        return (String) this.f320600b.getPhone().get();
    }

    public final void l3(String str) {
        pfm.r rVarG0;
        h hVar = this.f320600b;
        hVar.j0().set(ChannelType.SMS);
        hVar.F().set(Boolean.FALSE);
        this.f320603h.onNext(new Data(null, null, true, 3, null));
        String phone = k3();
        List list = (List) hVar.z().get();
        p61.b auth = (p61.b) te0.w.O(hVar.E());
        al3.a aVar = this.f320601c.f306607a;
        Intrinsics.checkNotNullParameter(phone, "phone");
        if (auth != null) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(auth, "auth");
            rVarG0 = te0.w.g0(aVar.f6140b.resendSMSCode(new ResendRequestDto(phone, list), yh5.b.S(auth, aVar.f6139a)));
        } else {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(phone, "phone");
            rVarG0 = te0.w.g0(aVar.f6140b.resendSMSCode(str, new ResendRequestDto(phone, list)));
        }
        c cVar = new c(this, 0);
        a aVar2 = new a(this, 4);
        pfm.a aVar3 = new pfm.a(rVarG0, new xy7.l(4, new z63.j(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new yma.h(3, aVar2), new yzc.p(4, cVar));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        this.d.a(hVarW);
    }
}
