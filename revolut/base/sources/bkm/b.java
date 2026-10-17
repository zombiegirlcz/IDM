package bkm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16433b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16434c = new b(1);
    public static final b d = new b(2);
    public static final b e = new b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16435a;

    public /* synthetic */ b(int i) {
        this.f16435a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16435a) {
            case 0:
                Name it8 = (Name) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.TRUE;
            case 1:
                SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup = (SimpleFunctionDescriptor) obj2;
                TypeIntersectionScope.Companion companion = TypeIntersectionScope.Companion;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                PropertyDescriptor selectMostSpecificInEachOverridableGroup2 = (PropertyDescriptor) obj2;
                TypeIntersectionScope.Companion companion2 = TypeIntersectionScope.Companion;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup2, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup2;
            default:
                CallableDescriptor selectMostSpecificInEachOverridableGroup3 = (CallableDescriptor) obj2;
                TypeIntersectionScope.Companion companion3 = TypeIntersectionScope.Companion;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup3, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup3;
        }
    }
}
