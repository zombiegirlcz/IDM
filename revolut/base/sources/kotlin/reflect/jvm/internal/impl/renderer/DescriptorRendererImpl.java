package kotlin.reflect.jvm.internal.impl.renderer;

import ajm.d;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt;
import kotlin.text.a0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import p.a;
import qm.e;
import vsl.f;
import wjm.b;
import wjm.c;
import yhm.j;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes13.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f187537c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl f187538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f187539b;

    /* JADX INFO: loaded from: classes14.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f187538a = options;
        options.isLocked();
        this.f187539b = j.b(new d(this, 28));
    }

    public static boolean E(KotlinType kotlinType) {
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        List<TypeProjection> arguments = kotlinType.getArguments();
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            return true;
        }
        Iterator<T> it8 = arguments.iterator();
        while (it8.hasNext()) {
            if (((TypeProjection) it8.next()).isStarProjection()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void access$renderClass(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r9, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r10, java.lang.StringBuilder r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderClass(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void access$renderConstructor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r13, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r14, java.lang.StringBuilder r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderConstructor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void access$renderFunction(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r7, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r8, java.lang.StringBuilder r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderFunction(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.StringBuilder):void");
    }

    public static final void access$renderPackageFragment(DescriptorRendererImpl descriptorRendererImpl, PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb6) {
        descriptorRendererImpl.getClass();
        FqName fqName = packageFragmentDescriptor.getFqName();
        sb6.append(descriptorRendererImpl.j("package-fragment"));
        String strRenderFqName = descriptorRendererImpl.renderFqName(fqName.toUnsafe());
        if (strRenderFqName.length() > 0) {
            sb6.append(" ");
            sb6.append(strRenderFqName);
        }
        if (descriptorRendererImpl.getDebugMode()) {
            sb6.append(" in ");
            descriptorRendererImpl.o(packageFragmentDescriptor.getContainingDeclaration(), sb6, false);
        }
    }

    public static final void access$renderPackageView(DescriptorRendererImpl descriptorRendererImpl, PackageViewDescriptor packageViewDescriptor, StringBuilder sb6) {
        descriptorRendererImpl.getClass();
        FqName fqName = packageViewDescriptor.getFqName();
        sb6.append(descriptorRendererImpl.j("package"));
        String strRenderFqName = descriptorRendererImpl.renderFqName(fqName.toUnsafe());
        if (strRenderFqName.length() > 0) {
            sb6.append(" ");
            sb6.append(strRenderFqName);
        }
        if (descriptorRendererImpl.getDebugMode()) {
            sb6.append(" in context of ");
            descriptorRendererImpl.o(packageViewDescriptor.getModule(), sb6, false);
        }
    }

    public static final void access$renderProperty(DescriptorRendererImpl descriptorRendererImpl, PropertyDescriptor propertyDescriptor, StringBuilder sb6) throws IOException {
        ConstantValue<?> constantValueMo3788getCompileTimeInitializer;
        String strE;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
                descriptorRendererImpl.f(sb6, contextReceiverParameters);
                if (descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.c(sb6, propertyDescriptor, null);
                    FieldDescriptor backingField = propertyDescriptor.getBackingField();
                    if (backingField != null) {
                        descriptorRendererImpl.c(sb6, backingField, AnnotationUseSiteTarget.FIELD);
                    }
                    FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
                    if (delegateField != null) {
                        descriptorRendererImpl.c(sb6, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (descriptorRendererImpl.getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.c(sb6, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.c(sb6, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) d0.K0(valueParameters);
                            Intrinsics.h(valueParameterDescriptor);
                            descriptorRendererImpl.c(sb6, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                descriptorRendererImpl.C(visibility, sb6);
                descriptorRendererImpl.n(sb6, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                descriptorRendererImpl.l(propertyDescriptor, sb6);
                descriptorRendererImpl.m(propertyDescriptor, sb6);
                descriptorRendererImpl.r(propertyDescriptor, sb6);
                descriptorRendererImpl.n(sb6, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit(), "lateinit");
                descriptorRendererImpl.k(propertyDescriptor, sb6);
            }
            descriptorRendererImpl.z(propertyDescriptor, sb6, false);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.y(sb6, typeParameters, true);
            descriptorRendererImpl.t(propertyDescriptor, sb6);
        }
        descriptorRendererImpl.o(propertyDescriptor, sb6, true);
        sb6.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb6.append(descriptorRendererImpl.renderType(type));
        descriptorRendererImpl.u(propertyDescriptor, sb6);
        if (descriptorRendererImpl.getIncludePropertyConstant() && (constantValueMo3788getCompileTimeInitializer = propertyDescriptor.mo3788getCompileTimeInitializer()) != null && (strE = descriptorRendererImpl.e(constantValueMo3788getCompileTimeInitializer)) != null) {
            sb6.append(" = ");
            sb6.append(descriptorRendererImpl.a(strE));
        }
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        descriptorRendererImpl.D(sb6, typeParameters2);
    }

    public static final void access$renderTypeAlias(DescriptorRendererImpl descriptorRendererImpl, TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb6) {
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.c(sb6, typeAliasDescriptor, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        descriptorRendererImpl.C(visibility, sb6);
        descriptorRendererImpl.l(typeAliasDescriptor, sb6);
        sb6.append(descriptorRendererImpl.j("typealias"));
        sb6.append(" ");
        descriptorRendererImpl.o(typeAliasDescriptor, sb6, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        descriptorRendererImpl.y(sb6, declaredTypeParameters, false);
        descriptorRendererImpl.d(typeAliasDescriptor, sb6);
        sb6.append(" = ");
        sb6.append(descriptorRendererImpl.renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    public static Modality b(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (memberDescriptor instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            if (!overriddenDescriptors.isEmpty() && classDescriptor.getModality() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.f(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
                return Modality.FINAL;
            }
            Modality modality = callableMemberDescriptor.getModality();
            Modality modality2 = Modality.ABSTRACT;
            return modality == modality2 ? modality2 : Modality.OPEN;
        }
        return Modality.FINAL;
    }

    public static void v(StringBuilder sb6) {
        int length = sb6.length();
        if (length == 0 || sb6.charAt(length - 1) != ' ') {
            sb6.append(p.SPACE_CHAR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.A(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, boolean, java.lang.StringBuilder, boolean):void");
    }

    public final void B(Collection collection, boolean z, StringBuilder sb6) {
        int i = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        boolean z3 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z) {
            }
            z3 = false;
        }
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb6);
        Iterator it8 = collection.iterator();
        int i2 = 0;
        while (it8.hasNext()) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it8.next();
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i2, size, sb6);
            A(valueParameterDescriptor, z3, sb6, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i2, size, sb6);
            i2++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb6);
    }

    public final boolean C(DescriptorVisibility descriptorVisibility, StringBuilder sb6) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.f(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb6.append(j(descriptorVisibility.getInternalDisplayName()));
        sb6.append(" ");
        return true;
    }

    public final void D(StringBuilder sb6, List list) throws IOException {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it8.next();
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (KotlinType kotlinType : d0.V(upperBounds, 1)) {
                StringBuilder sb9 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb9.append(renderName(name, false));
                sb9.append(" : ");
                Intrinsics.h(kotlinType);
                sb9.append(renderType(kotlinType));
                arrayList.add(sb9.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb6.append(" ");
        sb6.append(j("where"));
        sb6.append(" ");
        d0.j0(arrayList, sb6, ", ", null, null, null, 124);
    }

    public final String a(String str) {
        return getTextFormat().escape(str);
    }

    public final void c(StringBuilder sb6, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!d0.T(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !Intrinsics.f(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName) && (annotationFilter == null || ((Boolean) annotationFilter.invoke(annotationDescriptor)).booleanValue())) {
                    sb6.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb6.append('\n');
                    } else {
                        sb6.append(" ");
                    }
                }
            }
        }
    }

    public final void d(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb6) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb6.append(" /*captured type parameters: ");
            x(sb6, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb6.append("*/");
        }
    }

    public final String e(ConstantValue constantValue) {
        Function1<ConstantValue<?>, String> propertyConstantRenderer = this.f187538a.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return (String) propertyConstantRenderer.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it8 = value.iterator();
            while (it8.hasNext()) {
                String strE = e((ConstantValue) it8.next());
                if (strE != null) {
                    arrayList.add(strE);
                }
            }
            return d0.k0(arrayList, ", ", "{", "}", 0, null, 56);
        }
        if (constantValue instanceof AnnotationValue) {
            return kotlin.text.d0.e0(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value2).getType() + "::class";
        }
        if (!(value2 instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
        String strAsString = normalClass.getClassId().asSingleFqName().asString();
        int arrayDimensions = normalClass.getArrayDimensions();
        for (int i = 0; i < arrayDimensions; i++) {
            strAsString = a.l('>', "kotlin.Array<", strAsString);
        }
        return a0.d.r(strAsString, "::class");
    }

    public final void f(StringBuilder sb6, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb6.append("context(");
        Iterator it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            int i2 = i + 1;
            ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) it8.next();
            c(sb6, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb6.append(i(type));
            if (i == v.j(list)) {
                sb6.append(") ");
            } else {
                sb6.append(", ");
            }
            i = i2;
        }
    }

    public final void g(StringBuilder sb6, SimpleType simpleType) {
        c(sb6, simpleType, null);
        DefinitelyNotNullType definitelyNotNullType = simpleType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) simpleType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(simpleType)) {
            if (TypeUtilsKt.isUnresolvedType(simpleType) && getPresentableUnresolvedTypes()) {
                sb6.append(h(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(simpleType)));
            } else {
                if (!(simpleType instanceof ErrorType) || getInformativeErrorType()) {
                    sb6.append(simpleType.getConstructor().toString());
                } else {
                    sb6.append(((ErrorType) simpleType).getDebugMessage());
                }
                sb6.append(renderTypeArguments(simpleType.getArguments()));
            }
        } else if (simpleType instanceof StubTypeForBuilderInference) {
            sb6.append(((StubTypeForBuilderInference) simpleType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb6.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            TypeConstructor constructor = simpleType.getConstructor();
            PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(simpleType);
            if (possiblyInnerTypeBuildPossiblyInnerType == null) {
                sb6.append(renderTypeConstructor(constructor));
                sb6.append(renderTypeArguments(simpleType.getArguments()));
            } else {
                s(sb6, possiblyInnerTypeBuildPossiblyInnerType);
            }
            Unit unit = Unit.f186387a;
        }
        if (simpleType.isMarkedNullable()) {
            sb6.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(simpleType)) {
            sb6.append(" & Any");
        }
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.f187538a.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.f187538a.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.f187538a.getAnnotationArgumentsRenderingPolicy();
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.f187538a.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.f187538a.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.f187538a.getClassWithPrimaryConstructor();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.f187538a.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.f187538a.getDebugMode();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.f187538a.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.f187538a.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.f187538a.getEnhancedTypes();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return this.f187538a.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.f187538a.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.f187538a.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.f187538a.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.f187538a.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.f187538a.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.f187538a.getInformativeErrorType();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return this.f187538a.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.f187538a.getNormalizedVisibilities();
    }

    @NotNull
    public final DescriptorRendererOptionsImpl getOptions() {
        return this.f187538a;
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.f187538a.getOverrideRenderingPolicy();
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.f187538a.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.f187538a.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.f187538a.getPresentableUnresolvedTypes();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.f187538a.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.f187538a.getReceiverAfterName();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return this.f187538a.getRenderAbbreviatedTypeComments();
    }

    public boolean getRenderCompanionObjectName() {
        return this.f187538a.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.f187538a.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.f187538a.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.f187538a.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.f187538a.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.f187538a.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.f187538a.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.f187538a.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.f187538a.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.f187538a.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.f187538a.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.f187538a.getStartFromName();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return this.f187538a.getTextFormat();
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.f187538a.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.f187538a.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.f187538a.getUnitReturnType();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.f187538a.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.f187538a.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.f187538a.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.f187538a.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.f187538a.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.f187538a.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.f187538a.getWithoutTypeParameters();
    }

    public final String h(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return a.p("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String i(KotlinType kotlinType) {
        String strRenderType = renderType(kotlinType);
        return ((!E(kotlinType) || TypeUtils.isNullableType(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) ? strRenderType : a.l(CoreConstants.RIGHT_PARENTHESIS_CHAR, "(", strRenderType);
    }

    public final String j(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!getBoldOnlyForNamesInHtml()) {
                return a.p("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void k(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb6) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb6.append("/*");
            sb6.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb6.append("*/ ");
        }
    }

    public final void l(MemberDescriptor memberDescriptor, StringBuilder sb6) {
        n(sb6, memberDescriptor.isExternal(), "external");
        boolean z = false;
        n(sb6, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            z = true;
        }
        n(sb6, z, "actual");
    }

    public final void m(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb6) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && !callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            return;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Intrinsics.checkNotNullExpressionValue(modality, "getModality(...)");
        Modality modalityB = b(callableMemberDescriptor);
        if (getRenderDefaultModality() || modality != modalityB) {
            n(sb6, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
        }
    }

    public final void n(StringBuilder sb6, boolean z, String str) {
        if (z) {
            sb6.append(j(str));
            sb6.append(" ");
        }
    }

    public final void o(DeclarationDescriptor declarationDescriptor, StringBuilder sb6, boolean z) {
        Name name = declarationDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb6.append(renderName(name, z));
    }

    public final void p(StringBuilder sb6, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        AbbreviatedType abbreviatedType = unwrappedTypeUnwrap instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeUnwrap : null;
        if (abbreviatedType == null) {
            q(sb6, kotlinType);
            return;
        }
        if (getRenderTypeExpansions()) {
            q(sb6, abbreviatedType.getExpandedType());
            if (getRenderAbbreviatedTypeComments()) {
                RenderingFormat textFormat = getTextFormat();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (textFormat == renderingFormat) {
                    sb6.append("<font color=\"808080\"><i>");
                }
                sb6.append(" /* ");
                sb6.append("from: ");
                q(sb6, abbreviatedType.getAbbreviation());
                sb6.append(" */");
                if (getTextFormat() == renderingFormat) {
                    sb6.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        q(sb6, abbreviatedType.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            RenderingFormat textFormat2 = getTextFormat();
            RenderingFormat renderingFormat2 = RenderingFormat.HTML;
            if (textFormat2 == renderingFormat2) {
                sb6.append("<font color=\"808080\"><i>");
            }
            sb6.append(" /* ");
            sb6.append("= ");
            q(sb6, abbreviatedType.getExpandedType());
            sb6.append(" */");
            if (getTextFormat() == renderingFormat2) {
                sb6.append("</i></font>");
            }
        }
    }

    public final void q(StringBuilder sb6, KotlinType kotlinType) {
        Name nameExtractParameterNameFromFunctionTypeArgument;
        String strA;
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb6.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            sb6.append(((FlexibleType) unwrappedTypeUnwrap).render(this, this));
            return;
        }
        if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
            throw new NoWhenBranchMatchedException();
        }
        SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
        if (simpleType.equals(TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb6.append("???");
            return;
        }
        if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
            if (!getUninferredTypeParameterAsName()) {
                sb6.append("???");
                return;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            Intrinsics.i(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb6.append(h(((ErrorTypeConstructor) constructor).getParam(0)));
            return;
        }
        if (KotlinTypeKt.isError(simpleType)) {
            g(sb6, simpleType);
            return;
        }
        if (!E(simpleType)) {
            g(sb6, simpleType);
            return;
        }
        int length = sb6.length();
        ((DescriptorRendererImpl) this.f187539b.getValue()).c(sb6, simpleType, null);
        boolean z = sb6.length() != length;
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
        boolean zIsSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(simpleType);
        boolean zIsMarkedNullable = simpleType.isMarkedNullable();
        boolean z3 = zIsMarkedNullable || (z && receiverTypeFromFunctionType != null);
        if (z3) {
            if (zIsSuspendFunctionType) {
                sb6.insert(length, CoreConstants.LEFT_PARENTHESIS_CHAR);
            } else {
                if (z) {
                    CharsKt.e(f0.S0(sb6));
                    if (sb6.charAt(kotlin.text.d0.P(sb6) - 1) != ')') {
                        sb6.insert(kotlin.text.d0.P(sb6), "()");
                    }
                }
                sb6.append("(");
            }
        }
        n(sb6, zIsSuspendFunctionType, "suspend");
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb6.append("context(");
            Iterator<KotlinType> it8 = contextReceiverTypesFromFunctionType.subList(0, v.j(contextReceiverTypesFromFunctionType)).iterator();
            while (it8.hasNext()) {
                p(sb6, it8.next());
                sb6.append(", ");
            }
            p(sb6, (KotlinType) d0.m0(contextReceiverTypesFromFunctionType));
            sb6.append(") ");
        }
        if (receiverTypeFromFunctionType != null) {
            boolean z4 = (E(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || FunctionTypesKt.isSuspendFunctionType(receiverTypeFromFunctionType) || !receiverTypeFromFunctionType.getAnnotations().isEmpty() || (receiverTypeFromFunctionType instanceof DefinitelyNotNullType);
            if (z4) {
                sb6.append("(");
            }
            p(sb6, receiverTypeFromFunctionType);
            if (z4) {
                sb6.append(")");
            }
            sb6.append(".");
        }
        sb6.append("(");
        if (!FunctionTypesKt.isBuiltinExtensionFunctionalType(simpleType) || simpleType.getArguments().size() > 1) {
            int i = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb6.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    nameExtractParameterNameFromFunctionTypeArgument = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    nameExtractParameterNameFromFunctionTypeArgument = null;
                }
                if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                    sb6.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                    sb6.append(": ");
                }
                sb6.append(renderTypeProjection(typeProjection));
                i = i2;
            }
        } else {
            sb6.append("???");
        }
        sb6.append(") ");
        int i3 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i3 == 1) {
            strA = a("->");
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strA = "&rarr;";
        }
        sb6.append(strA);
        sb6.append(" ");
        p(sb6, FunctionTypesKt.getReturnTypeFromFunctionType(simpleType));
        if (z3) {
            sb6.append(")");
        }
        if (zIsMarkedNullable) {
            sb6.append("?");
        }
    }

    public final void r(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb6) {
        if (!getModifiers().contains(DescriptorRendererModifier.OVERRIDE) || callableMemberDescriptor.getOverriddenDescriptors().isEmpty() || getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OPEN) {
            return;
        }
        n(sb6, true, "override");
        if (getVerbose()) {
            sb6.append("/*");
            sb6.append(callableMemberDescriptor.getOverriddenDescriptors().size());
            sb6.append("*/ ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String render(@NotNull DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb6 = new StringBuilder();
        declarationDescriptor.accept(new e(this, 11), sb6);
        if (getWithDefinedIn() && !(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor) && (containingDeclaration = declarationDescriptor.getContainingDeclaration()) != null && !(containingDeclaration instanceof ModuleDescriptor)) {
            sb6.append(" ");
            sb6.append(renderMessage("defined in"));
            sb6.append(" ");
            FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
            Intrinsics.checkNotNullExpressionValue(fqName, "getFqName(...)");
            sb6.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
            if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
                sb6.append(" ");
                sb6.append(renderMessage("in file"));
                sb6.append(" ");
                sb6.append(name);
            }
        }
        return sb6.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderAnnotation(@NotNull AnnotationDescriptor annotation, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        ClassConstructorDescriptor classConstructorDescriptorMo3786getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb6 = new StringBuilder();
        sb6.append('@');
        if (annotationUseSiteTarget != null) {
            sb6.append(annotationUseSiteTarget.getRenderName() + CoreConstants.COLON_CHAR);
        }
        KotlinType type = annotation.getType();
        sb6.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            Map<Name, ConstantValue<?>> allValueArguments = annotation.getAllValueArguments();
            List list = null;
            ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotation) : null;
            if (annotationClass != null && (classConstructorDescriptorMo3786getUnsubstitutedPrimaryConstructor = annotationClass.mo3786getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo3786getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : valueParameters) {
                    if (((ValueParameterDescriptor) obj2).declaresDefaultValue()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((ValueParameterDescriptor) it8.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = zhm.f0.f322471a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (!allValueArguments.containsKey((Name) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((Name) it9.next()).asString() + " = ...");
            }
            Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
            ArrayList arrayList5 = new ArrayList(w.t(setEntrySet, 10));
            Iterator<T> it10 = setEntrySet.iterator();
            while (it10.hasNext()) {
                Map.Entry entry = (Map.Entry) it10.next();
                Name name = (Name) entry.getKey();
                ConstantValue constantValue = (ConstantValue) entry.getValue();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(name.asString());
                sb9.append(" = ");
                sb9.append(!list.contains(name) ? e(constantValue) : "...");
                arrayList5.add(sb9.toString());
            }
            List listO0 = d0.O0(d0.E0(arrayList5, arrayList4));
            if (getIncludeEmptyAnnotationArguments() || !listO0.isEmpty()) {
                d0.j0(listO0, sb6, ", ", "(", ")", null, 112);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo3795getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb6.append(" /* annotation class not found */");
        }
        return sb6.toString();
    }

    @NotNull
    public String renderClassifierName(@NotNull ClassifierDescriptor klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return ErrorUtils.isError(klass) ? klass.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(klass, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFlexibleType(@NotNull String lowerRendered, @NotNull String upperRendered, @NotNull KotlinBuiltIns builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(lowerRendered, upperRendered)) {
            if (a0.H(upperRendered, "(", false)) {
                return a.p("(", lowerRendered, ")!");
            }
            return lowerRendered + '!';
        }
        String strRenderFlexibleMutabilityOrArrayElementVarianceType = RenderingUtilsKt.renderFlexibleMutabilityOrArrayElementVarianceType(lowerRendered, upperRendered, new b(this, builtIns, 0), new b(this, builtIns, 1), new f(this));
        if (strRenderFlexibleMutabilityOrArrayElementVarianceType != null) {
            return strRenderFlexibleMutabilityOrArrayElementVarianceType;
        }
        return "(" + lowerRendered + ".." + upperRendered + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFqName(@NotNull FqNameUnsafe fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return a(RenderingUtilsKt.renderFqName(fqName.pathSegments()));
    }

    @NotNull
    public String renderMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return message;
        }
        if (i == 2) {
            return a.p("<i>", message, "</i>");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderName(@NotNull Name name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = a(RenderingUtilsKt.render(name));
        return (getBoldOnlyForNamesInHtml() && getTextFormat() == RenderingFormat.HTML && z) ? a.p("<b>", strA, "</b>") : strA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderType(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb6 = new StringBuilder();
        p(sb6, (KotlinType) getTypeNormalizer().invoke(type));
        return sb6.toString();
    }

    @NotNull
    public String renderTypeArguments(@NotNull List<? extends TypeProjection> typeArguments) throws IOException {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(a("<"));
        d0.j0(typeArguments, sb6, ", ", null, null, new c(this, 0), 60);
        sb6.append(a(">"));
        return sb6.toString();
    }

    @NotNull
    public String renderTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = typeConstructor.mo3795getDeclarationDescriptor();
        if ((classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeParameterDescriptor) || (classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor) || (classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            return renderClassifierName(classifierDescriptorMo3795getDeclarationDescriptor);
        }
        if (classifierDescriptorMo3795getDeclarationDescriptor == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(wjm.a.f298158m) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + classifierDescriptorMo3795getDeclarationDescriptor.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderTypeProjection(@NotNull TypeProjection typeProjection) throws IOException {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb6 = new StringBuilder();
        d0.j0(u.c(typeProjection), sb6, ", ", null, null, new c(this, 0), 60);
        return sb6.toString();
    }

    public final void s(StringBuilder sb6, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            s(sb6, outerType);
            sb6.append(CoreConstants.DOT);
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb6.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
            sb6.append(renderTypeConstructor(typeConstructor));
        }
        sb6.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f187538a.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        this.f187538a.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.f187538a.setDebugMode(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f187538a.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f187538a.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.f187538a.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.f187538a.setReceiverAfterName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.f187538a.setRenderCompanionObjectName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.f187538a.setStartFromName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.f187538a.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.f187538a.setVerbose(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.f187538a.setWithDefinedIn(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.f187538a.setWithoutSuperTypes(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.f187538a.setWithoutTypeParameters(z);
    }

    public final void t(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb6) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            c(sb6, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb6.append(i(type));
            sb6.append(".");
        }
    }

    public final void u(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb6) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter()) != null) {
            sb6.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb6.append(renderType(type));
        }
    }

    public final void w(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb6, boolean z) {
        if (z) {
            sb6.append(a("<"));
        }
        if (getVerbose()) {
            sb6.append("/*");
            sb6.append(typeParameterDescriptor.getIndex());
            sb6.append("*/ ");
        }
        n(sb6, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z3 = true;
        n(sb6, label.length() > 0, label);
        c(sb6, typeParameterDescriptor, null);
        o(typeParameterDescriptor, sb6, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb6.append(" : ");
                Intrinsics.h(next);
                sb6.append(renderType(next));
            }
        } else if (z) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z3) {
                        sb6.append(" : ");
                    } else {
                        sb6.append(" & ");
                    }
                    Intrinsics.h(kotlinType);
                    sb6.append(renderType(kotlinType));
                    z3 = false;
                }
            }
        }
        if (z) {
            sb6.append(a(">"));
        }
    }

    public final void x(StringBuilder sb6, List list) {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            w((TypeParameterDescriptor) it8.next(), sb6, false);
            if (it8.hasNext()) {
                sb6.append(", ");
            }
        }
    }

    public final void y(StringBuilder sb6, List list, boolean z) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb6.append(a("<"));
        x(sb6, list);
        sb6.append(a(">"));
        if (z) {
            sb6.append(" ");
        }
    }

    public final void z(VariableDescriptor variableDescriptor, StringBuilder sb6, boolean z) {
        if (z || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb6.append(j(variableDescriptor.isVar() ? "var" : "val"));
            sb6.append(" ");
        }
    }
}
