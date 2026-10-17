package com.revolut.data.database.models.beneficiary;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeneficiaryDao_Impl f60135b;

    public /* synthetic */ a(BeneficiaryDao_Impl beneficiaryDao_Impl, int i) {
        this.f60134a = i;
        this.f60135b = beneficiaryDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60134a) {
            case 0:
                return this.f60135b.lambda$getAllSync$4((SQLiteConnection) obj2);
            default:
                return this.f60135b.lambda$observeRecent$6((SQLiteConnection) obj2);
        }
    }
}
