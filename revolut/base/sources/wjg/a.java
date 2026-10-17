package wjg;

import akg.o;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import ekg.g;
import gim.c;
import kotlin.Unit;
import xjg.j;
import xjg.m;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static void a(g gVar) {
        AppTheme appThemeJ = gVar.j();
        ((o) gVar.f127161b).f5953g.k(Unit.f186387a);
        gVar.f127160a.a(appThemeJ.f94561a, appThemeJ.f94562b, appThemeJ.f94563c);
    }

    static /* synthetic */ Object b(g gVar, GlobalThemeDeclaration globalThemeDeclaration, m mVar, j jVar, c cVar, int i) {
        if ((i & 1) != 0) {
            globalThemeDeclaration = null;
        }
        if ((i & 2) != 0) {
            mVar = null;
        }
        if ((i & 4) != 0) {
            jVar = null;
        }
        return gVar.f(globalThemeDeclaration, mVar, jVar, cVar);
    }
}
