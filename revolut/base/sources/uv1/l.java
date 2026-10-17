package uv1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f283279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f283280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f283281c;
    public final Data d;
    public final Data e;

    public l() {
        this(0);
    }

    public static l a(l lVar, Data data, k kVar, Data data2, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = lVar.f283279a;
        }
        Data aliases = data;
        if ((i & 2) != 0) {
            kVar = lVar.f283280b;
        }
        k contactsState = kVar;
        if ((i & 4) != 0) {
            data2 = lVar.f283281c;
        }
        Data legalEntityContext = data2;
        if ((i & 8) != 0) {
            data3 = lVar.d;
        }
        Data qrInfoData = data3;
        if ((i & 16) != 0) {
            data4 = lVar.e;
        }
        Data transactionInfo = data4;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(contactsState, "contactsState");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(qrInfoData, "qrInfoData");
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        return new l(aliases, contactsState, legalEntityContext, qrInfoData, transactionInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f283279a, lVar.f283279a) && Intrinsics.f(this.f283280b, lVar.f283280b) && Intrinsics.f(this.f283281c, lVar.f283281c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f283281c, (this.f283280b.hashCode() + (this.f283279a.hashCode() * 31)) * 31, 31), 31);
    }

    public l(Data aliases, k contactsState, Data legalEntityContext, Data qrInfoData, Data transactionInfo) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(contactsState, "contactsState");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(qrInfoData, "qrInfoData");
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        this.f283279a = aliases;
        this.f283280b = contactsState;
        this.f283281c = legalEntityContext;
        this.d = qrInfoData;
        this.e = transactionInfo;
    }

    public /* synthetic */ l(int i) {
        this(new Data(null, null, true, 3, null), new k(0), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
