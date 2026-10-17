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
public final class MemberKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MemberKind[] $VALUES;
    public static final MemberKind DECLARATION;
    public static final MemberKind DELEGATION;
    public static final MemberKind FAKE_OVERRIDE;
    public static final MemberKind SYNTHESIZED;

    @NotNull
    private final FlagImpl flag;

    static {
        MemberKind memberKind = new MemberKind("DECLARATION", 0, 0);
        DECLARATION = memberKind;
        MemberKind memberKind2 = new MemberKind("FAKE_OVERRIDE", 1, 1);
        FAKE_OVERRIDE = memberKind2;
        MemberKind memberKind3 = new MemberKind("DELEGATION", 2, 2);
        DELEGATION = memberKind3;
        MemberKind memberKind4 = new MemberKind("SYNTHESIZED", 3, 3);
        SYNTHESIZED = memberKind4;
        MemberKind[] memberKindArr = {memberKind, memberKind2, memberKind3, memberKind4};
        $VALUES = memberKindArr;
        $ENTRIES = s.n(memberKindArr);
    }

    public MemberKind(String str, int i, int i2) {
        Flags.FlagField<ProtoBuf.MemberKind> MEMBER_KIND = Flags.MEMBER_KIND;
        Intrinsics.checkNotNullExpressionValue(MEMBER_KIND, "MEMBER_KIND");
        this.flag = new FlagImpl(MEMBER_KIND, i2);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MemberKind valueOf(String str) {
        return (MemberKind) Enum.valueOf(MemberKind.class, str);
    }

    public static MemberKind[] values() {
        return (MemberKind[]) $VALUES.clone();
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}
