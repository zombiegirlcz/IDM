package skm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes13.dex */
public class h1 extends r1 implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f263981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Job job2) {
        super(true);
        boolean z = true;
        R(job2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f264006b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z = false;
            break;
        }
        r1 r1VarH = pVar.h();
        while (!r1VarH.L()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(r1VarH);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z = false;
                break;
            }
            r1VarH = pVar2.h();
        }
        this.f263981c = z;
    }

    @Override // skm.r1
    public final boolean L() {
        return this.f263981c;
    }

    @Override // skm.r1
    public final boolean N() {
        return true;
    }

    public final boolean h0() {
        return U(Unit.f186387a);
    }
}
