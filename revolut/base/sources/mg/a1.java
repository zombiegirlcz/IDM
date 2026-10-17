package mg;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public class a1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        int iS;
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        aVar.f();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        while (aVar.A() != qg.b.END_OBJECT) {
            String strU = aVar.u();
            iS = aVar.s();
            strU.getClass();
            switch (strU) {
                case "dayOfMonth":
                    i3 = iS;
                    break;
                case "minute":
                    i6 = iS;
                    break;
                case "second":
                    i21 = iS;
                    break;
                case "year":
                    i = iS;
                    break;
                case "month":
                    i2 = iS;
                    break;
                case "hourOfDay":
                    i5 = iS;
                    break;
            }
        }
        aVar.j();
        return new GregorianCalendar(i, i2, i3, i5, i6, i21);
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (((Calendar) obj2) == null) {
            cVar.m();
            return;
        }
        cVar.g();
        cVar.k("year");
        cVar.u(r4.get(1));
        cVar.k("month");
        cVar.u(r4.get(2));
        cVar.k("dayOfMonth");
        cVar.u(r4.get(5));
        cVar.k("hourOfDay");
        cVar.u(r4.get(11));
        cVar.k("minute");
        cVar.u(r4.get(12));
        cVar.k("second");
        cVar.u(r4.get(13));
        cVar.j();
    }
}
