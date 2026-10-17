package gai;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.CollectCitizenshipFlowContract$InputData;
import e31.i;
import e7l.g;
import g8i.h;
import ga9.v;
import gaf.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vkm.v1;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements kbl.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f142185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f142186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z70.a f142187c;
    public final CollectCitizenshipFlowContract$InputData d;
    public final Object e;

    public b(fk3.a configurationInteractor, n8b.a countryInteractor, z70.a contextProvider, CollectCitizenshipFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f142185a = configurationInteractor;
        this.f142186b = countryInteractor;
        this.f142187c = contextProvider;
        this.d = inputData;
        this.e = w.y0(new h(this, 2));
    }

    @Override // kbl.a
    public final Flow a() {
        return rd0.e.n(new y(new i(2, 20, null), new v1(new v(this, (Continuation) null, 9))), h0.f322473a);
    }

    @Override // kbl.a
    public final Clause b() {
        return new TextLocalisedClause(R$string.nationality_picker_suggested_title, null, null, 14);
    }

    @Override // kbl.a
    public final Clause c() {
        return new TextLocalisedClause(R$string.nationality_picker_supported_title, null, null, 14);
    }

    @Override // kbl.a
    public final Flow d() {
        return rd0.e.b(nim.a.w(ue0.e.p(((ik3.c) this.f142185a).l(g.b.f123407a, w4l.h.f294642c), h0.f322473a), new l(this, 3)));
    }
}
