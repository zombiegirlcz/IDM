package cb2;

import cb2.e;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.retail.common.ui.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import r10.w;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends oki.h implements f {

    @NotNull
    public static final i Companion = new i();
    public final vw1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f22715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Alias f22716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f22717r;

    public m(d inputData, vw1.b aliasRepository, w payIdSettingInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(payIdSettingInteractor, "payIdSettingInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasRepository;
        this.f22715p = payIdSettingInteractor;
        Alias alias = inputData.f22704a;
        this.f22716q = alias;
        this.f22717r = mra.d.b(this, new c(alias), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(cb2.m r9, com.revolut.core.ui_kit.models.TextLocalisedClause r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof cb2.l
            if (r0 == 0) goto L13
            r0 = r11
            cb2.l r0 = (cb2.l) r0
            int r1 = r0.f22714x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22714x = r1
            goto L18
        L13:
            cb2.l r0 = new cb2.l
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22714x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = r0.u
            yhm.o.b(r11)
        L28:
            r4 = r10
            goto L44
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r11)
            vw1.b r11 = r9.o
            r0.u = r10
            r0.f22714x = r3
            uy1.j r11 = (uy1.j) r11
            java.lang.Object r11 = r11.j(r3, r0)
            if (r11 != r1) goto L28
            return r1
        L44:
            mii.k r2 = new mii.k
            r7 = 0
            r8 = 28
            java.lang.String r3 = "SHOT_DIALOG_ID"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.X1(r2)
            cb2.e$a r10 = cb2.e.a.f22705a
            r9.C2(r10)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cb2.m.I2(cb2.m, com.revolut.core.ui_kit.models.TextLocalisedClause, gim.c):java.lang.Object");
    }

    public static final void J2(m mVar) {
        mVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void K2(g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f22708a;
        int iHashCode = str.hashCode();
        Continuation continuation = null;
        Alias alias = this.f22716q;
        switch (iHashCode) {
            case -973106629:
                if (str.equals("LIST_ID_FREEZE_ACTION")) {
                    l2(new k(this, alias, continuation, 0), new yi5.b(26));
                    break;
                }
                break;
            case 496658599:
                if (str.equals("LIST_ID_DELETE_ACTION")) {
                    C2(e.c.f22707a);
                    break;
                }
                break;
            case 680073212:
                if (str.equals("MENU_ID_COPY_ACTION")) {
                    C2(e.b.f22706a);
                    break;
                }
                break;
            case 2133615874:
                if (str.equals("LIST_ID_UNFREEZE_ACTION")) {
                    l2(new k(this, alias, continuation, 1), new yi5.b(26));
                    break;
                }
                break;
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f22717r;
    }
}
