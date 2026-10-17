package awk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10806a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AssetStatsId f10807b;

    public /* synthetic */ k(l lVar, AssetStatsId assetStatsId) {
        this.f10807b = assetStatsId;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f10806a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LinkedHashMap assetStatsSelectionStates = r0.z(update.f10802a);
                AssetStatsId assetStatsId = this.f10807b;
                if (((Boolean) assetStatsSelectionStates.get(assetStatsId)) != null) {
                    assetStatsSelectionStates.put(assetStatsId, Boolean.valueOf(!r1.booleanValue()));
                }
                Intrinsics.checkNotNullParameter(assetStatsSelectionStates, "assetStatsSelectionStates");
                return new h(assetStatsSelectionStates);
            default:
                AssetStatsId assetStatsId2 = this.f10807b;
                yvk.f update2 = (yvk.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List list = (List) update2.f317217a.getContent();
                if (list == null || list.size() <= 1) {
                    return update2;
                }
                Data data2 = update2.f317217a;
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? d0.A0((List) content, assetStatsId2) : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return yvk.f.a(update2, data, null, 2);
        }
    }

    public /* synthetic */ k(AssetStatsId assetStatsId) {
        this.f10807b = assetStatsId;
    }
}
