package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class AnnotationUseSiteTarget {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationUseSiteTarget[] $VALUES;
    public static final AnnotationUseSiteTarget ALL;
    public static final AnnotationUseSiteTarget CONSTRUCTOR_PARAMETER;
    public static final AnnotationUseSiteTarget FIELD;
    public static final AnnotationUseSiteTarget FILE;
    public static final AnnotationUseSiteTarget PROPERTY;
    public static final AnnotationUseSiteTarget PROPERTY_DELEGATE_FIELD;
    public static final AnnotationUseSiteTarget PROPERTY_GETTER;
    public static final AnnotationUseSiteTarget PROPERTY_SETTER;
    public static final AnnotationUseSiteTarget RECEIVER;
    public static final AnnotationUseSiteTarget SETTER_PARAMETER;

    @NotNull
    private final String renderName;

    static {
        AnnotationUseSiteTarget annotationUseSiteTarget = new AnnotationUseSiteTarget("ALL", 0, null);
        ALL = annotationUseSiteTarget;
        AnnotationUseSiteTarget annotationUseSiteTarget2 = new AnnotationUseSiteTarget("FIELD", 1, null);
        FIELD = annotationUseSiteTarget2;
        AnnotationUseSiteTarget annotationUseSiteTarget3 = new AnnotationUseSiteTarget("FILE", 2, null);
        FILE = annotationUseSiteTarget3;
        AnnotationUseSiteTarget annotationUseSiteTarget4 = new AnnotationUseSiteTarget("PROPERTY", 3, null);
        PROPERTY = annotationUseSiteTarget4;
        AnnotationUseSiteTarget annotationUseSiteTarget5 = new AnnotationUseSiteTarget("PROPERTY_GETTER", 4, "get");
        PROPERTY_GETTER = annotationUseSiteTarget5;
        AnnotationUseSiteTarget annotationUseSiteTarget6 = new AnnotationUseSiteTarget("PROPERTY_SETTER", 5, "set");
        PROPERTY_SETTER = annotationUseSiteTarget6;
        AnnotationUseSiteTarget annotationUseSiteTarget7 = new AnnotationUseSiteTarget("RECEIVER", 6, null);
        RECEIVER = annotationUseSiteTarget7;
        AnnotationUseSiteTarget annotationUseSiteTarget8 = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 7, "param");
        CONSTRUCTOR_PARAMETER = annotationUseSiteTarget8;
        AnnotationUseSiteTarget annotationUseSiteTarget9 = new AnnotationUseSiteTarget("SETTER_PARAMETER", 8, "setparam");
        SETTER_PARAMETER = annotationUseSiteTarget9;
        AnnotationUseSiteTarget annotationUseSiteTarget10 = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 9, "delegate");
        PROPERTY_DELEGATE_FIELD = annotationUseSiteTarget10;
        AnnotationUseSiteTarget[] annotationUseSiteTargetArr = {annotationUseSiteTarget, annotationUseSiteTarget2, annotationUseSiteTarget3, annotationUseSiteTarget4, annotationUseSiteTarget5, annotationUseSiteTarget6, annotationUseSiteTarget7, annotationUseSiteTarget8, annotationUseSiteTarget9, annotationUseSiteTarget10};
        $VALUES = annotationUseSiteTargetArr;
        $ENTRIES = s.n(annotationUseSiteTargetArr);
    }

    public AnnotationUseSiteTarget(String str, int i, String str2) {
        this.renderName = str2 == null ? CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(name()) : str2;
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) $VALUES.clone();
    }

    @NotNull
    public final String getRenderName() {
        return this.renderName;
    }
}
