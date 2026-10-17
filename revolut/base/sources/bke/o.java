package bke;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh5.c f16368b;

    public /* synthetic */ o(sh5.c cVar, int i) {
        this.f16367a = i;
        this.f16368b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16367a) {
            case 0:
                sh5.c cVar = this.f16368b;
                Intrinsics.h(cVar);
                return ake.a.a((ake.a) obj2, null, null, null, null, cVar, null, null, null, null, null, 1007);
            case 1:
                return c46.c.a((c46.c) obj2, null, this.f16368b, null, 5);
            case 2:
                return cy5.e.a((cy5.e) obj2, null, null, null, null, this.f16368b.f263435a, null, 47);
            case 3:
                return dx5.e.a((dx5.e) obj2, null, this.f16368b, null, 47);
            case 4:
                return ef5.b.a((ef5.b) obj2, null, null, null, null, null, null, this.f16368b.f263435a, 63);
            case 5:
                return ej6.l.a((ej6.l) obj2, null, null, null, null, null, this.f16368b, null, 95);
            case 6:
                return gf5.a.a((gf5.a) obj2, null, null, this.f16368b.f263435a, 3);
            case 7:
                return hud.i.a((hud.i) obj2, null, null, null, null, this.f16368b, null, null, 1791);
            case 8:
                sh5.c cVar2 = this.f16368b;
                Intrinsics.h(cVar2);
                return j0i.a.a((j0i.a) obj2, null, null, null, null, null, null, null, null, null, cVar2, 511);
            case 9:
                return jzh.r.a((jzh.r) obj2, null, null, this.f16368b, null, null, null, null, 123);
            case 10:
                return l26.b.a((l26.b) obj2, null, this.f16368b.f263435a, null, null, null, null, null, null, null, 509);
            case 11:
                return o9c.s.a((o9c.s) obj2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, this.f16368b, null, 196607);
            case 12:
                sh5.c cVar3 = this.f16368b;
                Intrinsics.h(cVar3);
                return ox5.l.a((ox5.l) obj2, cVar3, null, null, null, null, null, null, null, 0, null, null, false, null, null, false, 32766);
            case 13:
                return sqd.a.a((sqd.a) obj2, null, false, this.f16368b, 3);
            case 14:
                return u8j.b.a((u8j.b) obj2, false, null, null, this.f16368b.f263435a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194271);
            case 15:
                ((v5c.d) obj2).getClass();
                return new v5c.d(this.f16368b);
            case 16:
                return xpk.h.a((xpk.h) obj2, false, false, false, null, null, this.f16368b.f263435a, false, 383);
            default:
                return zf5.g.a((zf5.g) obj2, null, null, null, this.f16368b, null, null, LDSFile.EF_SOD_TAG);
        }
    }
}
