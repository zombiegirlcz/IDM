package zim;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u1 extends u implements KProperty {

    @NotNull
    public static final p1 Companion = new p1();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f322707n = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f322708h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f322709j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f322710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h2 f322711m;

    public u1(l0 l0Var, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj2) {
        this.f322708h = l0Var;
        this.i = str;
        this.f322709j = str2;
        this.k = obj2;
        this.f322710l = yhm.j.c(yhm.k.PUBLICATION, new n1(this, 0));
        h2 h2VarN = m70.a.n(propertyDescriptor, new n1(this, 1));
        Intrinsics.checkNotNullExpressionValue(h2VarN, "lazySoft(...)");
        this.f322711m = h2VarN;
    }

    @Override // zim.u
    public final ajm.i c() {
        return t().c();
    }

    @Override // zim.u
    public final l0 d() {
        return this.f322708h;
    }

    public final boolean equals(Object obj2) {
        u1 u1VarC = o2.c(obj2);
        return u1VarC != null && Intrinsics.f(this.f322708h, u1VarC.f322708h) && Intrinsics.f(this.i, u1VarC.i) && Intrinsics.f(this.f322709j, u1VarC.f322709j) && Intrinsics.f(this.k, u1VarC.k);
    }

    @Override // zim.u
    public final ajm.i g() {
        t().getClass();
        return null;
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return this.i;
    }

    public final int hashCode() {
        return this.f322709j.hashCode() + p.a.c(this.f322708h.hashCode() * 31, 31, this.i);
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isConst() {
        return j().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isLateinit() {
        return j().isLateInit();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return false;
    }

    @Override // zim.u
    public final boolean p() {
        return this.k != kotlin.jvm.internal.h.NO_RECEIVER;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final Member q() {
        if (!j().isDelegated()) {
            return null;
        }
        ClassId classId = m2.f322665a;
        foh.i iVarB = m2.b(j());
        if (iVarB instanceof p) {
            p pVar = (p) iVarB;
            if (pVar.O().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = pVar.O().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return this.f322708h.d(pVar.N().getString(delegateMethod.getName()), pVar.N().getString(delegateMethod.getDesc()));
            }
        }
        return (Field) this.f322710l.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object r(Member member, Object obj2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj3 = f322707n;
            if (obj2 == obj3 && j().getExtensionReceiverParameter() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objF = p() ? l9.l.f(this.k, j()) : obj2;
            if (objF == obj3) {
                objF = null;
            }
            if (!p()) {
                obj2 = null;
            }
            if (obj2 == obj3) {
                obj2 = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(yim.a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objF);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objF == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                    objF = o2.e(cls);
                }
                return method.invoke(null, objF);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj2 == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                obj2 = o2.e(cls2);
            }
            return method2.invoke(null, objF, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    @Override // zim.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final PropertyDescriptor j() {
        Object objInvoke = this.f322711m.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (PropertyDescriptor) objInvoke;
    }

    public abstract r1 t();

    public final String toString() {
        return l2.e(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(l0 container, String name, String signature, Object obj2) {
        this(container, name, signature, null, obj2);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u1(l0 container, PropertyDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        this(container, strAsString, m2.b(descriptor).b(), descriptor, kotlin.jvm.internal.h.NO_RECEIVER);
    }
}
