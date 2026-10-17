package twh;

import ihm.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import od0.i;
import org.jetbrains.annotations.NotNull;
import th9.t;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements pwh.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lpa.a f275026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uwh.a f275027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.c f275028c;
    public ifm.c d;
    public final Object e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0m.b f275029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f275030h;

    public d(lpa.a contextualPromptInterceptor, e dateProvider, uwh.a contextualPromptRepository, lfm.c appDisposable) {
        Intrinsics.checkNotNullParameter(contextualPromptInterceptor, "contextualPromptInterceptor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(contextualPromptRepository, "contextualPromptRepository");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        this.f275026a = contextualPromptInterceptor;
        this.f275027b = contextualPromptRepository;
        this.f275028c = appDisposable;
        this.e = new Object();
        this.f = new ArrayList();
        this.f275029g = new e0m.b(new t(this, 24));
        i.Companion.getClass();
        j jVarD = ihm.b.e(i.f224256b).d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f275030h = jVarD;
    }
}
