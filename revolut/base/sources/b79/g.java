package b79;

import android.net.NetworkRequest;
import android.net.Uri;
import b4b.z;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.u;
import efm.w;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements kfm.g, kfm.o, u, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12948b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f12947a = i;
        this.f12948b = obj2;
    }

    @Override // efm.u
    public void a(z0 subscriber) {
        b80.c cVar = (b80.c) this.f12948b;
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        b80.b bVar = new b80.b(subscriber);
        cVar.f13082a.registerNetworkCallback(new NetworkRequest.Builder().build(), bVar);
        subscriber.d(new b80.a(cVar, bVar, 0));
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f12947a) {
            case 0:
                ((f) this.f12948b).invoke(obj2);
                break;
            default:
                ((b9i.e) this.f12948b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f12947a) {
            case 1:
                o oVar = (o) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) oVar.invoke(p0);
            case 2:
                b73.h hVar = (b73.h) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) hVar.invoke(p0);
            case 3:
                b7j.e eVar = (b7j.e) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar.invoke(p0);
            case 4:
                a82.n nVar = (a82.n) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) nVar.invoke(p0);
            case 5:
                b7j.e eVar2 = (b7j.e) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) eVar2.invoke(p0);
            case 6:
            case 14:
            case 23:
            default:
                a26.j jVar = (a26.j) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hce.d) jVar.invoke(p0);
            case 7:
                b96.a aVar = (b96.a) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) aVar.invoke(p0);
            case 8:
                b96.b bVar = (b96.b) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar.invoke(p0);
            case 9:
                b96.b bVar2 = (b96.b) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar2.invoke(p0);
            case 10:
                b58.f fVar = (b58.f) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar.invoke(p0);
            case 11:
                z zVar = (z) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Uri) zVar.invoke(p0);
            case 12:
                b9i.f fVar2 = (b9i.f) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) fVar2.invoke(p0);
            case 13:
                b9i.e eVar3 = (b9i.e) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar3.invoke(p0);
            case 15:
                b9i.g gVar = (b9i.g) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) gVar.invoke(p0);
            case 16:
                b9i.g gVar2 = (b9i.g) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewsUiItem) gVar2.invoke(p0);
            case 17:
                b96.a aVar2 = (b96.a) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar2.invoke(p0);
            case 18:
                b96.a aVar3 = (b96.a) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar3.invoke(p0);
            case 19:
                b96.a aVar4 = (b96.a) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p89.a) aVar4.invoke(p0);
            case 20:
                b9i.f fVar3 = (b9i.f) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                fVar3.invoke(p0);
                return pfm.m.f235744a;
            case 21:
                b9i.f fVar4 = (b9i.f) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) fVar4.invoke(p0);
            case 22:
                b96.a aVar5 = (b96.a) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (tjg.e) aVar5.invoke(p0);
            case 24:
                b96.a aVar6 = (b96.a) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (tjg.c) aVar6.invoke(p0);
            case 25:
                bbe.b bVar3 = (bbe.b) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (bbe.a) bVar3.invoke(p0);
            case 26:
                bc1.d dVar = (bc1.d) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar.invoke(p0);
            case 27:
                bc1.d dVar2 = (bc1.d) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar2.invoke(p0);
            case 28:
                bbh.a aVar7 = (bbh.a) this.f12948b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar7.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        b96.a aVar = (b96.a) this.f12948b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
