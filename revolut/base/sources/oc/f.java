package oc;

import android.content.Context;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f224008a;

    public f(Context context, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f224008a = context;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f224008a = context;
                break;
            default:
                this.f224008a = context;
                break;
        }
    }

    public q1h.c a(WealthAccountType wealthAccountType) {
        b60.a aVar;
        int i = t8h.a.f268897a[wealthAccountType.ordinal()];
        Context context = this.f224008a;
        if (i == 1) {
            phm.a aVar2 = (phm.a) j6.a.i(context, e3f.a.class);
            aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
            if (aVar != null) {
                return (q1h.c) aVar.b();
            }
            throw new IllegalStateException(a0.d.q("Api ", e3f.a.class, " is not found"));
        }
        if (i == 2) {
            phm.a aVar3 = (phm.a) j6.a.i(context, e3f.a.class);
            aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
            if (aVar != null) {
                return (q1h.c) aVar.b();
            }
            throw new IllegalStateException(a0.d.q("Api ", e3f.a.class, " is not found"));
        }
        if (i == 3) {
            phm.a aVar4 = (phm.a) j6.a.i(context, hlc.a.class);
            aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
            if (aVar != null) {
                return (q1h.c) aVar.b();
            }
            throw new IllegalStateException(a0.d.q("Api ", hlc.a.class, " is not found"));
        }
        if (i == 4) {
            phm.a aVar5 = (phm.a) j6.a.i(context, f5b.a.class);
            aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
            if (aVar != null) {
                return (q1h.c) aVar.b();
            }
            throw new IllegalStateException(a0.d.q("Api ", f5b.a.class, " is not found"));
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        phm.a aVar6 = (phm.a) j6.a.i(context, q1h.g.class);
        aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
        if (aVar != null) {
            return (q1h.c) aVar.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", q1h.g.class, " is not found"));
    }
}
