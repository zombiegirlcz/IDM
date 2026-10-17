package mg;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends kg.l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f205076c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f205077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205078b;

    public h(g gVar, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f205078b = arrayList;
        Objects.requireNonNull(gVar);
        this.f205077a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (com.google.gson.internal.k.f49643a >= 9) {
            StringBuilder sb6 = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(a0.d.n("Unknown DateFormat style: ", i));
                }
                str = "M/d/yy";
            }
            sb6.append(str);
            sb6.append(" ");
            if (i2 == 0 || i2 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i2 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException(a0.d.n("Unknown DateFormat style: ", i2));
                }
                str2 = "h:mm a";
            }
            sb6.append(str2);
            arrayList.add(new SimpleDateFormat(sb6.toString(), locale));
        }
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        Date dateB;
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        synchronized (this.f205078b) {
            try {
                Iterator it8 = this.f205078b.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        try {
                            dateB = ng.a.b(strY, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Failed parsing '", strY, "' as Date; at path ");
                            sbX.append(aVar.m());
                            throw new JsonSyntaxException(sbX.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it8.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strY);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return this.f205077a.a(dateB);
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        String str;
        Date date = (Date) obj2;
        if (date == null) {
            cVar.m();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f205078b.get(0);
        synchronized (this.f205078b) {
            str = dateFormat.format(date);
        }
        cVar.s(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f205078b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
