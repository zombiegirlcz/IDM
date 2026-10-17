package ru9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f257468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yu9.c f257469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kdh.b f257470c;
    public final r2a.a d;

    public e0(wu9.a chatMessageReactionsMapper, b commonBubbleElementsMapper, m paymentBubbleFactory, yu9.c paymentBubbleTagMapper, kdh.b transactionBubbleTitlesMapper, h0 transactionBubbleTextStyleMapper, r2a.a personalisationUiInfoMapper) {
        Intrinsics.checkNotNullParameter(chatMessageReactionsMapper, "chatMessageReactionsMapper");
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(paymentBubbleTagMapper, "paymentBubbleTagMapper");
        Intrinsics.checkNotNullParameter(transactionBubbleTitlesMapper, "transactionBubbleTitlesMapper");
        Intrinsics.checkNotNullParameter(transactionBubbleTextStyleMapper, "transactionBubbleTextStyleMapper");
        Intrinsics.checkNotNullParameter(personalisationUiInfoMapper, "personalisationUiInfoMapper");
        this.f257468a = paymentBubbleFactory;
        this.f257469b = paymentBubbleTagMapper;
        this.f257470c = transactionBubbleTitlesMapper;
        this.d = personalisationUiInfoMapper;
    }
}
