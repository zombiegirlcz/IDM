package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import rjm.f;
import zhm.q;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class SignatureEnhancementBuilder$ClassEnhancementBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f187040b;

    public SignatureEnhancementBuilder$ClassEnhancementBuilder(@NotNull f fVar, String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        this.f187040b = fVar;
        this.f187039a = className;
    }

    public static /* synthetic */ void function$default(SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder, String str, String str2, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        signatureEnhancementBuilder$ClassEnhancementBuilder.function(str, str2, function1);
    }

    public final void function(@NotNull String name, String str, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        LinkedHashMap linkedHashMap = this.f187040b.f254701a;
        FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, name, str);
        block.invoke(functionEnhancementBuilder);
        Pair<String, PredefinedFunctionEnhancementInfo> pairBuild = functionEnhancementBuilder.build();
        linkedHashMap.put(pairBuild.f186385a, pairBuild.f186386b);
    }

    @NotNull
    public final String getClassName() {
        return this.f187039a;
    }

    public final class FunctionEnhancementBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f187041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f187042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f187043c;
        public Pair d;
        public final /* synthetic */ SignatureEnhancementBuilder$ClassEnhancementBuilder e;

        public FunctionEnhancementBuilder(@NotNull SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder, String functionName, String str) {
            Intrinsics.checkNotNullParameter(functionName, "functionName");
            this.e = signatureEnhancementBuilder$ClassEnhancementBuilder;
            this.f187041a = functionName;
            this.f187042b = str;
            this.f187043c = new ArrayList();
            this.d = new Pair("V", null);
        }

        @NotNull
        public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            String className = this.e.getClassName();
            ArrayList arrayList = this.f187043c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add((String) ((Pair) it8.next()).f186385a);
            }
            String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(this.f187041a, arrayList2, (String) this.d.f186385a));
            TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.d.f186386b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                arrayList3.add((TypeEnhancementInfo) ((Pair) it9.next()).f186386b);
            }
            return new Pair<>(strSignature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList3, this.f187042b));
        }

        public final void parameter(@NotNull String type, @NotNull JavaTypeQualifiers... qualifiers) {
            TypeEnhancementInfo typeEnhancementInfo;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
            if (qualifiers.length == 0) {
                typeEnhancementInfo = null;
            } else {
                q qVarZ0 = d.z0(qualifiers);
                int iB = q0.b(w.t(qVarZ0, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                Iterator it8 = qVarZ0.iterator();
                while (true) {
                    kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
                    if (!((Iterator) dVar.f186416c).hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) dVar.next();
                    linkedHashMap.put(Integer.valueOf(indexedValue.f186391a), (JavaTypeQualifiers) indexedValue.f186392b);
                }
                typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
            }
            this.f187043c.add(new Pair(type, typeEnhancementInfo));
        }

        public final void returns(@NotNull String type, @NotNull JavaTypeQualifiers... qualifiers) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
            q qVarZ0 = d.z0(qualifiers);
            int iB = q0.b(w.t(qVarZ0, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            Iterator it8 = qVarZ0.iterator();
            while (true) {
                kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
                if (!((Iterator) dVar.f186416c).hasNext()) {
                    this.d = new Pair(type, new TypeEnhancementInfo(linkedHashMap));
                    return;
                } else {
                    IndexedValue indexedValue = (IndexedValue) dVar.next();
                    linkedHashMap.put(Integer.valueOf(indexedValue.f186391a), (JavaTypeQualifiers) indexedValue.f186392b);
                }
            }
        }

        public final void returns(@NotNull JvmPrimitiveType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            String desc = type.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            this.d = new Pair(desc, null);
        }
    }
}
