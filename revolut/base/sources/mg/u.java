package mg;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class u implements kg.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f205126b;

    public /* synthetic */ u(Object obj2, int i) {
        this.f205125a = i;
        this.f205126b = obj2;
    }

    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        switch (this.f205125a) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (w) this.f205126b;
                }
                return null;
            case 1:
                if (typeToken.getRawType() == Object.class) {
                    return new y(oVar, (kg.j0) this.f205126b);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (a1) this.f205126b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f205125a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((a1) this.f205126b) + "]";
            default:
                return super.toString();
        }
    }
}
