package lqk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.actions.impl.R$string;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import pcd.x;
import te0.w;
import yhm.o;
import ypg.p;
import zdd.k;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f199321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f199322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f199323y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f199321w = dVar;
        this.f199322x = str;
        this.f199323y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f199321w, this.f199322x, this.f199323y, continuation, 0);
            default:
                return new a(this.f199321w, this.f199322x, this.f199323y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB3;
        Object objB32;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f199322x;
                d dVar = this.f199321w;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    objB3 = d.b3(dVar, str, this.f199323y, this);
                    if (objB3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        dVar.f199330m.getClass();
                        dVar.L2(w.a("ID_SHOT_REMOVE_SUCCESS", new TextLocalisedClause(R$string.retail_accounts_subaccount_members_widget_member_removed_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG));
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objB3 = obj2;
                }
                pfm.a aVarP = ((p) dVar.f199331n).p(str, (x) objB3);
                this.v = 2;
                if (nim.a.a(aVarP, this) == aVar) {
                    return aVar;
                }
                dVar.f199330m.getClass();
                dVar.L2(w.a("ID_SHOT_REMOVE_SUCCESS", new TextLocalisedClause(R$string.retail_accounts_subaccount_members_widget_member_removed_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String vaultId = this.f199322x;
                d dVar2 = this.f199321w;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    objB32 = d.b3(dVar2, vaultId, this.f199323y, this);
                    if (objB32 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        dVar2.f199330m.getClass();
                        dVar2.L2(w.a("ID_SHOT_REMIND_SUCCESS", new TextLocalisedClause(R$string.retail_accounts_subaccount_members_widget_resend_success_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG));
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objB32 = obj2;
                }
                x member = (x) objB32;
                p pVar = (p) dVar2.f199331n;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                Intrinsics.checkNotNullParameter(member, "member");
                qdd.a aVar3 = pVar.f315887a;
                List members = u.c(member.f234903a);
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                Intrinsics.checkNotNullParameter(members, "members");
                pfm.a aVarE = w.g0(((aed.o) aVar3).f3546a.remindInvitee(vaultId, new k(members))).e(pVar.o(pcd.b.PERSONAL, true));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                this.v = 2;
                if (nim.a.a(aVarE, this) == aVar2) {
                    return aVar2;
                }
                dVar2.f199330m.getClass();
                dVar2.L2(w.a("ID_SHOT_REMIND_SUCCESS", new TextLocalisedClause(R$string.retail_accounts_subaccount_members_widget_resend_success_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG));
                return Unit.f186387a;
        }
    }
}
