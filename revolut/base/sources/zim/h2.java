package zim;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 implements Function0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qf.b f322643c = new qf.b(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f322644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile SoftReference f322645b;

    public h2(Object obj2, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f322645b = null;
        this.f322644a = function0;
        if (obj2 != null) {
            this.f322645b = new SoftReference(obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj2;
        Object obj3 = f322643c;
        SoftReference softReference = this.f322645b;
        if (softReference != null && (obj2 = softReference.get()) != null) {
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        Object objInvoke = this.f322644a.invoke();
        if (objInvoke != null) {
            obj3 = objInvoke;
        }
        this.f322645b = new SoftReference(obj3);
        return objInvoke;
    }
}
