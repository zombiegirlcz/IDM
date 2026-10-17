package zim;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class n1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f322673b;

    public /* synthetic */ n1(u1 u1Var, int i) {
        this.f322672a = i;
        this.f322673b = u1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        Class<?> enclosingClass;
        int i = this.f322672a;
        u1 u1Var = this.f322673b;
        switch (i) {
            case 0:
                ClassId classId = m2.f322665a;
                PropertyDescriptor propertyDescriptorJ = u1Var.j();
                l0 l0Var = u1Var.f322708h;
                foh.i iVarB = m2.b(propertyDescriptorJ);
                if (iVarB instanceof p) {
                    p pVar = (p) iVarB;
                    DeserializedPropertyDescriptor deserializedPropertyDescriptor = pVar.f322678a;
                    JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, pVar.f322679b, pVar.d, pVar.e, false, 8, null);
                    if (jvmFieldSignature$default != null) {
                        if (DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(deserializedPropertyDescriptor) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(pVar.f322679b)) {
                            enclosingClass = l0Var.getF186423a().getEnclosingClass();
                        } else {
                            DeclarationDescriptor containingDeclaration = deserializedPropertyDescriptor.getContainingDeclaration();
                            enclosingClass = containingDeclaration instanceof ClassDescriptor ? o2.j((ClassDescriptor) containingDeclaration) : l0Var.getF186423a();
                        }
                        if (enclosingClass != null) {
                            try {
                                return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
                            } catch (NoSuchFieldException unused) {
                            }
                        }
                    }
                } else {
                    if (iVarB instanceof n) {
                        return ((n) iVarB).f322666a;
                    }
                    if (!(iVarB instanceof o) && !(iVarB instanceof q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return null;
            default:
                l0 l0Var2 = u1Var.f322708h;
                String name = u1Var.i;
                String signature = u1Var.f322709j;
                l0Var2.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(signature, "signature");
                kotlin.text.o match = l0.f322659a.e(signature);
                if (match != null) {
                    Intrinsics.checkNotNullParameter(match, "match");
                    String str = (String) match.c().get(1);
                    PropertyDescriptor propertyDescriptorN = l0Var2.n(Integer.parseInt(str));
                    if (propertyDescriptorN != null) {
                        return propertyDescriptorN;
                    }
                    StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Local property #", str, " not found in ");
                    sbX.append(l0Var2.getF186423a());
                    throw new KotlinReflectionInternalError(sbX.toString());
                }
                Name nameIdentifier = Name.identifier(name);
                Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                Collection collectionQ = l0Var2.q(nameIdentifier);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionQ) {
                    if (Intrinsics.f(m2.b((PropertyDescriptor) obj2).b(), signature)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbM = v0.a.m("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    sbM.append(l0Var2);
                    throw new KotlinReflectionInternalError(sbM.toString());
                }
                if (arrayList.size() == 1) {
                    return (PropertyDescriptor) zhm.d0.K0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList) {
                    DescriptorVisibility visibility = ((PropertyDescriptor) obj3).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                Collection collectionValues = zhm.q0.f(linkedHashMap, new h(2)).values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                List list = (List) zhm.d0.l0(collectionValues);
                if (list.size() == 1) {
                    return (PropertyDescriptor) zhm.d0.b0(list);
                }
                Name nameIdentifier2 = Name.identifier(name);
                Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
                String strK0 = zhm.d0.k0(l0Var2.q(nameIdentifier2), "\n", null, null, 0, c.i, 30);
                StringBuilder sbM2 = v0.a.m("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbM2.append(l0Var2);
                sbM2.append(CoreConstants.COLON_CHAR);
                sbM2.append(strK0.length() == 0 ? " no members found" : "\n".concat(strK0));
                throw new KotlinReflectionInternalError(sbM2.toString());
        }
    }
}
