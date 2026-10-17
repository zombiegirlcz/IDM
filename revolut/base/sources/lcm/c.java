package lcm;

import ecm.g2;
import ecm.h;
import ecm.m1;
import io.grpc.StatusRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f193907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f193908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f193909c = false;

    public c(a aVar) {
        this.f193907a = aVar;
    }

    @Override // ecm.h
    public final void a(g2 g2Var, m1 m1Var) {
        boolean zE = g2Var.e();
        a aVar = this.f193907a;
        if (!zE) {
            aVar.setException(new StatusRuntimeException(g2Var));
            return;
        }
        if (!this.f193909c) {
            aVar.setException(new StatusRuntimeException(g2.f124806l.g("No value received for unary call")));
        }
        aVar.set(this.f193908b);
    }

    @Override // ecm.h
    public final void b(m1 m1Var) {
    }

    @Override // ecm.h
    public final void c(Object obj2) {
        if (this.f193909c) {
            throw new StatusRuntimeException(g2.f124806l.g("More than one value received for unary call"));
        }
        this.f193908b = obj2;
        this.f193909c = true;
    }
}
