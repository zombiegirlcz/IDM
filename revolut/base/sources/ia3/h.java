package ia3;

import android.content.Context;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import h93.f0;
import h93.h0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements m93.d {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha3.f f159935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f159937c;

    public h(Context context, ha3.f cardsConfigInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        this.f159935a = cardsConfigInteractor;
        float f = context.getResources().getDisplayMetrics().density;
        this.f159936b = f < 1.5f ? "" : f < 2.5f ? "@2x" : "@3x";
        this.f159937c = w.y0(new hq1.f(this, 25));
    }

    public final Image a(b93.b cardCode, e93.b brand, boolean z) {
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(brand, "brand");
        String strH = u1.h(brand, hx7.l.j());
        if (strH == null) {
            strH = "";
        }
        return b(new b93.j(cardCode, strH), z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit_core.displayers.image.Image b(b93.j r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia3.h.b(b93.j, boolean):com.revolut.core.ui_kit_core.displayers.image.Image");
    }

    public final Image c(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return b(card.f(), h0.f(card));
    }
}
