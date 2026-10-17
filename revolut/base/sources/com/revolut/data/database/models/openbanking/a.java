package com.revolut.data.database.models.openbanking;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConsentsDao_Impl f60151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f60152c;

    public /* synthetic */ a(ConsentsDao_Impl consentsDao_Impl, List list, int i) {
        this.f60150a = i;
        this.f60151b = consentsDao_Impl;
        this.f60152c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60150a) {
            case 0:
                return this.f60151b.lambda$updateAllInactive$2(this.f60152c, (SQLiteConnection) obj2);
            case 1:
                return this.f60151b.lambda$updateAll$1(this.f60152c, (SQLiteConnection) obj2);
            default:
                return this.f60151b.lambda$saveAll$0(this.f60152c, (SQLiteConnection) obj2);
        }
    }
}
