package o01;

import android.R;
import android.content.Context;
import android.util.SparseIntArray;
import android.widget.RemoteViews;
import b9.e;
import com.revolut.core.ui_kit_remote.R$id;
import com.revolut.core.ui_kit_remote.R$layout;
import com.revolut.core.ui_kit_resources.R$drawable;
import k01.n;
import kotlin.jvm.internal.Intrinsics;
import p01.t;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends k01.a {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, s70.a aVar, int i) {
        super(context, aVar);
        this.d = i;
    }

    @Override // k01.a
    public final RemoteViews a(n nVar, e spec) {
        int i;
        int i2 = this.d;
        String str = this.f179896b;
        switch (i2) {
            case 0:
                if (nVar != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "item");
                Intrinsics.checkNotNullParameter(spec, "spec");
                RemoteViews remoteViews = new RemoteViews(str, R$layout.remote_view_loading_layout);
                int i3 = R$id.logoImage;
                SparseIntArray sparseIntArray = vw0.a.f292608a;
                remoteViews.setImageViewResource(i3, vw0.a.a(R$drawable.uikit_icn_16_revolut));
                return remoteViews;
            default:
                t item = (t) nVar;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(spec, "spec");
                RemoteViews remoteViews2 = new RemoteViews(str, R$layout.remote_text_tile_delegate);
                int i5 = spec.f13337a;
                boolean z = true;
                if (i5 != -1 && (i = spec.f13338b) != -1 && i5 < 160 && i < 120) {
                    z = false;
                }
                remoteViews2.setTextViewText(R$id.title, item.f231454a);
                int i6 = R$id.logoImage;
                SparseIntArray sparseIntArray2 = vw0.a.f292608a;
                remoteViews2.setImageViewResource(i6, vw0.a.a(R$drawable.uikit_icn_16_revolut));
                remoteViews2.setViewVisibility(R$id.logoImage, z ? 0 : 8);
                k01.c cVar = item.f231455b;
                Intrinsics.checkNotNullParameter(remoteViews2, "<this>");
                remoteViews2.setOnClickPendingIntent(R.id.background, ((s70.b) this.f179895a).g(this.f179897c, 0, cVar.f179898a, 201326592, 4));
                return remoteViews2;
        }
    }

    @Override // k01.a
    public final boolean b(n item) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                return false;
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof t;
        }
    }
}
