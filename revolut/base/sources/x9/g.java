package x9;

import com.fasterxml.jackson.databind.JavaType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d9.y;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class g implements h {
    public static io.grpc.okhttp.internal.n a(Object obj2) {
        return new io.grpc.okhttp.internal.n(Array.getLength(obj2), 3, obj2.getClass(), obj2);
    }

    public static Object b(JavaType javaType) {
        Class cls = javaType.f26182a;
        Class clsT = f.t(cls);
        if (clsT == null) {
            if (javaType.H0() || javaType.D()) {
                return y.NON_EMPTY;
            }
            if (cls == String.class) {
                return "";
            }
            if (javaType.L0(Date.class)) {
                return new Date(0L);
            }
            if (!javaType.L0(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        if (clsT == Integer.TYPE) {
            return 0;
        }
        if (clsT == Long.TYPE) {
            return 0L;
        }
        if (clsT == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (clsT == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (clsT == Float.TYPE) {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        if (clsT == Byte.TYPE) {
            return (byte) 0;
        }
        if (clsT == Short.TYPE) {
            return (short) 0;
        }
        if (clsT == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException(j6.a.o(clsT, new StringBuilder("Class "), " is not a primitive type"));
    }

    public static boolean c(Object obj2, Set set, Set set2) {
        if (set == null && set2 == null) {
            return false;
        }
        return set2 == null ? set.contains(obj2) : set == null ? !set2.contains(obj2) : !set2.contains(obj2) || set.contains(obj2);
    }
}
