package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface yc extends uf {

    public interface a {
        @NotNull
        yc build();

        @NotNull
        a selfieModule(@NotNull bb bbVar);
    }

    @Override // com.fourthline.vision.internal.uf
    @NotNull
    /* synthetic */ x getCameraFocusManager();

    @Override // com.fourthline.vision.internal.uf
    @NotNull
    /* synthetic */ e2 getDebugConsumer();

    @Override // com.fourthline.vision.internal.uf
    @NotNull
    @yhm.d
    /* synthetic */ z7 getLegacyPreviewCalculator();

    @Override // com.fourthline.vision.internal.uf
    @NotNull
    /* synthetic */ i8 getMediaCodecDataSource();

    @Override // com.fourthline.vision.internal.uf
    @NotNull
    /* synthetic */ x9 getPreviewCalculator();

    @Override // com.fourthline.vision.internal.uf
    @NotNull
    /* synthetic */ ne getVisionAnalytics();

    @Override // com.fourthline.vision.internal.uf
    @NotNull
    /* synthetic */ xf getVisionViewModel();
}
