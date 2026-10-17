package oj2;

import android.net.Uri;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreen;
import com.revolut.kompot.common.ExternalDestination;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o23.l;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArticleWebViewScreen f225713w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ArticleWebViewScreen articleWebViewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225713w = articleWebViewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f225713w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f225713w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strR;
        int i = this.u;
        ArticleWebViewScreen articleWebViewScreen = this.f225713w;
        switch (i) {
            case 0:
                String url2 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarE3 = articleWebViewScreen.R2();
                Intrinsics.h(url2);
                i iVar = (i) fVarE3;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                Uri uri2 = Uri.parse(url2);
                String scheme = uri2.getScheme();
                Continuation continuation = null;
                if (scheme != null) {
                    Locale locale = Locale.ROOT;
                    strR = p.a.r(locale, "ROOT", scheme, locale, "toLowerCase(...)");
                } else {
                    strR = null;
                }
                if (iVar.f225720q.y1(url2)) {
                    iVar.l2(new oh4.i(3, iVar, url2, continuation), new yi5.b(26));
                } else if (d0.T(i.f225718t, strR) && uri2.getHost() != null) {
                    iVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, uri2, 0, null, 494));
                }
                break;
            default:
                String title = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarE32 = articleWebViewScreen.R2();
                Intrinsics.h(title);
                i iVar2 = (i) fVarE32;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                iVar2.H2(iVar2.f225722s, new l(title, 21));
                break;
        }
        return Unit.f186387a;
    }
}
