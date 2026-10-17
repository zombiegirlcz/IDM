package cjm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Name f24732b;

    public /* synthetic */ f(Name name, int i) {
        this.f24731a = i;
        this.f24732b = name;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f24731a;
        Name name = this.f24732b;
        MemberScope it8 = (MemberScope) obj2;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = JvmBuiltInsCustomizer.i;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
            default:
                int i2 = LazyJavaStaticClassScope.o;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
        }
    }
}
