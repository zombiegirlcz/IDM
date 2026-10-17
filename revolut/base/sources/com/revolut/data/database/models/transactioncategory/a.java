package com.revolut.data.database.models.transactioncategory;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionCustomCategoryDao_Impl f60180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionCustomCategoryEntity f60181c;

    public /* synthetic */ a(TransactionCustomCategoryDao_Impl transactionCustomCategoryDao_Impl, TransactionCustomCategoryEntity transactionCustomCategoryEntity, int i) {
        this.f60179a = i;
        this.f60180b = transactionCustomCategoryDao_Impl;
        this.f60181c = transactionCustomCategoryEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60179a) {
            case 0:
                return this.f60180b.lambda$insert$0(this.f60181c, (SQLiteConnection) obj2);
            case 1:
                return this.f60180b.lambda$update$3(this.f60181c, (SQLiteConnection) obj2);
            default:
                return this.f60180b.lambda$delete$2(this.f60181c, (SQLiteConnection) obj2);
        }
    }
}
