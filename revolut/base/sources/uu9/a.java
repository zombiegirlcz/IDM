package uu9;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import defpackage.e1;
import do3.n;
import efm.d0;
import efm.r;
import ipa.j;
import kog.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pfm.m;
import rfm.l;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f283172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f283173c;

    public /* synthetic */ a(c cVar, j jVar, int i) {
        this.f283171a = i;
        this.f283172b = cVar;
        this.f283173c = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarM;
        switch (this.f283171a) {
            case 0:
                Boolean isActive = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isActive, "isActive");
                if (isActive.booleanValue()) {
                    return m.f235744a;
                }
                c cVar = this.f283172b;
                d0 d0VarF = cVar.d.f(false);
                j jVar = this.f283173c;
                i iVar = new i(d0VarF, new up5.d0(18, new a(cVar, jVar, 2)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                pfm.a aVar = new pfm.a(new i(iVar, new up5.d0(16, new a(cVar, jVar, 1)), 0), new up5.d0(17, new b(cVar, 0)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 1:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                n nVar = (n) hVar.f288433a;
                ipa.n messageAuthor = (ipa.n) hVar.f288434b;
                vu9.a aVar2 = (vu9.a) hVar.f288435c;
                String newMessage = (String) hVar.d;
                c cVar2 = this.f283172b;
                pu9.e eVar = cVar2.f;
                j jVar2 = this.f283173c;
                String conversationId = hx7.a.d(jVar2);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(messageAuthor, "messageAuthor");
                Intrinsics.checkNotNullParameter(newMessage, "newMessage");
                ku9.d dVar = eVar.f239842a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                StatusBarNotification[] activeNotifications = ((NotificationManager) dVar.f189760b.getValue()).getActiveNotifications();
                Intrinsics.checkNotNullExpressionValue(activeNotifications, "getActiveNotifications(...)");
                r rVarFilter = r.fromIterable(kotlin.collections.d.v0(activeNotifications)).filter(new ksb.a(new k7c.n(conversationId, 19), 10));
                Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                d0 list = w.a0(rVarFilter, new ksk.h(13)).flatMap(new ksb.a(new ksk.h(14), 11)).map(new ksb.a(new ksk.h(15), 12)).flatMapSingle(new ksb.a(new k(dVar, 23), 13)).toList();
                Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
                prl.n nVar2 = new prl.n(9, new pth.m(messageAuthor, newMessage, 1));
                list.getClass();
                i iVar2 = new i(list, nVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return new i(iVar2, new up5.d0(13, new ryd.f(cVar2, jVar2, nVar, aVar2, messageAuthor, 9)), 0);
            default:
                n currentUser = (n) obj2;
                Intrinsics.checkNotNullParameter(currentUser, "currentUser");
                c cVar3 = this.f283172b;
                u0a.a aVar3 = cVar3.e;
                j pushMessage = this.f283173c;
                Intrinsics.checkNotNullParameter(pushMessage, "message");
                Intrinsics.checkNotNullParameter(currentUser, "currentUser");
                i iVar3 = new i(((pv9.d) ((cv9.a) aVar3.f276162b)).j(), new up5.d0(19, new toh.h(currentUser, 29, pushMessage, aVar3)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                h hVar2 = cVar3.f283180h;
                Intrinsics.checkNotNullParameter(pushMessage, "pushMessage");
                if (hx7.a.f(pushMessage) != null) {
                    Intrinsics.checkNotNullParameter(pushMessage, "<this>");
                    String str = (String) pushMessage.get("group_picture");
                    ufm.b bVar = new ufm.b(new e1(hVar2, (str == null || str.length() == 0) ? lq9.a.f199213b : new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), 7), 0);
                    Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
                    d0VarM = new i(bVar, new up5.d0(21, new b(pushMessage, 1)), 1);
                } else {
                    od0.i.Companion.getClass();
                    d0VarM = d0.m(od0.i.f224256b);
                    Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                }
                u0a.a aVar4 = cVar3.f283179g;
                Intrinsics.checkNotNullParameter(pushMessage, "pushMessage");
                String strC = ipa.k.c(pushMessage);
                if (strC == null) {
                    strC = "";
                }
                String strA = ipa.k.a(pushMessage);
                if (strA == null) {
                    strA = "";
                }
                String strC2 = ipa.k.c(pushMessage);
                rfm.m mVarH = ((yf.c) aVar4.f276163c).h(strC2 != null ? strC2 : "");
                ufm.b bVarM = d0.m(strA);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                l lVarL = mVarH.l(bVarM);
                Intrinsics.checkNotNullExpressionValue(lVarL, "switchIfEmpty(...)");
                i iVar4 = new i(lVarL, new ty1.c(new twg.a(aVar4, strC, 14), 27), 0);
                Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                return new i(w.I0(iVar3, d0VarM, iVar4), new up5.d0(14, new a2f.j(currentUser, 19)), 1);
        }
    }
}
