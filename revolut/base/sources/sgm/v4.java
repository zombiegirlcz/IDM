package sgm;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class v4 extends ArrayList implements o4, tfm.y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263223a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f263224b;

    public /* synthetic */ v4(int i) {
        super(i);
    }

    @Override // sgm.o4
    public final void a(Object obj2) {
        switch (this.f263223a) {
            case 0:
                add(obj2);
                this.f263224b++;
                break;
            default:
                add(obj2);
                this.f263224b++;
                break;
        }
    }

    @Override // sgm.o4
    public final void b() {
        switch (this.f263223a) {
            case 0:
                add(ygm.l.COMPLETE);
                this.f263224b++;
                break;
            default:
                add(zfm.m.COMPLETE);
                this.f263224b++;
                break;
        }
    }

    @Override // sgm.o4
    public void c(m4 m4Var) {
        if (m4Var.getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = m4Var.f262999b;
        int iAddAndGet = 1;
        while (!m4Var.d) {
            int i = this.f263224b;
            Integer num = (Integer) m4Var.f263000c;
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i) {
                if (ygm.l.a(lVar, get(iIntValue)) || m4Var.d) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            m4Var.f263000c = Integer.valueOf(iIntValue);
            iAddAndGet = m4Var.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // tfm.y4
    public void e(tfm.v4 v4Var) {
        if (v4Var.getAndIncrement() != 0) {
            return;
        }
        efm.y yVar = v4Var.f270892b;
        int iAddAndGet = 1;
        while (!v4Var.d) {
            int i = this.f263224b;
            Integer num = (Integer) v4Var.f270893c;
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i) {
                if (zfm.m.a(yVar, get(iIntValue)) || v4Var.d) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            v4Var.f270893c = Integer.valueOf(iIntValue);
            iAddAndGet = v4Var.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // sgm.o4
    public final void error(Throwable th10) {
        switch (this.f263223a) {
            case 0:
                add(new ygm.j(th10));
                this.f263224b++;
                break;
            default:
                add(new zfm.k(th10));
                this.f263224b++;
                break;
        }
    }

    public v4() {
        super(16);
    }
}
