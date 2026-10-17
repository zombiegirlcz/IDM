package aw1;

import aqd.h1;
import au6.e2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.breb.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv1.a f10665a;

    public s(sv1.a aliasUiMapper) {
        Intrinsics.checkNotNullParameter(aliasUiMapper, "aliasUiMapper");
        this.f10665a = aliasUiMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new n((List) iii.c.f(domainState.f10652a, new e2(23), new h1(24), new a2f.q(this, 21)), new lw0.a(new TextLocalisedClause(R$string.bre_b_key_management_sheet_title, null, null, 14), null, null, new lw0.j("ADD_MENU_ITEM_ID", new fw0.b(null)), false, 22));
    }
}
