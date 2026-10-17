package o9;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.HashMap;
import org.w3c.dom.Node;
import v9.i;
import x9.f;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f223050b = Node.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f223051c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f223052a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        try {
            int i = a.f223048a;
        } catch (Throwable unused) {
        }
        f223051c = new c();
    }

    public c() {
        HashMap map = new HashMap();
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.f223052a = map2;
        map2.put("java.sql.Timestamp", i.f286917g);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public static Object a(JavaType javaType, Class cls) {
        try {
            return f.f(cls, false);
        } catch (Throwable th10) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + f.m(javaType) + ", problem: (" + th10.getClass().getName() + ") " + th10.getMessage());
        }
    }

    public static Object b(JavaType javaType, String str) {
        try {
            return a(javaType, Class.forName(str));
        } catch (Throwable th10) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Failed to find class `", str, "` for handling values of type ");
            sbX.append(f.m(javaType));
            sbX.append(", problem: (");
            sbX.append(th10.getClass().getName());
            sbX.append(") ");
            sbX.append(th10.getMessage());
            throw new IllegalStateException(sbX.toString());
        }
    }
}
