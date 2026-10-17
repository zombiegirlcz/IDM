package ola;

import aw0.m3;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements m3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CREDIT_CARD;
    public static final d CREDIT_HUB;
    public static final d CRYPTO;
    public static final d CURRENCY;
    public static final d INVEST;
    public static final d JOINT;
    public static final d JUNIOR;
    public static final d LIFESTYLE_REVPOINTS;
    public static final d LINKED;
    public static final d LOAN;
    public static final d PAYMENTS;
    public static final d POCKETS;
    public static final d PRO;
    public static final d SAVINGS;

    @NotNull
    private final AnimatedBackgroundType background = AnimatedBackgroundType.DEFAULT.f51471a;
    private final boolean checkUserCreationDate;

    @NotNull
    private final String introId;

    static {
        d dVar = new d("CURRENCY", 0, "HOME_PERSONAL_CURRENCY.discovery");
        CURRENCY = dVar;
        d dVar2 = new d("CRYPTO", 1, "CRYPTO.discovery");
        CRYPTO = dVar2;
        d dVar3 = new d("INVEST", 2, "INVEST.discovery");
        INVEST = dVar3;
        d dVar4 = new d("PAYMENTS", 3, "PAYMENTS.discovery");
        PAYMENTS = dVar4;
        d dVar5 = new d("JUNIOR", 4, "JUNIOR.discovery");
        JUNIOR = dVar5;
        d dVar6 = new d("SAVINGS", 5, "HOME_SAVINGS.discovery");
        SAVINGS = dVar6;
        d dVar7 = new d("POCKETS", 6, "HOME_SUB_ACCOUNT.discovery");
        POCKETS = dVar7;
        d dVar8 = new d("JOINT", 7, "HOME_JOINT.discovery");
        JOINT = dVar8;
        d dVar9 = new d("PRO", 8, "HOME_PRO.discovery");
        PRO = dVar9;
        d dVar10 = new d("LINKED", 9, "HOME_LINKED.discovery");
        LINKED = dVar10;
        d dVar11 = new d("CREDIT_CARD", 10, "HOME_CREDIT_CARD.discovery");
        CREDIT_CARD = dVar11;
        d dVar12 = new d("CREDIT_HUB", 11, "HOME_CREDIT_HUB.discovery");
        CREDIT_HUB = dVar12;
        d dVar13 = new d("LOAN", 12, "HOME_LOAN.discovery");
        LOAN = dVar13;
        d dVar14 = new d("LIFESTYLE_REVPOINTS", 13, "LIFESTYLE_REVPOINTS.discovery");
        LIFESTYLE_REVPOINTS = dVar14;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.introId = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // aw0.l6
    public final boolean a() {
        return this.checkUserCreationDate;
    }

    @Override // aw0.l6
    public final String b() {
        return this.introId;
    }

    @Override // aw0.l6
    public final AnimatedBackgroundType getBackground() {
        return this.background;
    }
}
