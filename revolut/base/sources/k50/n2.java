package k50;

import aw0.k8;
import aw0.l8;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.data.model.Data;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v30.j f181189b;

    public /* synthetic */ n2(n30.n nVar, v30.j jVar) {
        this.f181188a = 2;
        this.f181189b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181188a) {
            case 0:
                h0 update = (h0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                v30.c0 c0Var = update.f181083h;
                l8 l8VarA = update.u;
                v30.c0 c0Var2 = v30.c0.PRIVATE_BANKING;
                v30.j jVar = this.f181189b;
                boolean z = (c0Var != c0Var2 || jVar == null || v30.r.c(jVar)) ? false : true;
                boolean z3 = jVar != null && v30.r.a(jVar);
                boolean z4 = (z || z3) ? false : true;
                boolean z6 = z || z3;
                v30.i iVarA = v30.i.a(update.f, z4, null, z3, null, z, 10);
                if (z6) {
                    if (!((l8VarA != null ? (l0) l8VarA.f10411a : null) instanceof j0)) {
                        l8.Companion.getClass();
                        l8VarA = k8.a(j0.f181115a);
                    }
                }
                return h0.a(update, null, null, null, null, null, iVarA, null, null, null, null, false, false, null, null, null, null, false, l8VarA, null, null, null, null, null, null, 267386847);
            case 1:
                return h0.a((h0) obj2, null, new Data(this.f181189b, null, false, 6, null), null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435453);
            default:
                AgentInfo it8 = (AgentInfo) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                v30.j jVar2 = this.f181189b;
                UUID uuid = jVar2.f285785a;
                Instant instant = jVar2.f285792m;
                Instant instant2 = jVar2.f285793n;
                Instant instant3 = jVar2.o;
                Instant instant4 = jVar2.f285794p;
                Boolean bool = jVar2.f285795q;
                v30.u0 u0Var = jVar2.f;
                w30.v vVar = new w30.v(jVar2.f285790j, it8.a(), jVar2.e == v30.s0.CANCELED);
                v30.o0 o0Var = jVar2.f285788g;
                return new v30.l0(new w30.n(uuid, instant, instant2, instant3, instant4, bool, u0Var, vVar, o0Var != null ? o0Var.f285811b : null, jVar2.f285799w, jVar2.f285800x, jVar2.f285789h, jVar2.f285797s, null, null, v30.c0.SUPPORT, 229888));
        }
    }

    public /* synthetic */ n2(v30.j jVar, int i) {
        this.f181188a = i;
        this.f181189b = jVar;
    }
}
