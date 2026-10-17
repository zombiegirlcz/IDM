package rrd;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    public static AnimatedBackgroundType.Base a(Long l2, Long l3) {
        return (l2 == null || l3 == null) ? AnimatedBackgroundType.Base.PERFORMANCE_STATIC : l2.longValue() > l3.longValue() ? AnimatedBackgroundType.Base.PERFORMANCE_POSITIVE : l2.longValue() < l3.longValue() ? AnimatedBackgroundType.Base.PERFORMANCE_NEGATIVE : AnimatedBackgroundType.Base.PERFORMANCE_STATIC;
    }
}
