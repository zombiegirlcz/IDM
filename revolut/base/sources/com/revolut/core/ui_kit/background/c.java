package com.revolut.core.ui_kit.background;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import po0.e;
import po0.f;
import po0.i;
import po0.j;
import po0.k;
import po0.l;
import po0.t;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private c() {
    }

    public static l a(AnimatedBackgroundType animatedBackgroundType, t colorAttrResolver) {
        int i;
        Intrinsics.checkNotNullParameter(colorAttrResolver, "colorAttrResolver");
        if (animatedBackgroundType == null) {
            return null;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.DEFAULT.f51471a)) {
            return j.DEFAULT;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.SAVINGS.f51489a)) {
            return j.SAVINGS;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.CREDIT.f51468a)) {
            return j.CREDIT;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.POCKETS.f51485a)) {
            return j.POCKETS;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.JOINT.f51476a)) {
            return j.JOINT;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.PRO.f51486a)) {
            return j.PRO;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.U18.f51490a)) {
            return j.U18;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.LINKED.f51477a)) {
            return j.LINKED;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.INVEST.f51475a)) {
            return j.INVEST;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.CRYPTO.f51469a)) {
            return j.CRYPTO;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.REV_POINTS.f51487a)) {
            return j.REV_POINTS;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.CX.f51470a)) {
            return po0.d.f237847a;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.PLAN_PLUS.f51480a)) {
            return j.PLAN_PLUS;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.PLAN_PREMIUM.f51481a)) {
            return i.PREMIUM;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.PLAN_METAL.f51479a)) {
            return i.METAL;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.PLAN_ULTRA.f51483a)) {
            return i.ULTRA;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.PLAN_ULTRA_CX.f51484a)) {
            return i.ULTRA_CX;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.PLAN_PRIVATE.f51482a)) {
            return i.PRIVATE;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.REV_X.f51488a)) {
            return k.f237854a;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.AIR.f51467a)) {
            return po0.a.f237843a;
        }
        if (animatedBackgroundType.equals(AnimatedBackgroundType.ONBOARDING.f51478a)) {
            return f.f237851a;
        }
        if (animatedBackgroundType instanceof AnimatedBackgroundType.Esim) {
            AnimatedBackgroundType.Esim esim = (AnimatedBackgroundType.Esim) animatedBackgroundType;
            return new e(esim.f51472a, esim.f51473b, esim.f51474c);
        }
        if (!(animatedBackgroundType instanceof AnimatedBackgroundType.Base)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = b.f51505a[((AnimatedBackgroundType.Base) animatedBackgroundType).ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorPerformancePositive;
        } else if (i2 == 2) {
            i = R$attr.uikit_colorPerformanceNegative;
        } else if (i2 == 3) {
            i = R$attr.uikit_colorPerformanceStatic;
        } else if (i2 == 4) {
            i = R$attr.uikit_colorStatusWarning;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorAccent;
        }
        return new po0.c(colorAttrResolver.a(i));
    }
}
