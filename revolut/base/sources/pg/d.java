package pg;

import java.sql.Timestamp;
import java.util.Date;
import kg.l0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f235785b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f235786a;

    public d(l0 l0Var) {
        this.f235786a = l0Var;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        Date date = (Date) this.f235786a.c(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) {
        this.f235786a.d(cVar, (Timestamp) obj2);
    }
}
