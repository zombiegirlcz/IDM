package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.d;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class DescriptorRendererModifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DescriptorRendererModifier[] $VALUES;
    public static final DescriptorRendererModifier ACTUAL;

    @NotNull
    public static final Set<DescriptorRendererModifier> ALL;

    @NotNull
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;
    public static final DescriptorRendererModifier ANNOTATIONS;
    public static final DescriptorRendererModifier CONST;

    @NotNull
    public static final Companion Companion;
    public static final DescriptorRendererModifier DATA;
    public static final DescriptorRendererModifier EXPECT;
    public static final DescriptorRendererModifier FUN;
    public static final DescriptorRendererModifier INLINE;
    public static final DescriptorRendererModifier INNER;
    public static final DescriptorRendererModifier LATEINIT;
    public static final DescriptorRendererModifier MEMBER_KIND;
    public static final DescriptorRendererModifier MODALITY;
    public static final DescriptorRendererModifier OVERRIDE;
    public static final DescriptorRendererModifier VALUE;
    public static final DescriptorRendererModifier VISIBILITY;
    private final boolean includeByDefault;

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$Companion] */
    static {
        DescriptorRendererModifier descriptorRendererModifier = new DescriptorRendererModifier("VISIBILITY", 0, true);
        VISIBILITY = descriptorRendererModifier;
        DescriptorRendererModifier descriptorRendererModifier2 = new DescriptorRendererModifier("MODALITY", 1, true);
        MODALITY = descriptorRendererModifier2;
        DescriptorRendererModifier descriptorRendererModifier3 = new DescriptorRendererModifier("OVERRIDE", 2, true);
        OVERRIDE = descriptorRendererModifier3;
        DescriptorRendererModifier descriptorRendererModifier4 = new DescriptorRendererModifier("ANNOTATIONS", 3, false);
        ANNOTATIONS = descriptorRendererModifier4;
        DescriptorRendererModifier descriptorRendererModifier5 = new DescriptorRendererModifier("INNER", 4, true);
        INNER = descriptorRendererModifier5;
        DescriptorRendererModifier descriptorRendererModifier6 = new DescriptorRendererModifier("MEMBER_KIND", 5, true);
        MEMBER_KIND = descriptorRendererModifier6;
        DescriptorRendererModifier descriptorRendererModifier7 = new DescriptorRendererModifier("DATA", 6, true);
        DATA = descriptorRendererModifier7;
        DescriptorRendererModifier descriptorRendererModifier8 = new DescriptorRendererModifier("INLINE", 7, true);
        INLINE = descriptorRendererModifier8;
        DescriptorRendererModifier descriptorRendererModifier9 = new DescriptorRendererModifier("EXPECT", 8, true);
        EXPECT = descriptorRendererModifier9;
        DescriptorRendererModifier descriptorRendererModifier10 = new DescriptorRendererModifier("ACTUAL", 9, true);
        ACTUAL = descriptorRendererModifier10;
        DescriptorRendererModifier descriptorRendererModifier11 = new DescriptorRendererModifier("CONST", 10, true);
        CONST = descriptorRendererModifier11;
        DescriptorRendererModifier descriptorRendererModifier12 = new DescriptorRendererModifier("LATEINIT", 11, true);
        LATEINIT = descriptorRendererModifier12;
        DescriptorRendererModifier descriptorRendererModifier13 = new DescriptorRendererModifier("FUN", 12, true);
        FUN = descriptorRendererModifier13;
        DescriptorRendererModifier descriptorRendererModifier14 = new DescriptorRendererModifier("VALUE", 13, true);
        VALUE = descriptorRendererModifier14;
        DescriptorRendererModifier[] descriptorRendererModifierArr = {descriptorRendererModifier, descriptorRendererModifier2, descriptorRendererModifier3, descriptorRendererModifier4, descriptorRendererModifier5, descriptorRendererModifier6, descriptorRendererModifier7, descriptorRendererModifier8, descriptorRendererModifier9, descriptorRendererModifier10, descriptorRendererModifier11, descriptorRendererModifier12, descriptorRendererModifier13, descriptorRendererModifier14};
        $VALUES = descriptorRendererModifierArr;
        $ENTRIES = s.n(descriptorRendererModifierArr);
        Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.Companion
        };
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier15 : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier15.includeByDefault) {
                arrayList.add(descriptorRendererModifier15);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = d0.i1(arrayList);
        ALL = d.y0(values());
    }

    public DescriptorRendererModifier(String str, int i, boolean z) {
        this.includeByDefault = z;
    }

    public static DescriptorRendererModifier valueOf(String str) {
        return (DescriptorRendererModifier) Enum.valueOf(DescriptorRendererModifier.class, str);
    }

    public static DescriptorRendererModifier[] values() {
        return (DescriptorRendererModifier[]) $VALUES.clone();
    }
}
