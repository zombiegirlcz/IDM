package mg;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends kg.l0 {
    public static final i d = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f205087a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f205088b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f205089c = new HashMap();

    public j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                lg.b bVar = (lg.b) field2.getAnnotation(lg.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.f205087a.put(str, r4);
                    }
                }
                this.f205087a.put(strName, r4);
                this.f205088b.put(string, r4);
                this.f205089c.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        Enum r06 = (Enum) this.f205087a.get(strY);
        return r06 == null ? (Enum) this.f205088b.get(strY) : r06;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        Enum r3 = (Enum) obj2;
        cVar.s(r3 == null ? null : (String) this.f205089c.get(r3));
    }
}
