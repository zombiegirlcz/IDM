package z51;

import efm.d0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import ngm.n;
import od0.i;
import te0.w;
import u80.j;
import vfg.p;
import yhm.r;
import yt8.k;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f319411b;

    public /* synthetic */ a(e eVar, int i) {
        this.f319410a = i;
        this.f319411b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f319410a) {
            case 0:
                i defaultCountry = (i) obj2;
                Intrinsics.checkNotNullParameter(defaultCountry, "defaultCountry");
                e eVar = this.f319411b;
                break;
            case 1:
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!it8.booleanValue()) {
                    e eVar2 = this.f319411b;
                    d0 d0VarP = osg.b.p(((m61.c) eVar2.f319415b).f202967a, null, 2);
                    m30.b bVar = new m30.b(27, new m30.c(29));
                    d0VarP.getClass();
                    ufm.i iVar = new ufm.i(d0VarP, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                } else {
                    ufm.b bVarM = d0.m(k.c.f316672a);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                }
                break;
            case 2:
                dj0.d money = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(money, "money");
                p pVar = this.f319411b.d;
                Intrinsics.checkNotNullParameter(money, "money");
                j jVar = u80.k.Companion;
                qd0.b bVar2 = (qd0.b) pVar.f288633b;
                jVar.getClass();
                u80.k kVarA = j.a(bVar2);
                kVarA.v(money);
                kVarA.k = true;
                break;
            case 3:
                i defaultCountry2 = (i) obj2;
                Intrinsics.checkNotNullParameter(defaultCountry2, "defaultCountry");
                e eVar3 = this.f319411b;
                mt8.d dVar = eVar3.f319414a;
                sfm.b bVar3 = new sfm.b(w.I0(dVar.getKyc(), eVar3.a((wi0.b) defaultCountry2.f224257a), mt8.d.c(dVar)), new z3e.a(new a(eVar3, 4), 11), 2);
                Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
                break;
            case 4:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                yt8.c cVar = (yt8.c) rVar.f314201a;
                wi0.b bVar4 = (wi0.b) rVar.f314202b;
                yt8.d dVar2 = (yt8.d) rVar.f314203c;
                if (cVar.c() || !n.r(dVar2.f316665a)) {
                    if (!cVar.c()) {
                        e eVar4 = this.f319411b;
                        if (!eVar4.c(cVar)) {
                        }
                    } else {
                        yt8.f fVarR = l.r(cVar);
                        boolean z = false;
                        if (fVarR != null && n.p(fVarR.f316667a)) {
                            z = true;
                        }
                    }
                }
                break;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                yt8.c cVar2 = (yt8.c) pair.f186385a;
                wi0.b bVar5 = (wi0.b) pair.f186386b;
                yt8.i iVar2 = cVar2.f316662a;
                if (iVar2 == yt8.i.FAILED || iVar2 == yt8.i.NONE) {
                    yt8.f fVarR2 = l.r(cVar2);
                    boolean z3 = false;
                    if (fVarR2 != null && n.p(fVarR2.f316667a)) {
                        z3 = true;
                    }
                } else {
                    e eVar5 = this.f319411b;
                    if (!eVar5.c(cVar2)) {
                    }
                }
                break;
        }
        return w.h(k.b.f316671a);
    }
}
