package tid;

import com.revolut.data.model.Data;
import efm.h0;
import efm.n;
import efm.w;
import java.util.List;
import java.util.Set;
import kfm.c;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import l97.t;
import sc7.b;
import td1.f;
import tif.h;
import tjf.a0;
import tjf.d;
import tjf.k;
import tjf.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements o, p, g, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f271480b;

    public /* synthetic */ a(Function function, int i) {
        this.f271479a = i;
        this.f271480b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f271479a) {
            case 4:
                ((h) this.f271480b).invoke(obj2);
                break;
            case 5:
                ((t) this.f271480b).invoke(obj2);
                break;
            case 6:
            case 8:
            case 10:
            default:
                ((f) this.f271480b).invoke(obj2);
                break;
            case 7:
                ((h) this.f271480b).invoke(obj2);
                break;
            case 9:
                ((h) this.f271480b).invoke(obj2);
                break;
            case 11:
                ((h) this.f271480b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f271479a) {
            case 0:
                an9.t tVar = (an9.t) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) tVar.invoke(p0);
            case 1:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
            case 25:
            default:
                b bVar = (b) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar.invoke(p0);
            case 2:
                tfh.a aVar = (tfh.a) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar.invoke(p0);
            case 3:
                tif.g gVar = (tif.g) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (tif.p) gVar.invoke(p0);
            case 6:
                pbi.h hVar = (pbi.h) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) hVar.invoke(p0);
            case 8:
                f fVar = (f) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar.invoke(p0);
            case 10:
                f fVar2 = (f) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) fVar2.invoke(p0);
            case 13:
                mli.h hVar2 = (mli.h) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar2.invoke(p0);
            case 14:
                d dVar = (d) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) dVar.invoke(p0);
            case 15:
                k kVar = (k) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar.invoke(p0);
            case 16:
                t8e.c cVar = (t8e.c) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar.invoke(p0);
            case 17:
                s sVar = (s) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) sVar.invoke(p0);
            case 18:
                s sVar2 = (s) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) sVar2.invoke(p0);
            case 19:
                t8e.c cVar2 = (t8e.c) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar2.invoke(p0);
            case 20:
                tjf.w wVar = (tjf.w) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) wVar.invoke(p0);
            case 21:
                t8e.c cVar3 = (t8e.c) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar3.invoke(p0);
            case 22:
                a0 a0Var = (a0) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) a0Var.invoke(p0);
            case 23:
                t8e.c cVar4 = (t8e.c) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar4.invoke(p0);
            case 24:
                b6.a aVar2 = (b6.a) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar2.invoke(p0);
            case 26:
                tif.g gVar2 = (tif.g) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) gVar2.invoke(p0);
            case 27:
                tif.g gVar3 = (tif.g) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) gVar3.invoke(p0);
            case 28:
                t8e.c cVar5 = (t8e.c) this.f271480b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar5.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        tfh.a aVar = (tfh.a) this.f271480b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        tj9.d dVar = (tj9.d) this.f271480b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Data) dVar.invoke(p0, p17);
    }
}
