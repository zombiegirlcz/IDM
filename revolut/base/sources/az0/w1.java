package az0;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.WallpaperImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import tx0.d5;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk0.e f11373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk0.e f11374c;
    public final wz0.t d;

    public w1(Context context, bk0.e eVar, bk0.e eVar2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11372a = context;
        this.f11373b = eVar;
        this.f11374c = eVar2;
        this.d = new wz0.t(new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG));
    }

    public final com.bumptech.glide.j a(com.bumptech.glide.n nVar, WallpaperImage wallpaperImage, Context context, boolean z) {
        u8.a aVarG = nVar.t(b(z ? wallpaperImage.f60055b : wallpaperImage.f60054a, wallpaperImage.d)).g(e8.p.f123505a);
        Intrinsics.checkNotNullExpressionValue(aVarG, "diskCacheStrategy(...)");
        return te0.w.d((com.bumptech.glide.j) aVarG, context, this.d);
    }

    public final Object b(String str, boolean z) {
        qz0.g gVar = null;
        if (z) {
            String appTypeHeader = this.f11374c.f16210b.getAppTypeHeader();
            gVar = new qz0.g(str, this.f11373b, appTypeHeader != null ? new Pair("X-App-Type", appTypeHeader) : null, null);
        }
        return gVar != null ? new i8.k(str, gVar) : str;
    }

    public final Object c(WallpaperImage wallpaperImage, boolean z, gim.c frame) {
        boolean zQ = true;
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        Context context = this.f11372a;
        com.bumptech.glide.n nVarC = com.bumptech.glide.b.b(context).c(context);
        Intrinsics.checkNotNullExpressionValue(nVarC, "with(...)");
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        if (defaultNightMode == 1) {
            zQ = false;
        } else if (defaultNightMode != 2) {
            zQ = kli.a.q(context);
        }
        com.bumptech.glide.j jVarT = ((com.bumptech.glide.j) a(nVarC, wallpaperImage, context, zQ).q(z)).T(new v1(context, lVar));
        v8.l lVarH = v8.j.h(jVarT.f26098x, d5.d(context), d5.b(context));
        jVarT.S(lVarH, null, jVarT, y8.f.f311599a);
        Intrinsics.checkNotNullExpressionValue(lVarH, "preload(...)");
        lVar.r(new a26.s(this, lVarH, 6));
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }
}
