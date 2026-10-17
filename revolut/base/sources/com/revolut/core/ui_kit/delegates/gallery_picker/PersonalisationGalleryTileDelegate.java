package com.revolut.core.ui_kit.delegates.gallery_picker;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import au0.t1;
import aw0.v8;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import e01.a;
import efm.r;
import fp0.p;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import llh.g;
import lnk.o;
import lp0.b;
import or0.m;
import qr0.d;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/gallery_picker/PersonalisationGalleryTileDelegate;", "Lcom/revolut/core/ui_kit/delegates/gallery_picker/BaseGalleryTileDelegate;", "Lcom/revolut/core/ui_kit/delegates/gallery_picker/PersonalisationGalleryTileModel;", "Llp0/b;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonalisationGalleryTileDelegate extends BaseGalleryTileDelegate<PersonalisationGalleryTileModel, b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54211c;
    public final int d;
    public final f e;
    public final a f;

    public PersonalisationGalleryTileDelegate() {
        int i = R$id.internal_gallery_tile_delegate_type;
        o rule = new o(1);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
        this.f54211c = 206;
        this.d = DefaultFrameSampler.DESIRED_FRAME_WIDTH;
        this.e = v0.a.d("create(...)");
        this.f = new a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new b(new d(new ContextThemeWrapper(parent.getContext(), R$style.UiKitTheme_TransparentDayNight), null, 0, 14));
    }

    @Override // com.revolut.core.ui_kit.delegates.gallery_picker.BaseGalleryTileDelegate
    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.delegates.gallery_picker.BaseGalleryTileDelegate
    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getF54211c() {
        return this.f54211c;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(b holder, PersonalisationGalleryTileModel data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        d dVar = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof lp0.a)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zIsEmpty = zIsEmpty || ((lp0.a) payloads.get(i3)).f198903a;
        }
        if (zIsEmpty) {
            v8 tile = data.f54214b;
            Intrinsics.checkNotNullParameter(tile, "tile");
            dVar.setModel(tile);
        }
        p pVar = holder.f198904g;
        p.b(pVar, true);
        View view = pVar.f137029a;
        m.a(view);
        view.setOnClickListener(new t1(data, 26, this, data));
        r map = dVar.f248588c.map(new g(23, new lk4.g(data, 17)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f.a(map, holder);
    }
}
