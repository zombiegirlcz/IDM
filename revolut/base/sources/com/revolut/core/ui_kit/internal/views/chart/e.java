package com.revolut.core.ui_kit.internal.views.chart;

import aw0.e2;
import aw0.f2;
import aw0.l2;
import aw0.o2;
import aw0.x1;
import ts0.p;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f56775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f56776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f56777c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f56778g;

    static {
        int[] iArr = new int[x1.values().length];
        try {
            iArr[x1.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x1.TALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x1.MATCH_PARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f56775a = iArr;
        int[] iArr2 = new int[p.values().length];
        try {
            iArr2[p.PULSATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[p.ENLARGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f56776b = iArr2;
        int[] iArr3 = new int[e2.values().length];
        try {
            iArr3[e2.PERFORMANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[e2.MONOCHROMATIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f56777c = iArr3;
        int[] iArr4 = new int[f2.values().length];
        try {
            iArr4[f2.FIRST_OF_CURRENT_LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[f2.CURRENT_OR_SELECTED_OF_PREVIOUS_LINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[f2.LAST_OF_PREVIOUS_LINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
        int[] iArr5 = new int[l2.values().length];
        try {
            iArr5[l2.GREATER_VALUE_GREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr5[l2.GREATER_VALUE_RED.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        e = iArr5;
        int[] iArr6 = new int[b.values().length];
        try {
            iArr6[b.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr6[b.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr6[b.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        f = iArr6;
        int[] iArr7 = new int[o2.values().length];
        try {
            iArr7[o2.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr7[o2.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        f56778g = iArr7;
    }
}
