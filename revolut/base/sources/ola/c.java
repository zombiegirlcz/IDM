package ola;

import aw0.l6;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements l6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BUSINESS_ACCOUNTS_WALKTHROUGH;
    public static final c BUSINESS_CARDHOLDER_HOME;
    public static final c BUSINESS_CRYPTO;
    public static final c BUSINESS_REV_POINTS;
    public static final c BUSINESS_REV_POINTS_FEATURES;
    public static final c CREDIT_CARD;
    public static final c CRYPTO;
    public static final c CURRENCY;
    public static final c CURRENCY_WITH_CONTENT_BG;
    public static final c INVEST;
    public static final c JOINT;
    public static final c JUNIOR;
    public static final c LINKED;
    public static final c LOAN;
    public static final c PLAN_BENEFITS_METAL;
    public static final c PLAN_BENEFITS_PLUS;
    public static final c PLAN_BENEFITS_PREMIUM;
    public static final c PLAN_BENEFITS_PRIVATE;
    public static final c PLAN_BENEFITS_ULTRA;
    public static final c POCKETS;
    public static final c PRO;
    public static final c REV_X_HOME;
    public static final c SAVINGS;
    public static final c STUDENT;
    private final AnimatedBackgroundType background;
    private final boolean checkUserCreationDate;

    @NotNull
    private final String introId;

    static {
        AnimatedBackgroundType.DEFAULT r102 = AnimatedBackgroundType.DEFAULT.f51471a;
        c cVar = new c("CURRENCY", 0, "HOME_PERSONAL_CURRENCY", true, r102);
        CURRENCY = cVar;
        c cVar2 = new c("CURRENCY_WITH_CONTENT_BG", 1, "HOME_PERSONAL_CURRENCY", true, null);
        CURRENCY_WITH_CONTENT_BG = cVar2;
        c cVar3 = new c("STUDENT", 2, "HOME_STUDENT_ACCOUNT", false, null);
        STUDENT = cVar3;
        AnimatedBackgroundType.CRYPTO crypto = AnimatedBackgroundType.CRYPTO.f51469a;
        c cVar4 = new c("CRYPTO", 3, "CRYPTO", true, crypto);
        CRYPTO = cVar4;
        c cVar5 = new c("INVEST", 4, "INVEST", true, AnimatedBackgroundType.INVEST.f51475a);
        INVEST = cVar5;
        c cVar6 = new c("JUNIOR", 5, "JUNIOR", true, AnimatedBackgroundType.U18.f51490a);
        JUNIOR = cVar6;
        c cVar7 = new c("SAVINGS", 6, "HOME_SAVINGS", true, AnimatedBackgroundType.SAVINGS.f51489a);
        SAVINGS = cVar7;
        c cVar8 = new c("POCKETS", 7, "HOME_SUB_ACCOUNT", true, AnimatedBackgroundType.POCKETS.f51485a);
        POCKETS = cVar8;
        c cVar9 = new c("JOINT", 8, "HOME_JOINT", true, AnimatedBackgroundType.JOINT.f51476a);
        JOINT = cVar9;
        c cVar10 = new c("PRO", 9, "HOME_PRO", true, AnimatedBackgroundType.PRO.f51486a);
        PRO = cVar10;
        c cVar11 = new c("LINKED", 10, "HOME_LINKED", true, AnimatedBackgroundType.LINKED.f51477a);
        LINKED = cVar11;
        AnimatedBackgroundType.CREDIT credit = AnimatedBackgroundType.CREDIT.f51468a;
        c cVar12 = new c("CREDIT_CARD", 11, "HOME_CREDIT_CARD", true, credit);
        CREDIT_CARD = cVar12;
        c cVar13 = new c("LOAN", 12, "HOME_LOAN", true, credit);
        LOAN = cVar13;
        c cVar14 = new c("REV_X_HOME", 13, "REV_X_HOME", false, AnimatedBackgroundType.REV_X.f51488a);
        REV_X_HOME = cVar14;
        c cVar15 = new c("BUSINESS_CRYPTO", 14, "CRYPTO", false, crypto);
        BUSINESS_CRYPTO = cVar15;
        c cVar16 = new c("BUSINESS_ACCOUNTS_WALKTHROUGH", 15, "BUSINESS_ACCOUNTS_WALKTHROUGH", false, r102);
        BUSINESS_ACCOUNTS_WALKTHROUGH = cVar16;
        c cVar17 = new c("BUSINESS_REV_POINTS", 16, "BUSINESS_REV_POINTS", false, AnimatedBackgroundType.REV_POINTS.f51487a);
        BUSINESS_REV_POINTS = cVar17;
        c cVar18 = new c("BUSINESS_REV_POINTS_FEATURES", 17, "BUSINESS_REV_POINTS_FEATURES", false, null);
        BUSINESS_REV_POINTS_FEATURES = cVar18;
        c cVar19 = new c("PLAN_BENEFITS_PLUS", 18, "HOME_PLAN_BENEFITS_PLUS", false, null);
        PLAN_BENEFITS_PLUS = cVar19;
        c cVar20 = new c("PLAN_BENEFITS_PREMIUM", 19, "HOME_PLAN_BENEFITS_PREMIUM", false, null);
        PLAN_BENEFITS_PREMIUM = cVar20;
        c cVar21 = new c("PLAN_BENEFITS_METAL", 20, "HOME_PLAN_BENEFITS_METAL", false, null);
        PLAN_BENEFITS_METAL = cVar21;
        c cVar22 = new c("PLAN_BENEFITS_ULTRA", 21, "HOME_PLAN_BENEFITS_ULTRA", false, null);
        PLAN_BENEFITS_ULTRA = cVar22;
        c cVar23 = new c("PLAN_BENEFITS_PRIVATE", 22, "HOME_PLAN_BENEFITS_PRIVATE", false, null);
        PLAN_BENEFITS_PRIVATE = cVar23;
        c cVar24 = new c("BUSINESS_CARDHOLDER_HOME", 23, "BUSINESS_CARDHOLDER_HOME", true, r102);
        BUSINESS_CARDHOLDER_HOME = cVar24;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2, boolean z, AnimatedBackgroundType animatedBackgroundType) {
        this.introId = str2;
        this.checkUserCreationDate = z;
        this.background = animatedBackgroundType;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
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
