package v9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public abstract class j extends p0 implements t9.h {
    public final Boolean d;
    public final DateFormat e;
    public final AtomicReference f;

    public j(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.d = bool;
        this.e = dateFormat;
        this.f = dateFormat == null ? null : new AtomicReference();
    }

    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        Class cls = this.f286928a;
        d9.p pVarM = o0.m(vVar, dVar, cls);
        k9.t tVar = vVar.f182201a;
        if (pVarM != null) {
            String str = pVarM.d;
            Locale locale = pVarM.f112316c;
            String str2 = pVarM.f112314a;
            d9.o oVar = pVarM.f112315b;
            TimeZone timeZone = null;
            if (oVar.a()) {
                return t(Boolean.TRUE, null);
            }
            if (str2 != null && str2.length() > 0) {
                if (locale == null) {
                    locale = tVar.f203599b.f;
                }
                DateFormat simpleDateFormat = new SimpleDateFormat(str2, locale);
                if (pVarM.c()) {
                    TimeZone timeZone2 = pVarM.f112317g;
                    if (timeZone2 != null) {
                        timeZone = timeZone2;
                    } else if (str != null) {
                        timeZone = TimeZone.getTimeZone(str);
                        pVarM.f112317g = timeZone;
                    }
                } else {
                    tVar.f203599b.getClass();
                    timeZone = m9.a.f203589h;
                }
                simpleDateFormat.setTimeZone(timeZone);
                return t(Boolean.FALSE, simpleDateFormat);
            }
            boolean z = locale != null;
            boolean zC = pVarM.c();
            boolean z3 = oVar == d9.o.STRING;
            if (z || zC || z3) {
                DateFormat dateFormat = tVar.f203599b.e;
                if (dateFormat instanceof x9.q) {
                    x9.q qVar = (x9.q) dateFormat;
                    if (locale != null && !locale.equals(qVar.f303527b)) {
                        qVar = new x9.q(qVar.f303526a, locale, qVar.f303528c, qVar.f);
                    }
                    if (pVarM.c()) {
                        TimeZone timeZone3 = pVarM.f112317g;
                        if (timeZone3 != null) {
                            timeZone = timeZone3;
                        } else if (str != null) {
                            timeZone = TimeZone.getTimeZone(str);
                            pVarM.f112317g = timeZone;
                        }
                        if (timeZone == null) {
                            timeZone = x9.q.f303522j;
                        }
                        TimeZone timeZone4 = qVar.f303526a;
                        if (timeZone != timeZone4 && !timeZone.equals(timeZone4)) {
                            qVar = new x9.q(timeZone, qVar.f303527b, qVar.f303528c, qVar.f);
                        }
                    }
                    return t(Boolean.FALSE, qVar);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    String strP = p.a.p("Configured `DateFormat` (", dateFormat.getClass().getName(), ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`");
                    if (cls != null) {
                        vVar.s().b(null, cls, w9.f.d);
                    }
                    vVar.A(strP);
                    throw null;
                }
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
                DateFormat simpleDateFormat3 = z ? new SimpleDateFormat(simpleDateFormat2.toPattern(), locale) : (SimpleDateFormat) simpleDateFormat2.clone();
                TimeZone timeZone5 = pVarM.f112317g;
                if (timeZone5 != null) {
                    timeZone = timeZone5;
                } else if (str != null) {
                    timeZone = TimeZone.getTimeZone(str);
                    pVarM.f112317g = timeZone;
                }
                if (timeZone != null && !timeZone.equals(simpleDateFormat3.getTimeZone())) {
                    simpleDateFormat3.setTimeZone(timeZone);
                }
                return t(Boolean.FALSE, simpleDateFormat3);
            }
        }
        return this;
    }

    @Override // v9.p0, k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return false;
    }

    public final boolean r(k9.v vVar) {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e != null) {
            return false;
        }
        if (vVar == null) {
            throw new IllegalArgumentException("Null SerializerProvider passed for ".concat(this.f286928a.getName()));
        }
        return vVar.f182201a.n(k9.u.WRITE_DATES_AS_TIMESTAMPS);
    }

    public final void s(Date date, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        DateFormat dateFormat = this.e;
        if (dateFormat == null) {
            vVar.getClass();
            if (vVar.f182201a.n(k9.u.WRITE_DATES_AS_TIMESTAMPS)) {
                hVar.t(date.getTime());
                return;
            } else {
                hVar.B(vVar.d().format(date));
                return;
            }
        }
        AtomicReference atomicReference = this.f;
        DateFormat dateFormat2 = (DateFormat) atomicReference.getAndSet(null);
        if (dateFormat2 == null) {
            dateFormat2 = (DateFormat) dateFormat.clone();
        }
        hVar.B(dateFormat2.format(date));
        while (!atomicReference.compareAndSet(null, dateFormat2) && atomicReference.get() == null) {
        }
    }

    public abstract j t(Boolean bool, DateFormat dateFormat);
}
