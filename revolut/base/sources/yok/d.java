package yok;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.core.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import qc0.e1;
import vkm.y;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements tla.a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji5.m f315693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f315694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f315695c;

    public d(ji5.m cryptoPreferencesInteractor) {
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        this.f315693a = cryptoPreferencesInteractor;
        this.f315694b = new TextLocalisedClause(R$string.profileHome_settings_item_crypto_tab_title, null, null, 14);
        this.f315695c = new ResourceImage(R$drawable.uikit_icn_24_bitcoin, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    @Override // tla.a
    public final Flow a() {
        return this.f315693a.a();
    }

    @Override // tla.a
    public final Object b(boolean z, e1 e1Var) throws Throwable {
        Object objC = this.f315693a.c(z, e1Var);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }

    @Override // tla.a
    public final y c() {
        return this.f315693a.b();
    }

    @Override // tla.a
    public final TextLocalisedClause d(boolean z) {
        return new TextLocalisedClause(z ? R$string.profileHome_settings_item_crypto_tab_visible : R$string.profileHome_settings_item_crypto_tab_hidden, null, null, 14);
    }

    @Override // tla.a
    public final ResourceImage getIcon() {
        return this.f315695c;
    }

    @Override // tla.a
    public final String getId() {
        return "crypto";
    }

    @Override // tla.a
    public final TextLocalisedClause getTitle() {
        return this.f315694b;
    }
}
