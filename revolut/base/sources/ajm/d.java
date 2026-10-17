package ajm;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import ch.qos.logback.core.CoreConstants;
import com.meshconnect.link.ui.LinkActivity;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.bouncycastle.asn1.eac.CertificateBody;
import yhm.m;
import zhm.a1;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5602b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f5601a = i;
        this.f5602b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r7v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? arrayList;
        Object objA;
        Map mapC;
        int i = this.f5601a;
        int iHashCode = 0;
        Object obj2 = this.f5602b;
        switch (i) {
            case 0:
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * CertificateBody.profileType);
                }
                return Integer.valueOf(iHashCode);
            case 1:
                ReflectionTypes.Companion companion = ReflectionTypes.Companion;
                return ((ModuleDescriptor) obj2).getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
            case 2:
                final GivenFunctionsMemberScope givenFunctionsMemberScope = (GivenFunctionsMemberScope) obj2;
                KProperty[] kPropertyArr = GivenFunctionsMemberScope.f187615c;
                List listA = givenFunctionsMemberScope.a();
                List list = listA;
                final ArrayList arrayList2 = new ArrayList(3);
                Collection<KotlinType> supertypes = givenFunctionsMemberScope.f187616a.getTypeConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = supertypes.iterator();
                while (it8.hasNext()) {
                    zhm.a0.x(ResolutionScope.DefaultImpls.getContributedDescriptors$default(((KotlinType) it8.next()).getMemberScope(), null, null, 3, null), arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (obj3 instanceof CallableMemberDescriptor) {
                        arrayList4.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList4) {
                    Name name = ((CallableMemberDescriptor) obj4).getName();
                    Object arrayList5 = linkedHashMap.get(name);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(name, arrayList5);
                    }
                    ((List) arrayList5).add(obj4);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                    Name name2 = (Name) key;
                    List list2 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj5 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj5) instanceof FunctionDescriptor);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj5);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list3 = (List) entry3.getValue();
                        OverridingUtil overridingUtil = OverridingUtil.DEFAULT;
                        List list4 = list3;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj6 : listA) {
                                if (Intrinsics.f(((FunctionDescriptor) obj6).getName(), name2)) {
                                    arrayList.add(obj6);
                                }
                            }
                        } else {
                            arrayList = zhm.f0.f322471a;
                        }
                        overridingUtil.generateOverridesInFunctionGroup(name2, list4, (Collection) arrayList, givenFunctionsMemberScope.f187616a, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                            public final void a(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                                Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                                Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                                throw new IllegalStateException(("Conflict in scope of " + givenFunctionsMemberScope.f187616a + ": " + fromSuper + " vs " + fromCurrent).toString());
                            }

                            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                            public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                                Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                                OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                                arrayList2.add(fakeOverride);
                            }
                        });
                    }
                }
                return zhm.d0.E0(CollectionsKt.compact(arrayList2), list);
            case 3:
                return ((TypeSubstitutor) obj2).getSubstitution().buildSubstitutor();
            case 4:
                SubstitutingScope substitutingScope = (SubstitutingScope) obj2;
                return substitutingScope.a(ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.f187626a, null, null, 3, null));
            case 5:
                JvmBuiltIns jvmBuiltIns = (JvmBuiltIns) obj2;
                Function0 function0 = jvmBuiltIns.f;
                if (function0 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) function0.invoke();
                jvmBuiltIns.f = null;
                return settings;
            case 6:
                Collection<ClassId> allClassIds = ((DeserializedPackageFragmentImpl) obj2).getClassDataFinder().getAllClassIds();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : allClassIds) {
                    ClassId classId = (ClassId) obj7;
                    if (!classId.isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                        arrayList7.add(obj7);
                    }
                }
                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                Iterator it9 = arrayList7.iterator();
                while (it9.hasNext()) {
                    arrayList8.add(((ClassId) it9.next()).getShortClassName());
                }
                return arrayList8;
            case 7:
                ScopesHolderForClass scopesHolderForClass = (ScopesHolderForClass) obj2;
                return (MemberScope) scopesHolderForClass.f186541b.invoke(scopesHolderForClass.f186542c);
            case 8:
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = (BuiltInAnnotationDescriptor) obj2;
                return builtInAnnotationDescriptor.f186556a.getBuiltInClassByFqName(builtInAnnotationDescriptor.getFqName()).getDefaultType();
            case 9:
                return (ArrayList) obj2;
            case 10:
                HashSet hashSet = new HashSet();
                DeserializedClassDescriptor deserializedClassDescriptor = ((ekm.e) obj2).d;
                Iterator<KotlinType> it10 = deserializedClassDescriptor.getTypeConstructor().getSupertypes().iterator();
                while (it10.hasNext()) {
                    for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(it10.next().getMemberScope(), null, null, 3, null)) {
                        if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                            hashSet.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                        }
                    }
                }
                List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
                Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
                Iterator it11 = functionList.iterator();
                while (it11.hasNext()) {
                    hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it11.next()).getName()));
                }
                List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
                Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
                Iterator it12 = propertyList.iterator();
                while (it12.hasNext()) {
                    hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Property) it12.next()).getName()));
                }
                return a1.l(hashSet, hashSet);
            case 11:
                DeserializedMemberScope deserializedMemberScope = (DeserializedMemberScope) obj2;
                KProperty[] kPropertyArr2 = DeserializedMemberScope.e;
                Set setF = deserializedMemberScope.f();
                if (setF == null) {
                    return null;
                }
                return a1.l(a1.l(deserializedMemberScope.getClassNames$deserialization(), deserializedMemberScope.f187725b.b()), setF);
            case 12:
                DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = (DeserializedTypeParameterDescriptor) obj2;
                return zhm.d0.d1(deserializedTypeParameterDescriptor.k.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(deserializedTypeParameterDescriptor.f187739l, deserializedTypeParameterDescriptor.k.getNameResolver()));
            case 13:
                KProperty[] kPropertyArr3 = AbstractTypeAliasDescriptor.f186567j;
                return ((AbstractTypeAliasDescriptor) obj2).getTypeAliasConstructors();
            case 14:
                StringBuilder sb6 = new StringBuilder("Scope for type parameter ");
                fjm.c cVar = (fjm.c) obj2;
                sb6.append(cVar.f135684a.asString());
                return TypeIntersectionScope.create(sb6.toString(), cVar.f135685b.getUpperBounds());
            case 15:
                fjm.g gVar = (fjm.g) obj2;
                gVar.getClass();
                HashSet hashSet2 = new HashSet();
                for (Name name3 : (Set) gVar.d.f186584j.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet2.addAll(gVar.getContributedFunctions(name3, noLookupLocation));
                    hashSet2.addAll(gVar.getContributedVariables(name3, noLookupLocation));
                }
                return hashSet2;
            case 16:
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj2;
                ModuleDependencies moduleDependencies = moduleDescriptorImpl.f186628g;
                if (moduleDependencies == null) {
                    StringBuilder sb9 = new StringBuilder("Dependencies of module ");
                    String string = moduleDescriptorImpl.getName().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb9.append(string);
                    sb9.append(" were not set before querying module content");
                    throw new AssertionError(sb9.toString());
                }
                List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
                moduleDescriptorImpl.assertValid();
                allDependencies.contains(moduleDescriptorImpl);
                List<ModuleDescriptorImpl> list5 = allDependencies;
                Iterator it13 = list5.iterator();
                while (it13.hasNext()) {
                    ((ModuleDescriptorImpl) it13.next()).getClass();
                }
                ArrayList arrayList9 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it14 = list5.iterator();
                while (it14.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it14.next()).f186629h;
                    Intrinsics.h(packageFragmentProvider);
                    arrayList9.add(packageFragmentProvider);
                }
                return new CompositePackageFragmentProvider(arrayList9, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
            case 17:
                int i2 = ValueParameterDescriptorImpl.WithDestructuringDeclaration.f186672m;
                return ((ValueParameterDescriptorImpl.WithDestructuringDeclaration) obj2).getDestructuringVariables();
            case 18:
                return new gkm.e(((AbstractTypeConstructor) obj2).b());
            case 19:
                return StarProjectionImplKt.starProjectionType(((StarProjectionImpl) obj2).f187790a);
            case 20:
                TypeParameterUpperBoundEraser.Companion companion2 = TypeParameterUpperBoundEraser.Companion;
                return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, ((TypeParameterUpperBoundEraser) obj2).toString());
            case 21:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) obj2;
                try {
                    m.Companion companion3 = yhm.m.INSTANCE;
                } catch (Throwable th10) {
                    m.Companion companion4 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (!aVar.q2().d()) {
                    throw new IllegalStateException("Modal environment expected");
                }
                objA = Unit.f186387a;
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    new Handler(Looper.getMainLooper()).post(new ag.q(thA, 25));
                }
                return Unit.f186387a;
            case 22:
                Function0 function02 = ((NewCapturedTypeConstructor) obj2).f187827b;
                if (function02 != null) {
                    return (List) function02.invoke();
                }
                return null;
            case 23:
                Jsr305Settings jsr305Settings = (Jsr305Settings) obj2;
                aim.e eVarB = zhm.u.b();
                eVarB.add(jsr305Settings.f186885a.getDescription());
                ReportLevel reportLevel = jsr305Settings.f186886b;
                if (reportLevel != null) {
                    eVarB.add("under-migration:" + reportLevel.getDescription());
                }
                for (Map.Entry entry4 : jsr305Settings.f186887c.entrySet()) {
                    eVarB.add("@" + entry4.getKey() + CoreConstants.COLON_CHAR + ((ReportLevel) entry4.getValue()).getDescription());
                }
                return (String[]) zhm.u.a(eVarB).toArray(new String[0]);
            case 24:
                KProperty[] kPropertyArr4 = JavaRetentionAnnotationDescriptor.f186923h;
                ConstantValue<?> constantValueMapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(((JavaRetentionAnnotationDescriptor) obj2).d);
                mapC = constantValueMapJavaRetentionArgument$descriptors_jvm != null ? q0.c(new Pair(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), constantValueMapJavaRetentionArgument$descriptors_jvm)) : null;
                return mapC == null ? r0.g() : mapC;
            case 25:
                KProperty[] kPropertyArr5 = JavaTargetAnnotationDescriptor.f186925h;
                JavaAnnotationArgument javaAnnotationArgument = ((JavaTargetAnnotationDescriptor) obj2).d;
                ConstantValue<?> constantValueMapJavaTargetArguments$descriptors_jvm = javaAnnotationArgument instanceof JavaArrayAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) javaAnnotationArgument).getElements()) : javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(zhm.u.c(javaAnnotationArgument)) : null;
                mapC = constantValueMapJavaTargetArguments$descriptors_jvm != null ? q0.c(new Pair(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValueMapJavaTargetArguments$descriptors_jvm)) : null;
                return mapC == null ? r0.g() : mapC;
            case 26:
                LayoutInflater layoutInflater = ((LinkActivity) obj2).getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                View viewInflate = layoutInflater.inflate(R.layout.link_activity, (ViewGroup) null, false);
                int i3 = R.id.back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.back);
                if (imageView != null) {
                    i3 = R.id.close;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.close);
                    if (imageView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i3 = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.progress);
                        if (progressBar != null) {
                            i3 = R.id.toolbar;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
                            if (constraintLayout2 != null) {
                                i3 = R.id.web_view;
                                WebView webView = (WebView) ViewBindings.findChildViewById(viewInflate, R.id.web_view);
                                if (webView != null) {
                                    i3 = R.id.web_view2;
                                    WebView webView2 = (WebView) ViewBindings.findChildViewById(viewInflate, R.id.web_view2);
                                    if (webView2 != null) {
                                        i3 = R.id.web_view_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.web_view_container);
                                        if (frameLayout != null) {
                                            return new mk.a(constraintLayout, imageView, imageView2, progressBar, constraintLayout2, webView, webView2, frameLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
            case 27:
                JvmPackageScope jvmPackageScope = (JvmPackageScope) obj2;
                Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.f186962b.getBinaryClasses$descriptors_jvm().values();
                ArrayList arrayList10 = new ArrayList();
                Iterator it15 = collectionValues.iterator();
                while (it15.hasNext()) {
                    MemberScope memberScopeCreateKotlinPackagePartScope = jvmPackageScope.f186961a.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(jvmPackageScope.f186962b, (KotlinJvmBinaryClass) it15.next());
                    if (memberScopeCreateKotlinPackagePartScope != null) {
                        arrayList10.add(memberScopeCreateKotlinPackagePartScope);
                    }
                }
                return (MemberScope[]) ScopeUtilsKt.listOfNonEmptyScopes(arrayList10).toArray(new MemberScope[0]);
            case 28:
                int i5 = DescriptorRendererImpl.f187537c;
                DescriptorRenderer descriptorRendererWithOptions = ((DescriptorRendererImpl) obj2).withOptions(wjm.a.o);
                Intrinsics.i(descriptorRendererWithOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                return (DescriptorRendererImpl) descriptorRendererWithOptions;
            default:
                KotlinType type = ((TypeProjection) obj2).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return type;
        }
    }
}
