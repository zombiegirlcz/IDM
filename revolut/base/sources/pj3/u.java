package pj3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.feature.cms.stories.impl.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements cli.n {

    @NotNull
    private static final s Companion = new s();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g80.c f236657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f236658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fj3.f f236659c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.g(3, pkm.e.SECONDS);
    }

    public u(g80.c urlHelper, f01.a uiKitResources, fj3.f theme) {
        Intrinsics.checkNotNullParameter(urlHelper, "urlHelper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f236657a = urlHelper;
        this.f236658b = uiKitResources;
        this.f236659c = theme;
    }

    public static TextLocalisedClause b() {
        return new TextLocalisedClause(R$string.communication_story_revamp_button_skip, null, null, 14);
    }

    public final yw0.g a() {
        return new yw0.g(new TextLocalisedClause(R$string.communication_story_revamp_error_title, null, null, 14), new TextLocalisedClause(R$string.communication_story_revamp_error_button, null, null, 14), this.f236659c.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c4, code lost:
    
        r2 = r14;
     */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r29) {
        /*
            Method dump skipped, instruction units count: 1360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pj3.u.c(cli.j):cli.o");
    }

    public final n14.e d(hj3.b bVar, boolean z) {
        String strA;
        String str;
        String strA2;
        n14.e dVar;
        String str2 = bVar.f152655a;
        String str3 = bVar.f152656b;
        g80.c cVar = this.f236657a;
        if (str2 != null) {
            try {
                strA = ((g80.a) cVar).a(str2);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                strA = null;
            }
            str = strA;
        } else {
            str = null;
        }
        try {
            strA2 = ((g80.a) cVar).a(str3);
        } catch (Exception e2) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
            strA2 = null;
        }
        boolean zJ = strA2 != null ? d0.J(strA2, "video", false) : false;
        boolean zJ2 = str != null ? d0.J(str, "video", false) : false;
        if (str2 == null || zJ == zJ2) {
            if (zJ || zJ2) {
                dVar = new yw0.d(z, new UrlVideo(str2 == null ? str3 : str2, bVar.f152656b, false, (oz0.b) null, false, (oz0.c) null, 124));
            } else {
                dVar = new yw0.c(d, new UrlImage(str2 == null ? str3 : str2, bVar.f152656b, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524284), z);
            }
            return dVar;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.s("Light and dark URLs have different MIME types: light=", str, ", dark=", strA2));
        h0 h0Var3 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CmsStoriesStateMapper", null, illegalArgumentException, h0Var3);
        return null;
    }

    public final yw0.e e(hj3.c cVar) {
        s sVar = Companion;
        String str = cVar.f152658b;
        sVar.getClass();
        return new yw0.e(new TextLocalisedClause(R$string.communication_story_revamp_badge_text, zhm.u.c(str), null, 12), Integer.valueOf(this.f236658b.a(cVar.f152657a)));
    }

    public final yw0.l f(hj3.g gVar) {
        String str;
        n14.e eVarD = d(gVar.e, false);
        if (eVarD == null || (str = gVar.f152663c) == null) {
            return null;
        }
        s sVar = Companion;
        TextLocalisedClause textLocalisedClauseD = s.d(sVar, str);
        String str2 = gVar.d;
        TextLocalisedClause textLocalisedClauseC = str2 != null ? s.c(sVar, str2) : null;
        hj3.c cVar = gVar.f152662b;
        return new yw0.l(eVarD, textLocalisedClauseD, textLocalisedClauseC, cVar != null ? e(cVar) : null);
    }

    public final yw0.o g(hj3.g gVar) {
        n14.e eVarD = d(gVar.e, false);
        if (eVarD == null) {
            return null;
        }
        String str = gVar.f152663c;
        TextLocalisedClause textLocalisedClauseD = str != null ? s.d(Companion, str) : null;
        String str2 = gVar.d;
        TextLocalisedClause textLocalisedClauseC = str2 != null ? s.c(Companion, str2) : null;
        hj3.c cVar = gVar.f152662b;
        return new yw0.o(eVarD, textLocalisedClauseD, textLocalisedClauseC, cVar != null ? e(cVar) : null);
    }
}
