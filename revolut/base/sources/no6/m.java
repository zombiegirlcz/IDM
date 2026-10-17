package no6;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends oki.h implements f {

    @NotNull
    public static final h Companion = new h();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oe6.a f217928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oe6.h f217929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lo6.a f217930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lo6.c f217931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f217932t;

    public m(c inputData, oe6.a externalInstitutionsInteractor, oe6.h linkPlaidInstitutionInteractor, lo6.a dialogsProvider, lo6.c eventsParser, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(linkPlaidInstitutionInteractor, "linkPlaidInstitutionInteractor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(eventsParser, "eventsParser");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f217928p = externalInstitutionsInteractor;
        this.f217929q = linkPlaidInstitutionInteractor;
        this.f217930r = dialogsProvider;
        this.f217931s = eventsParser;
        this.f217932t = mra.d.b(this, new b(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f217932t;
    }
}
