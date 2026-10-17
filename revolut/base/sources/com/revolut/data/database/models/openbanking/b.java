package com.revolut.data.database.models.openbanking;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConsentsDao_Impl f60154b;

    public /* synthetic */ b(ConsentsDao_Impl consentsDao_Impl, int i) {
        this.f60153a = i;
        this.f60154b = consentsDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60153a) {
            case 0:
                return this.f60154b.lambda$getAllActive$3((SQLiteConnection) obj2);
            default:
                return this.f60154b.lambda$getAllInactive$4((SQLiteConnection) obj2);
        }
    }
}
