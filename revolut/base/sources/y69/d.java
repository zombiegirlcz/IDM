package y69;

import b79.m;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.feature.notification_centre.api.NotificationCentreApi$Toggles;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import s69.j;
import s69.k;
import s69.l;
import xyh.n;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements r69.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b79.c f311235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q06.d f311236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f311237c;

    public d(b79.c repository, q06.d deeplinkParser, gte.a toggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(toggleInteractor, "toggleInteractor");
        this.f311235a = repository;
        this.f311236b = deeplinkParser;
        this.f311237c = toggleInteractor;
    }

    public final String a(s69.d dVar, String str) {
        jf0.c cVarD;
        String str2 = dVar.f260163j;
        if (str2 == null || (cVarD = ((s06.c) this.f311236b).d(str2)) == null) {
            return null;
        }
        return (String) cVarD.d.get(str);
    }

    public final k b() {
        ChatApi$Toggles.SupportNewInbox supportNewInbox = ChatApi$Toggles.SupportNewInbox.f50985c;
        gte.a aVar = this.f311237c;
        if (((jte.d) aVar).c(supportNewInbox)) {
            if (!((jte.d) aVar).c(NotificationCentreApi$Toggles.RevfeedInProfile.f78133c)) {
                if (!((jte.d) aVar).c(NotificationCentreApi$Toggles.OldInboxInProfile.f78132c)) {
                    return k.CHATS;
                }
            }
        }
        return k.PROFILE;
    }

    public final r c() {
        int i = b.f311232a[(t69.a.a(this.f311237c) ? l.REVOLUT_FEED : l.LEGACY_INBOX).ordinal()];
        b79.c cVar = this.f311235a;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m mVar = (m) cVar;
            return mVar.f12964j.f(Unit.f186387a, mVar.i.a("time_based_cache", false));
        }
        j pageParams = new j(null);
        m mVar2 = (m) cVar;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        return rd0.e.c(mVar2.k.c(pageParams, mVar2.i.a("time_based_paging_cache", false)), g.f186406a);
    }

    public final r d() {
        int i = b.f311232a[(t69.a.a(this.f311237c) ? l.REVOLUT_FEED : l.LEGACY_INBOX).ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return nim.a.w(c(), new n(z, 2));
    }
}
