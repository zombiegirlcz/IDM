package qf1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCOUNTS;
    public static final c BORROW;
    public static final c CRYPTO;
    public static final c INVEST;
    public static final c LIFESTYLE;
    public static final c ORGANISE;
    public static final c SAVE;
    public static final c TRAVEL;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f245213id;

    static {
        c cVar = new c("ACCOUNTS", 0, "ACCOUNTS");
        ACCOUNTS = cVar;
        c cVar2 = new c("SAVE", 1, "SAVE");
        SAVE = cVar2;
        c cVar3 = new c("ORGANISE", 2, "ORGANISE");
        ORGANISE = cVar3;
        c cVar4 = new c("BORROW", 3, "BORROW");
        BORROW = cVar4;
        c cVar5 = new c("INVEST", 4, "INVEST");
        INVEST = cVar5;
        c cVar6 = new c("CRYPTO", 5, "CRYPTO");
        CRYPTO = cVar6;
        c cVar7 = new c("TRAVEL", 6, "TRAVEL");
        TRAVEL = cVar7;
        c cVar8 = new c("LIFESTYLE", 7, "LIFESTYLE");
        LIFESTYLE = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.f245213id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f245213id;
    }
}
