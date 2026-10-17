package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaResolverComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StorageManager f186930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaClassFinder f186931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinClassFinder f186932c;
    public final DeserializedDescriptorResolver d;
    public final SignaturePropagator e;
    public final ErrorReporter f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JavaResolverCache f186933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JavaPropertyInitializerEvaluator f186934h;
    public final SamConversionResolver i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JavaSourceElementFactory f186935j;
    public final ModuleClassResolver k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PackagePartProvider f186936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SupertypeLoopChecker f186937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LookupTracker f186938n;
    public final ModuleDescriptor o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReflectionTypes f186939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnnotationTypeQualifierResolver f186940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SignatureEnhancement f186941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final JavaClassesTracker f186942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final JavaResolverSettings f186943t;
    public final NewKotlinTypeChecker u;
    public final JavaTypeEnhancementState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final JavaModuleAnnotationsProvider f186944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SyntheticJavaPartsProvider f186945x;

    public JavaResolverComponents(@NotNull StorageManager storageManager, @NotNull JavaClassFinder finder, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull SignaturePropagator signaturePropagator, @NotNull ErrorReporter errorReporter, @NotNull JavaResolverCache javaResolverCache, @NotNull JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, @NotNull SamConversionResolver samConversionResolver, @NotNull JavaSourceElementFactory sourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull LookupTracker lookupTracker, @NotNull ModuleDescriptor module, @NotNull ReflectionTypes reflectionTypes, @NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull SignatureEnhancement signatureEnhancement, @NotNull JavaClassesTracker javaClassesTracker, @NotNull JavaResolverSettings settings, @NotNull NewKotlinTypeChecker kotlinTypeChecker, @NotNull JavaTypeEnhancementState javaTypeEnhancementState, @NotNull JavaModuleAnnotationsProvider javaModuleResolver, @NotNull SyntheticJavaPartsProvider syntheticPartsProvider) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(signaturePropagator, "signaturePropagator");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        Intrinsics.checkNotNullParameter(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(sourceElementFactory, "sourceElementFactory");
        Intrinsics.checkNotNullParameter(moduleClassResolver, "moduleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        Intrinsics.checkNotNullParameter(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(reflectionTypes, "reflectionTypes");
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(signatureEnhancement, "signatureEnhancement");
        Intrinsics.checkNotNullParameter(javaClassesTracker, "javaClassesTracker");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaModuleResolver, "javaModuleResolver");
        Intrinsics.checkNotNullParameter(syntheticPartsProvider, "syntheticPartsProvider");
        this.f186930a = storageManager;
        this.f186931b = finder;
        this.f186932c = kotlinClassFinder;
        this.d = deserializedDescriptorResolver;
        this.e = signaturePropagator;
        this.f = errorReporter;
        this.f186933g = javaResolverCache;
        this.f186934h = javaPropertyInitializerEvaluator;
        this.i = samConversionResolver;
        this.f186935j = sourceElementFactory;
        this.k = moduleClassResolver;
        this.f186936l = packagePartProvider;
        this.f186937m = supertypeLoopChecker;
        this.f186938n = lookupTracker;
        this.o = module;
        this.f186939p = reflectionTypes;
        this.f186940q = annotationTypeQualifierResolver;
        this.f186941r = signatureEnhancement;
        this.f186942s = javaClassesTracker;
        this.f186943t = settings;
        this.u = kotlinTypeChecker;
        this.v = javaTypeEnhancementState;
        this.f186944w = javaModuleResolver;
        this.f186945x = syntheticPartsProvider;
    }

    @NotNull
    public final AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.f186940q;
    }

    @NotNull
    public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.d;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.f;
    }

    @NotNull
    public final JavaClassFinder getFinder() {
        return this.f186931b;
    }

    @NotNull
    public final JavaClassesTracker getJavaClassesTracker() {
        return this.f186942s;
    }

    @NotNull
    public final JavaModuleAnnotationsProvider getJavaModuleResolver() {
        return this.f186944w;
    }

    @NotNull
    public final JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.f186934h;
    }

    @NotNull
    public final JavaResolverCache getJavaResolverCache() {
        return this.f186933g;
    }

    @NotNull
    public final JavaTypeEnhancementState getJavaTypeEnhancementState() {
        return this.v;
    }

    @NotNull
    public final KotlinClassFinder getKotlinClassFinder() {
        return this.f186932c;
    }

    @NotNull
    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.u;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.f186938n;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.o;
    }

    @NotNull
    public final ModuleClassResolver getModuleClassResolver() {
        return this.k;
    }

    @NotNull
    public final PackagePartProvider getPackagePartProvider() {
        return this.f186936l;
    }

    @NotNull
    public final ReflectionTypes getReflectionTypes() {
        return this.f186939p;
    }

    @NotNull
    public final JavaResolverSettings getSettings() {
        return this.f186943t;
    }

    @NotNull
    public final SignatureEnhancement getSignatureEnhancement() {
        return this.f186941r;
    }

    @NotNull
    public final SignaturePropagator getSignaturePropagator() {
        return this.e;
    }

    @NotNull
    public final JavaSourceElementFactory getSourceElementFactory() {
        return this.f186935j;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f186930a;
    }

    @NotNull
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.f186937m;
    }

    @NotNull
    public final SyntheticJavaPartsProvider getSyntheticPartsProvider() {
        return this.f186945x;
    }

    @NotNull
    public final JavaResolverComponents replace(@NotNull JavaResolverCache javaResolverCache) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        return new JavaResolverComponents(this.f186930a, this.f186931b, this.f186932c, this.d, this.e, this.f, javaResolverCache, this.f186934h, this.i, this.f186935j, this.k, this.f186936l, this.f186937m, this.f186938n, this.o, this.f186939p, this.f186940q, this.f186941r, this.f186942s, this.f186943t, this.u, this.v, this.f186944w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i & 8388608) != 0 ? SyntheticJavaPartsProvider.Companion.getEMPTY() : syntheticJavaPartsProvider);
    }
}
