package ha1;

import com.revolut.data.model.Data;
import efm.h0;
import efm.w;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class s implements kfm.g, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f150388b;

    public /* synthetic */ s(int i, Function1 function1) {
        this.f150387a = i;
        this.f150388b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f150387a) {
            case 0:
                ((k) this.f150388b).invoke(obj2);
                break;
            case 1:
                ((k) this.f150388b).invoke(obj2);
                break;
            default:
                ((ha3.p) this.f150388b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f150387a) {
            case 2:
                h56.a aVar = (h56.a) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar.invoke(p0);
            case 3:
                gae.a aVar2 = (gae.a) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar2.invoke(p0);
            case 4:
                h8b.b bVar = (h8b.b) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar.invoke(p0);
            case 5:
                ha3.h hVar = (ha3.h) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar.invoke(p0);
            case 6:
                ha3.i iVar = (ha3.i) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar.invoke(p0);
            case 7:
                ha3.i iVar2 = (ha3.i) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar2.invoke(p0);
            case 8:
                ha3.h hVar2 = (ha3.h) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar2.invoke(p0);
            case 9:
                k kVar = (k) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) kVar.invoke(p0);
            case 10:
                k kVar2 = (k) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) kVar2.invoke(p0);
            case 11:
                h56.a aVar3 = (h56.a) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar3.invoke(p0);
            case 12:
                k kVar3 = (k) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) kVar3.invoke(p0);
            case 13:
                k kVar4 = (k) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) kVar4.invoke(p0);
            case 14:
                g7b.q qVar = (g7b.q) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) qVar.invoke(p0);
            case 15:
                h8b.b bVar2 = (h8b.b) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar2.invoke(p0);
            case 16:
            default:
                k kVar5 = (k) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar5.invoke(p0);
            case 17:
                k kVar6 = (k) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) kVar6.invoke(p0);
            case 18:
                dqd.a aVar4 = (dqd.a) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar4.invoke(p0);
            case 19:
                ha3.q qVar2 = (ha3.q) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar2.invoke(p0);
            case 20:
                be7.m mVar = (be7.m) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) mVar.invoke(p0);
            case 21:
                ha3.p pVar = (ha3.p) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) pVar.invoke(p0);
            case 22:
                ha3.q qVar3 = (ha3.q) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar3.invoke(p0);
            case 23:
                ha3.p pVar2 = (ha3.p) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) pVar2.invoke(p0);
            case 24:
                ha3.q qVar4 = (ha3.q) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) qVar4.invoke(p0);
            case 25:
                k kVar7 = (k) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar7.invoke(p0);
            case 26:
                ard.t tVar = (ard.t) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) tVar.invoke(p0);
            case 27:
                gae.b bVar3 = (gae.b) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hae.g) bVar3.invoke(p0);
            case 28:
                h56.a aVar5 = (h56.a) this.f150388b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar5.invoke(p0);
        }
    }
}
