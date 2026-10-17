package g48;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.retail.core.navigation.DummyCommand;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f140369b;

    public /* synthetic */ g(z zVar, int i) {
        this.f140368a = i;
        this.f140369b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140368a) {
            case 0:
                n38.a jointAccount = (n38.a) obj2;
                Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                n38.q qVar = jointAccount.f211925c;
                n38.q qVar2 = n38.q.ACTIVE;
                z zVar = this.f140369b;
                if (qVar == qVar2 || qVar == n38.q.OFFBOARDING || qVar == n38.q.PENDING) {
                    return zVar.c(l38.a.c(jointAccount), null);
                }
                ufm.i iVar = new ufm.i(zVar.f140419c.f(false), new k(2, new j((Object) jointAccount, zVar, 1)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return new ufm.i(iVar, new g1i.i0(29, new g(zVar, 2)), 0);
            case 1:
                od0.i jaOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(jaOptional, "jaOptional");
                n38.a aVar = (n38.a) jaOptional.f224257a;
                z zVar2 = this.f140369b;
                return aVar == null ? zVar2.b() : zVar2.c(l38.a.c(aVar), null);
            case 2:
                String otherUserDisplayName = (String) obj2;
                Intrinsics.checkNotNullParameter(otherUserDisplayName, "otherUserDisplayName");
                return this.f140369b.a(new f9g.l(otherUserDisplayName, 28));
            default:
                od0.i invitationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(invitationOptional, "invitationOptional");
                final n38.d0 d0Var = (n38.d0) invitationOptional.f224257a;
                if (d0Var == null) {
                    ufm.b bVarM = efm.d0.m(DummyCommand.f98635a);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                int i = n.f140392a[d0Var.f211940g.ordinal()];
                z zVar3 = this.f140369b;
                switch (i) {
                    case 1:
                    case 2:
                        return zVar3.b();
                    case 3:
                        final int i2 = 0;
                        return zVar3.a(new Function1() { // from class: g48.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i3 = i2;
                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                switch (i3) {
                                    case 0:
                                        return new m(new TextLocalisedClause(R$string.joint_home_invitation_declined_prompt_title, null, null, 14), new TextLocalisedClause(zBooleanValue ? R$string.joint_home_invitation_declined_prompt_description : R$string.joint_home_invitation_declined_prompt_no_joint_description, zhm.u.c(new TextClause(d0Var.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30));
                                    default:
                                        if (zBooleanValue) {
                                            return null;
                                        }
                                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_home_invitation_expired_prompt_title, null, null, 14);
                                        int i5 = R$string.joint_home_invitation_expired_prompt_no_joint_subtitle;
                                        n38.d0 d0Var2 = d0Var;
                                        TextClause textClause = new TextClause(d0Var2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                        long j2 = d0Var2.k;
                                        TimeClause.Format.INSTANCE.getClass();
                                        return new m(textLocalisedClause, new TextLocalisedClause(i5, zhm.v.k(textClause, new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12)), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d101", null, null, null, 30));
                                }
                            }
                        });
                    case 4:
                        return zVar3.a(new g3e.h(7));
                    case 5:
                    case 6:
                        final int i3 = 1;
                        return zVar3.a(new Function1() { // from class: g48.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i32 = i3;
                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                switch (i32) {
                                    case 0:
                                        return new m(new TextLocalisedClause(R$string.joint_home_invitation_declined_prompt_title, null, null, 14), new TextLocalisedClause(zBooleanValue ? R$string.joint_home_invitation_declined_prompt_description : R$string.joint_home_invitation_declined_prompt_no_joint_description, zhm.u.c(new TextClause(d0Var.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30));
                                    default:
                                        if (zBooleanValue) {
                                            return null;
                                        }
                                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_home_invitation_expired_prompt_title, null, null, 14);
                                        int i5 = R$string.joint_home_invitation_expired_prompt_no_joint_subtitle;
                                        n38.d0 d0Var2 = d0Var;
                                        TextClause textClause = new TextClause(d0Var2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                        long j2 = d0Var2.k;
                                        TimeClause.Format.INSTANCE.getClass();
                                        return new m(textLocalisedClause, new TextLocalisedClause(i5, zhm.v.k(textClause, new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12)), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d101", null, null, null, 30));
                                }
                            }
                        });
                    default:
                        throw new NoWhenBranchMatchedException();
                }
        }
    }
}
