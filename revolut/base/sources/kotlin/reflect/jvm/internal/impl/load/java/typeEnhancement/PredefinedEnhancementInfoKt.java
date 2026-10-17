package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import atg.t;
import ek2.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import n8i.b1;
import org.jetbrains.annotations.NotNull;
import rjm.d;
import rjm.f;

/* JADX INFO: loaded from: classes14.dex */
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JavaTypeQualifiers f187032a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JavaTypeQualifiers f187033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JavaTypeQualifiers f187034c;
    public static final LinkedHashMap d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f187033b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        f187034c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents.javaLang("Object");
        String strJavaFunction = signatureBuildingComponents.javaFunction("Predicate");
        String strJavaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String strJavaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        String strJavaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String strJavaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        String strJavaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        String strJavaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        f fVar = new f();
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaUtil("Iterator")), "forEachRemaining", null, new p(strJavaFunction3, 3), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaLang("Iterable")), "spliterator", null, new b1(signatureBuildingComponents, 26), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder = new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaUtil("Collection"));
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder, "removeIf", null, new p(strJavaFunction, 20), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder, "stream", null, new p(strJavaUtil, 29), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder, "parallelStream", null, new d(strJavaUtil, 4), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder2 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaUtil("List"));
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder2, "replaceAll", null, new d(strJavaFunction6, 5), 2, null);
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("addFirst", "2.1", new d(strJavaLang, 6));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("addLast", "2.1", new d(strJavaLang, 7));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("removeFirst", "2.1", new d(strJavaLang, 8));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("removeLast", "2.1", new d(strJavaLang, 9));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder3 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaUtil("LinkedList"));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("addFirst", "2.1", new p(strJavaLang, 4));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("addLast", "2.1", new p(strJavaLang, 5));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("removeFirst", "2.1", new p(strJavaLang, 6));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("removeLast", "2.1", new p(strJavaLang, 7));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder4 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaUtil("LinkedHashSet"));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("addFirst", "2.2", new p(strJavaLang, 8));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("addLast", "2.2", new p(strJavaLang, 9));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("removeFirst", "2.2", new p(strJavaLang, 10));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("removeLast", "2.2", new p(strJavaLang, 11));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("getFirst", "2.2", new p(strJavaLang, 12));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("getLast", "2.2", new p(strJavaLang, 13));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder5 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaUtil("Map"));
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "forEach", null, new p(strJavaFunction5, 14), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "putIfAbsent", null, new p(strJavaLang, 15), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "replace", null, new p(strJavaLang, 16), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "replace", null, new p(strJavaLang, 17), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "replaceAll", null, new p(strJavaFunction4, 18), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "compute", null, new t(strJavaLang, strJavaFunction4, 7), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "computeIfAbsent", null, new t(strJavaLang, strJavaFunction2, 8), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "computeIfPresent", null, new t(strJavaLang, strJavaFunction4, 9), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "merge", null, new t(strJavaLang, strJavaFunction4, 10), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder6 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaUtil("LinkedHashMap"));
        signatureEnhancementBuilder$ClassEnhancementBuilder6.function("putFirst", "2.2", new p(strJavaLang, 19));
        signatureEnhancementBuilder$ClassEnhancementBuilder6.function("putLast", "2.2", new p(strJavaLang, 21));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder7 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, strJavaUtil2);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "empty", null, new p(strJavaUtil2, 22), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "of", null, new t(strJavaLang, strJavaUtil2, 11), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "ofNullable", null, new t(strJavaLang, strJavaUtil2, 12), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "get", null, new p(strJavaLang, 23), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "ifPresent", null, new p(strJavaFunction3, 24), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaLang("ref/Reference")), "get", null, new p(strJavaLang, 25), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, strJavaFunction), "test", null, new p(strJavaLang, 26), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaFunction("BiPredicate")), "test", null, new p(strJavaLang, 27), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, strJavaFunction3), "accept", null, new p(strJavaLang, 28), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, strJavaFunction5), "accept", null, new d(strJavaLang, 0), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, strJavaFunction2), "apply", null, new d(strJavaLang, 1), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, strJavaFunction4), "apply", null, new d(strJavaLang, 2), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(fVar, signatureBuildingComponents.javaFunction("Supplier")), "get", null, new d(strJavaLang, 3), 2, null);
        d = fVar.f254701a;
    }

    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return d;
    }
}
