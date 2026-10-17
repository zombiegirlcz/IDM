package com.google.android.material.color.utilities;

import android.view.View;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OptionsBundle;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.foundation.lazy.layout.PriorityTask;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.youTransactor.uCube.connexion.UCubeDevice;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mk5.l;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49091a;

    public /* synthetic */ g(int i) {
        this.f49091a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f49091a) {
            case 0:
                return ((Double) obj2).compareTo((Double) obj3);
            case 1:
                return OptionsBundle.lambda$static$0((Config.Option) obj2, (Config.Option) obj3);
            case 2:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj2, (SlowMotionData.Segment) obj3);
            case 3:
                return AndroidPrefetchScheduler.prefetchRequests$lambda$0((PriorityTask) obj2, (PriorityTask) obj3);
            case 4:
                return LazyLayoutMeasuredItemKt.LazyLayoutMeasuredItemIndexComparator$lambda$0((LazyLayoutMeasuredItem) obj2, (LazyLayoutMeasuredItem) obj3);
            case 5:
                View itemView = ((koi.b) obj2).itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                float translationY = itemView.getTranslationY() + itemView.getTop();
                View itemView2 = ((koi.b) obj3).itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                return Float.compare(translationY, itemView2.getTranslationY() + itemView2.getTop());
            case 6:
                UCubeDevice uCubeDevice = (UCubeDevice) obj2;
                UCubeDevice uCubeDevice2 = (UCubeDevice) obj3;
                String name = uCubeDevice.getName();
                if (ymm.g.c(name)) {
                    name = uCubeDevice.getAddress();
                }
                String name2 = uCubeDevice2.getName();
                if (ymm.g.c(name)) {
                    name2 = uCubeDevice2.getAddress();
                }
                return name.compareToIgnoreCase(name2);
            case 7:
                UCubeDevice uCubeDevice3 = (UCubeDevice) obj2;
                UCubeDevice uCubeDevice4 = (UCubeDevice) obj3;
                String name3 = uCubeDevice3.getName();
                if (ymm.g.c(name3)) {
                    name3 = uCubeDevice3.getAddress();
                }
                String name4 = uCubeDevice4.getName();
                if (ymm.g.c(name3)) {
                    name4 = uCubeDevice4.getAddress();
                }
                return name3.compareToIgnoreCase(name4);
            case 8:
                l lVar = (l) obj3;
                cw5.b bVar = ((l) obj2).f;
                long j2 = bVar != null ? bVar.f109535b : 0L;
                cw5.b bVar2 = lVar.f;
                long j3 = bVar2 != null ? bVar2.f109535b : 0L;
                if (j2 > j3) {
                    return -1;
                }
                return j2 < j3 ? 1 : 0;
            case 9:
                return BaseUrlExclusionList.compareBaseUrl((BaseUrl) obj2, (BaseUrl) obj3);
            case 10:
                return LayoutNode.ZComparator$lambda$0((LayoutNode) obj2, (LayoutNode) obj3);
            case 11:
                return HlsMediaPlaylist.Interstitial.lambda$new$0((HlsMediaPlaylist.ClientDefinedAttribute) obj2, (HlsMediaPlaylist.ClientDefinedAttribute) obj3);
            case 12:
                return ((io3.d) obj2).getName().compareTo(((io3.d) obj3).getName());
            default:
                return LayoutIntrinsics.computeMinIntrinsicWidth$lambda$0((Pair) obj2, (Pair) obj3);
        }
    }

    public /* synthetic */ g(ks0.f fVar) {
        this.f49091a = 5;
    }
}
