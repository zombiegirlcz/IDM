package it3;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CC_BUILDER;
    public static final k CC_CLI_USER_INITIATED;
    public static final k CC_RETAIL;
    public static final k CC_SECURED;
    public static final k CC_SECURED_RETAIL;

    @NotNull
    public static final j Companion;
    public static final k INVITATION;
    public static final k MC_BNPL_CORE_USER;

    static {
        k kVar = new k("CC_SECURED", 0);
        CC_SECURED = kVar;
        k kVar2 = new k("INVITATION", 1);
        INVITATION = kVar2;
        k kVar3 = new k("CC_RETAIL", 2);
        CC_RETAIL = kVar3;
        k kVar4 = new k("CC_SECURED_RETAIL", 3);
        CC_SECURED_RETAIL = kVar4;
        k kVar5 = new k("CC_CLI_USER_INITIATED", 4);
        CC_CLI_USER_INITIATED = kVar5;
        k kVar6 = new k("CC_BUILDER", 5);
        CC_BUILDER = kVar6;
        k kVar7 = new k("MC_BNPL_CORE_USER", 6);
        MC_BNPL_CORE_USER = kVar7;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
        Companion = new j();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
