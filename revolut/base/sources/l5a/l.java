package l5a;

import aw0.k9;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5a.a f192202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9 f192203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainerBackground f192204c;
    public final Data d;
    public final y80.d e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f192205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NavBarMessage f192206h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f192207j;

    public l(i5a.a aVar, k9 searchFieldActionButtons, NavBarWithContainerBackground navBarWithContainerBackground, Data localContacts, y80.d contactPermissionStatus, boolean z, k createFirstTransferStubsState, NavBarMessage navBarMessage, boolean z3, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
        Intrinsics.checkNotNullParameter(localContacts, "localContacts");
        Intrinsics.checkNotNullParameter(contactPermissionStatus, "contactPermissionStatus");
        Intrinsics.checkNotNullParameter(createFirstTransferStubsState, "createFirstTransferStubsState");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f192202a = aVar;
        this.f192203b = searchFieldActionButtons;
        this.f192204c = navBarWithContainerBackground;
        this.d = localContacts;
        this.e = contactPermissionStatus;
        this.f = z;
        this.f192205g = createFirstTransferStubsState;
        this.f192206h = navBarMessage;
        this.i = z3;
        this.f192207j = legalEntityContext;
    }

    public static l a(l lVar, i5a.a aVar, k9 k9Var, NavBarWithContainerBackground navBarWithContainerBackground, Data data, y80.d dVar, boolean z, k kVar, NavBarMessage navBarMessage, boolean z3, Data data2, int i) {
        if ((i & 1) != 0) {
            aVar = lVar.f192202a;
        }
        i5a.a aVar2 = aVar;
        if ((i & 2) != 0) {
            k9Var = lVar.f192203b;
        }
        k9 searchFieldActionButtons = k9Var;
        if ((i & 4) != 0) {
            navBarWithContainerBackground = lVar.f192204c;
        }
        NavBarWithContainerBackground navBarWithContainerBackground2 = navBarWithContainerBackground;
        if ((i & 8) != 0) {
            data = lVar.d;
        }
        Data localContacts = data;
        y80.d contactPermissionStatus = (i & 16) != 0 ? lVar.e : dVar;
        boolean z4 = (i & 32) != 0 ? lVar.f : z;
        k createFirstTransferStubsState = (i & 64) != 0 ? lVar.f192205g : kVar;
        NavBarMessage navBarMessage2 = (i & 128) != 0 ? lVar.f192206h : navBarMessage;
        boolean z6 = (i & 256) != 0 ? lVar.i : z3;
        Data legalEntityContext = (i & 512) != 0 ? lVar.f192207j : data2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
        Intrinsics.checkNotNullParameter(localContacts, "localContacts");
        Intrinsics.checkNotNullParameter(contactPermissionStatus, "contactPermissionStatus");
        Intrinsics.checkNotNullParameter(createFirstTransferStubsState, "createFirstTransferStubsState");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new l(aVar2, searchFieldActionButtons, navBarWithContainerBackground2, localContacts, contactPermissionStatus, z4, createFirstTransferStubsState, navBarMessage2, z6, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f192202a, lVar.f192202a) && Intrinsics.f(this.f192203b, lVar.f192203b) && Intrinsics.f(this.f192204c, lVar.f192204c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && this.f == lVar.f && this.f192205g == lVar.f192205g && Intrinsics.f(this.f192206h, lVar.f192206h) && this.i == lVar.i && Intrinsics.f(this.f192207j, lVar.f192207j);
    }

    public final int hashCode() {
        i5a.a aVar = this.f192202a;
        int iHashCode = (this.f192203b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.f192204c;
        int iHashCode2 = (this.f192205g.hashCode() + j6.a.c((this.e.hashCode() + kii.e.c(this.d, (iHashCode + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode())) * 31, 31)) * 31, 31, this.f)) * 31;
        NavBarMessage navBarMessage = this.f192206h;
        return this.f192207j.hashCode() + j6.a.c((iHashCode2 + (navBarMessage != null ? navBarMessage.hashCode() : 0)) * 31, 31, this.i);
    }
}
