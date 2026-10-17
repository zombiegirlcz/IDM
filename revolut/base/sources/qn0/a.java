package qn0;

import kotlin.jvm.internal.Intrinsics;
import rn0.b;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn0.b f247853a;

    public a(sn0.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f247853a = repository;
    }

    @Override // rn0.b
    public final rn0.a a() {
        String string = this.f247853a.f264471a.getString("nav_bar_background_id", null);
        if (string != null) {
            return new rn0.a(string);
        }
        return null;
    }

    @Override // rn0.b
    public final void b(String themeId) {
        Intrinsics.checkNotNullParameter(themeId, "themeId");
        Intrinsics.checkNotNullParameter(themeId, "themeId");
        this.f247853a.f264471a.edit().putString("key_last_default_theme_id", themeId).apply();
    }

    @Override // rn0.b
    public final void c() {
        this.f247853a.f264471a.edit().clear().apply();
    }

    @Override // rn0.b
    public final void d(rn0.a background) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f247853a.f264471a.edit().putString("nav_bar_background_id", background.f255386a).apply();
    }

    @Override // rn0.b
    public final String e() {
        return this.f247853a.f264471a.getString("key_last_default_theme_id", null);
    }
}
