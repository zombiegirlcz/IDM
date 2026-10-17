package knm;

import androidx.webkit.internal.WebMessageListenerAdapter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebMessageListenerAdapter f186199a;

    public a(WebMessageListenerAdapter webMessageListenerAdapter) {
        this.f186199a = webMessageListenerAdapter;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        boolean z = obj2 instanceof a;
        WebMessageListenerAdapter webMessageListenerAdapter = this.f186199a;
        return z ? webMessageListenerAdapter.equals(((a) obj2).f186199a) : webMessageListenerAdapter.equals(obj2);
    }

    public final int hashCode() {
        return this.f186199a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
        WebMessageListenerAdapter webMessageListenerAdapter = this.f186199a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, webMessageListenerAdapter.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(webMessageListenerAdapter, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Reflection failed for method " + method, e2);
        }
    }
}
