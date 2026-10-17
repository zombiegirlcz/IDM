package gaa;

import com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.ReviewMigrateAliasScreenContract$InputData;
import fo1.b0;
import g23.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h {
    public final ReviewMigrateAliasScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f142125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f142126q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s8a.c f142127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z8a.a f142128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f142129t;

    public j(ReviewMigrateAliasScreenContract$InputData inputData, j60.a bottomExpandableDialog, d dialogProvider, s8a.c aliasManagementInteractor, z8a.a aliasRegistrationExtension, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(aliasManagementInteractor, "aliasManagementInteractor");
        Intrinsics.checkNotNullParameter(aliasRegistrationExtension, "aliasRegistrationExtension");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f142125p = bottomExpandableDialog;
        this.f142126q = dialogProvider;
        this.f142127r = aliasManagementInteractor;
        this.f142128s = aliasRegistrationExtension;
        this.f142129t = idempotencyKeyHolder;
    }

    @Override // yji.l
    public final void I1() {
        this.f142129t.a("request_alias_migration");
    }

    public final void I2(Function0 function0, Function1 function1) {
        j60.a.v(this.f142125p, false, null, 3);
        l2(new q(this, function1, function0, (Continuation) null), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, rd0.e.b(this.f142125p.E()), null, new g(this, continuation, 0), 3);
        l2(new b0(this, continuation, 21), new yi5.b(26));
    }
}
