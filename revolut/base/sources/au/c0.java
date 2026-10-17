package au;

import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import ft3.h1;
import grl.r2;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om4.c3;
import om4.q4;
import rnd.v0;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f9102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9103x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, Continuation continuation, yji.l lVar, boolean z) {
        super(2, continuation);
        this.u = i;
        this.f9103x = lVar;
        this.v = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(0, continuation, (com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a) this.f9103x, this.v);
                c0Var.f9102w = obj2;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0((cmh.n) this.f9102w, (sfe.a) this.f9103x, continuation, 1);
                c0Var2.v = ((Boolean) obj2).booleanValue();
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0((r10.v) this.f9102w, (hha.d) this.f9103x, continuation, 2);
                c0Var3.v = ((Boolean) obj2).booleanValue();
                return c0Var3;
            case 3:
                c0 c0Var4 = new c0((fnc.d0) this.f9102w, (akg.n) this.f9103x, continuation, 3);
                c0Var4.v = ((Boolean) obj2).booleanValue();
                return c0Var4;
            case 4:
                c0 c0Var5 = new c0(4, continuation, (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f9103x, this.v);
                c0Var5.f9102w = obj2;
                return c0Var5;
            case 5:
                c0 c0Var6 = new c0(5, continuation, (gnl.s) this.f9103x, this.v);
                c0Var6.f9102w = obj2;
                return c0Var6;
            case 6:
                return new c0((gsh.a0) this.f9102w, (String) this.f9103x, this.v, continuation, 6);
            case 7:
                return new c0((hje.c) this.f9102w, (jf0.c) this.f9103x, this.v, continuation, 7);
            case 8:
                return new c0((hje.g) this.f9102w, (jf0.c) this.f9103x, this.v, continuation, 8);
            case 9:
                c0 c0Var7 = new c0(continuation, (ht4.c) this.f9102w, (String) this.f9103x, 9);
                c0Var7.v = ((Boolean) obj2).booleanValue();
                return c0Var7;
            case 10:
                c0 c0Var8 = new c0(this.v, (im9.i) this.f9103x, continuation, 10);
                c0Var8.f9102w = obj2;
                return c0Var8;
            case 11:
                return new c0((j34.g) this.f9102w, (h1) this.f9103x, this.v, continuation, 11);
            case 12:
                c0 c0Var9 = new c0(12, continuation, (com.revolut.feature.security_hub.impl.ui.security_hub.c) this.f9103x, this.v);
                c0Var9.f9102w = obj2;
                return c0Var9;
            case 13:
                c0 c0Var10 = new c0(continuation, (k25.u) this.f9102w, (w4l.k) this.f9103x, 13);
                c0Var10.v = ((Boolean) obj2).booleanValue();
                return c0Var10;
            case 14:
                return new c0((l10.n) this.f9102w, (n10.b) this.f9103x, this.v, continuation, 14);
            case 15:
                c0 c0Var11 = new c0(this.v, (mp6.n) this.f9103x, continuation, 15);
                c0Var11.f9102w = obj2;
                return c0Var11;
            case 16:
                c0 c0Var12 = new c0((mqd.o) this.f9102w, (lcd.q) this.f9103x, continuation, 16);
                c0Var12.v = ((Boolean) obj2).booleanValue();
                return c0Var12;
            case 17:
                c0 c0Var13 = new c0((om4.b) this.f9102w, (r2) this.f9103x, continuation, 17);
                c0Var13.v = ((Boolean) obj2).booleanValue();
                return c0Var13;
            case 18:
                c0 c0Var14 = new c0(continuation, (om4.l) this.f9102w, (String) this.f9103x, 18);
                c0Var14.v = ((Boolean) obj2).booleanValue();
                return c0Var14;
            case 19:
                c0 c0Var15 = new c0(continuation, (om4.w) this.f9102w, (String) this.f9103x, 19);
                c0Var15.v = ((Boolean) obj2).booleanValue();
                return c0Var15;
            case 20:
                c0 c0Var16 = new c0(continuation, (c3) this.f9102w, (String) this.f9103x, 20);
                c0Var16.v = ((Boolean) obj2).booleanValue();
                return c0Var16;
            case 21:
                c0 c0Var17 = new c0((q4) this.f9102w, (r2) this.f9103x, continuation, 21);
                c0Var17.v = ((Boolean) obj2).booleanValue();
                return c0Var17;
            case 22:
                return new c0((NavBarWithToolbar) this.f9102w, (SelectorScreen) this.f9103x, this.v, continuation, 22);
            case 23:
                c0 c0Var18 = new c0((v0) this.f9102w, (JuniorBankingProfile) this.f9103x, continuation, 23);
                c0Var18.v = ((Boolean) obj2).booleanValue();
                return c0Var18;
            case 24:
                return new c0((sca.e) this.f9102w, (KompotDestination) this.f9103x, this.v, continuation, 24);
            case 25:
                c0 c0Var19 = new c0(continuation, (u25.i) this.f9102w, (w4l.k) this.f9103x, 25);
                c0Var19.v = ((Boolean) obj2).booleanValue();
                return c0Var19;
            case 26:
                c0 c0Var20 = new c0(this.v, (woc.r) this.f9103x, continuation, 26);
                c0Var20.f9102w = obj2;
                return c0Var20;
            case 27:
                c0 c0Var21 = new c0((toh.d) this.f9102w, (lcd.q) this.f9103x, continuation, 27);
                c0Var21.v = ((Boolean) obj2).booleanValue();
                return c0Var21;
            case 28:
                c0 c0Var22 = new c0(this.v, (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a) this.f9103x, continuation, 28);
                c0Var22.f9102w = obj2;
                return c0Var22;
            default:
                c0 c0Var23 = new c0(continuation, (y25.h) this.f9102w, (w4l.k) this.f9103x, 29);
                c0Var23.v = ((Boolean) obj2).booleanValue();
                return c0Var23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c0) create((kmi.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((c0) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return ((c0) create(bool2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                return ((c0) create(bool3, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                Boolean bool4 = (Boolean) obj2;
                bool4.booleanValue();
                return ((c0) create(bool4, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                Boolean bool5 = (Boolean) obj2;
                bool5.booleanValue();
                return ((c0) create(bool5, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c0) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                Boolean bool6 = (Boolean) obj2;
                bool6.booleanValue();
                return ((c0) create(bool6, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                Boolean bool7 = (Boolean) obj2;
                bool7.booleanValue();
                return ((c0) create(bool7, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                Boolean bool8 = (Boolean) obj2;
                bool8.booleanValue();
                return ((c0) create(bool8, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                Boolean bool9 = (Boolean) obj2;
                bool9.booleanValue();
                return ((c0) create(bool9, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                Boolean bool10 = (Boolean) obj2;
                bool10.booleanValue();
                return ((c0) create(bool10, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                Boolean bool11 = (Boolean) obj2;
                bool11.booleanValue();
                return ((c0) create(bool11, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                Boolean bool12 = (Boolean) obj2;
                bool12.booleanValue();
                return ((c0) create(bool12, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                Boolean bool13 = (Boolean) obj2;
                bool13.booleanValue();
                return ((c0) create(bool13, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c0) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                Boolean bool14 = (Boolean) obj2;
                bool14.booleanValue();
                return ((c0) create(bool14, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                Boolean bool15 = (Boolean) obj2;
                bool15.booleanValue();
                return ((c0) create(bool15, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0803  */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.revolut.retail.core.navigation.NaviCommand[], java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 2514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9102w = obj2;
        this.f9103x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9102w = obj2;
        this.f9103x = obj3;
        this.v = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Continuation continuation, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.u = i;
        this.f9102w = obj2;
        this.f9103x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(boolean z, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = z;
        this.f9103x = obj2;
    }
}
