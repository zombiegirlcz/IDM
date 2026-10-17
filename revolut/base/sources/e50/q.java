package e50;

import com.revolut.chat.ui.inbox.InboxScreenContract$DomainState;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.youTransactor.uCube.rpc.Constants;
import e40.w;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tse.l f122692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f122693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.c f122694c;

    public q(tse.l ticketsWidgetUiMapper, w ticketTilesFactory, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(ticketsWidgetUiMapper, "ticketsWidgetUiMapper");
        Intrinsics.checkNotNullParameter(ticketTilesFactory, "ticketTilesFactory");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f122692a = ticketsWidgetUiMapper;
        this.f122693b = ticketTilesFactory;
        this.f122694c = chatFeatureToggles;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.joda.time.Instant a(e50.q r7, qv0.i r8) {
        /*
            boolean r7 = r8 instanceof qv0.p
            if (r7 == 0) goto Lc
            r7 = r8
            qv0.p r7 = (qv0.p) r7
            java.lang.Object r7 = r7.getF55191g()
            goto L26
        Lc:
            boolean r7 = r8 instanceof com.revolut.core.ui_kit.delegates.wh
            r0 = 0
            if (r7 == 0) goto L25
            r7 = r8
            com.revolut.core.ui_kit.delegates.wh r7 = (com.revolut.core.ui_kit.delegates.wh) r7
            qv0.i r7 = r7.f54925b
            boolean r1 = r7 instanceof qv0.p
            if (r1 == 0) goto L1d
            qv0.p r7 = (qv0.p) r7
            goto L1e
        L1d:
            r7 = r0
        L1e:
            if (r7 == 0) goto L25
            java.lang.Object r7 = r7.getF55191g()
            goto L26
        L25:
            r7 = r0
        L26:
            boolean r0 = r7 instanceof v30.y
            if (r0 == 0) goto L30
            v30.y r7 = (v30.y) r7
            org.joda.time.Instant r7 = r7.e
            return r7
        L30:
            boolean r0 = r7 instanceof v30.g0
            if (r0 == 0) goto L5f
            r8 = r7
            v30.g0 r8 = (v30.g0) r8
            boolean r0 = r8 instanceof v30.d0
            if (r0 == 0) goto L40
            v30.d0 r7 = (v30.d0) r7
            org.joda.time.Instant r7 = r7.f285763b
            return r7
        L40:
            v30.e0 r7 = v30.e0.f285765a
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L57
            v30.f0 r7 = v30.f0.f285773a
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L51
            goto L57
        L51:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L57:
            org.joda.time.Instant r7 = org.joda.time.Instant.EPOCH
            java.lang.String r8 = "EPOCH"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        L5f:
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r1 = rd0.c.DEBUG
            java.lang.String r8 = r8.getF55007b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve timestamp: listId="
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = ", parcel="
            r0.append(r8)
            r0.append(r7)
            java.lang.String r3 = r0.toString()
            r5 = 0
            r6 = 16
            java.lang.String r2 = "InboxScreenMapper"
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            org.joda.time.Instant r7 = org.joda.time.Instant.EPOCH
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e50.q.a(e50.q, qv0.i):org.joda.time.Instant");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listP0;
        InboxScreenContract$DomainState domainState = (InboxScreenContract$DomainState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f51167a;
        Data data2 = domainState.f51168b;
        Collection collection = zi0.c.D(data) ? f0.f322471a : (List) iii.c.f(domainState.f51167a, new e1.b(this, domainState, 20), new a8a.a(this, domainState, 24), new o(this, domainState));
        Data data3 = domainState.i;
        Data data4 = domainState.e;
        if (zi0.c.D(data2) || zi0.c.D(data4) || zi0.c.D(data3)) {
            aim.e eVarB = zhm.u.b();
            nb0 nb0Var = pb0.Companion;
            eVarB.add(nb0.b(nb0Var, "ID_LOADING_FEED_SUPPORT", false, 0, false, 30));
            if (((rf3.d) this.f122694c).d()) {
                eVarB.add(nb0.b(nb0Var, "ID_LOADING_FEED_ASSISTANT", false, 0, false, 30));
            }
            eVarB.add(nb0.b(nb0Var, "ID_LOADING_NEWSFEED", false, 0, false, 30));
            aim.e eVarA = zhm.u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            listP0 = eVarA;
        } else {
            listP0 = d0.P0(d0.E0((List) iii.c.f(data3, new e4k.f(10), new e07.k(21), new dob.a(11)), d0.E0((List) iii.c.f(data4, new e4k.f(11), new e07.k(22), new dbg.b(this, 23)), (List) iii.c.f(data2, new e4k.f(12), new e07.k(20), new o(domainState, this)))), new a9j.f(this, 26));
            yp0.b.k(listP0, 0, 0, 0, 0, 31);
        }
        ArrayList arrayListE0 = d0.E0(listP0, collection);
        List listL = v.l((domainState.f || domainState.f51170g) ? new IconNavBarMenuItem("PAST_REQUESTS_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_archive, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.chat_list_past_requests_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : null);
        List list = (List) domainState.f51171h.getContent();
        if (list == null) {
            list = f0.f322471a;
        }
        return new n(arrayListE0, listL, list);
    }
}
