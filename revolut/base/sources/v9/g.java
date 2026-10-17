package v9;

import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f286915g = new g(null, null);

    public g(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Calendar calendar = (Calendar) obj2;
        if (r(vVar)) {
            hVar.t(calendar == null ? 0L : calendar.getTimeInMillis());
        } else {
            s(calendar.getTime(), hVar, vVar);
        }
    }

    @Override // v9.j
    public final j t(Boolean bool, DateFormat dateFormat) {
        return new g(bool, dateFormat);
    }
}
