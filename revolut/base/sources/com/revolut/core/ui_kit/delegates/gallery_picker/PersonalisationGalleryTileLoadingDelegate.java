package com.revolut.core.ui_kit.delegates.gallery_picker;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ft0.m;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lnk.o;
import lp0.c;
import or0.u;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/gallery_picker/PersonalisationGalleryTileLoadingDelegate;", "Lcom/revolut/core/ui_kit/delegates/gallery_picker/BaseGalleryTileDelegate;", "Llp0/c;", "Lft0/m;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonalisationGalleryTileLoadingDelegate extends BaseGalleryTileDelegate<c, m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54212c;
    public final int d;

    public PersonalisationGalleryTileLoadingDelegate() {
        int i = R$id.internal_gallery_tile_loading_delegate_type;
        o rule = new o(2);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
        this.f54212c = 206;
        this.d = DefaultFrameSampler.DESIRED_FRAME_WIDTH;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ImageView itemView = new ImageView(parent.getContext());
        Intrinsics.checkNotNullParameter(itemView, "shimmerView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        m mVar = new m(itemView);
        itemView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        u.v(R$attr.uikit_dp16, itemView);
        Context context = mVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f.e(d.f(context).Q(), ShimmerImage.f60002a, itemView, null, null, 12);
        return mVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.gallery_picker.BaseGalleryTileDelegate
    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.delegates.gallery_picker.BaseGalleryTileDelegate
    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getF54212c() {
        return this.f54212c;
    }
}
