package a3e;

import com.revolut.data.model.Data;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lk0.g f1119b;

    public /* synthetic */ s(lk0.g gVar, int i) {
        this.f1118a = i;
        this.f1119b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f1118a) {
            case 0:
                return c.a((c) obj2, null, null, this.f1119b, 3);
            case 1:
                a7g.r rVar = (a7g.r) obj2;
                lk0.g gVar = this.f1119b;
                Intrinsics.h(gVar);
                return a7g.r.a(rVar, null, gVar, null, null, null, null, null, rVar.f1895g, ISO781611.SMT_TAG);
            case 2:
                return fjd.o.a((fjd.o) obj2, null, null, null, null, null, null, null, this.f1119b, null, false, null, null, null, 0L, 16255);
            case 3:
                lk0.g gVar2 = this.f1119b;
                Intrinsics.h(gVar2);
                return g3e.a.a((g3e.a) obj2, null, gVar2, null, null, 13);
            case 4:
                hb0.g update = (hb0.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new hb0.g(this.f1119b);
            case 5:
                lk0.g gVar3 = this.f1119b;
                Intrinsics.h(gVar3);
                return i3g.f.a((i3g.f) obj2, null, gVar3, null, 5);
            case 6:
                return j1k.d.a((j1k.d) obj2, this.f1119b, null, 5);
            case 7:
                jb0.d update2 = (jb0.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return jb0.d.a(update2, null, null, this.f1119b, 3);
            case 8:
                return lig.g.a((lig.g) obj2, null, null, this.f1119b, null, 11);
            case 9:
                return lm1.e.a((lm1.e) obj2, this.f1119b, null, 14);
            case 10:
                lk0.g gVar4 = this.f1119b;
                Intrinsics.h(gVar4);
                return n3e.d.a((n3e.d) obj2, gVar4, null, false, 6);
            case 11:
                lk0.g gVar5 = this.f1119b;
                Intrinsics.h(gVar5);
                return nig.a.a((nig.a) obj2, gVar5, null, false, 6);
            case 12:
                q6h.a update3 = (q6h.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data = update3.f242596b;
                update3.getClass();
                return new q6h.a(this.f1119b, data);
            case 13:
                ((qc6.a) obj2).getClass();
                return new qc6.a(this.f1119b);
            case 14:
                return s2g.j.a((s2g.j) obj2, null, this.f1119b, null, null, null, false, 61);
            case 15:
                lk0.g gVar6 = this.f1119b;
                Intrinsics.h(gVar6);
                return sdg.g.a((sdg.g) obj2, null, null, gVar6, null, 11);
            case 16:
                lk0.g gVar7 = this.f1119b;
                Intrinsics.h(gVar7);
                return y2e.a.a((y2e.a) obj2, gVar7, null, null, null, 14);
            case 17:
                return y66.a.a((y66.a) obj2, null, this.f1119b, null, null, 13);
            case 18:
                yb0.d update4 = (yb0.d) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return yb0.d.a(update4, null, null, null, this.f1119b, 7);
            default:
                return z66.b.a((z66.b) obj2, null, this.f1119b, null, null, null, false, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
    }
}
