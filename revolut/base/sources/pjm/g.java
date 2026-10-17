package pjm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaClassMemberScope f236891b;

    public /* synthetic */ g(LazyJavaClassMemberScope lazyJavaClassMemberScope, int i) {
        this.f236890a = i;
        this.f236891b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f236890a;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f236891b;
        Name it8 = (Name) obj2;
        switch (i) {
            case 0:
                int i2 = LazyJavaClassMemberScope.u;
                Intrinsics.checkNotNullParameter(it8, "it");
                return lazyJavaClassMemberScope.B(it8);
            default:
                int i3 = LazyJavaClassMemberScope.u;
                Intrinsics.checkNotNullParameter(it8, "it");
                return lazyJavaClassMemberScope.C(it8);
        }
    }
}
