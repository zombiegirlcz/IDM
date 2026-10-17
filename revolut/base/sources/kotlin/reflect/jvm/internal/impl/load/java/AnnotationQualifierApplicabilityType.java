package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class AnnotationQualifierApplicabilityType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] $VALUES;
    public static final AnnotationQualifierApplicabilityType FIELD;
    public static final AnnotationQualifierApplicabilityType METHOD_RETURN_TYPE;
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER;
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER_BOUNDS;
    public static final AnnotationQualifierApplicabilityType TYPE_USE;
    public static final AnnotationQualifierApplicabilityType VALUE_PARAMETER;

    @NotNull
    private final String javaTarget;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
        METHOD_RETURN_TYPE = annotationQualifierApplicabilityType;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
        VALUE_PARAMETER = annotationQualifierApplicabilityType2;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
        FIELD = annotationQualifierApplicabilityType3;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType4 = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
        TYPE_USE = annotationQualifierApplicabilityType4;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType5 = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        TYPE_PARAMETER_BOUNDS = annotationQualifierApplicabilityType5;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType6 = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");
        TYPE_PARAMETER = annotationQualifierApplicabilityType6;
        AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArr = {annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, annotationQualifierApplicabilityType4, annotationQualifierApplicabilityType5, annotationQualifierApplicabilityType6};
        $VALUES = annotationQualifierApplicabilityTypeArr;
        $ENTRIES = s.n(annotationQualifierApplicabilityTypeArr);
    }

    public AnnotationQualifierApplicabilityType(String str, int i, String str2) {
        this.javaTarget = str2;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) $VALUES.clone();
    }

    @NotNull
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
