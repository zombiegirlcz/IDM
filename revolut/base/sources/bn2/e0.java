package bn2;

import android.os.Bundle;
import android.os.Parcelable;
import b9.w2;
import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemeCustomisationSandboxInteractorImpl$SandboxState;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends yji.p implements c {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ekg.g f17002c;
    public final w2 d;
    public final p e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r10.d f17003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zjh.f f17004h;
    public final fn2.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2 f17005j;

    public e0(ekg.g uiPersonalisationInteractor, w2 customisableProductsProvider, p backgroundsInteractor, f backgroundsCatalogInteractor, r10.d availableBackgroundsInteractor, zjh.f sandboxAppearanceInteractor, fn2.c defaultBackgroundIdResolver) {
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(customisableProductsProvider, "customisableProductsProvider");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(backgroundsCatalogInteractor, "backgroundsCatalogInteractor");
        Intrinsics.checkNotNullParameter(availableBackgroundsInteractor, "availableBackgroundsInteractor");
        Intrinsics.checkNotNullParameter(sandboxAppearanceInteractor, "sandboxAppearanceInteractor");
        Intrinsics.checkNotNullParameter(defaultBackgroundIdResolver, "defaultBackgroundIdResolver");
        this.f17002c = uiPersonalisationInteractor;
        this.d = customisableProductsProvider;
        this.e = backgroundsInteractor;
        this.f = backgroundsCatalogInteractor;
        this.f17003g = availableBackgroundsInteractor;
        this.f17004h = sandboxAppearanceInteractor;
        this.i = defaultBackgroundIdResolver;
        this.f17005j = vkm.q.c(new ThemeCustomisationSandboxInteractorImpl$SandboxState(uiPersonalisationInteractor.j()));
    }

    @Override // yji.p
    public final String Q() {
        return "THEME_CUSTOMISATION_SANDBOX";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        if (r13.f17002c.f(r5, r6, r2, r0) != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.e0.R(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f8, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f8 -> B:33:0x00fb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(java.util.List r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.e0.S(java.util.List, gim.c):java.lang.Object");
    }

    @Override // bn2.c
    public final Flow a(BackgroundKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return vkm.q.Q(this.f17005j, new a32.b((Continuation) null, key, this, 13));
    }

    @Override // bn2.c
    public final wkm.l c(List availableScopes) {
        Intrinsics.checkNotNullParameter(availableScopes, "availableScopes");
        return vkm.q.Q(this.f17005j, new a32.b((Continuation) null, this, availableScopes, 12));
    }

    @Override // yji.r
    public final void e(Bundle state) {
        j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(state, "state");
        ThemeCustomisationSandboxInteractorImpl$SandboxState themeCustomisationSandboxInteractorImpl$SandboxState = (ThemeCustomisationSandboxInteractorImpl$SandboxState) state.getParcelable("theme_customisation_sandbox_state_key");
        if (themeCustomisationSandboxInteractorImpl$SandboxState != null) {
            do {
                j2Var = this.f17005j;
                value = j2Var.getValue();
            } while (!j2Var.h(value, themeCustomisationSandboxInteractorImpl$SandboxState));
        }
    }

    @Override // bn2.c
    public final Object f(BackgroundKey backgroundKey, String str, qg7.p pVar) {
        j2 j2Var;
        Object value;
        ThemeCustomisationSandboxInteractorImpl$SandboxState themeCustomisationSandboxInteractorImpl$SandboxState;
        Map map;
        GlobalThemeDeclaration globalThemeDeclaration;
        Map mapG;
        do {
            j2Var = this.f17005j;
            value = j2Var.getValue();
            themeCustomisationSandboxInteractorImpl$SandboxState = (ThemeCustomisationSandboxInteractorImpl$SandboxState) value;
            AppTheme appTheme = themeCustomisationSandboxInteractorImpl$SandboxState.f63798b;
            map = themeCustomisationSandboxInteractorImpl$SandboxState.f63799c;
            globalThemeDeclaration = appTheme.f94561a;
            mapG = (Map) map.get(globalThemeDeclaration);
            if (mapG == null) {
                mapG = r0.g();
            }
        } while (!j2Var.h(value, ThemeCustomisationSandboxInteractorImpl$SandboxState.a(themeCustomisationSandboxInteractorImpl$SandboxState, null, null, r0.q(map, new Pair(globalThemeDeclaration, r0.q(mapG, new Pair(backgroundKey, str)))), 3)));
        return Unit.f186387a;
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("theme_customisation_sandbox_state_key", (Parcelable) this.f17005j.getValue());
    }
}
