package v9;

import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public final class i extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f286917g = new i(null, null);

    public i(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Date date = (Date) obj2;
        if (r(vVar)) {
            hVar.t(date == null ? 0L : date.getTime());
        } else {
            s(date, hVar, vVar);
        }
    }

    @Override // v9.j
    public final j t(Boolean bool, DateFormat dateFormat) {
        return new i(bool, dateFormat);
    }
}
