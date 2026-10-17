package com.revolut.feature.uipersonalisation.api;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import vjg.a;
import vjg.b;
import vjg.d;
import vjg.f;
import vjg.i;
import xjg.m;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001%\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/uipersonalisation/api/AbstractThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/AlexKDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/ApexThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/BusinessThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/ChristmasThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/ColoursThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/CryptoThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/Cyberpunk2ThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/CyberpunkThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/DogsDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/ExploreThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/FlowersDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GeometricDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlassThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlowThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/HalloweenThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/HorizonThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/JuniorGlowThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/LavaThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/LegacyDefaultThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/LightsThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/LinesThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/MetalThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/MinimalThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/ParticlesThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/PremiumThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/PrideThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/PrivateThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/PsychedelicDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/RevolutXThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/SnakeThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/TravertineDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/UKLandscapesDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/UltraThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/UpbeatThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/VelvetDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/ZodiacThemeDeclaration;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GlobalThemeDeclaration extends Parcelable {
    default String C2() {
        return null;
    }

    default boolean E7() {
        return false;
    }

    default Toning F8() {
        return new Toning((String) null, 3);
    }

    default b K2() {
        return b.ACCENT;
    }

    default boolean K5(e dateProvider) {
        f fVarE2;
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return e2() == null || ((fVarE2 = e2()) != null && fVarE2.a(dateProvider));
    }

    default d P7() {
        return null;
    }

    default i T4() {
        return i.NONE;
    }

    List X6();

    CoverIcon a1();

    default f e2() {
        return null;
    }

    a g0();

    String getId();

    Clause getTitle();

    default vjg.e h8() {
        return null;
    }

    default boolean isDefault() {
        return false;
    }

    default m l7() {
        return null;
    }

    List y6();
}
