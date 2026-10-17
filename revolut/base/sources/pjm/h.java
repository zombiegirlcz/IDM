package pjm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaPackageFragment f236893b;

    public /* synthetic */ h(LazyJavaPackageFragment lazyJavaPackageFragment, int i) {
        this.f236892a = i;
        this.f236893b = lazyJavaPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f236892a;
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f236893b;
        switch (i) {
            case 0:
                List<String> listFindPackageParts = lazyJavaPackageFragment.f186988h.getComponents().getPackagePartProvider().findPackageParts(lazyJavaPackageFragment.getFqName().asString());
                ArrayList arrayList = new ArrayList();
                for (String str : listFindPackageParts) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                    Intrinsics.checkNotNullExpressionValue(fqNameForTopLevelClassMaybeWithDollars, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.f186988h.getComponents().getKotlinClassFinder(), companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), lazyJavaPackageFragment.i);
                    Pair pair = kotlinJvmBinaryClassFindKotlinClass != null ? new Pair(str, kotlinJvmBinaryClassFindKotlinClass) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return r0.t(arrayList);
            case 1:
                Collection<JavaPackage> subPackages = lazyJavaPackageFragment.f186987g.getSubPackages();
                ArrayList arrayList2 = new ArrayList(w.t(subPackages, 10));
                Iterator<T> it8 = subPackages.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((JavaPackage) it8.next()).getFqName());
                }
                return arrayList2;
            default:
                KProperty[] kPropertyArr = LazyJavaPackageFragment.o;
                HashMap map = new HashMap();
                for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().entrySet()) {
                    String key = entry.getKey();
                    KotlinJvmBinaryClass value = entry.getValue();
                    JvmClassName jvmClassNameByInternalName = JvmClassName.byInternalName(key);
                    Intrinsics.checkNotNullExpressionValue(jvmClassNameByInternalName, "byInternalName(...)");
                    KotlinClassHeader classHeader = value.getClassHeader();
                    int i2 = LazyJavaPackageFragment.WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                    if (i2 == 1) {
                        String multifileClassName = classHeader.getMultifileClassName();
                        if (multifileClassName != null) {
                            map.put(jvmClassNameByInternalName, JvmClassName.byInternalName(multifileClassName));
                        }
                    } else if (i2 == 2) {
                        map.put(jvmClassNameByInternalName, jvmClassNameByInternalName);
                    }
                }
                return map;
        }
    }
}
