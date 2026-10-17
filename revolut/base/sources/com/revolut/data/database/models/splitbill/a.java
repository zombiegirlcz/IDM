package com.revolut.data.database.models.splitbill;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplitBillDao_Impl f60170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f60171c;

    public /* synthetic */ a(SplitBillDao_Impl splitBillDao_Impl, List list, int i) {
        this.f60169a = i;
        this.f60170b = splitBillDao_Impl;
        this.f60171c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60169a) {
            case 0:
                return this.f60170b.lambda$replaceAll$2(this.f60171c, (SQLiteConnection) obj2);
            default:
                return this.f60170b.lambda$createOrUpdateSplitBills$0(this.f60171c, (SQLiteConnection) obj2);
        }
    }
}
