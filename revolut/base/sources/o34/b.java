package o34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f221688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f221689c;

    public b(p creditApplicationDtoMapper, CreditPluginsService creditApplicationService, int i) {
        this.f221687a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
                Intrinsics.checkNotNullParameter(creditApplicationService, "creditApplicationService");
                this.f221688b = creditApplicationDtoMapper;
                this.f221689c = creditApplicationService;
                break;
            default:
                Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
                Intrinsics.checkNotNullParameter(creditApplicationService, "creditApplicationService");
                this.f221688b = creditApplicationDtoMapper;
                this.f221689c = creditApplicationService;
                break;
        }
    }

    public final Object a(h1 h1Var, i iVar) {
        int i = 0;
        Continuation continuation = null;
        switch (this.f221687a) {
            case 0:
                a aVar = new a(this, h1Var, continuation, i);
                p0 p0Var = p0.f264001a;
                return e0.J(f.f127540b, aVar, iVar);
            default:
                c cVar = new c(this, h1Var, continuation, i);
                p0 p0Var2 = p0.f264001a;
                return e0.J(f.f127540b, cVar, iVar);
        }
    }

    public final Object b(h1 h1Var, i iVar) {
        int i = 1;
        Continuation continuation = null;
        switch (this.f221687a) {
            case 0:
                a aVar = new a(this, h1Var, continuation, i);
                p0 p0Var = p0.f264001a;
                return e0.J(f.f127540b, aVar, iVar);
            default:
                c cVar = new c(this, h1Var, continuation, i);
                p0 p0Var2 = p0.f264001a;
                return e0.J(f.f127540b, cVar, iVar);
        }
    }

    public final Object c(h1 h1Var, gim.c cVar) {
        int i = 2;
        Continuation continuation = null;
        switch (this.f221687a) {
            case 0:
                a aVar = new a(this, h1Var, continuation, i);
                p0 p0Var = p0.f264001a;
                return e0.J(f.f127540b, aVar, cVar);
            default:
                c cVar2 = new c(this, h1Var, continuation, i);
                p0 p0Var2 = p0.f264001a;
                return e0.J(f.f127540b, cVar2, cVar);
        }
    }

    public final Object d(h1 h1Var, i iVar) {
        int i = 3;
        Continuation continuation = null;
        switch (this.f221687a) {
            case 0:
                a aVar = new a(this, h1Var, continuation, i);
                p0 p0Var = p0.f264001a;
                return e0.J(f.f127540b, aVar, iVar);
            default:
                c cVar = new c(this, h1Var, continuation, i);
                p0 p0Var2 = p0.f264001a;
                return e0.J(f.f127540b, cVar, iVar);
        }
    }
}
