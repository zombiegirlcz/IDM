package aem;

import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import skm.a2;
import skm.c2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3767b;

    public /* synthetic */ q(Object obj2, int i) {
        this.f3766a = i;
        this.f3767b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f3766a) {
            case 0:
                ((skm.h1) this.f3767b).h0();
                break;
            case 1:
                c2 c2Var = (c2) this.f3767b;
                Throwable th10 = (Throwable) obj2;
                Logger logger = u0.f3783a;
                if (th10 != null) {
                    logger.trace("Cancelling request because engine Job failed with error: " + th10);
                    skm.e0.l(c2Var, "Engine failed", th10);
                } else {
                    logger.trace("Cancelling request because engine Job completed");
                    c2Var.h0();
                }
                break;
            case 2:
                ((skm.r0) this.f3767b).dispose();
                break;
            case 3:
                ((a2) this.f3767b).f(null);
                break;
            case 4:
                Function function = (Function2) this.f3767b;
                cem.d install = (cem.d) obj2;
                Intrinsics.checkNotNullParameter(install, "$this$install");
                install.getClass();
                Intrinsics.checkNotNullParameter(function, "<set-?>");
                install.f23509a = (gim.i) function;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                i0 i0Var = (i0) this.f3767b;
                vdm.b scope = (vdm.b) obj2;
                Intrinsics.checkNotNullParameter(scope, "scope");
                oem.e eVar = (oem.e) scope.f288082h.a(j0.f3736a, new vdm.d(0));
                Object obj3 = scope.f288083j.f288089b.get(i0Var.getKey());
                Intrinsics.h(obj3);
                Object objA = i0Var.a((Function1) obj3);
                i0Var.b(objA, scope);
                eVar.e(i0Var.getKey(), objA);
                break;
            case 14:
                vdm.b bVar = (vdm.b) this.f3767b;
                if (((Throwable) obj2) != null) {
                    bVar.i.c(iem.a.e);
                }
                break;
            default:
                ((ResponseBody) this.f3767b).close();
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ q(vdm.b bVar, hem.c cVar) {
        this.f3766a = 14;
        this.f3767b = bVar;
    }
}
