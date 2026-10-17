package ozc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f231306b;

    public /* synthetic */ p(int i, Function1 function1) {
        this.f231305a = i;
        this.f231306b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f231305a) {
            case 2:
                ((m) this.f231306b).invoke(obj2);
                break;
            default:
                ((u) this.f231306b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f231305a) {
            case 0:
                n nVar = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) nVar.invoke(p0);
            case 1:
                m mVar = (m) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar.invoke(p0);
            case 2:
            case 3:
            case 7:
            case 10:
            case 18:
            case 20:
            case 22:
            case 25:
            default:
                h0 h0Var = (h0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) h0Var.invoke(p0);
            case 4:
                u uVar = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) uVar.invoke(p0);
            case 5:
                u uVar2 = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) uVar2.invoke(p0);
            case 6:
                n nVar2 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c) nVar2.invoke(p0);
            case 8:
                u uVar3 = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) uVar3.invoke(p0);
            case 9:
                u uVar4 = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (b) uVar4.invoke(p0);
            case 11:
                u uVar5 = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) uVar5.invoke(p0);
            case 12:
                u uVar6 = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) uVar6.invoke(p0);
            case 13:
                n nVar3 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c) nVar3.invoke(p0);
            case 14:
                u uVar7 = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) uVar7.invoke(p0);
            case 15:
                n nVar4 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c) nVar4.invoke(p0);
            case 16:
                n nVar5 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c) nVar5.invoke(p0);
            case 17:
                u uVar8 = (u) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c) uVar8.invoke(p0);
            case 19:
                h0 h0Var2 = (h0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) h0Var2.invoke(p0);
            case 21:
                h0 h0Var3 = (h0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) h0Var3.invoke(p0);
            case 23:
                h0 h0Var4 = (h0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) h0Var4.invoke(p0);
            case 24:
                h0 h0Var5 = (h0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) h0Var5.invoke(p0);
            case 26:
                h0 h0Var6 = (h0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) h0Var6.invoke(p0);
            case 27:
                i0 i0Var = (i0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) i0Var.invoke(p0);
            case 28:
                i0 i0Var2 = (i0) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) i0Var2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f231305a) {
            case 3:
                m mVar = (m) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) mVar.invoke(p0)).booleanValue();
            case 7:
                n nVar = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) nVar.invoke(p0)).booleanValue();
            case 18:
                n nVar2 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) nVar2.invoke(p0)).booleanValue();
            case 20:
                n nVar3 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) nVar3.invoke(p0)).booleanValue();
            case 22:
                n nVar4 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) nVar4.invoke(p0)).booleanValue();
            default:
                n nVar5 = (n) this.f231306b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) nVar5.invoke(p0)).booleanValue();
        }
    }
}
