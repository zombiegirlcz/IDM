package pg;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kg.l0;
import kg.m0;
import kg.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1307a f235781b = new C1307a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f235782a;

    /* JADX INFO: renamed from: pg.a$a, reason: collision with other inner class name */
    public class C1307a implements m0 {
        @Override // kg.m0
        public final l0 a(o oVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i) {
        this();
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        Date date;
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        synchronized (this) {
            TimeZone timeZone = this.f235782a.getTimeZone();
            try {
                try {
                    date = new Date(this.f235782a.parse(strY).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strY + "' as SQL Date; at path " + aVar.m(), e);
                }
            } finally {
                this.f235782a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        String str;
        Date date = (Date) obj2;
        if (date == null) {
            cVar.m();
            return;
        }
        synchronized (this) {
            str = this.f235782a.format((java.util.Date) date);
        }
        cVar.s(str);
    }

    private a() {
        this.f235782a = new SimpleDateFormat("MMM d, yyyy");
    }
}
