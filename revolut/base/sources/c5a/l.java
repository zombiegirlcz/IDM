package c5a;

import aw0.k9;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.payments.who_to_transfer.impl.ui.chats.a f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f21499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f21500c;
    public final List d;
    public final e3a.a e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f21501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ks8.j f21502h;
    public final k9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n38.a f21503j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NavBarWithContainerBackground f21504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f21505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y80.d f21506n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f21507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final NavBarMessage f21508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f21509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Data f21510s;

    public l(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.a navBarTitleMode, Data recipients, Data showBirthdayLabel, List pinnedRecipients, e3a.a aVar, boolean z, List npsContent, ks8.j jVar, k9 searchFieldExtraButtons, n38.a aVar2, Data slotManagerItems, NavBarWithContainerBackground navBarWithContainerBackground, List localContacts, y80.d contactPermissionState, boolean z3, boolean z4, NavBarMessage navBarMessage, boolean z6, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(navBarTitleMode, "navBarTitleMode");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(showBirthdayLabel, "showBirthdayLabel");
        Intrinsics.checkNotNullParameter(pinnedRecipients, "pinnedRecipients");
        Intrinsics.checkNotNullParameter(npsContent, "npsContent");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(localContacts, "localContacts");
        Intrinsics.checkNotNullParameter(contactPermissionState, "contactPermissionState");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f21498a = navBarTitleMode;
        this.f21499b = recipients;
        this.f21500c = showBirthdayLabel;
        this.d = pinnedRecipients;
        this.e = aVar;
        this.f = z;
        this.f21501g = npsContent;
        this.f21502h = jVar;
        this.i = searchFieldExtraButtons;
        this.f21503j = aVar2;
        this.k = slotManagerItems;
        this.f21504l = navBarWithContainerBackground;
        this.f21505m = localContacts;
        this.f21506n = contactPermissionState;
        this.o = z3;
        this.f21507p = z4;
        this.f21508q = navBarMessage;
        this.f21509r = z6;
        this.f21510s = legalEntityContext;
    }

    public static l a(l lVar, o oVar, Data data, Data data2, List list, e3a.a aVar, boolean z, List list2, ks8.j jVar, k9 k9Var, n38.a aVar2, Data data3, NavBarWithContainerBackground navBarWithContainerBackground, List list3, y80.d dVar, boolean z3, boolean z4, NavBarMessage navBarMessage, boolean z6, Data data4, int i) {
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.a navBarTitleMode = (i & 1) != 0 ? lVar.f21498a : oVar;
        Data recipients = (i & 2) != 0 ? lVar.f21499b : data;
        Data showBirthdayLabel = (i & 4) != 0 ? lVar.f21500c : data2;
        List pinnedRecipients = (i & 8) != 0 ? lVar.d : list;
        e3a.a aVar3 = (i & 16) != 0 ? lVar.e : aVar;
        boolean z11 = (i & 32) != 0 ? lVar.f : z;
        List npsContent = (i & 64) != 0 ? lVar.f21501g : list2;
        ks8.j jVar2 = (i & 128) != 0 ? lVar.f21502h : jVar;
        k9 searchFieldExtraButtons = (i & 256) != 0 ? lVar.i : k9Var;
        n38.a aVar4 = (i & 512) != 0 ? lVar.f21503j : aVar2;
        Data slotManagerItems = (i & 1024) != 0 ? lVar.k : data3;
        NavBarWithContainerBackground navBarWithContainerBackground2 = (i & 2048) != 0 ? lVar.f21504l : navBarWithContainerBackground;
        List localContacts = (i & 4096) != 0 ? lVar.f21505m : list3;
        y80.d contactPermissionState = (i & 8192) != 0 ? lVar.f21506n : dVar;
        e3a.a aVar5 = aVar3;
        boolean z12 = (i & 16384) != 0 ? lVar.o : z3;
        boolean z29 = (i & 32768) != 0 ? lVar.f21507p : z4;
        NavBarMessage navBarMessage2 = (i & 65536) != 0 ? lVar.f21508q : navBarMessage;
        boolean z31 = (i & 131072) != 0 ? lVar.f21509r : z6;
        Data legalEntityContext = (i & 262144) != 0 ? lVar.f21510s : data4;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(navBarTitleMode, "navBarTitleMode");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(showBirthdayLabel, "showBirthdayLabel");
        Intrinsics.checkNotNullParameter(pinnedRecipients, "pinnedRecipients");
        Intrinsics.checkNotNullParameter(npsContent, "npsContent");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(localContacts, "localContacts");
        Intrinsics.checkNotNullParameter(contactPermissionState, "contactPermissionState");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new l(navBarTitleMode, recipients, showBirthdayLabel, pinnedRecipients, aVar5, z11, npsContent, jVar2, searchFieldExtraButtons, aVar4, slotManagerItems, navBarWithContainerBackground2, localContacts, contactPermissionState, z12, z29, navBarMessage2, z31, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f21498a, lVar.f21498a) && Intrinsics.f(this.f21499b, lVar.f21499b) && Intrinsics.f(this.f21500c, lVar.f21500c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f == lVar.f && Intrinsics.f(this.f21501g, lVar.f21501g) && Intrinsics.f(this.f21502h, lVar.f21502h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f21503j, lVar.f21503j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f21504l, lVar.f21504l) && Intrinsics.f(this.f21505m, lVar.f21505m) && this.f21506n == lVar.f21506n && this.o == lVar.o && this.f21507p == lVar.f21507p && Intrinsics.f(this.f21508q, lVar.f21508q) && this.f21509r == lVar.f21509r && Intrinsics.f(this.f21510s, lVar.f21510s);
    }

    public final int hashCode() {
        int iD = p.a.d(kii.e.c(this.f21500c, kii.e.c(this.f21499b, this.f21498a.hashCode() * 31, 31), 31), 31, this.d);
        e3a.a aVar = this.e;
        int iD2 = p.a.d(j6.a.c((iD + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f), 31, this.f21501g);
        ks8.j jVar = this.f21502h;
        int iHashCode = (this.i.hashCode() + ((iD2 + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31;
        n38.a aVar2 = this.f21503j;
        int iC = kii.e.c(this.k, (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31);
        NavBarWithContainerBackground navBarWithContainerBackground = this.f21504l;
        int iC2 = j6.a.c(j6.a.c((this.f21506n.hashCode() + p.a.d((iC + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode())) * 31, 31, this.f21505m)) * 31, 31, this.o), 31, this.f21507p);
        NavBarMessage navBarMessage = this.f21508q;
        return this.f21510s.hashCode() + j6.a.c((iC2 + (navBarMessage != null ? navBarMessage.hashCode() : 0)) * 31, 31, this.f21509r);
    }
}
