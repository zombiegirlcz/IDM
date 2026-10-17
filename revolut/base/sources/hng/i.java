package hng;

import com.revolut.core.error.data.model.ServerError;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zlg.r;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f154106b;

    public /* synthetic */ i(q qVar, int i) {
        this.f154105a = i;
        this.f154106b = qVar;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object obj2) {
        int i = this.f154105a;
        q qVar = this.f154106b;
        Throwable error = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(error, "error");
                ServerError serverErrorA = qVar.d.a(error);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.getF51362a()) : null;
                int iA = p.ALREADY_TAKEN.a();
                if (numValueOf != null && numValueOf.intValue() == iA) {
                    return r.a.f323265a;
                }
                return (numValueOf != null && numValueOf.intValue() == p.NOT_ALLOWED.a()) ? r.d.f323268a : r.j.f323274a;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                ServerError serverErrorA2 = qVar.d.a(error);
                Integer numValueOf2 = serverErrorA2 != null ? Integer.valueOf(serverErrorA2.f51362a) : null;
                int iA2 = o.ALREADY_TAKEN.a();
                if (numValueOf2 != null && numValueOf2.intValue() == iA2) {
                    return zlg.j.f323257a;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return zlg.k.f323258a;
        }
    }
}
