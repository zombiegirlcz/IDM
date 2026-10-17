package ppk;

import e7l.g;
import efm.d0;
import efm.r;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import po9.w;
import ufm.i;
import w4l.h;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238615a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f238616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f238617c;
    public final /* synthetic */ c d;

    public /* synthetic */ a(c cVar, xi0.b bVar, xi0.b bVar2) {
        this.d = cVar;
        this.f238616b = bVar;
        this.f238617c = bVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f238615a) {
            case 0:
                Boolean exchangeAllowed = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(exchangeAllowed, "exchangeAllowed");
                if (!exchangeAllowed.booleanValue()) {
                    return r.just(Boolean.FALSE);
                }
                c cVar = this.d;
                fk3.a aVar = cVar.f238618a;
                d0 d0VarFirstOrError = m70.a.g(((ik3.c) aVar).l(g.b.f123407a, h.f294642c), null, new pof.e(3), 1).firstOrError();
                w wVar = new w(8, new a(this.f238616b, this.f238617c, cVar));
                d0VarFirstOrError.getClass();
                i iVar = new i(d0VarFirstOrError, wVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return ue0.e.F(iVar, Boolean.TRUE).x();
            default:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                Set set = config.U;
                xi0.b bVar = this.f238616b;
                boolean zContains = set.contains(bVar);
                Set set2 = config.U;
                xi0.b bVar2 = this.f238617c;
                boolean zContains2 = set2.contains(bVar2);
                this.d.getClass();
                xi0.b bVar3 = config.J0;
                if (bVar3 == null) {
                    bVar3 = c.d;
                }
                boolean z = true;
                if ((zContains || zContains2) && ((!zContains || !Intrinsics.f(bVar2, bVar3)) && (!zContains2 || !Intrinsics.f(bVar, bVar3)))) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ a(xi0.b bVar, xi0.b bVar2, c cVar) {
        this.f238616b = bVar;
        this.f238617c = bVar2;
        this.d = cVar;
    }
}
