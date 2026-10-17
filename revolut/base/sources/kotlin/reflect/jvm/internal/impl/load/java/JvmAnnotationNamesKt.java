package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmAnnotationNamesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f186889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FqName f186890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FqName f186891c;
    public static final FqName d;
    public static final FqName e;
    public static final FqName f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FqName f186892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FqName f186893h;
    public static final FqName i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f186894j;
    public static final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set f186895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set f186896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set f186897n;
    public static final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f186898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final FqName f186899q;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f186889a = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        f186890b = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        f186891c = fqName8;
        d = new FqName("javax.annotation.meta.TypeQualifier");
        e = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        f186892g = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        f186893h = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        i = new FqName("javax.annotation.ParametersAreNullableByDefault");
        FqName[] elements = {fqName9, fqName11};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f186894j = d.y0(elements);
        FqName JETBRAINS_NOT_NULL_ANNOTATION = JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(JETBRAINS_NOT_NULL_ANNOTATION, "JETBRAINS_NOT_NULL_ANNOTATION");
        FqName[] elements2 = {JETBRAINS_NOT_NULL_ANNOTATION, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("android.support.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull"), new FqName("jakarta.annotation.Nonnull")};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Set setY0 = d.y0(elements2);
        k = setY0;
        FqName JETBRAINS_NULLABLE_ANNOTATION = JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(JETBRAINS_NULLABLE_ANNOTATION, "JETBRAINS_NULLABLE_ANNOTATION");
        FqName[] elements3 = {JETBRAINS_NULLABLE_ANNOTATION, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("android.support.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("jakarta.annotation.Nullable")};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set setY02 = d.y0(elements3);
        f186895l = setY02;
        FqName[] elements4 = {fqName3, fqName7};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        f186896m = d.y0(elements4);
        a1.m(a1.m(a1.m(a1.m(a1.l(a1.l(new LinkedHashSet(), setY0), setY02), fqName9), fqName2), fqName6), fqName8);
        FqName[] elements5 = {JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        f186897n = d.y0(elements5);
        FqName[] elements6 = {JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        o = d.y0(elements6);
        f186898p = r0.k(new Pair(JvmAnnotationNames.TARGET_ANNOTATION, StandardNames.FqNames.target), new Pair(JvmAnnotationNames.RETENTION_ANNOTATION, StandardNames.FqNames.retention), new Pair(JvmAnnotationNames.DEPRECATED_ANNOTATION, StandardNames.FqNames.deprecated), new Pair(JvmAnnotationNames.DOCUMENTED_ANNOTATION, StandardNames.FqNames.mustBeDocumented));
        f186899q = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    @NotNull
    public static final Set<FqName> getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS() {
        return f186894j;
    }

    @NotNull
    public static final Set<FqName> getFORCE_FLEXIBILITY_ANNOTATIONS() {
        return f186896m;
    }

    @NotNull
    public static final FqName getJAVAX_NONNULL_ANNOTATION_FQ_NAME() {
        return f186892g;
    }

    @NotNull
    public static final FqName getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return f186893h;
    }

    @NotNull
    public static final FqName getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return i;
    }

    @NotNull
    public static final FqName getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME() {
        return d;
    }

    @NotNull
    public static final FqName getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME() {
        return f;
    }

    @NotNull
    public static final FqName getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME() {
        return e;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return f186890b;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME() {
        return f186891c;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return f186889a;
    }

    @NotNull
    public static final Set<FqName> getMUTABLE_ANNOTATIONS() {
        return o;
    }

    @NotNull
    public static final Set<FqName> getNOT_NULL_ANNOTATIONS() {
        return k;
    }

    @NotNull
    public static final Set<FqName> getNULLABLE_ANNOTATIONS() {
        return f186895l;
    }

    @NotNull
    public static final Set<FqName> getREAD_ONLY_ANNOTATIONS() {
        return f186897n;
    }

    @NotNull
    public static final FqName getUNDER_MIGRATION_ANNOTATION_FQ_NAME() {
        return f186899q;
    }
}
