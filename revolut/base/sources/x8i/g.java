package x8i;

import com.revolut.data.model.Data;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x94.j;
import x94.l;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f303412b;

    public /* synthetic */ g(int i, Function1 function1) {
        this.f303411a = i;
        this.f303412b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f303411a) {
            case 8:
                ((x8k.a) this.f303412b).invoke(obj2);
                break;
            case 9:
                ((x8k.a) this.f303412b).invoke(obj2);
                break;
            case 10:
                ((x8k.a) this.f303412b).invoke(obj2);
                break;
            case 12:
                ((x8k.a) this.f303412b).invoke(obj2);
                break;
            case 13:
                ((j) this.f303412b).invoke(obj2);
                break;
            case 23:
                ((l) this.f303412b).invoke(obj2);
                break;
            case 24:
                ((l) this.f303412b).invoke(obj2);
                break;
            default:
                ((l) this.f303412b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f303411a) {
            case 0:
                f fVar = (f) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar.invoke(p0);
            case 1:
                x8h.h hVar = (x8h.h) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar.invoke(p0);
            case 2:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 23:
            case 24:
            case 25:
            default:
                wg9.p pVar = (wg9.p) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) pVar.invoke(p0);
            case 3:
                x8k.b bVar = (x8k.b) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar.invoke(p0);
            case 4:
                x52.a aVar = (x52.a) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 5:
                x8k.a aVar2 = (x8k.a) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar2.invoke(p0);
            case 6:
                wsg.j jVar = (wsg.j) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PeerToPeerTransferDescriptor.Link) jVar.invoke(p0);
            case 7:
                x8k.a aVar3 = (x8k.a) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar3.invoke(p0);
            case 11:
                x52.a aVar4 = (x52.a) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar4.invoke(p0);
            case 15:
                h hVar2 = (h) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) hVar2.invoke(p0);
            case 16:
                wsg.j jVar2 = (wsg.j) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) jVar2.invoke(p0);
            case 17:
                j jVar3 = (j) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) jVar3.invoke(p0);
            case 18:
                h hVar3 = (h) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (su3.a) hVar3.invoke(p0);
            case 19:
                l lVar = (l) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) lVar.invoke(p0);
            case 20:
                l lVar2 = (l) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar2.invoke(p0);
            case 21:
                h hVar4 = (h) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) hVar4.invoke(p0);
            case 22:
                l lVar3 = (l) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar3.invoke(p0);
            case 26:
                wma.e eVar = (wma.e) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar.invoke(p0);
            case 27:
                x52.a aVar5 = (x52.a) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar5.invoke(p0);
            case 28:
                x8h.d dVar = (x8h.d) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f303411a) {
            case 2:
                h hVar = (h) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar.invoke(p0)).booleanValue();
            default:
                wsg.j jVar = (wsg.j) this.f303412b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) jVar.invoke(p0)).booleanValue();
        }
    }
}
