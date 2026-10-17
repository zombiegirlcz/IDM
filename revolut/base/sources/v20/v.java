package v20;

import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f285580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f285581c;

    public /* synthetic */ v(f0 f0Var, UUID uuid, int i) {
        this.f285579a = i;
        this.f285580b = f0Var;
        this.f285581c = uuid;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f285579a) {
            case 0:
                final f0 f0Var = this.f285580b;
                final UUID uuid = this.f285581c;
                final v30.j jVarI = f0Var.i(uuid);
                final v30.j jVarA = jVarI != null ? v30.j.a(jVarI, v30.s0.CLOSED_AND_RATED, 16777199) : null;
                if (jVarI != null && jVarA != null) {
                    f0Var.f285394r.k(uuid, jVarA);
                }
                final int i = 0;
                pfm.t tVarL = f0Var.f285384b.closeTicket(uuid).m(new t(new w(jVarI, f0Var, uuid, 0), 8)).l(new kfm.a() { // from class: v20.x
                    @Override // kfm.a
                    public final void run() {
                        v30.j jVar;
                        v30.j jVar2;
                        switch (i) {
                            case 0:
                                if (jVarI != null && (jVar = jVarA) != null) {
                                    f0Var.f285394r.l(uuid, jVar);
                                    break;
                                }
                                break;
                            default:
                                v30.j jVar3 = jVarI;
                                f0 f0Var2 = f0Var;
                                if (jVar3 != null && (jVar2 = jVarA) != null) {
                                    f0Var2.f285394r.l(uuid, jVar2);
                                }
                                f0Var2.v.onNext(Unit.f186387a);
                                break;
                        }
                    }
                });
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                return ue0.e.A(tVarL, new p(f0Var, 21));
            case 1:
                final f0 f0Var2 = this.f285580b;
                final UUID uuid2 = this.f285581c;
                final v30.j jVarI2 = f0Var2.i(uuid2);
                final v30.j jVarA2 = jVarI2 != null ? v30.j.a(jVarI2, null, 16774143) : null;
                if (jVarI2 != null && jVarA2 != null) {
                    f0Var2.r(uuid2, jVarA2);
                }
                final int i2 = 1;
                return f0Var2.f285384b.markRead(uuid2).m(new t(new w(jVarI2, f0Var2, uuid2, 1), 10)).l(new kfm.a() { // from class: v20.x
                    @Override // kfm.a
                    public final void run() {
                        v30.j jVar;
                        v30.j jVar2;
                        switch (i2) {
                            case 0:
                                if (jVarI2 != null && (jVar = jVarA2) != null) {
                                    f0Var2.f285394r.l(uuid2, jVar);
                                    break;
                                }
                                break;
                            default:
                                v30.j jVar3 = jVarI2;
                                f0 f0Var22 = f0Var2;
                                if (jVar3 != null && (jVar2 = jVarA2) != null) {
                                    f0Var22.f285394r.l(uuid2, jVar2);
                                }
                                f0Var22.v.onNext(Unit.f186387a);
                                break;
                        }
                    }
                });
            default:
                return this.f285580b.f285384b.getTicket(this.f285581c);
        }
    }
}
