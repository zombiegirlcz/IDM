package qje;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.core.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ftb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji5.m f246827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ftb.a f246828b;

    public a(ji5.m cryptoPreferencesInteractor) {
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        this.f246827a = cryptoPreferencesInteractor;
        this.f246828b = new ftb.a(ibb.c.d, new TextLocalisedClause(R$string.profileHome_settings_item_crypto_tab_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bitcoin, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.profileHome_settings_item_crypto_tab_visible, null, null, 14), new TextLocalisedClause(R$string.profileHome_settings_item_crypto_tab_hidden, null, null, 14));
    }

    @Override // ftb.b
    public final Flow a() {
        return this.f246827a.a();
    }

    @Override // ftb.b
    public final ftb.a b() {
        return this.f246828b;
    }

    @Override // ftb.b
    public final y c() {
        return this.f246827a.b();
    }

    @Override // ftb.b
    public final Object d(boolean z, Continuation continuation) throws Throwable {
        Object objC = this.f246827a.c(z, (gim.i) continuation);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }
}
