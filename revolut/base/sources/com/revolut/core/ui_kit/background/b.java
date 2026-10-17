package com.revolut.core.ui_kit.background;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f51505a;

    static {
        int[] iArr = new int[AnimatedBackgroundType.Base.values().length];
        try {
            iArr[AnimatedBackgroundType.Base.PERFORMANCE_POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnimatedBackgroundType.Base.PERFORMANCE_NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AnimatedBackgroundType.Base.PERFORMANCE_STATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AnimatedBackgroundType.Base.STATUS_WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AnimatedBackgroundType.Base.ACCENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f51505a = iArr;
    }
}
