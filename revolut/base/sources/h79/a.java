package h79;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.InboxMessageMetadataContext;
import kotlin.jvm.internal.Intrinsics;
import s69.d;
import s69.h;
import z69.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public a(b productArticleParamsMapper) {
        Intrinsics.checkNotNullParameter(productArticleParamsMapper, "productArticleParamsMapper");
    }

    public static w0 a(d item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        InboxMessageMetadataContext.a aVarNewBuilder = InboxMessageMetadataContext.newBuilder();
        h hVar = item.e;
        if (hVar != null) {
            String str = hVar.f260170b;
            if (str != null) {
                Intrinsics.h(aVarNewBuilder);
                aVarNewBuilder.c();
                ((InboxMessageMetadataContext) aVarNewBuilder.f49761b).setCampaignId(str);
            }
            String str2 = hVar.f260169a;
            if (str2 != null) {
                Intrinsics.h(aVarNewBuilder);
                aVarNewBuilder.c();
                ((InboxMessageMetadataContext) aVarNewBuilder.f49761b).setMessageId(str2);
            }
            String str3 = hVar.f260171c;
            if (str3 != null) {
                Intrinsics.h(aVarNewBuilder);
                aVarNewBuilder.c();
                ((InboxMessageMetadataContext) aVarNewBuilder.f49761b).setPushId(str3);
            }
            String str4 = hVar.d;
            if (str4 != null) {
                Intrinsics.h(aVarNewBuilder);
                aVarNewBuilder.c();
                ((InboxMessageMetadataContext) aVarNewBuilder.f49761b).setTileId(str4);
            }
        }
        aVarNewBuilder.c();
        ((InboxMessageMetadataContext) aVarNewBuilder.f49761b).setIsProductArticle(z);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
