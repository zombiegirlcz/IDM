package j6k;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f171802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f171803c;

    public /* synthetic */ e(o oVar, String str, int i) {
        this.f171801a = i;
        this.f171802b = oVar;
        this.f171803c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f171801a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Set set = (Set) pair.f186385a;
                od0.i iVar = (od0.i) pair.f186386b;
                return this.f171802b.i.f(new k(this.f171803c, (String) iVar.g(), set), true);
            default:
                r rVar = (r) obj2;
                List list = (List) rVar.f314201a;
                Set set2 = (Set) rVar.f314202b;
                od0.i iVar2 = (od0.i) rVar.f314203c;
                o oVar = this.f171802b;
                oVar.f171820g.I0(this.f171803c);
                w4l.f fVar = oVar.f171821h;
                Intrinsics.h(set2);
                j jVar = new j((String) iVar2.g(), set2);
                Intrinsics.h(list);
                fVar.j(jVar, list);
                return Unit.f186387a;
        }
    }
}
