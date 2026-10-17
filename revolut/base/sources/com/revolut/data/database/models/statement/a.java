package com.revolut.data.database.models.statement;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatementTemplatesInfoDao_Impl f60175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StatementTemplateInfoEntity f60176c;

    public /* synthetic */ a(StatementTemplatesInfoDao_Impl statementTemplatesInfoDao_Impl, StatementTemplateInfoEntity statementTemplateInfoEntity, int i) {
        this.f60174a = i;
        this.f60175b = statementTemplatesInfoDao_Impl;
        this.f60176c = statementTemplateInfoEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60174a) {
            case 0:
                return this.f60175b.lambda$insert$0(this.f60176c, (SQLiteConnection) obj2);
            case 1:
                return this.f60175b.lambda$update$2(this.f60176c, (SQLiteConnection) obj2);
            default:
                return this.f60175b.lambda$delete$1(this.f60176c, (SQLiteConnection) obj2);
        }
    }
}
