package zmm;

import com.github.devnied.emvnfccard.model.AbstractData;
import com.google.android.material.color.utilities.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public final class a {
    public static volatile d d = d.DEFAULT_STYLE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuffer f323627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractData f323628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f323629c;

    public a(AbstractData abstractData, d dVar) {
        dVar = dVar == null ? d : dVar;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f323627a = stringBuffer;
        this.f323629c = dVar;
        this.f323628b = abstractData;
        dVar.appendStart(stringBuffer, abstractData);
    }

    public final void a(Class cls) {
        boolean zIsArray = cls.isArray();
        StringBuffer stringBuffer = this.f323627a;
        d dVar = this.f323629c;
        AbstractData abstractData = this.f323628b;
        if (zIsArray) {
            dVar.reflectionAppendArrayDetail(stringBuffer, null, abstractData);
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, Comparator.comparing(new f(14)));
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if ((field.getName().indexOf(36) != -1 || Modifier.isTransient(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) ? false : !field.isAnnotationPresent(b.class)) {
                try {
                    dVar.append(stringBuffer, name, field.get(abstractData), Boolean.valueOf(!field.isAnnotationPresent(e.class)));
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    public final String b() {
        d dVar = this.f323629c;
        StringBuffer stringBuffer = this.f323627a;
        AbstractData abstractData = this.f323628b;
        if (abstractData == null) {
            stringBuffer.append(dVar.getNullText());
        } else {
            dVar.appendEnd(stringBuffer, abstractData);
        }
        return stringBuffer.toString();
    }

    public final String toString() {
        AbstractData abstractData = this.f323628b;
        if (abstractData == null) {
            return this.f323629c.getNullText();
        }
        Class<?> superclass = abstractData.getClass();
        a(superclass);
        while (superclass.getSuperclass() != null) {
            superclass = superclass.getSuperclass();
            a(superclass);
        }
        return b();
    }
}
