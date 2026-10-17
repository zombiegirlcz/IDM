package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.revolut.feature.statements.impl.tools.transactions.InternalTransactionType;
import com.revolut.feature.statements.impl.tools.transactions.TransactionState;
import com.revolut.feature.statements.impl.tools.transactions.TransactionType;
import com.revolut.feature.statements.impl.tools.transactions.extras.MccType;
import com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements r, kfm.p, zk0.c, yil.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f49629b;

    public /* synthetic */ d(String str, int i) {
        this.f49628a = i;
        this.f49629b = str;
    }

    @Override // com.google.gson.internal.r
    public Object construct() {
        switch (this.f49628a) {
            case 0:
                throw new JsonIOException(this.f49629b);
            case 1:
                throw new JsonIOException(this.f49629b);
            default:
                throw new JsonIOException(this.f49629b);
        }
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        byte[] bytes = this.f49629b.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        outputStream.write(bytes);
    }

    @Override // yil.a
    public String generate() {
        return this.f49629b;
    }

    @Override // kfm.p
    public boolean test(Object obj2) {
        switch (this.f49628a) {
            case 3:
                return InternalTransactionType.lambda$parse$0(this.f49629b, (InternalTransactionType) obj2);
            case 4:
                return TransactionState.lambda$parse$0(this.f49629b, (TransactionState) obj2);
            case 5:
                return TransactionType.lambda$parse$0(this.f49629b, (TransactionType) obj2);
            case 6:
                return MccType.lambda$parse$0(this.f49629b, (MccType) obj2);
            default:
                return TopUpMethod.lambda$parse$0(this.f49629b, (TopUpMethod) obj2);
        }
    }
}
