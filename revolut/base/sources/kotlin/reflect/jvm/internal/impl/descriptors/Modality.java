package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class Modality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;
    public static final Modality ABSTRACT;

    @NotNull
    public static final Companion Companion;
    public static final Modality FINAL;
    public static final Modality OPEN;
    public static final Modality SEALED;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final Modality convertFromFlags(boolean z, boolean z3, boolean z4) {
            return z ? Modality.SEALED : z3 ? Modality.ABSTRACT : z4 ? Modality.OPEN : Modality.FINAL;
        }
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        FINAL = modality;
        Modality modality2 = new Modality("SEALED", 1);
        SEALED = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        OPEN = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        ABSTRACT = modality4;
        Modality[] modalityArr = {modality, modality2, modality3, modality4};
        $VALUES = modalityArr;
        $ENTRIES = s.n(modalityArr);
        Companion = new Companion(null);
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }
}
