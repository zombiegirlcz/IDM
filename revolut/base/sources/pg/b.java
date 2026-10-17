package pg;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kg.l0;
import kg.m0;
import kg.o;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f235783b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f235784a;

    public class a implements m0 {
        @Override // kg.m0
        public final l0 a(o oVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i) {
        this();
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        Time time;
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        synchronized (this) {
            TimeZone timeZone = this.f235784a.getTimeZone();
            try {
                try {
                    time = new Time(this.f235784a.parse(strY).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strY + "' as SQL Time; at path " + aVar.m(), e);
                }
            } finally {
                this.f235784a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        String str;
        Time time = (Time) obj2;
        if (time == null) {
            cVar.m();
            return;
        }
        synchronized (this) {
            str = this.f235784a.format((Date) time);
        }
        cVar.s(str);
    }

    private b() {
        this.f235784a = new SimpleDateFormat("hh:mm:ss a");
    }
}
