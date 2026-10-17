package twh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import efm.r;
import ihm.j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import od0.h;
import od0.i;
import ts5.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f275023b;

    public /* synthetic */ a(d dVar, int i) {
        this.f275022a = i;
        this.f275023b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275022a) {
            case 0:
                lpa.b bVar = (lpa.b) obj2;
                Long l2 = bVar.f;
                if (l2 == null || l2.longValue() >= System.currentTimeMillis()) {
                    d dVar = this.f275023b;
                    ifm.c cVar = dVar.d;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    ifm.c cVarSubscribe = r.just(Unit.f186387a).delay(5L, TimeUnit.SECONDS).subscribe(new o(17, new a(dVar, 1)));
                    dVar.d = cVarSubscribe;
                    dVar.f275028c.a(cVarSubscribe);
                    j jVar = dVar.f275030h;
                    h hVar = i.Companion;
                    String str = bVar.f198962a;
                    String str2 = bVar.f198963b;
                    String str3 = bVar.d;
                    String str4 = bVar.e;
                    pwh.a aVar = null;
                    if (str != null && str2 != null && str3 != null && str4 != null) {
                        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str5 = bVar.f198964c;
                        aVar = new pwh.a(str, textClause, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), str4);
                    }
                    hVar.getClass();
                    jVar.onNext(h.a(aVar));
                }
                break;
            default:
                j jVar2 = this.f275023b.f275030h;
                i.Companion.getClass();
                jVar2.onNext(i.f224256b);
                break;
        }
        return Unit.f186387a;
    }
}
