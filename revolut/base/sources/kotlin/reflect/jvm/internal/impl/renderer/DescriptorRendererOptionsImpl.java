package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.z;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import sim.c;
import v0.a;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    public static final /* synthetic */ KProperty[] Y;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 A;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 B;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 C;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 D;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 E;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 F;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 G;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 H;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 I;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 J;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 K;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 L;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 M;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 N;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 O;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 P;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 Q;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 R;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 S;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 T;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 U;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 V;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 W;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f187540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187541b = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187542c;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 d;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 e;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187544h;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187545j;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187548n;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187553t;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 u;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187555x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f187556y;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 z;

    static {
        z zVar = new z(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        p0 p0Var = o0.f186429a;
        Y = new KProperty[]{p0Var.f(zVar), a.s(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, p0Var), a.s(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0, p0Var)};
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f187542c = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.d = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.e = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187543g = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187544h = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.i = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187545j = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.k = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f187546l = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187547m = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187548n = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.o = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f187549p = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f187550q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187551r = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187552s = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187553t = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.u = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.v = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.f187554w = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187555x = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f187556y = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(wjm.a.f298160p, this);
        this.z = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(wjm.a.f298161q, this);
        this.A = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.B = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(OverrideRenderingPolicy.RENDER_OPEN, this);
        this.C = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE, this);
        this.D = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingFormat.PLAIN, this);
        this.E = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ParameterNameRenderingPolicy.ALL, this);
        this.F = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.G = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.H = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(PropertyAccessorRenderingPolicy.DEBUG, this);
        this.I = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.J = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.K = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(h0.f322473a, this);
        this.L = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve(), this);
        this.M = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.N = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.O = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.P = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.Q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.R = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.S = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.T = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.U = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.V = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.W = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.X = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
    }

    @NotNull
    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj2 = field.get(this);
                c cVar = obj2 instanceof c ? (c) obj2 : null;
                if (cVar != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    a0.H(name, "is", false);
                    KClass kClassB = o0.f186429a.b(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb6 = new StringBuilder("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb6.append(name3);
                    field.set(descriptorRendererOptionsImpl, new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(cVar.getValue(this, new kotlin.jvm.internal.h0(h.NO_RECEIVER, ((j) kClassB).getF186423a(), name2, sb6.toString(), 0)), descriptorRendererOptionsImpl));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) this.f187552s.getValue(this, Y[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.O.getValue(this, Y[39])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.N.getValue(this, Y[38]);
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return (Function1) this.M.getValue(this, Y[37]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) this.W.getValue(this, Y[48])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.i.getValue(this, Y[7])).booleanValue();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.f187541b.getValue(this, Y[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean) this.f187544h.getValue(this, Y[6])).booleanValue();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (Function1) this.z.getValue(this, Y[24]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) this.J.getValue(this, Y[34])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean) this.f187547m.getValue(this, Y[11])).booleanValue();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.K.getValue(this, Y[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.L.getValue(this, Y[36]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.T.getValue(this, Y[44])).booleanValue();
    }

    public /* bridge */ boolean getIncludeAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public /* bridge */ boolean getIncludeEmptyAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.u.getValue(this, Y[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean) this.X.getValue(this, Y[49])).booleanValue();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.e.getValue(this, Y[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.f187548n.getValue(this, Y[12])).booleanValue();
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.B.getValue(this, Y[26]);
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.E.getValue(this, Y[29]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.U.getValue(this, Y[45])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) this.V.getValue(this, Y[47])).booleanValue();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) this.H.getValue(this, Y[32]);
    }

    public Function1<ConstantValue<?>, String> getPropertyConstantRenderer() {
        return (Function1) this.v.getValue(this, Y[20]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.F.getValue(this, Y[30])).booleanValue();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return ((Boolean) this.S.getValue(this, Y[43])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.G.getValue(this, Y[31])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) this.f187550q.getValue(this, Y[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.P.getValue(this, Y[40])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.I.getValue(this, Y[33])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) this.f187549p.getValue(this, Y[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.o.getValue(this, Y[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) this.f187551r.getValue(this, Y[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) this.R.getValue(this, Y[42])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.Q.getValue(this, Y[41])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.A.getValue(this, Y[25])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.f187543g.getValue(this, Y[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.f.getValue(this, Y[4])).booleanValue();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.D.getValue(this, Y[28]);
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return (Function1) this.f187556y.getValue(this, Y[23]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.f187553t.getValue(this, Y[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.k.getValue(this, Y[9])).booleanValue();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (DescriptorRenderer.ValueParametersHandler) this.C.getValue(this, Y[27]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.f187545j.getValue(this, Y[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.f187542c.getValue(this, Y[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.d.getValue(this, Y[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.f187546l.getValue(this, Y[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.f187555x.getValue(this, Y[22])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.f187554w.getValue(this, Y[21])).booleanValue();
    }

    public final boolean isLocked() {
        return this.f187540a;
    }

    public final void lock() {
        this.f187540a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        this.N.setValue(this, Y[38], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        this.f187541b.setValue(this, Y[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.f187544h.setValue(this, Y[6], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.L.setValue(this, Y[36], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.e.setValue(this, Y[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.E.setValue(this, Y[29], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.F.setValue(this, Y[30], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.G.setValue(this, Y[31], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.f.setValue(this, Y[4], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.D.setValue(this, Y[28], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.f187545j.setValue(this, Y[8], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.f187542c.setValue(this, Y[1], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.f187555x.setValue(this, Y[22], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.f187554w.setValue(this, Y[21], Boolean.valueOf(z));
    }
}
