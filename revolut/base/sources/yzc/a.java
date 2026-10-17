package yzc;

import efm.w;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements kfm.p, kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f318065b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f318064a = i;
        this.f318065b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f318064a) {
            case 13:
                ((yze.b) this.f318065b).invoke(obj2);
                break;
            case 14:
                ((yze.b) this.f318065b).invoke(obj2);
                break;
            case 15:
            default:
                ((z1c.a) this.f318065b).invoke(obj2);
                break;
            case 16:
                ((z1c.a) this.f318065b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f318064a) {
            case 2:
                m mVar = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar.invoke(p0);
            case 3:
            case 7:
            case 9:
            case 13:
            case 14:
            case 16:
            case 17:
            case 23:
            default:
                z1i.m mVar2 = (z1i.m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar2.invoke(p0);
            case 4:
                m mVar3 = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar3.invoke(p0);
            case 5:
                m mVar4 = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) mVar4.invoke(p0);
            case 6:
                m mVar5 = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar5.invoke(p0);
            case 8:
                m mVar6 = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar6.invoke(p0);
            case 10:
                yy9.s sVar = (yy9.s) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) sVar.invoke(p0);
            case 11:
                m mVar7 = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar7.invoke(p0);
            case 12:
                m mVar8 = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) mVar8.invoke(p0);
            case 15:
                t9f.n nVar = (t9f.n) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar.invoke(p0);
            case 18:
                z1i.k kVar = (z1i.k) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar.invoke(p0);
            case 19:
                z1.c cVar = (z1.c) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar.invoke(p0);
            case 20:
                z1i.k kVar2 = (z1i.k) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar2.invoke(p0);
            case 21:
                z1i.l lVar = (z1i.l) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) lVar.invoke(p0);
            case 22:
                z1i.k kVar3 = (z1i.k) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar3.invoke(p0);
            case 24:
                z1i.m mVar9 = (z1i.m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar9.invoke(p0);
            case 25:
                z1i.m mVar10 = (z1i.m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) mVar10.invoke(p0);
            case 26:
                z1.c cVar2 = (z1.c) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar2.invoke(p0);
            case 27:
                z1i.m mVar11 = (z1i.m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar11.invoke(p0);
            case 28:
                z1i.m mVar12 = (z1i.m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar12.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f318064a) {
            case 0:
                yuc.p pVar = (yuc.p) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) pVar.invoke(p0)).booleanValue();
            case 1:
                yy9.s sVar = (yy9.s) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) sVar.invoke(p0)).booleanValue();
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                z1i.l lVar = (z1i.l) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) lVar.invoke(p0)).booleanValue();
            case 3:
                yy9.s sVar2 = (yy9.s) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) sVar2.invoke(p0)).booleanValue();
            case 7:
                m mVar = (m) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) mVar.invoke(p0)).booleanValue();
            case 9:
                yy9.s sVar3 = (yy9.s) this.f318065b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) sVar3.invoke(p0)).booleanValue();
        }
    }
}
