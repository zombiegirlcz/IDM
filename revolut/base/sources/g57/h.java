package g57;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f140674b;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data vatReminderData, g gVar, int i) {
        if ((i & 1) != 0) {
            vatReminderData = hVar.f140673a;
        }
        if ((i & 2) != 0) {
            gVar = hVar.f140674b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(vatReminderData, "vatReminderData");
        return new h(vatReminderData, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f140673a, hVar.f140673a) && Intrinsics.f(this.f140674b, hVar.f140674b);
    }

    public final int hashCode() {
        int iHashCode = this.f140673a.hashCode() * 31;
        g gVar = this.f140674b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public h(Data vatReminderData, g gVar) {
        Intrinsics.checkNotNullParameter(vatReminderData, "vatReminderData");
        this.f140673a = vatReminderData;
        this.f140674b = gVar;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
