package com.revolut.core.ui_kit.internal.dialogs;

import cr0.h;
import cr0.i;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f55924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f55925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f55926c;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.FIXED_SIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.DYNAMIC_MARGINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f55924a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[h.ANCHORED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[h.DRAGGING.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[h.SETTLING.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f55925b = iArr2;
        int[] iArr3 = new int[i.values().length];
        try {
            iArr3[i.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[i.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f55926c = iArr3;
    }
}
