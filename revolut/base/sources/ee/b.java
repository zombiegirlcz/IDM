package ee;

import ce.r;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import zhm.d0;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f125043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f125044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f125045c;

    public b(Function1 instanceCreator) {
        Intrinsics.checkNotNullParameter(instanceCreator, "instanceCreator");
        this.f125043a = instanceCreator;
    }

    public void a() {
    }

    public synchronized void b() {
        a();
        this.f125044b = null;
    }

    public Object c() {
        Object objInvoke;
        Object obj2 = this.f125044b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f125044b;
            if (objInvoke == null) {
                Function0 function0 = (Function0) this.f125045c;
                if (function0 == null) {
                    throw new IllegalStateException(d0.b0(o0.f186429a.b(getClass()).getSupertypes()) + " is not initialised");
                }
                objInvoke = ((Function1) this.f125043a).invoke(function0.invoke());
                this.f125044b = objInvoke;
            }
        }
        return objInvoke;
    }

    public void d(Function0 argumentSupplier) {
        Intrinsics.checkNotNullParameter(argumentSupplier, "argumentSupplier");
        this.f125045c = argumentSupplier;
        f();
    }

    public Object e(Function0 argumentSupplier) {
        Intrinsics.checkNotNullParameter(argumentSupplier, "argumentSupplier");
        d(argumentSupplier);
        return c();
    }

    public void f() {
    }

    public b(r rVar) {
        he.c cVar = new he.c();
        ch.b bVar = new ch.b(5);
        this.f125045c = cVar;
        this.f125043a = new ArrayList();
        this.f125044b = bVar;
        rVar.a(new a(this));
    }
}
