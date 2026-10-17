package ru9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f257471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ugc.a f257472b;

    public f(b commonBubbleElementsMapper, m paymentBubbleFactory, ugc.a groupChatMessageTagV2Mapper) {
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(groupChatMessageTagV2Mapper, "groupChatMessageTagV2Mapper");
        this.f257471a = paymentBubbleFactory;
        this.f257472b = groupChatMessageTagV2Mapper;
    }
}
