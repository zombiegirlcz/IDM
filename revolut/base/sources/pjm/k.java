package pjm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: loaded from: classes14.dex */
public final class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaScope f236899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JavaField f236900c;
    public final Ref$ObjectRef d;

    public /* synthetic */ k(LazyJavaScope lazyJavaScope, JavaField javaField, Ref$ObjectRef ref$ObjectRef, int i) {
        this.f236898a = i;
        this.f236899b = lazyJavaScope;
        this.f236900c = javaField;
        this.d = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f236898a) {
            case 0:
                LazyJavaScope lazyJavaScope = this.f236899b;
                return lazyJavaScope.f186999a.getStorageManager().createNullableLazyValue(new k(lazyJavaScope, this.f236900c, this.d, 1));
            default:
                return this.f236899b.f186999a.getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.f236900c, (PropertyDescriptor) this.d.f186409a);
        }
    }
}
