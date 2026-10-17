package com.revolut.feature.shared.savings.models.product;

import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CLEARBANK;
    public static final d CROSSRIVER;
    public static final d EU_DEPOSIT_SOLUTIONS;
    public static final d UK_FLAGSTONE;
    public static final d US_SUTTON;

    @NotNull
    private final List<String> ids;

    static {
        d dVar = new d(0, "UK_FLAGSTONE", v.k("44444444-4444-4444-4444-444444444444", "55555555-5555-5555-5555-555555555555", "66666666-6666-6666-6666-666666666666"));
        UK_FLAGSTONE = dVar;
        d dVar2 = new d(1, "CLEARBANK", u.c("22222222-2222-2222-3333-333333333333"));
        CLEARBANK = dVar2;
        d dVar3 = new d(2, "EU_DEPOSIT_SOLUTIONS", u.c("33333333-3333-3333-3333-333333333333"));
        EU_DEPOSIT_SOLUTIONS = dVar3;
        d dVar4 = new d(3, "US_SUTTON", u.c("77777777-7777-7777-7777-777777777777"));
        US_SUTTON = dVar4;
        d dVar5 = new d(4, "CROSSRIVER", u.c("22222222-2222-2222-2222-222222222222"));
        CROSSRIVER = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(int i, String str, List list) {
        this.ids = list;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final List a() {
        return this.ids;
    }
}
