package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class Modality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;
    public static final Modality ABSTRACT;
    public static final Modality FINAL;
    public static final Modality OPEN;
    public static final Modality SEALED;

    @NotNull
    private final FlagImpl flag;

    static {
        Modality modality = new Modality("FINAL", 0, 0);
        FINAL = modality;
        Modality modality2 = new Modality("OPEN", 1, 1);
        OPEN = modality2;
        Modality modality3 = new Modality("ABSTRACT", 2, 2);
        ABSTRACT = modality3;
        Modality modality4 = new Modality("SEALED", 3, 3);
        SEALED = modality4;
        Modality[] modalityArr = {modality, modality2, modality3, modality4};
        $VALUES = modalityArr;
        $ENTRIES = s.n(modalityArr);
    }

    public Modality(String str, int i, int i2) {
        Flags.FlagField<ProtoBuf.Modality> MODALITY = Flags.MODALITY;
        Intrinsics.checkNotNullExpressionValue(MODALITY, "MODALITY");
        this.flag = new FlagImpl(MODALITY, i2);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}
