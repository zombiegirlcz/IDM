package com.revolut.data.database.models.beneficiary;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeneficiaryDao_Impl f60137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeneficiaryEntity f60138c;

    public /* synthetic */ b(BeneficiaryDao_Impl beneficiaryDao_Impl, BeneficiaryEntity beneficiaryEntity, int i) {
        this.f60136a = i;
        this.f60137b = beneficiaryDao_Impl;
        this.f60138c = beneficiaryEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60136a) {
            case 0:
                return this.f60137b.lambda$delete$2(this.f60138c, (SQLiteConnection) obj2);
            case 1:
                return this.f60137b.lambda$update$3(this.f60138c, (SQLiteConnection) obj2);
            default:
                return this.f60137b.lambda$insert$1(this.f60138c, (SQLiteConnection) obj2);
        }
    }
}
