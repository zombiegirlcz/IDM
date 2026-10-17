package n4d;

import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import n33.v0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f212345b;

    public /* synthetic */ a0(Object obj2, int i) {
        this.f212344a = i;
        this.f212345b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f212344a) {
            case 2:
                ((b0) this.f212345b).invoke(obj2);
                break;
            case 28:
                ((na1.b) this.f212345b).invoke(obj2);
                break;
            default:
                ((na1.c) this.f212345b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f212344a) {
            case 0:
                y yVar = (y) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) yVar.invoke(p0);
            case 1:
                l1.e eVar = (l1.e) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) eVar.invoke(p0);
            case 2:
            case 13:
            case 20:
            default:
                mll.h hVar = (mll.h) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) hVar.invoke(p0);
            case 3:
                v0 v0Var = (v0) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ogd.d) v0Var.invoke(p0);
            case 4:
                mll.h hVar2 = (mll.h) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ogd.a) hVar2.invoke(p0);
            case 5:
                b0 b0Var = (b0) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) b0Var.invoke(p0);
            case 6:
                d0 d0Var = (d0) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) d0Var.invoke(p0);
            case 7:
                n45.b bVar = (n45.b) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) bVar.invoke(p0);
            case 8:
                d0 d0Var2 = (d0) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xo9.h) d0Var2.invoke(p0);
            case 9:
                n1.y yVar2 = (n1.y) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) yVar2.invoke(p0);
            case 10:
                d0 d0Var3 = (d0) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) d0Var3.invoke(p0);
            case 11:
                n5i.g gVar = (n5i.g) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) gVar.invoke(p0);
            case 12:
                n5i.g gVar2 = (n5i.g) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) gVar2.invoke(p0);
            case 14:
                n5k.c cVar = (n5k.c) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar.invoke(p0);
            case 15:
                n5k.c cVar2 = (n5k.c) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar2.invoke(p0);
            case 16:
                n45.b bVar2 = (n45.b) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar2.invoke(p0);
            case 17:
                n5k.c cVar3 = (n5k.c) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar3.invoke(p0);
            case 18:
                n45.b bVar3 = (n45.b) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar3.invoke(p0);
            case 19:
                kwg.e eVar2 = (kwg.e) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) eVar2.invoke(p0);
            case 21:
                n8i.q0 q0Var = (n8i.q0) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n8k.h) q0Var.invoke(p0);
            case 22:
                ((yx4.a) this.f212345b).getClass();
                return yx4.a.a(p0);
            case 23:
                v9 v9Var = (v9) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i9i.d) v9Var.invoke(p0);
            case 24:
                v9 v9Var2 = (v9) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i9i.d) v9Var2.invoke(p0);
            case 25:
                n9i.b bVar4 = (n9i.b) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) bVar4.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f212344a) {
            case 13:
                n5i.g gVar = (n5i.g) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) gVar.invoke(p0)).booleanValue();
            default:
                n8i.q0 q0Var = (n8i.q0) this.f212345b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) q0Var.invoke(p0)).booleanValue();
        }
    }
}
