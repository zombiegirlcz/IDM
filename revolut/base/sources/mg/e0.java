package mg;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class e0 extends a0 {
    public static final HashMap e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f205065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f205066c;
    public final HashMap d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        e = map;
    }

    public e0(Class cls, d0 d0Var, boolean z) {
        super(d0Var);
        this.d = new HashMap();
        te0.w wVar = og.c.f224953a;
        Constructor constructorH = wVar.H(cls);
        this.f205065b = constructorH;
        if (z) {
            f0.b(null, constructorH);
        } else {
            og.c.f(constructorH);
        }
        String[] strArrQ = wVar.Q(cls);
        for (int i = 0; i < strArrQ.length; i++) {
            this.d.put(strArrQ[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f205065b.getParameterTypes();
        this.f205066c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f205066c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // mg.a0
    public final Object e() {
        return (Object[]) this.f205066c.clone();
    }

    @Override // mg.a0
    public final Object f(Object obj2) {
        Object[] objArr = (Object[]) obj2;
        Constructor constructor = this.f205065b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            te0.w wVar = og.c.f224953a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + og.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new RuntimeException("Failed to invoke constructor '" + og.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + og.c.b(constructor) + "' with args " + Arrays.toString(objArr), e6.getCause());
        }
    }

    @Override // mg.a0
    public final void g(Object obj2, qg.a aVar, b0 b0Var) {
        Object[] objArr = (Object[]) obj2;
        String str = b0Var.f205053c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + og.c.b(this.f205065b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        z zVar = (z) b0Var;
        Object objC = zVar.f205134g.c(aVar);
        if (objC != null || !zVar.f205135h) {
            objArr[iIntValue] = objC;
            return;
        }
        throw new JsonParseException("null is not allowed as value for record component '" + zVar.f205053c + "' of primitive type; at path " + aVar.getPath());
    }
}
