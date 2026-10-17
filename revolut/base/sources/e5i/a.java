package e5i;

import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import p4i.f;
import pri.c;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f122820h;

    public a(b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f122820h = mapper;
    }

    @Override // p4i.f
    public final r E(Screen screen) {
        Screen.EffectiveRateDescription screen2 = (Screen.EffectiveRateDescription) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        return w.h(this.f122820h.a(screen2));
    }
}
