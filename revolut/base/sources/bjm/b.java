package bjm;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KotlinBuiltIns f16199b;

    public /* synthetic */ b(KotlinBuiltIns kotlinBuiltIns, int i) {
        this.f16198a = i;
        this.f16199b = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f16198a;
        KotlinBuiltIns kotlinBuiltIns = this.f16199b;
        switch (i) {
            case 0:
                return Arrays.asList(kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.RANGES_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
            default:
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strAsString = primitiveType.getTypeName().asString();
                    if (strAsString == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    Name name = KotlinBuiltIns.BUILTINS_MODULE_NAME;
                    SimpleType defaultType = kotlinBuiltIns.e(strAsString).getDefaultType();
                    if (defaultType == null) {
                        KotlinBuiltIns.a(48);
                        throw null;
                    }
                    String strAsString2 = primitiveType.getArrayTypeName().asString();
                    if (strAsString2 == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    SimpleType defaultType2 = kotlinBuiltIns.e(strAsString2).getDefaultType();
                    if (defaultType2 == null) {
                        KotlinBuiltIns.a(48);
                        throw null;
                    }
                    enumMap.put(primitiveType, defaultType2);
                    map.put(defaultType, defaultType2);
                    map2.put(defaultType2, defaultType);
                }
                return new e(enumMap, map, map2);
        }
    }
}
