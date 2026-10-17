package pie;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CREDIT_HUB;
    public static final a FAVOURITES;
    public static final a JOINT;
    public static final a LINKED;
    public static final a PERSONAL;
    public static final a PRO;
    public static final a RESTRICTED;
    public static final a TEEN;
    public static final a TOTAL_WEALTH;
    public static final a YOUTH;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f236471id;

    static {
        a aVar = new a("RESTRICTED", 0, "restricted");
        RESTRICTED = aVar;
        a aVar2 = new a("FAVOURITES", 1, "favourites");
        FAVOURITES = aVar2;
        a aVar3 = new a("PERSONAL", 2, "personal");
        PERSONAL = aVar3;
        a aVar4 = new a("JOINT", 3, "joint");
        JOINT = aVar4;
        a aVar5 = new a("PRO", 4, "pro");
        PRO = aVar5;
        a aVar6 = new a("YOUTH", 5, "youth");
        YOUTH = aVar6;
        a aVar7 = new a("TEEN", 6, "teen");
        TEEN = aVar7;
        a aVar8 = new a("LINKED", 7, "linked");
        LINKED = aVar8;
        a aVar9 = new a("TOTAL_WEALTH", 8, "total_wealth");
        TOTAL_WEALTH = aVar9;
        a aVar10 = new a("CREDIT_HUB", 9, "credit_hub");
        CREDIT_HUB = aVar10;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.f236471id = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f236471id;
    }
}
