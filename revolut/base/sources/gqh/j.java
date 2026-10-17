package gqh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wph.r;
import wph.s;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vph.n f145740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vph.j f145741c;

    public j(vph.n screenerNameInputMapper, vph.j screenerIconsGridMapper, int i) {
        this.f145739a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(screenerNameInputMapper, "screenerNameInputMapper");
                Intrinsics.checkNotNullParameter(screenerIconsGridMapper, "screenerIconsGridMapper");
                this.f145740b = screenerNameInputMapper;
                this.f145741c = screenerIconsGridMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(screenerNameInputMapper, "screenerNameInputMapper");
                Intrinsics.checkNotNullParameter(screenerIconsGridMapper, "screenerIconsGridMapper");
                this.f145740b = screenerNameInputMapper;
                this.f145741c = screenerIconsGridMapper;
                break;
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        switch (this.f145739a) {
            case 0:
                f domainState = (f) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                h hVar = new h(new TextLocalisedClause(R$string.screener_action_save, null, null, 14), domainState.f145732b == moh.a.VALID);
                List listA = this.f145740b.a(domainState.f145731a, domainState.f145732b);
                ugl.c.Companion.getClass();
                return new i(hVar, d0.E0(this.f145741c.a(domainState.f145733c, ugl.b.f280043b), listA));
            default:
                wph.n domainState2 = (wph.n) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                moh.a aVar = domainState2.f299334c;
                r rVar = new r(aVar == moh.a.VALID);
                List listA2 = this.f145740b.a(domainState2.f299333b, aVar);
                ugl.c.Companion.getClass();
                return new s(rVar, d0.E0(this.f145741c.a(domainState2.d, ugl.b.f280043b), listA2));
        }
    }
}
