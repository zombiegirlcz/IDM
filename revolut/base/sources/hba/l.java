package hba;

import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.portability_details.screens.review.ReviewPortabilityInfoScreenContract$InputData;
import h54.o;
import java.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import yhm.r;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends oki.h implements e {
    public final ReviewPortabilityInfoScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f150634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f150635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s8a.c f150636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f150637s;

    public l(ReviewPortabilityInfoScreenContract$InputData inputData, j60.a bottomExpandableDialog, h dialogProvider, s8a.c aliasManagementInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(aliasManagementInteractor, "aliasManagementInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f150634p = bottomExpandableDialog;
        this.f150635q = dialogProvider;
        this.f150636r = aliasManagementInteractor;
        this.f150637s = idempotencyKeyHolder;
    }

    @Override // yji.l
    public final void I1() {
        wj0.a aVar = this.f150637s;
        aVar.a("accept_alias_migration");
        aVar.a("cancel_alias_migration");
    }

    public final void I2(Function1 function1, Function0 function0, Function2 function2) {
        j60.a.v(this.f150634p, false, null, 3);
        l2(new g0a.e(this, function1, function0, function2, (Continuation) null), new yi5.b(26));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void J2() {
        y yVarC;
        PixKey pixKey = this.o.f80678b;
        h hVar = this.f150635q;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pixKey, "pixKey");
        PixKeyStatus f80406b = pixKey.getF80406b();
        Continuation continuation = null;
        if (f80406b instanceof PixKeyStatus.UnderPortability.DifferentOwnership) {
            PixKeyStatus.UnderPortability.DifferentOwnership differentOwnership = (PixKeyStatus.UnderPortability.DifferentOwnership) f80406b;
            LocalDateTime localDateTime = differentOwnership.f80412g;
            int i = g.f150627a[differentOwnership.d.ordinal()];
            if (i == 1) {
                r rVar = localDateTime.isBefore(LocalDateTime.now()) ? new r(Integer.valueOf(R$string.pix_reply_ownership_claim_description_decline_only), differentOwnership.f80410b, Boolean.FALSE) : new r(Integer.valueOf(R$string.pix_reply_ownership_claim_description_confirm_or_decline), localDateTime, Boolean.TRUE);
                yVarC = hVar.c(pixKey, R$string.pix_claim_details_donor_title, ((Number) rVar.f314201a).intValue(), R$string.pix_reply_ownership_claim_decline_action, ((Boolean) rVar.f314203c).booleanValue() ? Integer.valueOf(R$string.pix_reply_ownership_claim_accept_action) : null, (LocalDateTime) rVar.f314202b, differentOwnership);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                yVarC = hVar.b(pixKey, R$string.pix_cancel_ownership_title, R$string.pix_cancel_ownership_description, u.c(differentOwnership.f80411c), differentOwnership, R$string.pix_cancel_ownership_give_up);
            }
        } else {
            if (!(f80406b instanceof PixKeyStatus.UnderPortability.SameOwnership)) {
                throw new IllegalStateException("Active or pending keys won't trigger portability flow");
            }
            PixKeyStatus.UnderPortability.SameOwnership sameOwnership = (PixKeyStatus.UnderPortability.SameOwnership) f80406b;
            int i2 = g.f150627a[sameOwnership.d.ordinal()];
            if (i2 == 1) {
                yVarC = hVar.c(pixKey, R$string.pix_migration_details_donor_title, R$string.pix_migration_details_description, R$string.pix_migration_details_keep_key, Integer.valueOf(R$string.pix_migration_details_confirm_migration), sameOwnership.f80414b, sameOwnership);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                yVarC = hVar.b(pixKey, R$string.pix_migration_details_claimer_details_title, R$string.pix_migration_details_claimer_details_description, v.k(sameOwnership.f80415c, sameOwnership.f80414b), sameOwnership, R$string.pix_migration_details_claimer_details_cancel_migration);
            }
        }
        l2(new o(this, yVarC, continuation, 15), new yi5.b(26));
    }

    @Override // yji.l
    public final void P1() {
        j60.a.v(this.f150634p, false, null, 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(this.f150634p.E()), null, new k(this, (Continuation) null, 0), 3);
        J2();
    }
}
