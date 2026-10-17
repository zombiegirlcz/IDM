package vz0;

import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.engine.GlideException;
import u8.g;
import v8.h;
import v8.l;

/* JADX INFO: loaded from: classes20.dex */
public class c implements g {
    public void a(PictureDrawable pictureDrawable, Object obj2, l lVar, c8.a aVar, boolean z) {
        ((h) lVar).f286695b.setLayerType(1, null);
    }

    @Override // u8.g
    public boolean onLoadFailed(GlideException glideException, Object obj2, l lVar, boolean z) {
        ((h) lVar).f286695b.setLayerType(0, null);
        return false;
    }

    @Override // u8.g
    public /* bridge */ /* synthetic */ boolean onResourceReady(Object obj2, Object obj3, l lVar, c8.a aVar, boolean z) {
        a((PictureDrawable) obj2, obj3, lVar, aVar, z);
        return false;
    }
}
