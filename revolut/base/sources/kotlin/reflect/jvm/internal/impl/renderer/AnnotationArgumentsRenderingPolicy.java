package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class AnnotationArgumentsRenderingPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] $VALUES;
    public static final AnnotationArgumentsRenderingPolicy ALWAYS_PARENTHESIZED;
    public static final AnnotationArgumentsRenderingPolicy NO_ARGUMENTS;
    public static final AnnotationArgumentsRenderingPolicy UNLESS_EMPTY;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    static {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, 3);
        NO_ARGUMENTS = annotationArgumentsRenderingPolicy;
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy2 = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, 2);
        UNLESS_EMPTY = annotationArgumentsRenderingPolicy2;
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy3 = new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);
        ALWAYS_PARENTHESIZED = annotationArgumentsRenderingPolicy3;
        AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArr = {annotationArgumentsRenderingPolicy, annotationArgumentsRenderingPolicy2, annotationArgumentsRenderingPolicy3};
        $VALUES = annotationArgumentsRenderingPolicyArr;
        $ENTRIES = s.n(annotationArgumentsRenderingPolicyArr);
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i, int i2) {
        this(str, i, (i2 & 1) == 0, false);
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    public AnnotationArgumentsRenderingPolicy(String str, int i, boolean z, boolean z3) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z3;
    }
}
