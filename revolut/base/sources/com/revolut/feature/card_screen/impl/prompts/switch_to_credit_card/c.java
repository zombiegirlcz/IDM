package com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import h93.f0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m93.g;
import org.jetbrains.annotations.NotNull;
import xo8.j0;
import y5g.l;
import y66.p;
import y83.f;
import y83.h;
import y83.j;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f65522a;

    public c(g cardMapper) {
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        this.f65522a = cardMapper;
    }

    public static ArrayList a(String str) {
        nb0 nb0Var = pb0.Companion;
        return yp0.b.h(v.k(nb0.a(nb0Var, str.concat("_1"), false, 6), nb0.a(nb0Var, str.concat("_2"), false, 6)), new gu(str.concat("_header"), 0, 0, 30), null, 0, 126);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = (f0) domainState.f311624a.getContent();
        return new h(c8g.c.p(f0Var != null ? new TextLocalisedClause(R$string.card_switch_to_credit_title, u.c(f0Var.I), null, 12) : null), d0.E0((List) iii.c.f(domainState.f311625b, new p(this, 21), new y65.n(8), new j0(this, 18)), (List) iii.c.f(domainState.f311624a, new p(this, 20), new y65.n(7), new l(this, 1))));
    }
}
