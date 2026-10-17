package pjm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import zhm.a1;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaClassMemberScope f236886b;

    public /* synthetic */ e(LazyJavaClassMemberScope lazyJavaClassMemberScope, int i) {
        this.f236885a = i;
        this.f236886b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f236885a;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f236886b;
        switch (i) {
            case 0:
                return d0.i1(lazyJavaClassMemberScope.f186981n.getInnerClassNames());
            case 1:
                Collection<JavaField> fields = lazyJavaClassMemberScope.f186981n.getFields();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : fields) {
                    if (((JavaField) obj2).isEnumEntry()) {
                        arrayList.add(obj2);
                    }
                }
                int iB = q0.b(w.t(arrayList, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((JavaField) obj3).getName(), obj3);
                }
                return linkedHashMap;
            default:
                int i2 = LazyJavaClassMemberScope.u;
                return a1.l(lazyJavaClassMemberScope.getFunctionNames(), lazyJavaClassMemberScope.getVariableNames());
        }
    }
}
