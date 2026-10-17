package com.revolut.core.ui_kit.storiesdelegates;

import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58283a;

    static {
        int[] iArr = new int[StickerStoriesModel.StickerPosition.values().length];
        try {
            iArr[StickerStoriesModel.StickerPosition.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StickerStoriesModel.StickerPosition.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f58283a = iArr;
    }
}
