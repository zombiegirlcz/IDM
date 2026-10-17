package r25;

import com.revolut.chat.ui.chatlist.ChatListScreen;
import efm.f;
import efm.w;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0e.i;
import r2d.l;
import r2d.q;
import r38.m;
import r40.l0;
import r40.r;
import v20.l1;
import v20.n;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements o, p, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f251054b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f251053a = i;
        this.f251054b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f251053a) {
            case 16:
                ((qz9.o) this.f251054b).invoke(obj2);
                break;
            case 26:
                ((r) this.f251054b).invoke(obj2);
                break;
            default:
                ((l0) this.f251054b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f251053a) {
            case 0:
                i iVar = (i) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yx4.b) iVar.invoke(p0);
            case 1:
                i iVar2 = (i) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yx4.b) iVar2.invoke(p0);
            case 2:
                i iVar3 = (i) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) iVar3.invoke(p0);
            case 3:
            case 12:
            case 14:
            case 16:
            default:
                r2d.d dVar = (r2d.d) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) dVar.invoke(p0);
            case 4:
                r10.b bVar = (r10.b) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (o1d.e) bVar.invoke(p0);
            case 5:
                l lVar = (l) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) lVar.invoke(p0);
            case 6:
                qtb.c cVar = (qtb.c) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mgd.g) cVar.invoke(p0);
            case 7:
                l lVar2 = (l) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) lVar2.invoke(p0);
            case 8:
                q qVar = (q) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) qVar.invoke(p0);
            case 9:
                q qVar2 = (q) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) qVar2.invoke(p0);
            case 10:
                r10.b bVar2 = (r10.b) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) bVar2.invoke(p0);
            case 11:
                r2d.d dVar2 = (r2d.d) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l1) dVar2.invoke(p0);
            case 13:
                r2d.d dVar3 = (r2d.d) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) dVar3.invoke(p0);
            case 15:
                r2d.d dVar4 = (r2d.d) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) dVar4.invoke(p0);
            case 17:
                ou5.a aVar = (ou5.a) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) aVar.invoke(p0);
            case 18:
                r38.d dVar5 = (r38.d) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (nce.a) dVar5.invoke(p0);
            case 19:
                r10.b bVar3 = (r10.b) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) bVar3.invoke(p0);
            case 20:
                r2d.d dVar6 = (r2d.d) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                dVar6.invoke(p0);
                return w4l.i.f294643c;
            case 21:
                m mVar = (m) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) mVar.invoke(p0);
            case 22:
                r2d.d dVar7 = (r2d.d) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yhm.r) dVar7.invoke(p0);
            case 23:
                r10.b bVar4 = (r10.b) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar4.invoke(p0);
            case 24:
                m mVar2 = (m) this.f251054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) mVar2.invoke(p0);
            case 25:
                return (List) ((qz9.o) this.f251054b).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f251053a;
        r2d.d dVar = (r2d.d) this.f251054b;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                ChatListScreen.a aVar = ChatListScreen.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) dVar.invoke(p0)).booleanValue();
    }
}
