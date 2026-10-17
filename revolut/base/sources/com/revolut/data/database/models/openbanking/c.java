package com.revolut.data.database.models.openbanking;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExternalInstitutionsDao_Impl f60156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f60157c;

    public /* synthetic */ c(ExternalInstitutionsDao_Impl externalInstitutionsDao_Impl, List list, int i) {
        this.f60155a = i;
        this.f60156b = externalInstitutionsDao_Impl;
        this.f60157c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60155a) {
            case 0:
                return this.f60156b.lambda$saveAllInstitutions$0(this.f60157c, (SQLiteConnection) obj2);
            case 1:
                return this.f60156b.lambda$updateAll$2(this.f60157c, (SQLiteConnection) obj2);
            default:
                return this.f60156b.lambda$saveInstitutionBranches$1(this.f60157c, (SQLiteConnection) obj2);
        }
    }
}
