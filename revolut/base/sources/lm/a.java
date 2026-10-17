package lm;

import az0.r1;
import com.revolut.RevolutApplication;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import mri.w;
import nwl.l;
import rqk.k;
import skm.e0;
import skm.p0;
import yem.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f196830b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f196829a = i;
        this.f196830b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kfm.a
    public final void run() {
        Object[] objArr = 0;
        switch (this.f196829a) {
            case 0:
                RevolutApplication revolutApplication = (RevolutApplication) this.f196830b;
                RevolutApplication.Companion aVar = RevolutApplication.INSTANCE;
                hf0.b bVar = hf0.b.d;
                phm.a aVar2 = (phm.a) j6.a.j(bVar, e51.a.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", e51.a.class, " is not found"));
                }
                mwl.e eVarA = ((e51.a) aVar3.b()).a();
                if (eVarA.f209549g == null && !eVarA.f209552l) {
                    CoroutineScope coroutineScope = eVarA.f209548c;
                    p0 p0Var = p0.f264001a;
                    eVarA.f209549g = e0.C(coroutineScope, elm.f.f127540b, null, new mwl.b(eVarA, null), 2);
                }
                h.b(revolutApplication);
                phm.a aVar4 = (phm.a) bVar.g().a().get(cri.d.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", cri.d.class, " is not found"));
                }
                ((nzl.a) ((ozl.a) ((cri.d) aVar5.b())).a()).g();
                return;
            case 1:
                ((noi.h) this.f196830b).b();
                return;
            case 2:
                l lVar = (l) this.f196830b;
                ((nzl.a) ((w) lVar.f220031r.get())).f221092a.cancelUniqueWork("Device settings analytics worker");
                kll.c cVar = (kll.c) ((wil.a) lVar.f220033t.get());
                if (((k) cVar.f185652h).o.a() == asi.c.ABSENT) {
                    p0 p0Var2 = p0.f264001a;
                    e0.C(cVar, elm.f.f127540b, null, new r1(cVar, objArr == true ? 1 : 0, 6), 2);
                }
                lVar.T();
                return;
            case 3:
                ((qe0.f) this.f196830b).e = 0L;
                return;
            case 4:
                ((ihm.k) this.f196830b).onComplete();
                return;
            case 5:
                ((Function0) this.f196830b).invoke();
                return;
            default:
                ((dak.b) ((x9k.a) this.f196830b).f303746a).clear();
                return;
        }
    }
}
