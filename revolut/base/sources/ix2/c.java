package ix2;

import c93.h;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$CardDesignsChromaticFeatures;
import e93.f;
import e93.w;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mxl.g;
import mxl.k;
import mxl.l;
import mxl.m;
import mxl.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f169330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f169331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx2.a f169332c;
    public final String d;

    public c(e cardDesigns3dTextureUrlImageProvider, gte.a featureToggleInteractor, lx2.a cardMapper, lx2.d densityProvider) {
        Intrinsics.checkNotNullParameter(cardDesigns3dTextureUrlImageProvider, "cardDesigns3dTextureUrlImageProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f169330a = cardDesigns3dTextureUrlImageProvider;
        this.f169331b = featureToggleInteractor;
        this.f169332c = cardMapper;
        this.d = densityProvider.a();
    }

    public static n b(k kVar, String str) {
        if (str != null) {
            return new l(str);
        }
        int i = b.f169329a[kVar.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return new m(-8355842);
        }
        if (i == 3) {
            return new m(-1);
        }
        if (i == 4) {
            return new m(-16777216);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static UrlVideo c(w wVar) {
        return new UrlVideo(wVar.f123894a, wVar.f123895b, false, (oz0.b) null, false, (oz0.c) null, 124);
    }

    public final g a(f fVar) {
        if (((jte.d) this.f169331b).c(CardDesignApi$Toggles$CardDesignsChromaticFeatures.f64534c)) {
            List listK = fVar.k();
            h.Companion.getClass();
            return listK.contains(h.i) ? g.CHROME_METAL : fVar.k().contains(h.f22276h) ? g.CHROMATIC : g.DEFAULT;
        }
        b93.b bVarC = fVar.c();
        b93.b.Companion.getClass();
        return Intrinsics.f(bVarC, b93.b.C1) ? g.CHROME_METAL : Intrinsics.f(bVarC, b93.b.f13578n1) ? g.CHROMATIC : g.DEFAULT;
    }
}
