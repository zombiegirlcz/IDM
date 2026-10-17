package ce;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements cf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23288b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f23287a = i;
        this.f23288b = obj2;
    }

    @Override // cf.b
    public final Object get() {
        switch (this.f23287a) {
            case 0:
                String str = (String) this.f23288b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    String str2 = "Class " + str + " is not an found.";
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(p.a.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new InvalidRegistrarException(p.a.p("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e4) {
                    throw new InvalidRegistrarException(j6.a.q("Could not instantiate ", str), e4);
                } catch (InvocationTargetException e5) {
                    throw new InvalidRegistrarException(j6.a.q("Could not instantiate ", str), e5);
                }
            case 1:
                return (ComponentRegistrar) this.f23288b;
            default:
                return new ef.b((pd.g) this.f23288b);
        }
    }
}
