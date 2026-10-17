package gwl;

import aw0.o9;
import com.google.android.material.color.DynamicColors;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.uipersonalisation.api.AbstractThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.AlexKDeclaration;
import com.revolut.feature.uipersonalisation.api.ApexThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ChristmasThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ColoursThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.CryptoThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.Cyberpunk2ThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.CyberpunkThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.DogsDeclaration;
import com.revolut.feature.uipersonalisation.api.ExploreThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.FlowersDeclaration;
import com.revolut.feature.uipersonalisation.api.GeometricDeclaration;
import com.revolut.feature.uipersonalisation.api.GlassThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlowThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HalloweenThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HorizonThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LavaThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LightsThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LinesThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.MetalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.MinimalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ParticlesThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PremiumThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PrideThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PrivateThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PsychedelicDeclaration;
import com.revolut.feature.uipersonalisation.api.SnakeThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.Toning;
import com.revolut.feature.uipersonalisation.api.TravertineDeclaration;
import com.revolut.feature.uipersonalisation.api.UKLandscapesDeclaration;
import com.revolut.feature.uipersonalisation.api.UltraThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.VelvetDeclaration;
import com.revolut.feature.uipersonalisation.api.ZodiacThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.retail.common.ui.api.Toggles;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vjg.g;
import xjg.k;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements g {
    public final ChristmasThemeDeclaration A;
    public final AlexKDeclaration B;
    public final GeometricDeclaration C;
    public final DogsDeclaration D;
    public final PsychedelicDeclaration E;
    public final VelvetDeclaration F;
    public final FlowersDeclaration G;
    public final TravertineDeclaration H;
    public final PremiumThemeDeclaration I;
    public final UltraThemeDeclaration J;
    public final PrivateThemeDeclaration K;
    public final MetalThemeDeclaration L;
    public final UKLandscapesDeclaration M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f147588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.b f147589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k70.a f147590c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f147591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f147592h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f147593j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f147594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f147595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f147596n;
    public final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CyberpunkThemeDeclaration f147597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Cyberpunk2ThemeDeclaration f147598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ZodiacThemeDeclaration f147599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LightsThemeDeclaration f147600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ApexThemeDeclaration f147601t;
    public final HorizonThemeDeclaration u;
    public final ExploreThemeDeclaration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CryptoThemeDeclaration f147602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LavaThemeDeclaration f147603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SnakeThemeDeclaration f147604y;
    public final HalloweenThemeDeclaration z;

    public d(gte.a featureToggleInteractor, zm0.b sessionController, k70.a themeCompatibilityProvider, Lazy pricingPlanInteractor, Lazy backgroundsInteractorProvider, Lazy startupPreferencesInteractorProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(themeCompatibilityProvider, "themeCompatibilityProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractorProvider, "backgroundsInteractorProvider");
        Intrinsics.checkNotNullParameter(startupPreferencesInteractorProvider, "startupPreferencesInteractorProvider");
        this.f147588a = featureToggleInteractor;
        this.f147589b = sessionController;
        this.f147590c = themeCompatibilityProvider;
        this.d = pricingPlanInteractor;
        this.e = backgroundsInteractorProvider;
        this.f = startupPreferencesInteractorProvider;
        this.f147591g = new AtomicReference();
        final int i = 0;
        this.f147592h = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        final int i2 = 1;
        this.i = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        final int i3 = 2;
        this.f147593j = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        final int i5 = 3;
        this.k = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        final int i6 = 4;
        this.f147594l = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        final int i21 = 5;
        this.f147595m = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        final int i22 = 6;
        this.f147596n = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        final int i32 = 7;
        this.o = j.b(new Function0(this) { // from class: gwl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f147585b;

            {
                this.f147585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return new AbstractThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_abstract, null, null, 14), this.f147585b.d(), "default", null, new Toning("#5E29FF", "#A78AFF"));
                    case 1:
                        return new GlowThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glow, null, null, 14), this.f147585b.d(), false, true, new Toning("#356AD5", "#6FA0FF"));
                    case 2:
                        return new LinesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_lines, null, null, 14), this.f147585b.d(), false, new Toning("#759CF0", 1));
                    case 3:
                        return new GlassThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_glass, null, null, 14), this.f147585b.d(), new Toning("#6A61EA", "#8297F8"));
                    case 4:
                        return new ColoursThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_colours, null, null, 14), this.f147585b.d(), new Toning("#5A5FF2", "#959EDA"));
                    case 5:
                        return new MinimalThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_minimal, null, null, 14), this.f147585b.d(), false);
                    case 6:
                        return new ParticlesThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_particles, null, null, 14), this.f147585b.d(), true);
                    default:
                        return new PrideThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_theme_pride, null, null, 14), this.f147585b.d(), false, new Toning("#896C48", "#BCA480"));
                }
            }
        });
        this.f147597p = new CyberpunkThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_cyberpunk, null, null, 14), new Toning("#00FF1A", 1));
        this.f147598q = new Cyberpunk2ThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_cyberpunk2, null, null, 14));
        this.f147599r = new ZodiacThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_zodiac, null, null, 14), d());
        this.f147600s = new LightsThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_lights, null, null, 14), d());
        this.f147601t = new ApexThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_apex, null, null, 14), d());
        this.u = new HorizonThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_horizon, null, null, 14), d());
        this.v = new ExploreThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_explore, null, null, 14), d());
        this.f147602w = new CryptoThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_crypto, null, null, 14), d());
        this.f147603x = new LavaThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_lava, null, null, 14), d());
        this.f147604y = new SnakeThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_snake, null, null, 14), d());
        this.z = new HalloweenThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_app_theme_halloween, null, null, 14), new TextLocalisedClause(R$string.profile_appearance_theme_terracota, null, null, 14), new Toning("#A993D7", 1));
        this.A = new ChristmasThemeDeclaration(new TextLocalisedClause(R$string.settings_appearance_app_theme_christmas, null, null, 14), new TextLocalisedClause(R$string.profile_appearance_theme_default, null, null, 14));
        this.B = new AlexKDeclaration(new TextClause("Art collection", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d());
        this.C = new GeometricDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_geometric, null, null, 14), d());
        this.D = new DogsDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_dogs, null, null, 14), d());
        this.E = new PsychedelicDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_psychedelic, null, null, 14), d());
        this.F = new VelvetDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_velvet, null, null, 14), d());
        this.G = new FlowersDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_flowers, null, null, 14), d());
        this.H = new TravertineDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_travertine, null, null, 14), d());
        this.I = new PremiumThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_premium, null, null, 14), d());
        this.J = new UltraThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_ultra, null, null, 14), d());
        this.K = new PrivateThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_private, null, null, 14), d());
        this.L = new MetalThemeDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_metal, null, null, 14), d());
        this.M = new UKLandscapesDeclaration(new TextLocalisedClause(R$string.profile_appearance_theme_uk_landscapes, null, null, 14), d());
    }

    public final List d() {
        xjg.j jVar = xjg.j.DEFAULT;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profile_appearance_theme_default, null, null, 14);
        k kVar = k.ALWAYS;
        ColorThemeOption colorThemeOption = new ColorThemeOption(jVar, textLocalisedClause, kVar);
        this.f147590c.getClass();
        ColorThemeOption colorThemeOption2 = DynamicColors.isDynamicColorAvailable() ? new ColorThemeOption(xjg.j.DYNAMIC, new TextLocalisedClause(R$string.profile_appearance_theme_system, null, null, 14), kVar) : null;
        ColorThemeOption colorThemeOption3 = new ColorThemeOption(xjg.j.PURPLE, new TextLocalisedClause(R$string.profile_appearance_theme_purple, null, null, 14), kVar);
        ColorThemeOption colorThemeOption4 = new ColorThemeOption(xjg.j.ORANGE, new TextLocalisedClause(R$string.profile_appearance_theme_terracota, null, null, 14), kVar);
        xjg.j jVar2 = xjg.j.TEAL;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.profile_appearance_theme_teal, null, null, 14);
        k kVar2 = k.PREMIUM;
        ColorThemeOption[] elements = {colorThemeOption, colorThemeOption2, colorThemeOption3, colorThemeOption4, new ColorThemeOption(jVar2, textLocalisedClause2, kVar2), new ColorThemeOption(xjg.j.PINK, new TextLocalisedClause(R$string.profile_appearance_theme_deep_pink, null, null, 14), kVar2), new ColorThemeOption(xjg.j.DEEP_BLUE, new TextLocalisedClause(R$string.profile_appearance_theme_deep_blue, null, null, 14), kVar2)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration e() {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gwl.d.e():com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration");
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.z);
        arrayList.add(this.A);
        arrayList.add((GlobalThemeDeclaration) this.i.getValue());
        arrayList.add(this.M);
        arrayList.add((GlobalThemeDeclaration) this.f147593j.getValue());
        arrayList.add((GlobalThemeDeclaration) this.f147595m.getValue());
        if (((jte.d) this.f147588a).c(Toggles.ParticlesTheme.f98580c)) {
            arrayList.add((GlobalThemeDeclaration) this.f147596n.getValue());
        }
        arrayList.add((GlobalThemeDeclaration) this.f147594l.getValue());
        arrayList.add((GlobalThemeDeclaration) this.k.getValue());
        arrayList.add(this.f147600s);
        arrayList.add((AbstractThemeDeclaration) this.f147592h.getValue());
        arrayList.add(this.B);
        arrayList.add(this.H);
        arrayList.add(this.f147598q);
        arrayList.add(this.D);
        arrayList.add(this.f147603x);
        arrayList.add((GlobalThemeDeclaration) this.o.getValue());
        arrayList.add(this.G);
        arrayList.add(this.F);
        arrayList.add(this.f147604y);
        arrayList.add(this.f147597p);
        arrayList.add(this.v);
        arrayList.add(this.u);
        arrayList.add(this.E);
        arrayList.add(this.C);
        arrayList.add(this.I);
        arrayList.add(this.L);
        arrayList.add(this.J);
        arrayList.add(this.K);
        arrayList.add(this.f147599r);
        arrayList.add(this.f147602w);
        arrayList.add(this.f147601t);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof gwl.c
            if (r0 == 0) goto L13
            r0 = r5
            gwl.c r0 = (gwl.c) r0
            int r1 = r0.f147587w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147587w = r1
            goto L18
        L13:
            gwl.c r0 = new gwl.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f147587w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            kotlin.Lazy r5 = r4.d
            java.lang.Object r5 = r5.getValue()
            ffk.t r5 = (ffk.t) r5
            r0.f147587w = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.util.concurrent.atomic.AtomicReference r5 = r4.f147591g
            r0 = 0
            r5.set(r0)
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r5 = r4.e()
            java.lang.String r5 = r5.getF94454a()
            kotlin.Lazy r0 = r4.f
            java.lang.Object r1 = r0.getValue()
            rn0.b r1 = (rn0.b) r1
            java.lang.String r1 = r1.e()
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r1 != 0) goto L6c
            java.lang.Object r0 = r0.getValue()
            rn0.b r0 = (rn0.b) r0
            r0.b(r5)
        L6c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gwl.d.g(gim.c):java.lang.Object");
    }
}
